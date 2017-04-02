/* compiled from JSP: /DeleteTestCaseConfirm.jsp
*
* This code was automatically generated at 12:45:03 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*/

package jsp_servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

// User imports
import java.sql.*; //[ /DeleteTestCaseConfirm.jsp; Line: 9]
import javax.sql.*; //[ /DeleteTestCaseConfirm.jsp; Line: 9]
import java.util.Enumeration; //[ /DeleteTestCaseConfirm.jsp; Line: 9]


// built-in init parameters:
// boolean             _verbose -- wants debugging

// Well-known variables:
// JspWriter out                  -- to write to the browser
// HttpServletRequest  request    -- the request object.
// HttpServletResponse response   -- the response object.
// PageContext pageContext        -- the page context for this JSP
// HttpSession session            -- the session object for the client (if any)
// ServletContext application     -- The servlet (application) context
// ServletConfig config           -- The ServletConfig for this JSP
// Object page                    -- the instance of this page's implementation class (i.e., 'this')

/**
* This code was automatically generated at 12:45:03 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletetestcaseconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestCaseConfirm.jsp", 1123665126000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestCaseConfirm.jsp", 1123665126000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  
  private static void _writeText(ServletResponse rsp, JspWriter out, String block, byte[] blockBytes) throws IOException {
    if (!_WL_ENCODED_BYTES_OK || _hasEncodingChanged(rsp)) {
      out.print(block);
    } else {
      ((weblogic.servlet.jsp.ByteWriter)out).write(blockBytes, block);
    } 
  }
  
  
  private static boolean _hasEncodingChanged(ServletResponse rsp) {
    if (_WL_ORIGINAL_ENCODING.equals(rsp.getCharacterEncoding())) {
      return false;
    }
    return true;
  }
  
  private static boolean _WL_ENCODED_BYTES_OK = true;
  
  private static final String _WL_ORIGINAL_ENCODING = "GBK";
  
  private static byte[] _getBytes(String block) {
    try {
      return block.getBytes(_WL_ORIGINAL_ENCODING);
    } catch (java.io.UnsupportedEncodingException u) {
      _WL_ENCODED_BYTES_OK = false;
    }
    return null;
  }
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nDeleteTestCaseConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'EnquireTestCase1.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  
  
  public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException 
  {  
    
    // declare and set well-known variables:
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.ServletContext application = config.getServletContext();
    javax.servlet.jsp.tagext.Tag _activeTag = null;
    // variables for Tag extension protocol
    
    Object page = this;
    javax.servlet.jsp.JspWriter out;
    javax.servlet.jsp.PageContext pageContext =
    javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
    
    response.setHeader("Content-Type", "text/html; charset=GBK");
    out = pageContext.getOut();
    JspWriter _originalOut = out;
    
    javax.servlet.http.HttpSession session = request.getSession(true);
    
    
    
    try { // error page try block
      
      response.setContentType("text/html; charset=GBK");
      
      _writeText(response, out, _wl_block0, _wl_block0Bytes);
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      mydb.DatabaseBean tt = null; //[ /DeleteTestCaseConfirm.jsp; Line: 10]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestCaseConfirm.jsp; Line: 10]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteTestCaseConfirm.jsp; Line: 10]
        { // Don't need to synchronize on page scope //[ /DeleteTestCaseConfirm.jsp; Line: 10]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestCaseConfirm.jsp; Line: 10]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteTestCaseConfirm.jsp; Line: 10]
            tt = new mydb.DatabaseBean(); //[ /DeleteTestCaseConfirm.jsp; Line: 10]
            pageContext.setAttribute("tt", tt); //[ /DeleteTestCaseConfirm.jsp; Line: 10]
          } // end synchronized bean instantiation block... //[ /DeleteTestCaseConfirm.jsp; Line: 10]
        } // end synchronized bean scope block... //[ /DeleteTestCaseConfirm.jsp; Line: 10]
      } // end bean instantiation block... //[ /DeleteTestCaseConfirm.jsp; Line: 10]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteTestCaseConfirm.jsp; Line: 12]
      Enumeration ss=session.getAttributeNames(); //[ /DeleteTestCaseConfirm.jsp; Line: 13]
      //[ /DeleteTestCaseConfirm.jsp; Line: 14]
      if(!ss.hasMoreElements()){ //[ /DeleteTestCaseConfirm.jsp; Line: 15]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /DeleteTestCaseConfirm.jsp; Line: 20]
      } //[ /DeleteTestCaseConfirm.jsp; Line: 21]
      else{ //[ /DeleteTestCaseConfirm.jsp; Line: 22]
        DataSource ds=null; //[ /DeleteTestCaseConfirm.jsp; Line: 23]
        ds=tt.getDataSource(); //[ /DeleteTestCaseConfirm.jsp; Line: 24]
        Connection myConn=null; //[ /DeleteTestCaseConfirm.jsp; Line: 25]
        Statement myStatement=null; //[ /DeleteTestCaseConfirm.jsp; Line: 26]
        myConn=ds.getConnection(); //[ /DeleteTestCaseConfirm.jsp; Line: 27]
        myStatement=myConn.createStatement(); //[ /DeleteTestCaseConfirm.jsp; Line: 28]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteTestCaseConfirm.jsp; Line: 31]
        String checkBoxName=new String(); //[ /DeleteTestCaseConfirm.jsp; Line: 32]
        String hideName=new String(); //[ /DeleteTestCaseConfirm.jsp; Line: 33]
        String checkBoxResult=new String(); //[ /DeleteTestCaseConfirm.jsp; Line: 34]
        String testCaseID=new String(); //[ /DeleteTestCaseConfirm.jsp; Line: 35]
        String sql=new String(); //[ /DeleteTestCaseConfirm.jsp; Line: 36]
        //[ /DeleteTestCaseConfirm.jsp; Line: 37]
        int number=Integer.parseInt((String)session.getAttribute("CR_Number")); //[ /DeleteTestCaseConfirm.jsp; Line: 38]
        //[ /DeleteTestCaseConfirm.jsp; Line: 39]
        for(int i=1;i<(number+1);i++){ //[ /DeleteTestCaseConfirm.jsp; Line: 40]
          checkBoxName="C"+i; //[ /DeleteTestCaseConfirm.jsp; Line: 41]
          hideName="H"+i; //[ /DeleteTestCaseConfirm.jsp; Line: 42]
          //[ /DeleteTestCaseConfirm.jsp; Line: 43]
          checkBoxResult=request.getParameter(checkBoxName); //[ /DeleteTestCaseConfirm.jsp; Line: 44]
          //[ /DeleteTestCaseConfirm.jsp; Line: 45]
          if(checkBoxResult!=null){ //[ /DeleteTestCaseConfirm.jsp; Line: 46]
            testCaseID=request.getParameter(hideName); //[ /DeleteTestCaseConfirm.jsp; Line: 47]
            sql="delete from tctc_test_case where test_case_id="+Integer.parseInt(testCaseID); //[ /DeleteTestCaseConfirm.jsp; Line: 48]
            myStatement.executeUpdate(sql); //[ /DeleteTestCaseConfirm.jsp; Line: 49]
            //[ /DeleteTestCaseConfirm.jsp; Line: 50]
          } //[ /DeleteTestCaseConfirm.jsp; Line: 51]
        } //[ /DeleteTestCaseConfirm.jsp; Line: 52]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteTestCaseConfirm.jsp; Line: 57]
        myConn.close(); //[ /DeleteTestCaseConfirm.jsp; Line: 58]
        myStatement.close(); //[ /DeleteTestCaseConfirm.jsp; Line: 59]
      } //[ /DeleteTestCaseConfirm.jsp; Line: 60]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
