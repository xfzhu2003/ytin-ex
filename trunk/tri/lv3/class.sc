/nop --------------------------------------------------------------------------
/nop With those aliases, we could define a class with:
/nop class CLASSNAME { \
/nop TRIGGERS, ALIASES & VARS \
/nop } {CLEANUP_CMDS}
/nop Triggers of a specific class are defined with:
/nop tri {TRIGGER} {ACTION} {CLASSNAME}
/nop
/nop And we enable/disable classes, by using t+/t- CLASSNAME.
/nop 
/nop Here is an example:
/nop class autoChat { \
/nop tri {%1 says: 'Good morning'} {say Good morning, %1} {autoChat}; \
/nop } {#nop}
/nop When we want to use it:
/nop t+ autoChat
/nop Then whenenver anyone says "good morning" the robot would respond him too.
/nop ---------------------------------------------------------------------------

/nop /alias class {/var {_%%1} 0;/alias {c_%%1} {%%2};/alias {%%1_cu} {%%3}}
/nop /alias tri {/unact {%%1*};/act {%%1} {/if {$_%%%3=1} {%%%2}} {%%4}}
/nop /alias {t+} {c_%1;/var {_%%1} {1}}
/nop /alias {t-} {/var {_%%1} {0};%1_cu}

/alias class {/var {_%%1} 0;/alias {c_%%1} {%%2};/alias {%%1_cu} {%%3}}
/alias tri {/unact {%%1*};/act {%%1} {/if {$_%%%3=1} {%%%2}} {%%4}}
/alias {t+} {c_%1;/var {_%%1} {1}}
/alias {t-} {/var {_%%1} {0};%1_cu}
