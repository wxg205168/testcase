/* compiled from JSP: /UpdateFunctionPointConfirm.jsp
*
* This code was automatically generated at 12:46:59 on 2005-8-29
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
import java.sql.*; //[ /UpdateFunctionPointConfirm.jsp; Line: 10]
import javax.sql.*; //[ /UpdateFunctionPointConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /UpdateFunctionPointConfirm.jsp; Line: 10]


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
* This code was automatically generated at 12:46:59 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __updatefunctionpointconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateFunctionPointConfirm.jsp", 1123658638000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/UpdateFunctionPointConfirm.jsp", 1123658638000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nUpdateFunctionPointConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n</body>\r\n</html>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
      if (rr == null) { // begin 'rr' instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
        { // Don't need to synchronize on page scope //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
            rr = new managestring.mystring(); //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
            pageContext.setAttribute("rr", rr); //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
          } // end synchronized bean instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
        } // end synchronized bean scope block... //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
      } // end bean instantiation block... //[ /UpdateFunctionPointConfirm.jsp; Line: 12]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /UpdateFunctionPointConfirm.jsp; Line: 14]
      Enumeration ss=session.getAttributeNames(); //[ /UpdateFunctionPointConfirm.jsp; Line: 15]
      //[ /UpdateFunctionPointConfirm.jsp; Line: 16]
      if(!ss.hasMoreElements()){ //[ /UpdateFunctionPointConfirm.jsp; Line: 17]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /UpdateFunctionPointConfirm.jsp; Line: 22]
      } //[ /UpdateFunctionPointConfirm.jsp; Line: 23]
      else{ //[ /UpdateFunctionPointConfirm.jsp; Line: 24]
        DataSource ds=null; //[ /UpdateFunctionPointConfirm.jsp; Line: 25]
        ds=tt.getDataSource(); //[ /UpdateFunctionPointConfirm.jsp; Line: 26]
        Connection myConn=null; //[ /UpdateFunctionPointConfirm.jsp; Line: 27]
        Statement myStatement1=null; //[ /UpdateFunctionPointConfirm.jsp; Line: 28]
        Statement myStatement2=null; //[ /UpdateFunctionPointConfirm.jsp; Line: 29]
        myConn=ds.getConnection(); //[ /UpdateFunctionPointConfirm.jsp; Line: 30]
        myStatement1=myConn.createStatement(); //[ /UpdateFunctionPointConfirm.jsp; Line: 31]
        myStatement2=myConn.createStatement(); //[ /UpdateFunctionPointConfirm.jsp; Line: 32]
        //[ /UpdateFunctionPointConfirm.jsp; Line: 33]
        String sql=new String(); //[ /UpdateFunctionPointConfirm.jsp; Line: 34]
        ResultSet rs=null; //[ /UpdateFunctionPointConfirm.jsp; Line: 35]
        String textName=new String(); //[ /UpdateFunctionPointConfirm.jsp; Line: 36]
        String textName1=new String(); //[ /UpdateFunctionPointConfirm.jsp; Line: 37]
        String functionPointName=new String(); //[ /UpdateFunctionPointConfirm.jsp; Line: 38]
        long functionPointID=0; //[ /UpdateFunctionPointConfirm.jsp; Line: 39]
        //[ /UpdateFunctionPointConfirm.jsp; Line: 40]
        textName="t"+request.getParameter("radiobutton"); //[ /UpdateFunctionPointConfirm.jsp; Line: 41]
        textName1="u"+request.getParameter("radiobutton"); //[ /UpdateFunctionPointConfirm.jsp; Line: 42]
        functionPointID=Integer.parseInt(request.getParameter(textName)); //[ /UpdateFunctionPointConfirm.jsp; Line: 43]
        functionPointName=(String)request.getParameter(textName1); //[ /UpdateFunctionPointConfirm.jsp; Line: 44]
        functionPointName=rr.replaceString(functionPointName); //[ /UpdateFunctionPointConfirm.jsp; Line: 45]
        functionPointName=rr.restore(functionPointName); //[ /UpdateFunctionPointConfirm.jsp; Line: 46]
        functionPointName=functionPointName.trim(); //[ /UpdateFunctionPointConfirm.jsp; Line: 47]
        //[ /UpdateFunctionPointConfirm.jsp; Line: 48]
        if(rr.checkString(functionPointName)){ //[ /UpdateFunctionPointConfirm.jsp; Line: 49]
          sql="select fun_p_id,fun_n from tctc_function_point where fun_p_id="+functionPointID; //[ /UpdateFunctionPointConfirm.jsp; Line: 50]
          rs=myStatement1.executeQuery(sql); //[ /UpdateFunctionPointConfirm.jsp; Line: 51]
          //[ /UpdateFunctionPointConfirm.jsp; Line: 52]
          if(rs.next()){ //[ /UpdateFunctionPointConfirm.jsp; Line: 53]
            if(((String)request.getParameter(textName)).equals((String)session.getAttribute("FunctionPointID"))){ //[ /UpdateFunctionPointConfirm.jsp; Line: 54]
              //[ /UpdateFunctionPointConfirm.jsp; Line: 55]
              session.setAttribute("FunctionPointName",functionPointName); //[ /UpdateFunctionPointConfirm.jsp; Line: 56]
            } //[ /UpdateFunctionPointConfirm.jsp; Line: 57]
            //[ /UpdateFunctionPointConfirm.jsp; Line: 58]
            sql="update tctc_function_point set fun_n='"+functionPointName+"' where fun_p_id="+functionPointID; //[ /UpdateFunctionPointConfirm.jsp; Line: 59]
            myStatement2.executeUpdate(sql); //[ /UpdateFunctionPointConfirm.jsp; Line: 60]
          } //[ /UpdateFunctionPointConfirm.jsp; Line: 61]
          else{ //[ /UpdateFunctionPointConfirm.jsp; Line: 62]
            session.setAttribute("Error","3.2"); //[ /UpdateFunctionPointConfirm.jsp; Line: 63]
          } //[ /UpdateFunctionPointConfirm.jsp; Line: 64]
          rs.close(); //[ /UpdateFunctionPointConfirm.jsp; Line: 65]
        } //[ /UpdateFunctionPointConfirm.jsp; Line: 66]
        else{ //[ /UpdateFunctionPointConfirm.jsp; Line: 67]
          session.setAttribute("Error","3.5"); //[ /UpdateFunctionPointConfirm.jsp; Line: 68]
        } //[ /UpdateFunctionPointConfirm.jsp; Line: 69]
        //[ /UpdateFunctionPointConfirm.jsp; Line: 70]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /UpdateFunctionPointConfirm.jsp; Line: 75]
        //[ /UpdateFunctionPointConfirm.jsp; Line: 76]
        myConn.close(); //[ /UpdateFunctionPointConfirm.jsp; Line: 77]
        myStatement1.close(); //[ /UpdateFunctionPointConfirm.jsp; Line: 78]
        myStatement2.close(); //[ /UpdateFunctionPointConfirm.jsp; Line: 79]
      } //[ /UpdateFunctionPointConfirm.jsp; Line: 80]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
