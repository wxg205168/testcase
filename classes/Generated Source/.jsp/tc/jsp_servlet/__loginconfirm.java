/* compiled from JSP: /LoginConfirm.jsp
*
* This code was automatically generated at 16:29:25 on 2005-8-5
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
import java.sql.*; //[ /LoginConfirm.jsp; Line: 10]
import javax.sql.*; //[ /LoginConfirm.jsp; Line: 10]


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
* This code was automatically generated at 16:29:26 on 2005-8-5
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __loginconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/LoginConfirm.jsp", 1123230110000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/LoginConfirm.jsp", 1123230110000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  
  private static final String _WL_ORIGINAL_ENCODING = "GB2312";
  
  private static byte[] _getBytes(String block) {
    try {
      return block.getBytes(_WL_ORIGINAL_ENCODING);
    } catch (java.io.UnsupportedEncodingException u) {
      _WL_ENCODED_BYTES_OK = false;
    }
    return null;
  }
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n<title>LoginConfirm</title>\r\n<link rel=stylesheet href=\"style.css\" type=\"text/css\">\r\n</head>\r\n\r\n<body>\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n    ";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n    ";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  
  
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
    
    response.setHeader("Content-Type", "text/html; charset=gb2312");
    out = pageContext.getOut();
    JspWriter _originalOut = out;
    
    javax.servlet.http.HttpSession session = request.getSession(true);
    
    
    
    try { // error page try block
      
      response.setContentType("text/html; charset=gb2312");
      
      _writeText(response, out, _wl_block0, _wl_block0Bytes);
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      mydb.DatabaseBean tt = null; //[ /LoginConfirm.jsp; Line: 12]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /LoginConfirm.jsp; Line: 12]
      if (tt == null) { // begin 'tt' instantiation block... //[ /LoginConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /LoginConfirm.jsp; Line: 12]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /LoginConfirm.jsp; Line: 12]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /LoginConfirm.jsp; Line: 12]
            tt = new mydb.DatabaseBean(); //[ /LoginConfirm.jsp; Line: 12]
            pageContext.setAttribute("tt", tt); //[ /LoginConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /LoginConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /LoginConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /LoginConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /LoginConfirm.jsp; Line: 14]
      DataSource ds=null; //[ /LoginConfirm.jsp; Line: 15]
      ds=tt.getDataSource(); //[ /LoginConfirm.jsp; Line: 16]
      Connection myConn=null; //[ /LoginConfirm.jsp; Line: 17]
      Statement myStatement=null; //[ /LoginConfirm.jsp; Line: 18]
      myConn=ds.getConnection(); //[ /LoginConfirm.jsp; Line: 19]
      myStatement=myConn.createStatement(); //[ /LoginConfirm.jsp; Line: 20]
      //[ /LoginConfirm.jsp; Line: 21]
      //[ /LoginConfirm.jsp; Line: 22]
      String name1=request.getParameter("user_id"); //[ /LoginConfirm.jsp; Line: 23]
      String pwd1=request.getParameter("password"); //[ /LoginConfirm.jsp; Line: 24]
      String sql="select * from tctc_employee where em_n='" + name1 + "' and em_pwd='" + pwd1 + "'"; //[ /LoginConfirm.jsp; Line: 25]
      //[ /LoginConfirm.jsp; Line: 26]
      //  ResultSet rs=tt.executeQuery(sq1); //[ /LoginConfirm.jsp; Line: 27]
      ResultSet rs=myStatement.executeQuery(sql); //[ /LoginConfirm.jsp; Line: 28]
      //[ /LoginConfirm.jsp; Line: 29]
      if(rs.next()){ //[ /LoginConfirm.jsp; Line: 30]
        session.setMaxInactiveInterval(600); //[ /LoginConfirm.jsp; Line: 31]
        session.setAttribute("UserName",name1); //[ /LoginConfirm.jsp; Line: 32]
        session.setAttribute("ProjectName","null"); //[ /LoginConfirm.jsp; Line: 33]
        session.setAttribute("ProjectID","null"); //[ /LoginConfirm.jsp; Line: 34]
        session.setAttribute("UseCaseName","null"); //[ /LoginConfirm.jsp; Line: 35]
        session.setAttribute("UseCaseID","null"); //[ /LoginConfirm.jsp; Line: 36]
        session.setAttribute("FunctionPointName","null"); //[ /LoginConfirm.jsp; Line: 37]
        session.setAttribute("FunctionPointID","null"); //[ /LoginConfirm.jsp; Line: 38]
        session.setAttribute("TestElementName","null"); //[ /LoginConfirm.jsp; Line: 39]
        session.setAttribute("TestElementID","null"); //[ /LoginConfirm.jsp; Line: 40]
        session.setAttribute("Type","c"); //[ /LoginConfirm.jsp; Line: 41]
        session.setAttribute("CR_Number","null"); //[ /LoginConfirm.jsp; Line: 42]
        session.setAttribute("C_Number","null"); //[ /LoginConfirm.jsp; Line: 43]
        session.setAttribute("R_Number","null"); //[ /LoginConfirm.jsp; Line: 44]
        session.setAttribute("Temp","null"); //[ /LoginConfirm.jsp; Line: 45]
        session.setAttribute("Error","null"); //[ /LoginConfirm.jsp; Line: 46]
        session.setAttribute("Temp","null"); //[ /LoginConfirm.jsp; Line: 47]
        session.setAttribute("Page","null"); //[ /LoginConfirm.jsp; Line: 48]
        session.setAttribute("UseCasePage","null"); //[ /LoginConfirm.jsp; Line: 49]
        session.setAttribute("CR_Number2","null"); //[ /LoginConfirm.jsp; Line: 50]
        session.setAttribute("LoadName","null"); //[ /LoginConfirm.jsp; Line: 51]
        rs.close(); //[ /LoginConfirm.jsp; Line: 52]
        myConn.close(); //[ /LoginConfirm.jsp; Line: 53]
        myStatement.close(); //[ /LoginConfirm.jsp; Line: 54]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        if (true) { //forwarding request //[ /LoginConfirm.jsp; Line: 56]
          out.clear(); // clear current output buffer //[ /LoginConfirm.jsp; Line: 56]
          String __thePage =  //[ /LoginConfirm.jsp; Line: 56]
          //[ /LoginConfirm.jsp; Line: 56]
          "SelectProject.jsp"; //[ /LoginConfirm.jsp; Line: 56]
          pageContext.forward(__thePage); //[ /LoginConfirm.jsp; Line: 56]
          return; //[ /LoginConfirm.jsp; Line: 56]
        } //[ /LoginConfirm.jsp; Line: 56]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /LoginConfirm.jsp; Line: 57]
      } //[ /LoginConfirm.jsp; Line: 58]
      else{ //[ /LoginConfirm.jsp; Line: 59]
        rs.close(); //[ /LoginConfirm.jsp; Line: 60]
        myConn.close(); //[ /LoginConfirm.jsp; Line: 61]
        myStatement.close(); //[ /LoginConfirm.jsp; Line: 62]
        //[ /LoginConfirm.jsp; Line: 63]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        if (true) { //forwarding request //[ /LoginConfirm.jsp; Line: 65]
          out.clear(); // clear current output buffer //[ /LoginConfirm.jsp; Line: 65]
          String __thePage =  //[ /LoginConfirm.jsp; Line: 65]
          //[ /LoginConfirm.jsp; Line: 65]
          "login.htm"; //[ /LoginConfirm.jsp; Line: 65]
          pageContext.forward(__thePage); //[ /LoginConfirm.jsp; Line: 65]
          return; //[ /LoginConfirm.jsp; Line: 65]
        } //[ /LoginConfirm.jsp; Line: 65]
        _writeText(response, out, _wl_block6, _wl_block6Bytes);
        //[ /LoginConfirm.jsp; Line: 67]
      } //[ /LoginConfirm.jsp; Line: 68]
      //[ /LoginConfirm.jsp; Line: 69]
      //[ /LoginConfirm.jsp; Line: 70]
      _writeText(response, out, _wl_block7, _wl_block7Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
