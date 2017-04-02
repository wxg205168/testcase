/* compiled from JSP: /SelectProjectConfirm.jsp
*
* This code was automatically generated at 12:46:24 on 2005-8-29
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
import java.sql.*; //[ /SelectProjectConfirm.jsp; Line: 11]
import javax.sql.*; //[ /SelectProjectConfirm.jsp; Line: 11]
import java.util.Enumeration; //[ /SelectProjectConfirm.jsp; Line: 11]


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
* This code was automatically generated at 12:46:24 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selectprojectconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectProjectConfirm.jsp", 1123229424000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectProjectConfirm.jsp", 1123229424000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nSelectProjectConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n<form>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n</form>\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  
  
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
      mydb.DatabaseBean tt = null; //[ /SelectProjectConfirm.jsp; Line: 12]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectProjectConfirm.jsp; Line: 12]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectProjectConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /SelectProjectConfirm.jsp; Line: 12]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectProjectConfirm.jsp; Line: 12]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectProjectConfirm.jsp; Line: 12]
            tt = new mydb.DatabaseBean(); //[ /SelectProjectConfirm.jsp; Line: 12]
            pageContext.setAttribute("tt", tt); //[ /SelectProjectConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /SelectProjectConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /SelectProjectConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /SelectProjectConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /SelectProjectConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /SelectProjectConfirm.jsp; Line: 15]
      //[ /SelectProjectConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /SelectProjectConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /SelectProjectConfirm.jsp; Line: 22]
      } //[ /SelectProjectConfirm.jsp; Line: 23]
      else{ //[ /SelectProjectConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /SelectProjectConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /SelectProjectConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /SelectProjectConfirm.jsp; Line: 27]
        Statement myStatement=null; //[ /SelectProjectConfirm.jsp; Line: 28]
        myConn=ds.getConnection(); //[ /SelectProjectConfirm.jsp; Line: 29]
        myStatement=myConn.createStatement(); //[ /SelectProjectConfirm.jsp; Line: 30]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /SelectProjectConfirm.jsp; Line: 33]
        String textName=new String(); //[ /SelectProjectConfirm.jsp; Line: 34]
        String projectName=new String(); //[ /SelectProjectConfirm.jsp; Line: 35]
        long projectID=0; //[ /SelectProjectConfirm.jsp; Line: 36]
        textName="t"+request.getParameter("radiobutton"); //[ /SelectProjectConfirm.jsp; Line: 37]
        String sProjectID=request.getParameter(textName); //[ /SelectProjectConfirm.jsp; Line: 38]
        //[ /SelectProjectConfirm.jsp; Line: 39]
        projectID=Integer.parseInt(sProjectID); //[ /SelectProjectConfirm.jsp; Line: 40]
        //[ /SelectProjectConfirm.jsp; Line: 41]
        String sql=new String(); //[ /SelectProjectConfirm.jsp; Line: 42]
        ResultSet rs; //[ /SelectProjectConfirm.jsp; Line: 43]
        //[ /SelectProjectConfirm.jsp; Line: 44]
        sql="select pro_id,pro_n,pro_l from tctc_project where pro_id="+projectID; //[ /SelectProjectConfirm.jsp; Line: 45]
        rs=myStatement.executeQuery(sql); //[ /SelectProjectConfirm.jsp; Line: 46]
        if(rs.next()){ //[ /SelectProjectConfirm.jsp; Line: 47]
          projectName=rs.getString("pro_n"); //[ /SelectProjectConfirm.jsp; Line: 48]
          //[ /SelectProjectConfirm.jsp; Line: 49]
          session.setAttribute("ProjectName",projectName); //[ /SelectProjectConfirm.jsp; Line: 50]
          session.setAttribute("ProjectID",String.valueOf(projectID)); //[ /SelectProjectConfirm.jsp; Line: 51]
          session.setAttribute("UseCaseName","null"); //[ /SelectProjectConfirm.jsp; Line: 52]
          session.setAttribute("UseCaseID","null"); //[ /SelectProjectConfirm.jsp; Line: 53]
          session.setAttribute("FunctionPointName","null"); //[ /SelectProjectConfirm.jsp; Line: 54]
          session.setAttribute("FunctionPointID","null"); //[ /SelectProjectConfirm.jsp; Line: 55]
          session.setAttribute("TestElementName","null"); //[ /SelectProjectConfirm.jsp; Line: 56]
          session.setAttribute("TestElementID","null"); //[ /SelectProjectConfirm.jsp; Line: 57]
          session.setAttribute("Type","c"); //[ /SelectProjectConfirm.jsp; Line: 58]
          session.setAttribute("CR_Number","null"); //[ /SelectProjectConfirm.jsp; Line: 59]
          //[ /SelectProjectConfirm.jsp; Line: 60]
          rs.close(); //[ /SelectProjectConfirm.jsp; Line: 61]
          //    response.sendRedirect("SelectProject.jsp"); //[ /SelectProjectConfirm.jsp; Line: 62]
          _writeText(response, out, _wl_block5, _wl_block5Bytes);
          //[ /SelectProjectConfirm.jsp; Line: 67]
        } //[ /SelectProjectConfirm.jsp; Line: 68]
        else //[ /SelectProjectConfirm.jsp; Line: 69]
        { //[ /SelectProjectConfirm.jsp; Line: 70]
          rs.close(); //[ /SelectProjectConfirm.jsp; Line: 71]
          session.setAttribute("Error","1"); //[ /SelectProjectConfirm.jsp; Line: 72]
          //    response.sendRedirect("SelectProject.jsp"); //[ /SelectProjectConfirm.jsp; Line: 73]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /SelectProjectConfirm.jsp; Line: 78]
          //[ /SelectProjectConfirm.jsp; Line: 79]
        } //[ /SelectProjectConfirm.jsp; Line: 80]
        _writeText(response, out, _wl_block7, _wl_block7Bytes);
        //[ /SelectProjectConfirm.jsp; Line: 82]
        myConn.close(); //[ /SelectProjectConfirm.jsp; Line: 83]
        myStatement.close(); //[ /SelectProjectConfirm.jsp; Line: 84]
      } //[ /SelectProjectConfirm.jsp; Line: 85]
      _writeText(response, out, _wl_block8, _wl_block8Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
