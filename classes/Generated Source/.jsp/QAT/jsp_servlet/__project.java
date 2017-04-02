/* compiled from JSP: /Project.jsp
*
* This code was automatically generated at 10:38:42 on 2005-8-8
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
import java.sql.*; //[ /Project.jsp; Line: 39]


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
* This code was automatically generated at 10:38:42 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __project
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Project.jsp", 1119839318000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/Project.jsp", 1119839318000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<!-- DW6 -->\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n<title>Test Case System</title>\r\n<link rel=\"stylesheet\" href=\"emx_nav_left.css\" type=\"text/css\" />\r\n\r\n<style type=\"text/css\">\r\n<!--\r\n.style1 {font-size: small}\r\n.style88 {\r\n\tfont-weight: bold;\r\n\tfont-size: 36px;\r\n\tfont-family: Arial, Helvetica, sans-serif;\r\n}\r\n.style6 {font-size: small}\r\n.style8 {font-size: small}\r\n.style11 {\r\n\tcolor: #3399FF;\r\n\tfont-size: small;\r\n}\r\n.style7 {font-size:large}\r\n.style10 {\r\n\tcolor: #0000FF;\r\n\tfont-weight: bold;\r\n}\r\n.style12 {font-size: small; color: #FF0000; }\r\n.style100 {font-size: large}\r\n-->\r\n</style>\r\n</head>\r\n\r\n<body>\r\n\r\n<form method=\"post\" action=\"SelectProjectConfirm.jsp\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n<div id=\"masthead2\">\r\n  <center>\r\n  <h1 class=\"style88\" id=\"siteName\">Test Case Generator</h1>\r\n  <div id=\"globalNav\" class=\"style1\">\r\n    <img alt=\"\" src=\"gblnav_left.gif\" height=\"32\" width=\"4\" id=\"gnl\" /> <img alt=\"\" src=\"glbnav_right.gif\" height=\"32\" width=\"4\" id=\"gnr\" />\r\n    <div id=\"globalLink1\">\r\n\r\n      <a href=\"Project.jsp\" target=\"_parent\" id=\"gl1\" class=\"glink\" >Project\r\n      </a><a href=\"UseCase.jsp\" target=\'_parent\' id=\"gl2\" class=\"glink\" >Use Case\r\n      </a><a href=\"FunctionPoint.jsp\" target=\'_parent\' id=\"gl3\" class=\"glink\" >Function Point\r\n      </a><a href=\"TestElement.jsp\" target=\'_parent\' id=\"gl4\" class=\"glink\" >Test Element\r\n      </a><a href=\"EnquireCRInfromation.jsp\" target=\'_parent\' id=\"gl5\" class=\"glink\" >Test Case Material\r\n      </a><a href=\"DeleteTestCondition.jsp\" target=\'_parent\' id=\"gl6\" class=\"glink\" >Test Condition\r\n      </a><a href=\"EnquireTestCase.jsp\" target=\'_parent\' id=\"gl7\" class=\"glink\" >Test Case\r\n      </a><a href=\"EnquireTestSpec.jsp\" target=\'_parent\' id=\"gl7\" class=\"glink\" >Test Spec\r\n      </a>\r\n    </div>\r\n\r\n  </div>\r\n</center>\r\n</div>\r\n\r\n<div id=\"pagecell3\">\r\n  <!--pagecell1-->\r\n  <img alt=\"\" src=\"tl_curve_white.gif\" height=\"6\" width=\"6\" id=\"tl\" /> <img alt=\"\" src=\"tr_curve_white.gif\" height=\"6\" width=\"6\" id=\"tr\" />\r\n\r\n  <div id=\"col2\">\r\n    <div class=\"feature\">\r\n  <p></p>\r\n      <center>\r\n\r\n      <table width=\"750\" border=\"0\">\r\n\t    <tr>\r\n\t\t  <td align=\"left\"><h3><label><span class=\"style7\">Project List</span></label></h3></td>\r\n\t\t</tr>\r\n\t\t<tr><td height=\"30\"></td></tr>\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\t\t<tr><td align=\"left\"><h3><label><span class=\"style12\">Error:";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "</span></label></h3></td></tr>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n        <tr>\r\n          <td align=\"left\"><h3>\r\n            <label><span class=\"style8\">You can select a project from list:</span></label>\r\n          </h3></td>\r\n        </tr>\r\n      </table>\r\n      <table width=\"750\" border=\"1\">\r\n        <tr>\r\n          <td width=\"20\">&nbsp;</td>\r\n          <td width=\"452\" align=\"left\" class=\"style10\">Project Name </td>\r\n          <td width=\"130\" align=\"left\" class=\"style10\">Project Manager </td>\r\n          <td width=\"120\" align=\"left\" class=\"style10\">Project Leader </td>\r\n        </tr>\r\n\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n        <tr>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n\r\n          <td align=\"center\"><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = " checked=\"checked\" /></td>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n          <td align=\"center\"><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "  /></td>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n\r\n          <td align=\"left\">";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "<input type=\"hidden\" name=";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = " value=";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "></td>\r\n          <td align=\"left\">";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "</td>\r\n          <td align=\"left\">";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "</td>\r\n        </tr>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n\r\n      </table>\r\n      <p>&nbsp;</p>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n      <input type=\"Submit\" name=\"Submit\" value=\"Select Project\">\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n\r\n      </center>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n      <p>&nbsp;</p>\r\n    </div>\r\n  </div>\r\n  <!--end col2 -->\r\n  <div id=\"pageNav\">\r\n    <div id=\"sectionLinks\">\r\n      <p><label><span class=\"style100\">Project:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "</span></label></p>\r\n      <p><label><span class=\"style100\">Usecase:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = "</span></label></p>\r\n      <p><label><span class=\"style100\">FunctionPoint:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "</span></label></p>\r\n      <p><label><span class=\"style100\">TestElement:</span></p><p><span class=\"style11\">";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "</span></label></p>\r\n    </div>\r\n  </div>\r\n</div>\r\n<br />\r\n</form>\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  
  
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
      mydb.DatabaseBean tt = null; //[ /Project.jsp; Line: 40]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /Project.jsp; Line: 40]
      if (tt == null) { // begin 'tt' instantiation block... //[ /Project.jsp; Line: 40]
        { // Don't need to synchronize on page scope //[ /Project.jsp; Line: 40]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /Project.jsp; Line: 40]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /Project.jsp; Line: 40]
            tt = new mydb.DatabaseBean(); //[ /Project.jsp; Line: 40]
            pageContext.setAttribute("tt", tt); //[ /Project.jsp; Line: 40]
          } // end synchronized bean instantiation block... //[ /Project.jsp; Line: 40]
        } // end synchronized bean scope block... //[ /Project.jsp; Line: 40]
      } // end bean instantiation block... //[ /Project.jsp; Line: 40]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /Project.jsp; Line: 79]
      String sql=new String(); //[ /Project.jsp; Line: 80]
      ResultSet rs; //[ /Project.jsp; Line: 81]
      String sError=(String)session.getAttribute("Error"); //[ /Project.jsp; Line: 82]
      String dis=new String(); //[ /Project.jsp; Line: 83]
      //[ /Project.jsp; Line: 84]
      //[ /Project.jsp; Line: 85]
      if(sError.equals("1") || sError.equals("2.1")) //[ /Project.jsp; Line: 86]
      { //[ /Project.jsp; Line: 87]
        session.setAttribute("Error","null"); //[ /Project.jsp; Line: 88]
        sql="select error_dis from tctc_error where error_code='"+sError+"'"; //[ /Project.jsp; Line: 89]
        rs=tt.executeQuery(sql); //[ /Project.jsp; Line: 90]
        if(rs.next()) //[ /Project.jsp; Line: 91]
        { //[ /Project.jsp; Line: 92]
          dis=rs.getString("error_dis"); //[ /Project.jsp; Line: 93]
          //[ /Project.jsp; Line: 94]
          _writeText(response, out, _wl_block3, _wl_block3Bytes);
          out.print(String.valueOf(dis ));  //[ /Project.jsp; Line: 96]
          _writeText(response, out, _wl_block4, _wl_block4Bytes);
          //[ /Project.jsp; Line: 97]
        } //[ /Project.jsp; Line: 98]
      } //[ /Project.jsp; Line: 99]
      _writeText(response, out, _wl_block5, _wl_block5Bytes);
      //[ /Project.jsp; Line: 115]
      String radioName=new String(); //[ /Project.jsp; Line: 116]
      String textName=new String(); //[ /Project.jsp; Line: 117]
      String projectName=new String(); //[ /Project.jsp; Line: 118]
      String projectLeader=new String(); //[ /Project.jsp; Line: 119]
      String projectManager=new String(); //[ /Project.jsp; Line: 120]
      long projectID=0; //[ /Project.jsp; Line: 121]
      int number=0; //[ /Project.jsp; Line: 122]
      int noData=0; //[ /Project.jsp; Line: 123]
      //[ /Project.jsp; Line: 124]
      sql="select pro_id,pro_n,pro_r,pro_l from tctc_project"; //[ /Project.jsp; Line: 125]
      rs=tt.executeQuery(sql); //[ /Project.jsp; Line: 126]
      //[ /Project.jsp; Line: 127]
      if(rs.next()){ //[ /Project.jsp; Line: 128]
        noData=1; //[ /Project.jsp; Line: 129]
        //[ /Project.jsp; Line: 130]
        do{ //[ /Project.jsp; Line: 131]
          projectName=rs.getString("pro_n"); //[ /Project.jsp; Line: 132]
          projectLeader=rs.getString("pro_l"); //[ /Project.jsp; Line: 133]
          //projectManager=rs.getString("pro_m"); //[ /Project.jsp; Line: 134]
          projectID=rs.getLong("pro_id"); //[ /Project.jsp; Line: 135]
          number=number+1; //[ /Project.jsp; Line: 136]
          radioName=String.valueOf(number); //[ /Project.jsp; Line: 137]
          textName="t"+String.valueOf(number); //[ /Project.jsp; Line: 138]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /Project.jsp; Line: 142]
          if(number==1){ //[ /Project.jsp; Line: 143]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            out.print(String.valueOf(radioName ));  //[ /Project.jsp; Line: 146]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            //[ /Project.jsp; Line: 147]
          } //[ /Project.jsp; Line: 148]
          else{ //[ /Project.jsp; Line: 149]
            _writeText(response, out, _wl_block9, _wl_block9Bytes);
            out.print(String.valueOf(radioName ));  //[ /Project.jsp; Line: 151]
            _writeText(response, out, _wl_block10, _wl_block10Bytes);
            //[ /Project.jsp; Line: 152]
          } //[ /Project.jsp; Line: 153]
          _writeText(response, out, _wl_block11, _wl_block11Bytes);
          out.print(String.valueOf(projectName ));  //[ /Project.jsp; Line: 156]
          _writeText(response, out, _wl_block12, _wl_block12Bytes);
          out.print(String.valueOf(textName ));  //[ /Project.jsp; Line: 156]
          _writeText(response, out, _wl_block13, _wl_block13Bytes);
          out.print(String.valueOf(projectID ));  //[ /Project.jsp; Line: 156]
          _writeText(response, out, _wl_block14, _wl_block14Bytes);
          out.print(String.valueOf(projectManager ));  //[ /Project.jsp; Line: 157]
          _writeText(response, out, _wl_block15, _wl_block15Bytes);
          out.print(String.valueOf(projectLeader ));  //[ /Project.jsp; Line: 158]
          _writeText(response, out, _wl_block16, _wl_block16Bytes);
          //[ /Project.jsp; Line: 160]
        }while(rs.next()); //[ /Project.jsp; Line: 161]
        rs.close(); //[ /Project.jsp; Line: 162]
      } //[ /Project.jsp; Line: 163]
      else{ //[ /Project.jsp; Line: 164]
        noData=0; //[ /Project.jsp; Line: 165]
        rs.close(); //[ /Project.jsp; Line: 166]
      } //[ /Project.jsp; Line: 167]
      _writeText(response, out, _wl_block17, _wl_block17Bytes);
      //[ /Project.jsp; Line: 172]
      if(noData==1) //[ /Project.jsp; Line: 173]
      { //[ /Project.jsp; Line: 174]
        //[ /Project.jsp; Line: 175]
        //[ /Project.jsp; Line: 175]
        _writeText(response, out, _wl_block18, _wl_block18Bytes);
        //[ /Project.jsp; Line: 177]
      } //[ /Project.jsp; Line: 178]
      _writeText(response, out, _wl_block19, _wl_block19Bytes);
      out.print(String.valueOf(session.getAttribute("ProjectName") ));  //[ /Project.jsp; Line: 232]
      _writeText(response, out, _wl_block20, _wl_block20Bytes);
      out.print(String.valueOf(session.getAttribute("UseCaseName") ));  //[ /Project.jsp; Line: 233]
      _writeText(response, out, _wl_block21, _wl_block21Bytes);
      out.print(String.valueOf(session.getAttribute("FunctionPointName") ));  //[ /Project.jsp; Line: 234]
      _writeText(response, out, _wl_block22, _wl_block22Bytes);
      out.print(String.valueOf(session.getAttribute("TestElementName") ));  //[ /Project.jsp; Line: 235]
      _writeText(response, out, _wl_block23, _wl_block23Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
