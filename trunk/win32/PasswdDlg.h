#if !defined(AFX_PASSWDDLG_H__C5A113E3_FDCC_11D3_8359_00105A9F5B94__INCLUDED_)
#define AFX_PASSWDDLG_H__C5A113E3_FDCC_11D3_8359_00105A9F5B94__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000
// PasswdDlg.h : header file
//

/////////////////////////////////////////////////////////////////////////////
// CPasswdDlg dialog

class CPasswdDlg : public CDialog
{
// Construction
public:
	CPasswdDlg(CWnd* pParent = NULL);   // standard constructor

// Dialog Data
	//{{AFX_DATA(CPasswdDlg)
	enum { IDD = IDD_PASSWD };
	CString	m_szPasswd;
	//}}AFX_DATA


// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CPasswdDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:

	// Generated message map functions
	//{{AFX_MSG(CPasswdDlg)
	virtual void OnOK();
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_PASSWDDLG_H__C5A113E3_FDCC_11D3_8359_00105A9F5B94__INCLUDED_)
