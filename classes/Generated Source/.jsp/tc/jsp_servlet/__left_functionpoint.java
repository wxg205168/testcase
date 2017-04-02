/* compiled from JSP: /Left_FunctionPoint.jsp
*
* This code was automatically generated at 16:50:07 on 2005-8-4
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
import java.util.Enumeration; //[ /Left_FunctionPoint.jsp; Line: 24]


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
* This code was automatically generated at 16:50:07 on 2005-8-4
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __left_functionpoint
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Left_FunctionPoint.jsp", 1123145370000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Left_FunctionPoint.jsp", 1123145370000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-image: url(image/left_bg.jpg);\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n}\r\n.style2 {\r\n\tfont-size: 18px;\r\n\tfont-weight: bold;\r\n\tcolor: #FFFFFF;\r\n}\r\n-->\r\n</style>\r\n</head>\r\n\r\n<body>\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<table width=\"180\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td>&nbsp;</td>\r\n    <td>&nbsp;</td>\r\n  </tr>\r\n  <tr>\r\n    <td width=\"10\">&nbsp;</td>\r\n    <td width=\"170\"><span class=\"style2\"> Project:</span></td>\r\n  </tr>\r\n  <tr>\r\n    <td>&nbsp;</td>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n    <td height=\"50\">";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "</td>\r\n  </tr>\r\n  <tr>\r\n    <td>&nbsp;</td>\r\n    <td> <span class=\"style2\">Usecase:</span></td>\r\n  </tr>\r\n  <tr>\r\n    <td>&nbsp;</td>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n    <td height=\"50\">";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "</td>\r\n  </tr>\r\n  <tr>\r\n    <td>&nbsp;</td>\r\n    <td><span class=\"style2\">FunctionPoint:</span></td>\r\n  </tr>\r\n  <tr>\r\n    <td>&nbsp;</td>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n    <td height=\"50\">";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "</td>\r\n  </tr>\r\n</table>\r\n\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  
  
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
    
    out = pageContext.getOut();
    JspWriter _originalOut = out;
    
    javax.servlet.http.HttpSession session = request.getSession(true);
    
    
    
    try { // error page try block
      
      _writeText(response, out, _wl_block0, _wl_block0Bytes);
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      managestring.mystring rr = null; //[ /Left_FunctionPoint.jsp; Line: 25]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /Left_FunctionPoint.jsp; Line: 25]
      if (rr == null) { // begin 'rr' instantiation block... //[ /Left_FunctionPoint.jsp; Line: 25]
        { // Don't need to synchronize on page scope //[ /Left_FunctionPoint.jsp; Line: 25]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /Left_FunctionPoint.jsp; Line: 25]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /Left_FunctionPoint.jsp; Line: 25]
            rr = new managestring.mystring(); //[ /Left_FunctionPoint.jsp; Line: 25]
            pageContext.setAttribute("rr", rr); //[ /Left_FunctionPoint.jsp; Line: 25]
          } // end synchronized bean instantiation block... //[ /Left_FunctionPoint.jsp; Line: 25]
        } // end synchronized bean scope block... //[ /Left_FunctionPoint.jsp; Line: 25]
      } // end bean instantiation block... //[ /Left_FunctionPoint.jsp; Line: 25]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /Left_FunctionPoint.jsp; Line: 27]
      Enumeration ss=session.getAttributeNames(); //[ /Left_FunctionPoint.jsp; Line: 28]
      //[ /Left_FunctionPoint.jsp; Line: 29]
      if(!ss.hasMoreElements()){ //[ /Left_FunctionPoint.jsp; Line: 30]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /Left_FunctionPoint.jsp; Line: 35]
      } //[ /Left_FunctionPoint.jsp; Line: 36]
      else{ //[ /Left_FunctionPoint.jsp; Line: 37]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /Left_FunctionPoint.jsp; Line: 40]
        String temp; //[ /Left_FunctionPoint.jsp; Line: 41]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /Left_FunctionPoint.jsp; Line: 54]
        temp=new String(); //[ /Left_FunctionPoint.jsp; Line: 55]
        temp=(String)session.getAttribute("ProjectName"); //[ /Left_FunctionPoint.jsp; Line: 56]
        if(temp.equals("null")){ //[ /Left_FunctionPoint.jsp; Line: 57]
          temp="N.A."; //[ /Left_FunctionPoint.jsp; Line: 58]
        } //[ /Left_FunctionPoint.jsp; Line: 59]
        _writeText(response, out, _wl_block6, _wl_block6Bytes);
        out.print(String.valueOf(rr.replace(temp) ));  //[ /Left_FunctionPoint.jsp; Line: 61]
        _writeText(response, out, _wl_block7, _wl_block7Bytes);
        //[ /Left_FunctionPoint.jsp; Line: 69]
        temp=new String(); //[ /Left_FunctionPoint.jsp; Line: 70]
        temp=(String)session.getAttribute("UseCaseName"); //[ /Left_FunctionPoint.jsp; Line: 71]
        if(temp.equals("null")){ //[ /Left_FunctionPoint.jsp; Line: 72]
          temp="N.A."; //[ /Left_FunctionPoint.jsp; Line: 73]
        } //[ /Left_FunctionPoint.jsp; Line: 74]
        _writeText(response, out, _wl_block8, _wl_block8Bytes);
        out.print(String.valueOf(rr.replace(temp) ));  //[ /Left_FunctionPoint.jsp; Line: 76]
        _writeText(response, out, _wl_block9, _wl_block9Bytes);
        //[ /Left_FunctionPoint.jsp; Line: 84]
        temp=new String(); //[ /Left_FunctionPoint.jsp; Line: 85]
        temp=(String)session.getAttribute("FunctionPointName"); //[ /Left_FunctionPoint.jsp; Line: 86]
        if(temp.equals("null")){ //[ /Left_FunctionPoint.jsp; Line: 87]
          temp="N.A."; //[ /Left_FunctionPoint.jsp; Line: 88]
        } //[ /Left_FunctionPoint.jsp; Line: 89]
        _writeText(response, out, _wl_block10, _wl_block10Bytes);
        out.print(String.valueOf(rr.replace(temp) ));  //[ /Left_FunctionPoint.jsp; Line: 91]
        _writeText(response, out, _wl_block11, _wl_block11Bytes);
        //[ /Left_FunctionPoint.jsp; Line: 95]
      } //[ /Left_FunctionPoint.jsp; Line: 96]
      _writeText(response, out, _wl_block12, _wl_block12Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
