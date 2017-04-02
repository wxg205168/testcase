/* compiled from JSP: /CreateUseCase_Right.jsp
*
* This code was automatically generated at 10:06:55 on 2005-7-20
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
* This code was automatically generated at 10:06:55 on 2005-7-20
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __createusecase_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateUseCase_Right.jsp", 1118819694000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/CreateUseCase_Right.jsp", 1118819694000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<!-- DW6 -->\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n<title>Test Case System</title>\r\n<link rel=\"stylesheet\" href=\"emx_nav_left.css\" type=\"text/css\" />\r\n\r\n<style type=\"text/css\">\r\n<!--\r\n.style1 {font-size: small}\r\n.style6 {font-size: small}\r\n.style4 {font-size: large}\r\n.style7 {font-size: x-large}\r\n.style8 {font-size: small}\r\n-->\r\n</style>\r\n</head>\r\n\r\n\r\n<body>\r\n<form>\r\n<div id=\"pagecell2\">\r\n  <img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> <img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n  <div id=\"breadCrumb\">\r\n  <p></p>\r\n\t  <center>\r\n\t  <table width=\"750\" border=\"0\">\r\n\t    <tr>\r\n\t\t  <td align=\"left\"><h3><span class=\"style8\">Use Case Information:</span></h3></td>\r\n\t\t</tr>\r\n\t  </table>\r\n      <table width=\"750\" border=\"1\">\r\n        <tr>\r\n          <td width=\"150\" align=\"left\">UseCase Name </td>\r\n          <td width=\"584\" align=\"left\"><input name=\"textfield\" type=\"text\" size=\"92\" maxlength=\"100\" /></td>\r\n        </tr>\r\n      </table>      \r\n      <p>&nbsp;</p>\r\n      <input type=\"button\" name=\"Submit2\" value=\"Create UseCase\" onclick = \"parent.location.href=\'SelectUseCase.jsp\'\">\r\n\t  </center>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n  </div>\r\n\r\n</div>\r\n<!--end pagecell1-->\r\n<br />\r\n</form>\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  
  
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
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
