;; Major mode for XEmacs for editing mobprogs
;;  (it should also work in emacs, tested with 20.7)
;; Created in 2001 by Erwin S. Andreasen. This file is in Public Domain.
;; For newest version, see http://www.andreasen.org/misc.shtml
;; To use this, save it as mobprog.el in your xemacs load path and use:
;;  (require 'mobprog)
;; Or save it in /somedir/mobprog.el and put:
;;  (load-file "/somedir/mobprog.el")
;; To start it, M-x mobprog-mode
;; You can assign that to a certain keyboard command the usual way in your .emacs:
;; (global-set-key '(meta m) 'mobprog-mode)
;; Version history:
;; 1.0  -- May 21 2001
;;   Initial release. Support basic syntax highlighting and autoindentation
;; 1.1 -- May 22 2001
;;   Some cleanup (use more standard functions)
;; 1.2 -- May 24 2001
;;   Further cleanup following comments from Hrvoje Niksic and Stefan Monnier.
;    Should now work 100% in Emacs!

(defvar ytinprog-mode-hook nil
  "*List of functions to call when entering Ytinprog mode")

(defvar ytinprog-mode-map nil
  "Keymap for Ytinprog major mode")

(defvar ytinprog-indent-offset 2
  "*Indent Ytinprog blocks with that many spaces")

(if (null ytinprog-mode-map)
    (progn
      (setq ytinprog-mode-map (make-sparse-keymap))
      (define-key ytinprog-mode-map "\C-m" 'reindent-then-newline-and-indent)))

;; Syntax highlighting
(defvar ytinprog-font-lock-keywords
  ;; These are the keywords that need to be highlighted -- but only at the
  ;; beginning of a line
  (let ((bol-keywords (mapconcat 'identity 
				 '( "if" "and" "or" "endif" "else" "break" "continue") 
				 "\\|"  )))
    (list
     ;; Comments
 ;    (cons "^\\*.*$" 'font-lock-comment-face)     ; * ...
 ;    (cons "^ *#.*$" 'font-lock-comment-face)     ; # ...
 ;    (cons "^ *//.*$" 'font-lock-comment-face)    ; // ...
     (cons "^ */nop.*$" 'font-lock-comment-face)     ; # ...
     ;; Variable names: $foobar
     (cons "$[][_%0-9a-zA-Z]+" 'font-lock-variable-name-face)
     (cons "%[][_%0-9a-zA-Z]+" 'font-lock-variable-name-face)
     ;; Commands: @goto, mpgoto
;     (cons "^ */[a-zA-Z]+" 'font-lock-type-face)
     (cons "/[a-zA-Z]+" 'font-lock-type-face)
     (cons "class " 'font-lock-type-face)
     (cons "tri " 'font-lock-type-face)
;     (cons "^ *@[a-zA-Z]+" 'font-lock-type-face)
;     (cons "^ *mp[a-zA-Z]+" 'font-lock-type-face)
     ;; All the keywords above in keywords
     (cons (concat "^[ \t]*\\(" bol-keywords "\\)\\b") 'font-lock-keyword-face)))
  "Keywords highlighted in ytinprog-mode")

(defvar ytinprog-font-lock-defaults '(ytinprog-font-lock-keywords nil t))
(put 'ytinprog-mode 'font-lock-defaults ytinprog-font-lock-defaults)


(defun ytinprog-find-offset-for-following-line ()
  "Effect of this line on the offset of the following ones"
  (save-excursion
    (beginning-of-line)
    (cond ((looking-at "^[ \t]*\\(if\\|foreach\\|else\\)") 1)
	  (t 0))))

(defun ytinprog-find-offset-for-current-line ()
  "Effect of this line on its own offset"
  (save-excursion
    (beginning-of-line)
    (cond ((looking-at "^[ \t]*\\(endif\\|endfor\\|else\\)") -1)
	  (t 0))))

(defun ytinprog-indent-current-line ()
  "Reindent the current line accordingly to the indentation of the above line"
  (interactive)
  (save-excursion
    (let (new-indentation-level)

      ;; Find the indentation level on the previous line
      (setq new-indentation-level
	    (save-excursion
	      ;; if forward-line returns -1, we are already on the first line
	      (if (= (forward-line -1) -1)
		  0
		(+ (/ (current-indentation) ytinprog-indent-offset) 
		   (ytinprog-find-offset-for-following-line))
		)
	      ))
      
      ;; Adjust based on offset for the current line
      (setq new-indentation-level (+ new-indentation-level 
				     (ytinprog-find-offset-for-current-line)))

      (indent-line-to (* new-indentation-level ytinprog-indent-offset))

      ))
    ;; If we were standing in the now-deleted area, move past the indentation
    (if (= 0 (current-column)) (back-to-indentation)))
    
(defun ytinprog-mode ()
  "*Major mode for editing ytinprog code.
Pressing return will indent the current and next one accordingly, in multiples
of ytinprog-indent-offset.

This script's homepage is at http://www.andreasen.org/misc.shtml
"
  (interactive)
  (kill-all-local-variables)
  (setq  major-mode 'ytinprog-mode
	 mode-name "MProg")
  (set (make-local-variable 'require-final-newline) t)
  (set (make-local-variable 'comment-start) "# ")
  (set (make-local-variable 'comment-end) "")
  (set (make-local-variable 'comment-start-skip) "# *")
  (set (make-local-variable 'indent-line-function) 'ytinprog-indent-current-line)
  (set (make-local-variable 'font-lock-defaults) ytinprog-font-lock-defaults)
  (use-local-map ytinprog-mode-map)
  (run-hooks 'ytinprog-mode-hook)
)

(provide 'ytinprog)
