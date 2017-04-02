/* compiled from JSP: /SendTestSpecConfirm.jsp
*
* This code was automatically generated at 20:28:17 on 2005-6-29
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
* This code was automatically generated at 20:28:17 on 2005-6-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __sendtestspecconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SendTestSpecConfirm.jsp", 1120048088000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SendTestSpecConfirm.jsp", 1120048088000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<body>\r\n<form method=\"post\" action=\"DeleteTestCaseConfirm.jsp\">\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'EnquireTestSpec.jsp\'\r\n</script>\r\n\r\n</form>\r\n</body>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  
  
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
      excel.GenerateExcel excel = null; //[ /SendTestSpecConfirm.jsp; Line: 3]
      excel = (excel.GenerateExcel)pageContext.getAttribute("excel"); //[ /SendTestSpecConfirm.jsp; Line: 3]
      if (excel == null) { // begin 'excel' instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 3]
        { // Don't need to synchronize on page scope //[ /SendTestSpecConfirm.jsp; Line: 3]
          excel = (excel.GenerateExcel)pageContext.getAttribute("excel"); //[ /SendTestSpecConfirm.jsp; Line: 3]
          if (excel == null) { // begin 'excel' synchronized instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 3]
            excel = new excel.GenerateExcel(); //[ /SendTestSpecConfirm.jsp; Line: 3]
            pageContext.setAttribute("excel", excel); //[ /SendTestSpecConfirm.jsp; Line: 3]
          } // end synchronized bean instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 3]
        } // end synchronized bean scope block... //[ /SendTestSpecConfirm.jsp; Line: 3]
      } // end bean instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 3]
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      mydb.DatabaseBean tt = null; //[ /SendTestSpecConfirm.jsp; Line: 4]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SendTestSpecConfirm.jsp; Line: 4]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 4]
        { // Don't need to synchronize on page scope //[ /SendTestSpecConfirm.jsp; Line: 4]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SendTestSpecConfirm.jsp; Line: 4]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 4]
            tt = new mydb.DatabaseBean(); //[ /SendTestSpecConfirm.jsp; Line: 4]
            pageContext.setAttribute("tt", tt); //[ /SendTestSpecConfirm.jsp; Line: 4]
          } // end synchronized bean instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 4]
        } // end synchronized bean scope block... //[ /SendTestSpecConfirm.jsp; Line: 4]
      } // end bean instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 4]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      email.Email sm = null; //[ /SendTestSpecConfirm.jsp; Line: 5]
      sm = (email.Email)pageContext.getAttribute("sm"); //[ /SendTestSpecConfirm.jsp; Line: 5]
      if (sm == null) { // begin 'sm' instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 5]
        { // Don't need to synchronize on page scope //[ /SendTestSpecConfirm.jsp; Line: 5]
          sm = (email.Email)pageContext.getAttribute("sm"); //[ /SendTestSpecConfirm.jsp; Line: 5]
          if (sm == null) { // begin 'sm' synchronized instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 5]
            sm = new email.Email(); //[ /SendTestSpecConfirm.jsp; Line: 5]
            pageContext.setAttribute("sm", sm); //[ /SendTestSpecConfirm.jsp; Line: 5]
          } // end synchronized bean instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 5]
        } // end synchronized bean scope block... //[ /SendTestSpecConfirm.jsp; Line: 5]
      } // end bean instantiation block... //[ /SendTestSpecConfirm.jsp; Line: 5]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /SendTestSpecConfirm.jsp; Line: 7]
      String projectName=(String)session.getAttribute("ProjectName"); //[ /SendTestSpecConfirm.jsp; Line: 8]
      String sProjectID=(String)session.getAttribute("ProjectID"); //[ /SendTestSpecConfirm.jsp; Line: 9]
      //[ /SendTestSpecConfirm.jsp; Line: 10]
      if(!sProjectID.equals("null")){ //[ /SendTestSpecConfirm.jsp; Line: 11]
        long projectID=Integer.parseInt(sProjectID); //[ /SendTestSpecConfirm.jsp; Line: 12]
        //String fileName="D:/"+projectName+".xls"; //[ /SendTestSpecConfirm.jsp; Line: 13]
        String fileName=projectName+".xls"; //[ /SendTestSpecConfirm.jsp; Line: 14]
        excel.getExcel(sProjectID,fileName); //[ /SendTestSpecConfirm.jsp; Line: 15]
      } //[ /SendTestSpecConfirm.jsp; Line: 16]
      _writeText(response, out, _wl_block4, _wl_block4Bytes);
      //[ /SendTestSpecConfirm.jsp; Line: 19]
      String to =new String(); //[ /SendTestSpecConfirm.jsp; Line: 20]
      to=(String)session.getAttribute("UserName")+"@bhr.com.cn"; //[ /SendTestSpecConfirm.jsp; Line: 21]
      String subject=(String)session.getAttribute("ProjectName"); //[ /SendTestSpecConfirm.jsp; Line: 22]
      String mail="Please view test spec"; //[ /SendTestSpecConfirm.jsp; Line: 23]
      //String addition="D:\\"+ subject +".xls"; //[ /SendTestSpecConfirm.jsp; Line: 24]
      String addition=subject +".xls"; //[ /SendTestSpecConfirm.jsp; Line: 25]
      sm.sendmail(to,subject,mail,addition); //[ /SendTestSpecConfirm.jsp; Line: 26]
      _writeText(response, out, _wl_block5, _wl_block5Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
