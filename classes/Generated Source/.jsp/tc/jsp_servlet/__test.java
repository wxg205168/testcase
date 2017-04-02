/* compiled from JSP: /test.jsp
*
* This code was automatically generated at 10:09:03 on 2005-7-20
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
* This code was automatically generated at 10:09:04 on 2005-7-20
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __test
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/test.jsp", 1119774686000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/test.jsp", 1119774686000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<!-- DW6 -->\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n<title>Test Case System</title>\r\n<link rel=\"stylesheet\" href=\"emx_nav_left.css\" type=\"text/css\" />\r\n\r\n<style type=\"text/css\">\r\n<!--\r\n.style1 {font-size: small}\r\n.style88 {\r\n\tfont-weight: bold;\r\n\tfont-size: 36px;\r\n\tfont-family: Arial, Helvetica, sans-serif;\r\n}\r\n.style6 {font-size: small}\r\n.style8 {font-size: small}\r\n\r\n.style11 {\r\n\tcolor: #3399FF;\r\n\tfont-size: small;\r\n}\r\n\r\n.style7 {font-size:large}\r\n\r\n.style10 {\r\n\tcolor: #0000FF;\r\n\tfont-weight: bold;\r\n}\r\n.style12 {font-size: small; color: #FF0000; }\r\n.style100 {font-size: large}\r\n-->\r\n</style>\r\n</head>\r\n\r\n\r\n<body>\r\n<form>\r\n<div id=\"masthead2\">\r\n  <center>\r\n  <h1 class=\"style88\" id=\"siteName\">Test Case Generator</h1>\r\n  <div id=\"globalNav\" class=\"style1\">\r\n    <img alt=\"\" src=\"gblnav_left.gif\" height=\"32\" width=\"4\" id=\"gnl\" /> <img alt=\"\" src=\"glbnav_right.gif\" height=\"32\" width=\"4\" id=\"gnr\" />\r\n    <div id=\"globalLink1\">\r\n\r\n      <a href=\"Project.jsp\" target=\"_parent\" id=\"gl1\" class=\"glink\" >Project\r\n      </a><a href=\"UseCase.jsp\" target=\'_parent\' id=\"gl2\" class=\"glink\" >Use Case\r\n      </a><a href=\"FunctionPoint.jsp\" target=\'_parent\' id=\"gl3\" class=\"glink\" >Function Point\r\n      </a><a href=\"TestElement.jsp\" target=\'_parent\' id=\"gl4\" class=\"glink\" >Test Element\r\n      </a><a href=\"EnquireCRInfromation.jsp\" target=\'_parent\' id=\"gl5\" class=\"glink\" >Test Case Material\r\n      </a><a href=\"DeleteTestCondition.jsp\" target=\'_parent\' id=\"gl6\" class=\"glink\" >Test Condition\r\n      </a><a href=\"EnquireTestCase.jsp\" target=\'_parent\' id=\"gl7\" class=\"glink\" >Test Case\r\n      </a><a href=\"EnquireTestSpec.jsp\" target=\'_parent\' id=\"gl7\" class=\"glink\" >Test Spec\r\n      </a>\r\n    </div>\r\n\r\n  </div>\r\n</center>\r\n</div>\r\n\r\n<div id=\"pagecell3\">\r\n  <!--pagecell1-->\r\n  <img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> <img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n\r\n  <div id=\"col2\">\r\n    <div class=\"feature\">\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n    </div>\r\n  </div>\r\n  <!--end col2 -->\r\n  <div id=\"pageNav\">\r\n    <div id=\"sectionLinks\">\r\n      <p><label><span class=\"style100\">Project:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "</span></label></p>\r\n      <p><label><span class=\"style100\">Usecase:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "</span></label></p>\r\n      <p><label><span class=\"style100\">FunctionPoint:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "</span></label></p>\r\n      <p><label><span class=\"style100\">TestElement:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "</span></label></p>\r\n    </div>\r\n  </div>\r\n</div>\r\n<br />\r\n</form>\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  
  
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
      out.print(String.valueOf(session.getAttribute("ProjectName") ));  //[ /test.jsp; Line: 119]
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      out.print(String.valueOf(session.getAttribute("UseCaseName") ));  //[ /test.jsp; Line: 120]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      out.print(String.valueOf(session.getAttribute("FunctionPointName") ));  //[ /test.jsp; Line: 121]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      out.print(String.valueOf(session.getAttribute("TestElementName") ));  //[ /test.jsp; Line: 122]
      _writeText(response, out, _wl_block4, _wl_block4Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
