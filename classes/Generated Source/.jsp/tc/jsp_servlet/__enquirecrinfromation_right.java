/* compiled from JSP: /EnquireCRInfromation_Right.jsp
*
* This code was automatically generated at 9:07:47 on 2005-8-8
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
import java.sql.*; //[ /EnquireCRInfromation_Right.jsp; Line: 60]
import javax.sql.*; //[ /EnquireCRInfromation_Right.jsp; Line: 60]
import java.util.Enumeration; //[ /EnquireCRInfromation_Right.jsp; Line: 60]


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
* This code was automatically generated at 9:07:47 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __enquirecrinfromation_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireCRInfromation_Right.jsp", 1123463224000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireCRInfromation_Right.jsp", 1123463224000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title>�ޱ����ĵ�</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n.style66 {color: #FF0000}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n<script language=\"JavaScript\">\r\n\r\nfunction isValid(form){\r\n  if(form.textarea.value!=\"\"){\r\n    return true;\r\n  }\r\n  else{\r\n    alert(\"Content can not be blank!\");\r\n    return false;\r\n  }\r\n}\r\n\r\nfunction testSubmit()\r\n{\r\n  if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n    document.forms[0].action=\"DeleteCRInformationConfirm.jsp\";\r\n    document.forms[0].submit();\r\n  }\r\n}\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[1].action=\"CreateCRInformationConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\nfunction testSubmit2()\r\n{\r\ndocument.forms[0].action=\"UpdateCRInformationConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n</script>\r\n\r\n<body>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n<form method=\"POST\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestElement-Condition-an.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\"><span class=\"style66\">Error:";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "</span></td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\"><span class=\"style8\">Select any TestElement Condition from list to delete</span>:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">TestElement Condition</span></TD>\r\n    </TR>\r\n\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "></TD>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = " cols=\"100\" rows=\"3\">";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "</textarea><input type = \"hidden\" name = ";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = " value =";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = " /></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n  </TBODY>\r\n</TABLE>\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\"><span class=\"style8\">Select any result from list to delete</span>:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"160\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Result</span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "></TD>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = " cols=\"100\" rows=\"3\">";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "</textarea><input type = \"hidden\" name = ";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = " value =";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = " /></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "\r\n  </TBODY>\r\n</TABLE>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select4.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit2()\">&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = "\r\n\r\n</form>\r\n\r\n<form method=\"POST\" onSubmit=\"return isValid(this);\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-CreateTestMaterial.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Please input information:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"50\" height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" ><span class=\"style5\">Type</span></TD>\r\n      <TD width=\"220\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">\r\n";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = "\r\n            <input type=\"radio\" name=\"radiobutton\" value=\"1\"  checked=\"checked\"/>\r\n            <span class=\"style13\">Condition</span>\r\n            <input type=\"radio\" name=\"radiobutton\" value=\"2\" />\r\n            <span class=\"style13\">Result</span>\r\n";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = "\r\n            <input type=\"radio\" name=\"radiobutton\" value=\"1\" />\r\n            <span class=\"style13\">Condition </span>\r\n            <input type=\"radio\" name=\"radiobutton\" value=\"2\"  checked=\"checked\" />\r\n            <span class=\"style13\">Result</span>\r\n";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "\r\n\t  </span></TD>\r\n    </TR>\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=#74A5E8 class=\"style4\" ><span class=\"style5\">Detail</span></TD>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=\"textarea\" cols=\"96\" rows=\"3\"></textarea></TD>\r\n    </TR>\r\n  </TBODY>\r\n</TABLE>\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n\r\n</form>\r\n";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  
  
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
      mydb.DatabaseBean tt = null; //[ /EnquireCRInfromation_Right.jsp; Line: 61]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireCRInfromation_Right.jsp; Line: 61]
      if (tt == null) { // begin 'tt' instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 61]
        { // Don't need to synchronize on page scope //[ /EnquireCRInfromation_Right.jsp; Line: 61]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireCRInfromation_Right.jsp; Line: 61]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 61]
            tt = new mydb.DatabaseBean(); //[ /EnquireCRInfromation_Right.jsp; Line: 61]
            pageContext.setAttribute("tt", tt); //[ /EnquireCRInfromation_Right.jsp; Line: 61]
          } // end synchronized bean instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 61]
        } // end synchronized bean scope block... //[ /EnquireCRInfromation_Right.jsp; Line: 61]
      } // end bean instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 61]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /EnquireCRInfromation_Right.jsp; Line: 62]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireCRInfromation_Right.jsp; Line: 62]
      if (rr == null) { // begin 'rr' instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 62]
        { // Don't need to synchronize on page scope //[ /EnquireCRInfromation_Right.jsp; Line: 62]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireCRInfromation_Right.jsp; Line: 62]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 62]
            rr = new managestring.mystring(); //[ /EnquireCRInfromation_Right.jsp; Line: 62]
            pageContext.setAttribute("rr", rr); //[ /EnquireCRInfromation_Right.jsp; Line: 62]
          } // end synchronized bean instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 62]
        } // end synchronized bean scope block... //[ /EnquireCRInfromation_Right.jsp; Line: 62]
      } // end bean instantiation block... //[ /EnquireCRInfromation_Right.jsp; Line: 62]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /EnquireCRInfromation_Right.jsp; Line: 64]
      Enumeration ss=session.getAttributeNames(); //[ /EnquireCRInfromation_Right.jsp; Line: 65]
      //[ /EnquireCRInfromation_Right.jsp; Line: 66]
      if(!ss.hasMoreElements()){ //[ /EnquireCRInfromation_Right.jsp; Line: 67]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /EnquireCRInfromation_Right.jsp; Line: 72]
      } //[ /EnquireCRInfromation_Right.jsp; Line: 73]
      else{ //[ /EnquireCRInfromation_Right.jsp; Line: 74]
        DataSource ds=null; //[ /EnquireCRInfromation_Right.jsp; Line: 75]
        ds=tt.getDataSource(); //[ /EnquireCRInfromation_Right.jsp; Line: 76]
        Connection myConn=null; //[ /EnquireCRInfromation_Right.jsp; Line: 77]
        Statement myStatement1=null; //[ /EnquireCRInfromation_Right.jsp; Line: 78]
        Statement myStatement2=null; //[ /EnquireCRInfromation_Right.jsp; Line: 79]
        Statement myStatement3=null; //[ /EnquireCRInfromation_Right.jsp; Line: 80]
        myConn=ds.getConnection(); //[ /EnquireCRInfromation_Right.jsp; Line: 81]
        myStatement1=myConn.createStatement(); //[ /EnquireCRInfromation_Right.jsp; Line: 82]
        myStatement2=myConn.createStatement(); //[ /EnquireCRInfromation_Right.jsp; Line: 83]
        myStatement3=myConn.createStatement(); //[ /EnquireCRInfromation_Right.jsp; Line: 84]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /EnquireCRInfromation_Right.jsp; Line: 95]
        String sql=new String(); //[ /EnquireCRInfromation_Right.jsp; Line: 96]
        ResultSet rs; //[ /EnquireCRInfromation_Right.jsp; Line: 97]
        String sError=(String)session.getAttribute("Error"); //[ /EnquireCRInfromation_Right.jsp; Line: 98]
        String dis=new String(); //[ /EnquireCRInfromation_Right.jsp; Line: 99]
        //[ /EnquireCRInfromation_Right.jsp; Line: 100]
        if(sError.equals("5.1") || sError.equals("5.2") || sError.equals("5.3") || sError.equals("5.4")) //[ /EnquireCRInfromation_Right.jsp; Line: 101]
        { //[ /EnquireCRInfromation_Right.jsp; Line: 102]
          session.setAttribute("Error","null"); //[ /EnquireCRInfromation_Right.jsp; Line: 103]
          sql="select error_dis from tctc_error where error_code='"+sError+"'"; //[ /EnquireCRInfromation_Right.jsp; Line: 104]
          rs=myStatement1.executeQuery(sql); //[ /EnquireCRInfromation_Right.jsp; Line: 105]
          if(rs.next()) //[ /EnquireCRInfromation_Right.jsp; Line: 106]
          { //[ /EnquireCRInfromation_Right.jsp; Line: 107]
            dis=rs.getString("error_dis"); //[ /EnquireCRInfromation_Right.jsp; Line: 108]
            //[ /EnquireCRInfromation_Right.jsp; Line: 109]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            out.print(String.valueOf(dis ));  //[ /EnquireCRInfromation_Right.jsp; Line: 115]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            //[ /EnquireCRInfromation_Right.jsp; Line: 119]
          } //[ /EnquireCRInfromation_Right.jsp; Line: 120]
        } //[ /EnquireCRInfromation_Right.jsp; Line: 121]
        _writeText(response, out, _wl_block8, _wl_block8Bytes);
        //[ /EnquireCRInfromation_Right.jsp; Line: 140]
        int noData=0; //[ /EnquireCRInfromation_Right.jsp; Line: 141]
        //[ /EnquireCRInfromation_Right.jsp; Line: 142]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireCRInfromation_Right.jsp; Line: 143]
        String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /EnquireCRInfromation_Right.jsp; Line: 144]
        String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /EnquireCRInfromation_Right.jsp; Line: 145]
        String sTestElementID=(String)session.getAttribute("TestElementID"); //[ /EnquireCRInfromation_Right.jsp; Line: 146]
        String checkName=new String(); //[ /EnquireCRInfromation_Right.jsp; Line: 147]
        String textName=new String(); //[ /EnquireCRInfromation_Right.jsp; Line: 148]
        String textName1=new String(); //[ /EnquireCRInfromation_Right.jsp; Line: 149]
        String hidName=new String(); //[ /EnquireCRInfromation_Right.jsp; Line: 150]
        int number=0; //[ /EnquireCRInfromation_Right.jsp; Line: 151]
        long informationID=0; //[ /EnquireCRInfromation_Right.jsp; Line: 152]
        String information=new String(); //[ /EnquireCRInfromation_Right.jsp; Line: 153]
        //[ /EnquireCRInfromation_Right.jsp; Line: 154]
        if(sProjectID.equals("null")){ //[ /EnquireCRInfromation_Right.jsp; Line: 155]
          //[ /EnquireCRInfromation_Right.jsp; Line: 156]
          session.setAttribute("Error","2.1"); //[ /EnquireCRInfromation_Right.jsp; Line: 157]
          _writeText(response, out, _wl_block9, _wl_block9Bytes);
          //[ /EnquireCRInfromation_Right.jsp; Line: 162]
        } //[ /EnquireCRInfromation_Right.jsp; Line: 163]
        else if(sUseCaseID.equals("null")){ //[ /EnquireCRInfromation_Right.jsp; Line: 164]
          session.setAttribute("Error","3.1"); //[ /EnquireCRInfromation_Right.jsp; Line: 165]
          _writeText(response, out, _wl_block10, _wl_block10Bytes);
          //[ /EnquireCRInfromation_Right.jsp; Line: 170]
        } //[ /EnquireCRInfromation_Right.jsp; Line: 171]
        else if(sFunctionPointID.equals("null")){ //[ /EnquireCRInfromation_Right.jsp; Line: 172]
          session.setAttribute("Error","4.1"); //[ /EnquireCRInfromation_Right.jsp; Line: 173]
          _writeText(response, out, _wl_block11, _wl_block11Bytes);
          //[ /EnquireCRInfromation_Right.jsp; Line: 178]
        } //[ /EnquireCRInfromation_Right.jsp; Line: 179]
        else{ //[ /EnquireCRInfromation_Right.jsp; Line: 180]
          //[ /EnquireCRInfromation_Right.jsp; Line: 181]
          long functionPointID = Integer.parseInt(sFunctionPointID); //[ /EnquireCRInfromation_Right.jsp; Line: 182]
          long projectID = Integer.parseInt(sProjectID); //[ /EnquireCRInfromation_Right.jsp; Line: 183]
          long useCaseID = Integer.parseInt(sUseCaseID); //[ /EnquireCRInfromation_Right.jsp; Line: 184]
          long testElementID=0; //[ /EnquireCRInfromation_Right.jsp; Line: 185]
          //[ /EnquireCRInfromation_Right.jsp; Line: 186]
          if(sTestElementID.equals("null")) //[ /EnquireCRInfromation_Right.jsp; Line: 187]
          { //[ /EnquireCRInfromation_Right.jsp; Line: 188]
          } //[ /EnquireCRInfromation_Right.jsp; Line: 189]
          else //[ /EnquireCRInfromation_Right.jsp; Line: 190]
          { //[ /EnquireCRInfromation_Right.jsp; Line: 191]
            noData=1; //[ /EnquireCRInfromation_Right.jsp; Line: 192]
            testElementID = Integer.parseInt(sTestElementID); //[ /EnquireCRInfromation_Right.jsp; Line: 193]
            //[ /EnquireCRInfromation_Right.jsp; Line: 194]
            sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='c' and project_id="+projectID+" and uc_id="+useCaseID+" and element_id="+testElementID; //[ /EnquireCRInfromation_Right.jsp; Line: 195]
            rs=myStatement2.executeQuery(sql); //[ /EnquireCRInfromation_Right.jsp; Line: 196]
            //[ /EnquireCRInfromation_Right.jsp; Line: 197]
            if(rs.next()){ //[ /EnquireCRInfromation_Right.jsp; Line: 198]
              do{ //[ /EnquireCRInfromation_Right.jsp; Line: 199]
                number=number+1; //[ /EnquireCRInfromation_Right.jsp; Line: 200]
                informationID=rs.getLong("inf_id"); //[ /EnquireCRInfromation_Right.jsp; Line: 201]
                information=rs.getString("inf_dis"); //[ /EnquireCRInfromation_Right.jsp; Line: 202]
                information=rr.restoreString(information); //[ /EnquireCRInfromation_Right.jsp; Line: 203]
                //[ /EnquireCRInfromation_Right.jsp; Line: 204]
                checkName="C"+number; //[ /EnquireCRInfromation_Right.jsp; Line: 205]
                textName="T"+number; //[ /EnquireCRInfromation_Right.jsp; Line: 206]
                textName1="u"+number; //[ /EnquireCRInfromation_Right.jsp; Line: 207]
                //[ /EnquireCRInfromation_Right.jsp; Line: 208]
                _writeText(response, out, _wl_block12, _wl_block12Bytes);
                out.print(String.valueOf(checkName ));  //[ /EnquireCRInfromation_Right.jsp; Line: 211]
                _writeText(response, out, _wl_block13, _wl_block13Bytes);
                out.print(String.valueOf(textName1 ));  //[ /EnquireCRInfromation_Right.jsp; Line: 212]
                _writeText(response, out, _wl_block14, _wl_block14Bytes);
                out.print(String.valueOf(information ));  //[ /EnquireCRInfromation_Right.jsp; Line: 212]
                _writeText(response, out, _wl_block15, _wl_block15Bytes);
                out.print(String.valueOf(textName ));  //[ /EnquireCRInfromation_Right.jsp; Line: 212]
                _writeText(response, out, _wl_block16, _wl_block16Bytes);
                out.print(String.valueOf(informationID ));  //[ /EnquireCRInfromation_Right.jsp; Line: 212]
                _writeText(response, out, _wl_block17, _wl_block17Bytes);
                //[ /EnquireCRInfromation_Right.jsp; Line: 214]
              }while(rs.next()); //[ /EnquireCRInfromation_Right.jsp; Line: 215]
              //[ /EnquireCRInfromation_Right.jsp; Line: 216]
            } //[ /EnquireCRInfromation_Right.jsp; Line: 217]
          } //[ /EnquireCRInfromation_Right.jsp; Line: 218]
          _writeText(response, out, _wl_block18, _wl_block18Bytes);
          //[ /EnquireCRInfromation_Right.jsp; Line: 238]
          sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='r' and project_id="+projectID+" and uc_id="+useCaseID; //[ /EnquireCRInfromation_Right.jsp; Line: 239]
          rs=myStatement3.executeQuery(sql); //[ /EnquireCRInfromation_Right.jsp; Line: 240]
          //[ /EnquireCRInfromation_Right.jsp; Line: 241]
          if(rs.next()){ //[ /EnquireCRInfromation_Right.jsp; Line: 242]
            noData=1; //[ /EnquireCRInfromation_Right.jsp; Line: 243]
            //[ /EnquireCRInfromation_Right.jsp; Line: 244]
            do{ //[ /EnquireCRInfromation_Right.jsp; Line: 245]
              number=number+1; //[ /EnquireCRInfromation_Right.jsp; Line: 246]
              informationID=rs.getLong("inf_id"); //[ /EnquireCRInfromation_Right.jsp; Line: 247]
              information=rs.getString("inf_dis"); //[ /EnquireCRInfromation_Right.jsp; Line: 248]
              information=rr.restoreString(information); //[ /EnquireCRInfromation_Right.jsp; Line: 249]
              //[ /EnquireCRInfromation_Right.jsp; Line: 250]
              checkName="C"+number; //[ /EnquireCRInfromation_Right.jsp; Line: 251]
              textName="T"+number; //[ /EnquireCRInfromation_Right.jsp; Line: 252]
              textName1="u"+number; //[ /EnquireCRInfromation_Right.jsp; Line: 253]
              //[ /EnquireCRInfromation_Right.jsp; Line: 254]
              _writeText(response, out, _wl_block19, _wl_block19Bytes);
              out.print(String.valueOf(checkName ));  //[ /EnquireCRInfromation_Right.jsp; Line: 257]
              _writeText(response, out, _wl_block20, _wl_block20Bytes);
              out.print(String.valueOf(textName1 ));  //[ /EnquireCRInfromation_Right.jsp; Line: 258]
              _writeText(response, out, _wl_block21, _wl_block21Bytes);
              out.print(String.valueOf(information ));  //[ /EnquireCRInfromation_Right.jsp; Line: 258]
              _writeText(response, out, _wl_block22, _wl_block22Bytes);
              out.print(String.valueOf(textName ));  //[ /EnquireCRInfromation_Right.jsp; Line: 258]
              _writeText(response, out, _wl_block23, _wl_block23Bytes);
              out.print(String.valueOf(informationID ));  //[ /EnquireCRInfromation_Right.jsp; Line: 258]
              _writeText(response, out, _wl_block24, _wl_block24Bytes);
              //[ /EnquireCRInfromation_Right.jsp; Line: 260]
            }while(rs.next()); //[ /EnquireCRInfromation_Right.jsp; Line: 261]
          } //[ /EnquireCRInfromation_Right.jsp; Line: 262]
          rs.close(); //[ /EnquireCRInfromation_Right.jsp; Line: 263]
          session.setAttribute("CR_Number", String.valueOf(number)); //[ /EnquireCRInfromation_Right.jsp; Line: 264]
          _writeText(response, out, _wl_block25, _wl_block25Bytes);
          //[ /EnquireCRInfromation_Right.jsp; Line: 268]
          if(noData==1){ //[ /EnquireCRInfromation_Right.jsp; Line: 269]
            _writeText(response, out, _wl_block26, _wl_block26Bytes);
            //[ /EnquireCRInfromation_Right.jsp; Line: 280]
          } //[ /EnquireCRInfromation_Right.jsp; Line: 281]
        } //[ /EnquireCRInfromation_Right.jsp; Line: 282]
        _writeText(response, out, _wl_block27, _wl_block27Bytes);
        //[ /EnquireCRInfromation_Right.jsp; Line: 309]
        String type=(String)session.getAttribute("Type"); //[ /EnquireCRInfromation_Right.jsp; Line: 310]
        if(type.equals("c")){ //[ /EnquireCRInfromation_Right.jsp; Line: 311]
          _writeText(response, out, _wl_block28, _wl_block28Bytes);
          //[ /EnquireCRInfromation_Right.jsp; Line: 317]
        } //[ /EnquireCRInfromation_Right.jsp; Line: 318]
        else{ //[ /EnquireCRInfromation_Right.jsp; Line: 319]
          _writeText(response, out, _wl_block29, _wl_block29Bytes);
          //[ /EnquireCRInfromation_Right.jsp; Line: 325]
        } //[ /EnquireCRInfromation_Right.jsp; Line: 326]
        _writeText(response, out, _wl_block30, _wl_block30Bytes);
        //[ /EnquireCRInfromation_Right.jsp; Line: 347]
        myConn.close(); //[ /EnquireCRInfromation_Right.jsp; Line: 348]
        myStatement1.close(); //[ /EnquireCRInfromation_Right.jsp; Line: 349]
        myStatement2.close(); //[ /EnquireCRInfromation_Right.jsp; Line: 350]
        myStatement3.close(); //[ /EnquireCRInfromation_Right.jsp; Line: 351]
      } //[ /EnquireCRInfromation_Right.jsp; Line: 352]
      _writeText(response, out, _wl_block31, _wl_block31Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
