/* compiled from JSP: /SelectUseCaseConfirm.jsp
*
* This code was automatically generated at 12:46:42 on 2005-8-29
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
import java.sql.*; //[ /SelectUseCaseConfirm.jsp; Line: 10]
import javax.sql.*; //[ /SelectUseCaseConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /SelectUseCaseConfirm.jsp; Line: 10]


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
* This code was automatically generated at 12:46:42 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selectusecaseconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectUseCaseConfirm.jsp", 1123229044000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectUseCaseConfirm.jsp", 1123229044000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nSelectUseCaseConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n</body>\r\n</html>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /SelectUseCaseConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectUseCaseConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectUseCaseConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /SelectUseCaseConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectUseCaseConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectUseCaseConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /SelectUseCaseConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /SelectUseCaseConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /SelectUseCaseConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /SelectUseCaseConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /SelectUseCaseConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /SelectUseCaseConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /SelectUseCaseConfirm.jsp; Line: 14]
      //[ /SelectUseCaseConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /SelectUseCaseConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /SelectUseCaseConfirm.jsp; Line: 21]
      } //[ /SelectUseCaseConfirm.jsp; Line: 22]
      else{ //[ /SelectUseCaseConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /SelectUseCaseConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /SelectUseCaseConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /SelectUseCaseConfirm.jsp; Line: 26]
        Statement myStatement=null; //[ /SelectUseCaseConfirm.jsp; Line: 27]
        myConn=ds.getConnection(); //[ /SelectUseCaseConfirm.jsp; Line: 28]
        myStatement=myConn.createStatement(); //[ /SelectUseCaseConfirm.jsp; Line: 29]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /SelectUseCaseConfirm.jsp; Line: 32]
        String sql=new String(); //[ /SelectUseCaseConfirm.jsp; Line: 33]
        ResultSet rs; //[ /SelectUseCaseConfirm.jsp; Line: 34]
        String textName=new String(); //[ /SelectUseCaseConfirm.jsp; Line: 35]
        String useCaseName=new String(); //[ /SelectUseCaseConfirm.jsp; Line: 36]
        long useCaseID=0; //[ /SelectUseCaseConfirm.jsp; Line: 37]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /SelectUseCaseConfirm.jsp; Line: 38]
        long projectID=Integer.parseInt(sProjectID); //[ /SelectUseCaseConfirm.jsp; Line: 39]
        //[ /SelectUseCaseConfirm.jsp; Line: 40]
        textName="t"+request.getParameter("radiobutton"); //[ /SelectUseCaseConfirm.jsp; Line: 41]
        useCaseID=Integer.parseInt(request.getParameter(textName)); //[ /SelectUseCaseConfirm.jsp; Line: 42]
        //[ /SelectUseCaseConfirm.jsp; Line: 43]
        sql="select uc_id,uc_name from tctc_uc where project_id=" +projectID+" and uc_id="+useCaseID; //[ /SelectUseCaseConfirm.jsp; Line: 44]
        rs=myStatement.executeQuery(sql); //[ /SelectUseCaseConfirm.jsp; Line: 45]
        //[ /SelectUseCaseConfirm.jsp; Line: 46]
        if(rs.next()){ //[ /SelectUseCaseConfirm.jsp; Line: 47]
          //[ /SelectUseCaseConfirm.jsp; Line: 48]
          useCaseName=rs.getString("uc_name"); //[ /SelectUseCaseConfirm.jsp; Line: 49]
          session.setAttribute("UseCaseName",useCaseName); //[ /SelectUseCaseConfirm.jsp; Line: 50]
          session.setAttribute("UseCaseID",String.valueOf(useCaseID)); //[ /SelectUseCaseConfirm.jsp; Line: 51]
          session.setAttribute("FunctionPointName","null"); //[ /SelectUseCaseConfirm.jsp; Line: 52]
          session.setAttribute("FunctionPointID","null"); //[ /SelectUseCaseConfirm.jsp; Line: 53]
          session.setAttribute("TestElementName","null"); //[ /SelectUseCaseConfirm.jsp; Line: 54]
          session.setAttribute("TestElementID","null"); //[ /SelectUseCaseConfirm.jsp; Line: 55]
          session.setAttribute("Type","c"); //[ /SelectUseCaseConfirm.jsp; Line: 56]
          session.setAttribute("CR_Number","null"); //[ /SelectUseCaseConfirm.jsp; Line: 57]
          //    response.sendRedirect("SelectUseCase.jsp"); //[ /SelectUseCaseConfirm.jsp; Line: 58]
          _writeText(response, out, _wl_block5, _wl_block5Bytes);
          //[ /SelectUseCaseConfirm.jsp; Line: 63]
          //[ /SelectUseCaseConfirm.jsp; Line: 64]
        } //[ /SelectUseCaseConfirm.jsp; Line: 65]
        else //[ /SelectUseCaseConfirm.jsp; Line: 66]
        { //[ /SelectUseCaseConfirm.jsp; Line: 67]
          session.setAttribute("Error","2.2"); //[ /SelectUseCaseConfirm.jsp; Line: 68]
          //    response.sendRedirect("SelectUseCase.jsp"); //[ /SelectUseCaseConfirm.jsp; Line: 69]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /SelectUseCaseConfirm.jsp; Line: 74]
          //[ /SelectUseCaseConfirm.jsp; Line: 75]
        } //[ /SelectUseCaseConfirm.jsp; Line: 76]
        //[ /SelectUseCaseConfirm.jsp; Line: 77]
        //[ /SelectUseCaseConfirm.jsp; Line: 78]
        rs.close(); //[ /SelectUseCaseConfirm.jsp; Line: 79]
        _writeText(response, out, _wl_block7, _wl_block7Bytes);
        //[ /SelectUseCaseConfirm.jsp; Line: 82]
        myConn.close(); //[ /SelectUseCaseConfirm.jsp; Line: 83]
        myStatement.close(); //[ /SelectUseCaseConfirm.jsp; Line: 84]
      } //[ /SelectUseCaseConfirm.jsp; Line: 85]
      _writeText(response, out, _wl_block8, _wl_block8Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
