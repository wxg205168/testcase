/* compiled from JSP: /SelectFunctionPointConfirm.jsp
*
* This code was automatically generated at 10:38:56 on 2005-8-8
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
import java.sql.*; //[ /SelectFunctionPointConfirm.jsp; Line: 10]
import javax.sql.*; //[ /SelectFunctionPointConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /SelectFunctionPointConfirm.jsp; Line: 10]


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
* This code was automatically generated at 10:38:56 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selectfunctionpointconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectFunctionPointConfirm.jsp", 1123230054000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectFunctionPointConfirm.jsp", 1123230054000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nSelectFunctionPointConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /SelectFunctionPointConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectFunctionPointConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectFunctionPointConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /SelectFunctionPointConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectFunctionPointConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectFunctionPointConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /SelectFunctionPointConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /SelectFunctionPointConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /SelectFunctionPointConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /SelectFunctionPointConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /SelectFunctionPointConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /SelectFunctionPointConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /SelectFunctionPointConfirm.jsp; Line: 14]
      //[ /SelectFunctionPointConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /SelectFunctionPointConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /SelectFunctionPointConfirm.jsp; Line: 21]
      } //[ /SelectFunctionPointConfirm.jsp; Line: 22]
      else{ //[ /SelectFunctionPointConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /SelectFunctionPointConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /SelectFunctionPointConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /SelectFunctionPointConfirm.jsp; Line: 26]
        Statement myStatement=null; //[ /SelectFunctionPointConfirm.jsp; Line: 27]
        myConn=ds.getConnection(); //[ /SelectFunctionPointConfirm.jsp; Line: 28]
        myStatement=myConn.createStatement(); //[ /SelectFunctionPointConfirm.jsp; Line: 29]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /SelectFunctionPointConfirm.jsp; Line: 32]
        String sql=new String(); //[ /SelectFunctionPointConfirm.jsp; Line: 33]
        ResultSet rs; //[ /SelectFunctionPointConfirm.jsp; Line: 34]
        String textName=new String(); //[ /SelectFunctionPointConfirm.jsp; Line: 35]
        String functionPointName=new String(); //[ /SelectFunctionPointConfirm.jsp; Line: 36]
        long functionPointID=0; //[ /SelectFunctionPointConfirm.jsp; Line: 37]
        //[ /SelectFunctionPointConfirm.jsp; Line: 38]
        textName="t"+request.getParameter("radiobutton"); //[ /SelectFunctionPointConfirm.jsp; Line: 39]
        functionPointID=Integer.parseInt(request.getParameter(textName)); //[ /SelectFunctionPointConfirm.jsp; Line: 40]
        //[ /SelectFunctionPointConfirm.jsp; Line: 41]
        sql="select fun_p_id,fun_n from tctc_function_point where fun_p_id="+functionPointID; //[ /SelectFunctionPointConfirm.jsp; Line: 42]
        rs=myStatement.executeQuery(sql); //[ /SelectFunctionPointConfirm.jsp; Line: 43]
        //[ /SelectFunctionPointConfirm.jsp; Line: 44]
        if(rs.next()){ //[ /SelectFunctionPointConfirm.jsp; Line: 45]
          //[ /SelectFunctionPointConfirm.jsp; Line: 46]
          functionPointName=rs.getString("fun_n"); //[ /SelectFunctionPointConfirm.jsp; Line: 47]
          session.setAttribute("FunctionPointName",functionPointName); //[ /SelectFunctionPointConfirm.jsp; Line: 48]
          session.setAttribute("FunctionPointID",String.valueOf(functionPointID)); //[ /SelectFunctionPointConfirm.jsp; Line: 49]
          session.setAttribute("TestElementName","null"); //[ /SelectFunctionPointConfirm.jsp; Line: 50]
          session.setAttribute("TestElementID","null"); //[ /SelectFunctionPointConfirm.jsp; Line: 51]
          session.setAttribute("Type","c"); //[ /SelectFunctionPointConfirm.jsp; Line: 52]
          session.setAttribute("CR_Number","null"); //[ /SelectFunctionPointConfirm.jsp; Line: 53]
          _writeText(response, out, _wl_block5, _wl_block5Bytes);
          //[ /SelectFunctionPointConfirm.jsp; Line: 58]
        } //[ /SelectFunctionPointConfirm.jsp; Line: 59]
        else //[ /SelectFunctionPointConfirm.jsp; Line: 60]
        { //[ /SelectFunctionPointConfirm.jsp; Line: 61]
          session.setAttribute("Error","3.2"); //[ /SelectFunctionPointConfirm.jsp; Line: 62]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /SelectFunctionPointConfirm.jsp; Line: 67]
          //[ /SelectFunctionPointConfirm.jsp; Line: 68]
        } //[ /SelectFunctionPointConfirm.jsp; Line: 69]
        //[ /SelectFunctionPointConfirm.jsp; Line: 70]
        //[ /SelectFunctionPointConfirm.jsp; Line: 71]
        rs.close(); //[ /SelectFunctionPointConfirm.jsp; Line: 72]
        _writeText(response, out, _wl_block7, _wl_block7Bytes);
        //[ /SelectFunctionPointConfirm.jsp; Line: 75]
        myConn.close(); //[ /SelectFunctionPointConfirm.jsp; Line: 76]
        myStatement.close(); //[ /SelectFunctionPointConfirm.jsp; Line: 77]
      } //[ /SelectFunctionPointConfirm.jsp; Line: 78]
      _writeText(response, out, _wl_block8, _wl_block8Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
