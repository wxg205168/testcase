/* compiled from JSP: /DeleteFunctionPoint_Right.jsp
*
* This code was automatically generated at 10:07:07 on 2005-7-20
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
import java.sql.*; //[ /DeleteFunctionPoint_Right.jsp; Line: 32]


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
* This code was automatically generated at 10:07:07 on 2005-7-20
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletefunctionpoint_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteFunctionPoint_Right.jsp", 1119871504000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteFunctionPoint_Right.jsp", 1119871504000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<!-- DW6 -->\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n<title>Test Case System</title>\r\n<link rel=\"stylesheet\" href=\"emx_nav_left.css\" type=\"text/css\" />\r\n\r\n<style type=\"text/css\">\r\n<!--\r\n.style7 {font-size: large}\r\n.style8 {font-size: small}\r\n.style12 {font-size: small; color: #FF0000; }\r\n.style13 {\r\n\tcolor: #0000FF;\r\n\tfont-weight: bold;\r\n}\r\n-->\r\n</style>\r\n</head>\r\n\r\n\r\n<body>\r\n\r\n\r\n<div id=\"pagecell2\">\r\n  <img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> <img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n  <div id=\"breadCrumb\">\r\n\r\n<form method=\"post\" action=\"DeleteFunctionPointConfirm.jsp\">\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n  <p></p>\r\n      <center>\r\n\t  <table width=\"750\" border=\"0\">\r\n\t    <tr>\r\n\t\t  <td align=\"left\"><h3>\r\n\t\t    <label><span class=\"style7\">FunctionPoint List</span></label>\r\n\t\t  </h3></td>\r\n\t\t</tr>\r\n\t\t<tr><td height=\"30\"></td></tr>\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\t    <tr>\r\n\t\t  <td align=\"left\"><h3>\r\n\t\t    <label><span class=\"style8\">You can select a functionpoint to delete from list:</span></label>\r\n\t\t  </h3></td>\r\n\t    </tr>\r\n\t  </table>\r\n      <table width=\"750\" border=\"1\">\r\n        <tr>\r\n          <td width=\"20\">&nbsp;</td>\r\n          <td width=\"710\" align=\"left\"><span class=\"style13\">FunctionPoint Name </span></td>\r\n        </tr>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n        <tr>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n          <td align=\"center\"><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = " checked=\"checked\" /></td>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n          <td align=\"center\"><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = " /></td>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n          <td align=\"left\">";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "<input type=\"hidden\" name=";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = " value=";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "></td>\r\n        </tr>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n      </table>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n      <p>&nbsp;</p>\r\n      <input type=\"Submit\" name=\"Submit3\" value=\"Delete FunctionPoint\" >\r\n\t  </center>\r\n  <p></p>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n</form>\r\n\r\n  </div>\r\n\r\n</div>\r\n<!--end pagecell1-->\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  
  
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
      mydb.DatabaseBean tt = null; //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
        { // Don't need to synchronize on page scope //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
            tt = new mydb.DatabaseBean(); //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
            pageContext.setAttribute("tt", tt); //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
          } // end synchronized bean instantiation block... //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
        } // end synchronized bean scope block... //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
      } // end bean instantiation block... //[ /DeleteFunctionPoint_Right.jsp; Line: 33]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteFunctionPoint_Right.jsp; Line: 44]
      String sql=new String(); //[ /DeleteFunctionPoint_Right.jsp; Line: 45]
      ResultSet rs; //[ /DeleteFunctionPoint_Right.jsp; Line: 46]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /DeleteFunctionPoint_Right.jsp; Line: 59]
      String radioName=new String(); //[ /DeleteFunctionPoint_Right.jsp; Line: 60]
      String textName=new String(); //[ /DeleteFunctionPoint_Right.jsp; Line: 61]
      String functionPointName=new String(); //[ /DeleteFunctionPoint_Right.jsp; Line: 62]
      int noData=0; //[ /DeleteFunctionPoint_Right.jsp; Line: 63]
      //[ /DeleteFunctionPoint_Right.jsp; Line: 64]
      String sProjectID=(String)session.getAttribute("ProjectID"); //[ /DeleteFunctionPoint_Right.jsp; Line: 65]
      String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /DeleteFunctionPoint_Right.jsp; Line: 66]
      //[ /DeleteFunctionPoint_Right.jsp; Line: 67]
      if(sProjectID.equals("null")){ //[ /DeleteFunctionPoint_Right.jsp; Line: 68]
        //[ /DeleteFunctionPoint_Right.jsp; Line: 69]
        session.setAttribute("Error","2.1"); //[ /DeleteFunctionPoint_Right.jsp; Line: 70]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteFunctionPoint_Right.jsp; Line: 75]
      } //[ /DeleteFunctionPoint_Right.jsp; Line: 76]
      else if(sUseCaseID.equals("null")){ //[ /DeleteFunctionPoint_Right.jsp; Line: 77]
        session.setAttribute("Error","3.1"); //[ /DeleteFunctionPoint_Right.jsp; Line: 78]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteFunctionPoint_Right.jsp; Line: 83]
      } //[ /DeleteFunctionPoint_Right.jsp; Line: 84]
      else{ //[ /DeleteFunctionPoint_Right.jsp; Line: 85]
        //[ /DeleteFunctionPoint_Right.jsp; Line: 86]
        long projectID=Integer.parseInt(sProjectID); //[ /DeleteFunctionPoint_Right.jsp; Line: 87]
        long useCaseID=Integer.parseInt(sUseCaseID); //[ /DeleteFunctionPoint_Right.jsp; Line: 88]
        long functionPointID=0; //[ /DeleteFunctionPoint_Right.jsp; Line: 89]
        //[ /DeleteFunctionPoint_Right.jsp; Line: 90]
        int number=0; //[ /DeleteFunctionPoint_Right.jsp; Line: 91]
        //[ /DeleteFunctionPoint_Right.jsp; Line: 92]
        sql="select fun_p_id,fun_n from tctc_function_point where pro_id=" +projectID+" and uc_id="+useCaseID; //[ /DeleteFunctionPoint_Right.jsp; Line: 93]
        rs=tt.executeQuery(sql); //[ /DeleteFunctionPoint_Right.jsp; Line: 94]
        //[ /DeleteFunctionPoint_Right.jsp; Line: 95]
        if(rs.next()){ //[ /DeleteFunctionPoint_Right.jsp; Line: 96]
          noData=1; //[ /DeleteFunctionPoint_Right.jsp; Line: 97]
          //[ /DeleteFunctionPoint_Right.jsp; Line: 98]
          do{ //[ /DeleteFunctionPoint_Right.jsp; Line: 99]
            functionPointID=rs.getLong("fun_p_id"); //[ /DeleteFunctionPoint_Right.jsp; Line: 100]
            functionPointName=rs.getString("fun_n"); //[ /DeleteFunctionPoint_Right.jsp; Line: 101]
            number=number+1; //[ /DeleteFunctionPoint_Right.jsp; Line: 102]
            radioName=String.valueOf(number); //[ /DeleteFunctionPoint_Right.jsp; Line: 103]
            textName="t"+String.valueOf(number); //[ /DeleteFunctionPoint_Right.jsp; Line: 104]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            //[ /DeleteFunctionPoint_Right.jsp; Line: 107]
            if(number==1){ //[ /DeleteFunctionPoint_Right.jsp; Line: 108]
              _writeText(response, out, _wl_block7, _wl_block7Bytes);
              out.print(String.valueOf(radioName ));  //[ /DeleteFunctionPoint_Right.jsp; Line: 110]
              _writeText(response, out, _wl_block8, _wl_block8Bytes);
              //[ /DeleteFunctionPoint_Right.jsp; Line: 111]
            } //[ /DeleteFunctionPoint_Right.jsp; Line: 112]
            else{ //[ /DeleteFunctionPoint_Right.jsp; Line: 113]
              _writeText(response, out, _wl_block9, _wl_block9Bytes);
              out.print(String.valueOf(radioName ));  //[ /DeleteFunctionPoint_Right.jsp; Line: 115]
              _writeText(response, out, _wl_block10, _wl_block10Bytes);
              //[ /DeleteFunctionPoint_Right.jsp; Line: 116]
            } //[ /DeleteFunctionPoint_Right.jsp; Line: 117]
            _writeText(response, out, _wl_block11, _wl_block11Bytes);
            out.print(String.valueOf(functionPointName ));  //[ /DeleteFunctionPoint_Right.jsp; Line: 119]
            _writeText(response, out, _wl_block12, _wl_block12Bytes);
            out.print(String.valueOf(textName ));  //[ /DeleteFunctionPoint_Right.jsp; Line: 119]
            _writeText(response, out, _wl_block13, _wl_block13Bytes);
            out.print(String.valueOf(functionPointID ));  //[ /DeleteFunctionPoint_Right.jsp; Line: 119]
            _writeText(response, out, _wl_block14, _wl_block14Bytes);
            //[ /DeleteFunctionPoint_Right.jsp; Line: 121]
          }while(rs.next()); //[ /DeleteFunctionPoint_Right.jsp; Line: 122]
          rs.close(); //[ /DeleteFunctionPoint_Right.jsp; Line: 123]
          _writeText(response, out, _wl_block15, _wl_block15Bytes);
          //[ /DeleteFunctionPoint_Right.jsp; Line: 126]
        } //[ /DeleteFunctionPoint_Right.jsp; Line: 127]
        _writeText(response, out, _wl_block16, _wl_block16Bytes);
        //[ /DeleteFunctionPoint_Right.jsp; Line: 129]
      } //[ /DeleteFunctionPoint_Right.jsp; Line: 130]
      //[ /DeleteFunctionPoint_Right.jsp; Line: 131]
      if(noData==1){ //[ /DeleteFunctionPoint_Right.jsp; Line: 132]
        //[ /DeleteFunctionPoint_Right.jsp; Line: 133]
        _writeText(response, out, _wl_block17, _wl_block17Bytes);
        //[ /DeleteFunctionPoint_Right.jsp; Line: 139]
      } //[ /DeleteFunctionPoint_Right.jsp; Line: 140]
      _writeText(response, out, _wl_block18, _wl_block18Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
