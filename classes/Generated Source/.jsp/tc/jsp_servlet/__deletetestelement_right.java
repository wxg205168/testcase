/* compiled from JSP: /DeleteTestElement_Right.jsp
*
* This code was automatically generated at 10:07:29 on 2005-7-20
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
import java.sql.*; //[ /DeleteTestElement_Right.jsp; Line: 32]


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
* This code was automatically generated at 10:07:29 on 2005-7-20
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletetestelement_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestElement_Right.jsp", 1119874890000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestElement_Right.jsp", 1119874890000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<!-- DW6 -->\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n<title>Test Case System</title>\r\n<link rel=\"stylesheet\" href=\"emx_nav_left.css\" type=\"text/css\" />\r\n\r\n<style type=\"text/css\">\r\n<!--\r\n.style7 {font-size: large}\r\n.style8 {font-size: small}\r\n.style12 {font-size: small; color: #FF0000; }\r\n.style13 {\r\n\tcolor: #0000FF;\r\n\tfont-weight: bold;\r\n}\r\n-->\r\n</style>\r\n</head>\r\n\r\n\r\n<body>\r\n\r\n\r\n<div id=\"pagecell2\">\r\n  <img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> <img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n  <div id=\"breadCrumb\">\r\n\r\n<form method=\"post\" action=\"DeleteTestElementConfirm.jsp\">\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n  <p></p>\r\n      <center>\r\n\t  <table width=\"750\" border=\"0\">\r\n\t    <tr>\r\n\t\t  <td align=\"left\"><h3>\r\n\t\t    <label><span class=\"style7\">TestElement List</span></label>\r\n\t\t  </h3></td>\r\n\t\t</tr>\r\n\t\t<tr><td height=\"30\"></td></tr>\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\t    <tr>\r\n\t\t  <td align=\"left\"><h3>\r\n\t\t    <label><span class=\"style8\">You can select a testelement to delete from list:</span></label>\r\n\t\t  </h3></td>\r\n            </tr>\r\n\t  </table>\r\n      <table width=\"750\" border=\"1\">\r\n        <tr>\r\n          <td width=\"20\">&nbsp;</td>\r\n          <td width=\"710\" align=\"left\"><span class=\"style13\">TestElement Name </span></td>\r\n        </tr>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n        <tr>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n          <td align=\"center\"><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = " checked=\"checked\" /></td>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n          <td align=\"center\"><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = " /></td>\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n          <td align=\"left\">";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "<input type=\"hidden\" name=";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = " value=";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "></td>\r\n        </tr>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n      </table>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n      <p>&nbsp;</p>\r\n      <input type=\"Submit\" name=\"Submit\" value=\"Delete TestElement\">\r\n\t  </center>\r\n  <p></p>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n</form>\r\n\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n\r\n  </div>\r\n\r\n</div>\r\n<!--end pagecell1-->\r\n\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  
  
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
      mydb.DatabaseBean tt = null; //[ /DeleteTestElement_Right.jsp; Line: 33]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestElement_Right.jsp; Line: 33]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteTestElement_Right.jsp; Line: 33]
        { // Don't need to synchronize on page scope //[ /DeleteTestElement_Right.jsp; Line: 33]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestElement_Right.jsp; Line: 33]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteTestElement_Right.jsp; Line: 33]
            tt = new mydb.DatabaseBean(); //[ /DeleteTestElement_Right.jsp; Line: 33]
            pageContext.setAttribute("tt", tt); //[ /DeleteTestElement_Right.jsp; Line: 33]
          } // end synchronized bean instantiation block... //[ /DeleteTestElement_Right.jsp; Line: 33]
        } // end synchronized bean scope block... //[ /DeleteTestElement_Right.jsp; Line: 33]
      } // end bean instantiation block... //[ /DeleteTestElement_Right.jsp; Line: 33]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteTestElement_Right.jsp; Line: 44]
      String sql=new String(); //[ /DeleteTestElement_Right.jsp; Line: 45]
      ResultSet rs; //[ /DeleteTestElement_Right.jsp; Line: 46]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /DeleteTestElement_Right.jsp; Line: 59]
      String radioName=new String(); //[ /DeleteTestElement_Right.jsp; Line: 60]
      String textName=new String(); //[ /DeleteTestElement_Right.jsp; Line: 61]
      String testElementName=new String(); //[ /DeleteTestElement_Right.jsp; Line: 62]
      int noData=0; //[ /DeleteTestElement_Right.jsp; Line: 63]
      //[ /DeleteTestElement_Right.jsp; Line: 64]
      String sProjectID=(String)session.getAttribute("ProjectID"); //[ /DeleteTestElement_Right.jsp; Line: 65]
      String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /DeleteTestElement_Right.jsp; Line: 66]
      String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /DeleteTestElement_Right.jsp; Line: 67]
      //[ /DeleteTestElement_Right.jsp; Line: 68]
      if(sProjectID.equals("null")){ //[ /DeleteTestElement_Right.jsp; Line: 69]
        //[ /DeleteTestElement_Right.jsp; Line: 70]
        session.setAttribute("Error","2.1"); //[ /DeleteTestElement_Right.jsp; Line: 71]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteTestElement_Right.jsp; Line: 76]
      } //[ /DeleteTestElement_Right.jsp; Line: 77]
      else if(sUseCaseID.equals("null")){ //[ /DeleteTestElement_Right.jsp; Line: 78]
        session.setAttribute("Error","3.1"); //[ /DeleteTestElement_Right.jsp; Line: 79]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteTestElement_Right.jsp; Line: 84]
      } //[ /DeleteTestElement_Right.jsp; Line: 85]
      else if(sFunctionPointID.equals("null")){ //[ /DeleteTestElement_Right.jsp; Line: 86]
        session.setAttribute("Error","4.1"); //[ /DeleteTestElement_Right.jsp; Line: 87]
        _writeText(response, out, _wl_block6, _wl_block6Bytes);
        //[ /DeleteTestElement_Right.jsp; Line: 92]
      } //[ /DeleteTestElement_Right.jsp; Line: 93]
      else{ //[ /DeleteTestElement_Right.jsp; Line: 94]
        //[ /DeleteTestElement_Right.jsp; Line: 95]
        long projectID=Integer.parseInt(sProjectID); //[ /DeleteTestElement_Right.jsp; Line: 96]
        long useCaseID=Integer.parseInt(sUseCaseID); //[ /DeleteTestElement_Right.jsp; Line: 97]
        long functionPointID=Integer.parseInt(sFunctionPointID); //[ /DeleteTestElement_Right.jsp; Line: 98]
        long testElementID=0; //[ /DeleteTestElement_Right.jsp; Line: 99]
        //[ /DeleteTestElement_Right.jsp; Line: 100]
        int number=0; //[ /DeleteTestElement_Right.jsp; Line: 101]
        //[ /DeleteTestElement_Right.jsp; Line: 102]
        sql="select element_id,element_name from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID; //[ /DeleteTestElement_Right.jsp; Line: 103]
        rs=tt.executeQuery(sql); //[ /DeleteTestElement_Right.jsp; Line: 104]
        //[ /DeleteTestElement_Right.jsp; Line: 105]
        if(rs.next()){ //[ /DeleteTestElement_Right.jsp; Line: 106]
          noData=1; //[ /DeleteTestElement_Right.jsp; Line: 107]
          //[ /DeleteTestElement_Right.jsp; Line: 108]
          do{ //[ /DeleteTestElement_Right.jsp; Line: 109]
            testElementID=rs.getLong("element_id"); //[ /DeleteTestElement_Right.jsp; Line: 110]
            testElementName=rs.getString("element_name"); //[ /DeleteTestElement_Right.jsp; Line: 111]
            number=number+1; //[ /DeleteTestElement_Right.jsp; Line: 112]
            radioName=String.valueOf(number); //[ /DeleteTestElement_Right.jsp; Line: 113]
            textName="t"+String.valueOf(number); //[ /DeleteTestElement_Right.jsp; Line: 114]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            //[ /DeleteTestElement_Right.jsp; Line: 117]
            if(number==1){ //[ /DeleteTestElement_Right.jsp; Line: 118]
              _writeText(response, out, _wl_block8, _wl_block8Bytes);
              out.print(String.valueOf(radioName ));  //[ /DeleteTestElement_Right.jsp; Line: 120]
              _writeText(response, out, _wl_block9, _wl_block9Bytes);
              //[ /DeleteTestElement_Right.jsp; Line: 121]
            } //[ /DeleteTestElement_Right.jsp; Line: 122]
            else{ //[ /DeleteTestElement_Right.jsp; Line: 123]
              _writeText(response, out, _wl_block10, _wl_block10Bytes);
              out.print(String.valueOf(radioName ));  //[ /DeleteTestElement_Right.jsp; Line: 125]
              _writeText(response, out, _wl_block11, _wl_block11Bytes);
              //[ /DeleteTestElement_Right.jsp; Line: 126]
            } //[ /DeleteTestElement_Right.jsp; Line: 127]
            _writeText(response, out, _wl_block12, _wl_block12Bytes);
            out.print(String.valueOf(testElementName ));  //[ /DeleteTestElement_Right.jsp; Line: 129]
            _writeText(response, out, _wl_block13, _wl_block13Bytes);
            out.print(String.valueOf(textName ));  //[ /DeleteTestElement_Right.jsp; Line: 129]
            _writeText(response, out, _wl_block14, _wl_block14Bytes);
            out.print(String.valueOf(testElementID ));  //[ /DeleteTestElement_Right.jsp; Line: 129]
            _writeText(response, out, _wl_block15, _wl_block15Bytes);
            //[ /DeleteTestElement_Right.jsp; Line: 131]
          }while(rs.next()); //[ /DeleteTestElement_Right.jsp; Line: 132]
          rs.close(); //[ /DeleteTestElement_Right.jsp; Line: 133]
          _writeText(response, out, _wl_block16, _wl_block16Bytes);
          //[ /DeleteTestElement_Right.jsp; Line: 136]
        } //[ /DeleteTestElement_Right.jsp; Line: 137]
        _writeText(response, out, _wl_block17, _wl_block17Bytes);
        //[ /DeleteTestElement_Right.jsp; Line: 139]
      } //[ /DeleteTestElement_Right.jsp; Line: 140]
      //[ /DeleteTestElement_Right.jsp; Line: 141]
      if(noData==1){ //[ /DeleteTestElement_Right.jsp; Line: 142]
        //[ /DeleteTestElement_Right.jsp; Line: 143]
        _writeText(response, out, _wl_block18, _wl_block18Bytes);
        //[ /DeleteTestElement_Right.jsp; Line: 149]
      } //[ /DeleteTestElement_Right.jsp; Line: 150]
      _writeText(response, out, _wl_block19, _wl_block19Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
