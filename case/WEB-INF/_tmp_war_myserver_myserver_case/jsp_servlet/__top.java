/* compiled from JSP: /Top.jsp
*
* This code was automatically generated at 12:46:53 on 2005-8-29
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
* This code was automatically generated at 12:46:53 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __top
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Top.jsp", 1123665080000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Top.jsp", 1123665080000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n}\r\n-->\r\n</style></head>\r\n\r\n<body>\r\n<table width=\"1021\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td><img src=\"image/top1.jpg\" width=\"1021\" height=\"96\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td><table width=\"1021\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td width=\"219\"><img src=\"image/top3.jpg\" width=\"219\" height=\"24\"></td>\r\n        <td bgcolor=\"#D9E2FF\"><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td width=\"59\"><a href=\"SelectProject.jsp\" target=\"_parent\"><img src=\"image/B1.jpg\" alt=\"Project\" width=\"59\" height=\"24\" border=\"0\"></a></td>\r\n            <td width=\"23\"><img src=\"image/B.jpg\" width=\"23\" height=\"24\"></td>\r\n            <td width=\"75\"><a href=\"SelectUseCase.jsp\" target=\'_parent\'><img src=\"image/B2.jpg\" alt=\"Use Case\" width=\"75\" height=\"24\" border=\"0\"></a></td>\r\n            <td width=\"23\"><img src=\"image/B.jpg\" width=\"23\" height=\"24\"></td>\r\n            <td width=\"102\"><a href=\"SelectFunctionPoint.jsp\" target=\'_parent\'><img src=\"image/B3.jpg\" alt=\"Function Point\" width=\"102\" height=\"24\" border=\"0\"></a></td>\r\n            <td width=\"23\"><img src=\"image/B.jpg\" width=\"23\" height=\"24\"></td>\r\n            <td width=\"91\"><a href=\"SelectTestElement.jsp\" target=\'_parent\'><img src=\"image/B4.jpg\" alt=\"Test Element\" width=\"91\" height=\"24\" border=\"0\"></a></td>\r\n            <td width=\"23\"><img src=\"image/B.jpg\" width=\"23\" height=\"24\"></td>\r\n            <td width=\"131\"><a href=\"EnquireCRInfromation.jsp\" target=\'_parent\'><img src=\"image/B5.jpg\" alt=\"Test Case Material\" width=\"131\" height=\"24\" border=\"0\"></a></td>\r\n            <td width=\"23\"><img src=\"image/B.jpg\" width=\"23\" height=\"24\"></td>\r\n            <td width=\"75\"><a href=\"EnquireTestCase1.jsp\" target=\'_parent\'><img src=\"image/B7.jpg\" alt=\"Test Case\" width=\"75\" height=\"24\" border=\"0\"></a></td>\r\n            <td width=\"23\"><img src=\"image/B.jpg\" width=\"23\" height=\"24\"></td>\r\n            <td width=\"73\"><a href=\"EnquireTestSpec.jsp\" target=\'_parent\'><img src=\"image/B8.jpg\" alt=\"Test Spec\" width=\"73\" height=\"24\" border=\"0\"></a></td>\r\n            <td>&nbsp;</td>\r\n          </tr>\r\n        </table></td>\r\n      </tr>\r\n    </table></td>\r\n  </tr>\r\n  <tr>\r\n    <td><img src=\"image/top2.jpg\" width=\"1021\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n</body>\r\n</html>\r\n";
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
