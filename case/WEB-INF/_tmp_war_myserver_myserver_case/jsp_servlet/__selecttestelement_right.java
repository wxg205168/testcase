/* compiled from JSP: /SelectTestElement_Right.jsp
*
* This code was automatically generated at 14:03:30 on 2005-8-30
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
import java.sql.*; //[ /SelectTestElement_Right.jsp; Line: 66]
import javax.sql.*; //[ /SelectTestElement_Right.jsp; Line: 66]
import java.util.Enumeration; //[ /SelectTestElement_Right.jsp; Line: 66]


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
* This code was automatically generated at 14:03:30 on 2005-8-30
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selecttestelement_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectTestElement_Right.jsp", 1125304114000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectTestElement_Right.jsp", 1125304114000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title>无标题文档</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n.style66 {color: #FF0000}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n<script language=\"JavaScript\">\r\n\r\nfunction isValid(form){\r\n  if(form.testelement.value!=\"\"){\r\n    return true;\r\n  }\r\n  else{\r\n    alert(\"Test Element Name can not be blank!\");\r\n    return false;\r\n  }\r\n}\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"SelectTestElementConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\nfunction testSubmit1()\r\n{\r\n  if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n    document.forms[0].action=\"DeleteTestElementConfirm.jsp\";\r\n    document.forms[0].submit();\r\n  }\r\n}\r\nfunction testSubmit2()\r\n{\r\ndocument.forms[1].action=\"CreateTestElementConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\nfunction testSubmit3()\r\n{\r\ndocument.forms[0].action=\"UpdateTestElementConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n\r\n</script>\r\n\r\n<body>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n<form method=\"post\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestElement-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\"><span class=\"style66\">Error:";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "</span></td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">You can select a TestElement form list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">TestElement Name </span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = " checked=\"checked\" /></TD>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = " /></TD>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><input name=";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = " type=\"text\" size=\"115\" maxlength=\"200\" value=";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "><input type=\"hidden\" name=";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = " value=";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = "></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "\r\n  </TBODY>\r\n</TABLE>\r\n";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\">&nbsp;&nbsp;&nbsp;<img src=\"image/but_select4.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit3()\">&nbsp;&nbsp;&nbsp;<img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = "\r\n\r\n</form>\r\n\r\n<form method=\"POST\" onSubmit=\"return isValid(this);\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-Create-TestElement.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Please input TestElement information:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD height=\"25\" width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">TestElement Name </span></TD>\r\n    </TR>\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><input name=\"testelement\" type=\"text\" size=\"119\" maxlength=\"200\"></TD>\r\n    </TR>\r\n  </TBODY>\r\n</TABLE>\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit2()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n\r\n</form>\r\n";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  
  
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
      mydb.DatabaseBean tt = null; //[ /SelectTestElement_Right.jsp; Line: 67]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectTestElement_Right.jsp; Line: 67]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectTestElement_Right.jsp; Line: 67]
        { // Don't need to synchronize on page scope //[ /SelectTestElement_Right.jsp; Line: 67]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectTestElement_Right.jsp; Line: 67]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectTestElement_Right.jsp; Line: 67]
            tt = new mydb.DatabaseBean(); //[ /SelectTestElement_Right.jsp; Line: 67]
            pageContext.setAttribute("tt", tt); //[ /SelectTestElement_Right.jsp; Line: 67]
          } // end synchronized bean instantiation block... //[ /SelectTestElement_Right.jsp; Line: 67]
        } // end synchronized bean scope block... //[ /SelectTestElement_Right.jsp; Line: 67]
      } // end bean instantiation block... //[ /SelectTestElement_Right.jsp; Line: 67]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /SelectTestElement_Right.jsp; Line: 68]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /SelectTestElement_Right.jsp; Line: 68]
      if (rr == null) { // begin 'rr' instantiation block... //[ /SelectTestElement_Right.jsp; Line: 68]
        { // Don't need to synchronize on page scope //[ /SelectTestElement_Right.jsp; Line: 68]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /SelectTestElement_Right.jsp; Line: 68]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /SelectTestElement_Right.jsp; Line: 68]
            rr = new managestring.mystring(); //[ /SelectTestElement_Right.jsp; Line: 68]
            pageContext.setAttribute("rr", rr); //[ /SelectTestElement_Right.jsp; Line: 68]
          } // end synchronized bean instantiation block... //[ /SelectTestElement_Right.jsp; Line: 68]
        } // end synchronized bean scope block... //[ /SelectTestElement_Right.jsp; Line: 68]
      } // end bean instantiation block... //[ /SelectTestElement_Right.jsp; Line: 68]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /SelectTestElement_Right.jsp; Line: 70]
      Enumeration ss=session.getAttributeNames(); //[ /SelectTestElement_Right.jsp; Line: 71]
      //[ /SelectTestElement_Right.jsp; Line: 72]
      if(!ss.hasMoreElements()){ //[ /SelectTestElement_Right.jsp; Line: 73]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /SelectTestElement_Right.jsp; Line: 78]
      } //[ /SelectTestElement_Right.jsp; Line: 79]
      else{ //[ /SelectTestElement_Right.jsp; Line: 80]
        DataSource ds=null; //[ /SelectTestElement_Right.jsp; Line: 81]
        ds=tt.getDataSource(); //[ /SelectTestElement_Right.jsp; Line: 82]
        Connection myConn=null; //[ /SelectTestElement_Right.jsp; Line: 83]
        Statement myStatement1=null; //[ /SelectTestElement_Right.jsp; Line: 84]
        Statement myStatement2=null; //[ /SelectTestElement_Right.jsp; Line: 85]
        myConn=ds.getConnection(); //[ /SelectTestElement_Right.jsp; Line: 86]
        myStatement1=myConn.createStatement(); //[ /SelectTestElement_Right.jsp; Line: 87]
        myStatement2=myConn.createStatement(); //[ /SelectTestElement_Right.jsp; Line: 88]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /SelectTestElement_Right.jsp; Line: 98]
        String sql=new String(); //[ /SelectTestElement_Right.jsp; Line: 99]
        ResultSet rs; //[ /SelectTestElement_Right.jsp; Line: 100]
        String sError=(String)session.getAttribute("Error"); //[ /SelectTestElement_Right.jsp; Line: 101]
        String dis=new String(); //[ /SelectTestElement_Right.jsp; Line: 102]
        //[ /SelectTestElement_Right.jsp; Line: 103]
        if(sError.equals("4.1") || sError.equals("4.2") || sError.equals("4.3") || sError.equals("4.4") || sError.equals("5.1") || sError.equals("4.5")) //[ /SelectTestElement_Right.jsp; Line: 104]
        { //[ /SelectTestElement_Right.jsp; Line: 105]
          session.setAttribute("Error","null"); //[ /SelectTestElement_Right.jsp; Line: 106]
          sql="select error_dis from tctc_error where error_code='"+sError+"'"; //[ /SelectTestElement_Right.jsp; Line: 107]
          rs=myStatement1.executeQuery(sql); //[ /SelectTestElement_Right.jsp; Line: 108]
          if(rs.next()) //[ /SelectTestElement_Right.jsp; Line: 109]
          { //[ /SelectTestElement_Right.jsp; Line: 110]
            dis=rs.getString("error_dis"); //[ /SelectTestElement_Right.jsp; Line: 111]
            //[ /SelectTestElement_Right.jsp; Line: 112]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            out.print(String.valueOf(dis ));  //[ /SelectTestElement_Right.jsp; Line: 118]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            //[ /SelectTestElement_Right.jsp; Line: 122]
          } //[ /SelectTestElement_Right.jsp; Line: 123]
        } //[ /SelectTestElement_Right.jsp; Line: 124]
        _writeText(response, out, _wl_block8, _wl_block8Bytes);
        //[ /SelectTestElement_Right.jsp; Line: 142]
        String radioName=new String(); //[ /SelectTestElement_Right.jsp; Line: 143]
        String textName=new String(); //[ /SelectTestElement_Right.jsp; Line: 144]
        String textName1=new String(); //[ /SelectTestElement_Right.jsp; Line: 145]
        String testElementName=new String(); //[ /SelectTestElement_Right.jsp; Line: 146]
        int noData=0; //[ /SelectTestElement_Right.jsp; Line: 147]
        //[ /SelectTestElement_Right.jsp; Line: 148]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /SelectTestElement_Right.jsp; Line: 149]
        String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /SelectTestElement_Right.jsp; Line: 150]
        String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /SelectTestElement_Right.jsp; Line: 151]
        //[ /SelectTestElement_Right.jsp; Line: 152]
        //[ /SelectTestElement_Right.jsp; Line: 153]
        if(sProjectID.equals("null")){ //[ /SelectTestElement_Right.jsp; Line: 154]
          //[ /SelectTestElement_Right.jsp; Line: 155]
          session.setAttribute("Error","2.1"); //[ /SelectTestElement_Right.jsp; Line: 156]
          _writeText(response, out, _wl_block9, _wl_block9Bytes);
          //[ /SelectTestElement_Right.jsp; Line: 161]
        } //[ /SelectTestElement_Right.jsp; Line: 162]
        else if(sUseCaseID.equals("null")){ //[ /SelectTestElement_Right.jsp; Line: 163]
          session.setAttribute("Error","3.1"); //[ /SelectTestElement_Right.jsp; Line: 164]
          _writeText(response, out, _wl_block10, _wl_block10Bytes);
          //[ /SelectTestElement_Right.jsp; Line: 169]
        } //[ /SelectTestElement_Right.jsp; Line: 170]
        else if(sFunctionPointID.equals("null")){ //[ /SelectTestElement_Right.jsp; Line: 171]
          session.setAttribute("Error","4.1"); //[ /SelectTestElement_Right.jsp; Line: 172]
          _writeText(response, out, _wl_block11, _wl_block11Bytes);
          //[ /SelectTestElement_Right.jsp; Line: 177]
        } //[ /SelectTestElement_Right.jsp; Line: 178]
        else{ //[ /SelectTestElement_Right.jsp; Line: 179]
          //[ /SelectTestElement_Right.jsp; Line: 180]
          long projectID=Integer.parseInt(sProjectID); //[ /SelectTestElement_Right.jsp; Line: 181]
          long useCaseID=Integer.parseInt(sUseCaseID); //[ /SelectTestElement_Right.jsp; Line: 182]
          long functionPointID=Integer.parseInt(sFunctionPointID); //[ /SelectTestElement_Right.jsp; Line: 183]
          long testElementID=0; //[ /SelectTestElement_Right.jsp; Line: 184]
          //[ /SelectTestElement_Right.jsp; Line: 185]
          int number=0; //[ /SelectTestElement_Right.jsp; Line: 186]
          //[ /SelectTestElement_Right.jsp; Line: 187]
          sql="select element_id,element_name from tctc_element where project_id=" +projectID+" and uc_id="+useCaseID + " and functionpoint_id="+functionPointID; //[ /SelectTestElement_Right.jsp; Line: 188]
          rs=myStatement2.executeQuery(sql); //[ /SelectTestElement_Right.jsp; Line: 189]
          //[ /SelectTestElement_Right.jsp; Line: 190]
          if(rs.next()){ //[ /SelectTestElement_Right.jsp; Line: 191]
            noData=1; //[ /SelectTestElement_Right.jsp; Line: 192]
            //[ /SelectTestElement_Right.jsp; Line: 193]
            do{ //[ /SelectTestElement_Right.jsp; Line: 194]
              testElementID=rs.getLong("element_id"); //[ /SelectTestElement_Right.jsp; Line: 195]
              testElementName=rs.getString("element_name"); //[ /SelectTestElement_Right.jsp; Line: 196]
              testElementName=rr.replace(testElementName); //[ /SelectTestElement_Right.jsp; Line: 197]
              testElementName=rr.replaceBlank(testElementName); //[ /SelectTestElement_Right.jsp; Line: 198]
              //[ /SelectTestElement_Right.jsp; Line: 199]
              number=number+1; //[ /SelectTestElement_Right.jsp; Line: 200]
              radioName=String.valueOf(number); //[ /SelectTestElement_Right.jsp; Line: 201]
              textName="t"+String.valueOf(number); //[ /SelectTestElement_Right.jsp; Line: 202]
              textName1="u"+String.valueOf(number); //[ /SelectTestElement_Right.jsp; Line: 203]
              _writeText(response, out, _wl_block12, _wl_block12Bytes);
              //[ /SelectTestElement_Right.jsp; Line: 207]
              if(number==1){ //[ /SelectTestElement_Right.jsp; Line: 208]
                _writeText(response, out, _wl_block13, _wl_block13Bytes);
                out.print(String.valueOf(radioName ));  //[ /SelectTestElement_Right.jsp; Line: 210]
                _writeText(response, out, _wl_block14, _wl_block14Bytes);
                //[ /SelectTestElement_Right.jsp; Line: 211]
              } //[ /SelectTestElement_Right.jsp; Line: 212]
              else{ //[ /SelectTestElement_Right.jsp; Line: 213]
                _writeText(response, out, _wl_block15, _wl_block15Bytes);
                out.print(String.valueOf(radioName ));  //[ /SelectTestElement_Right.jsp; Line: 215]
                _writeText(response, out, _wl_block16, _wl_block16Bytes);
                //[ /SelectTestElement_Right.jsp; Line: 216]
              } //[ /SelectTestElement_Right.jsp; Line: 217]
              _writeText(response, out, _wl_block17, _wl_block17Bytes);
              out.print(String.valueOf(textName1 ));  //[ /SelectTestElement_Right.jsp; Line: 219]
              _writeText(response, out, _wl_block18, _wl_block18Bytes);
              out.print(String.valueOf(testElementName ));  //[ /SelectTestElement_Right.jsp; Line: 219]
              _writeText(response, out, _wl_block19, _wl_block19Bytes);
              out.print(String.valueOf(textName ));  //[ /SelectTestElement_Right.jsp; Line: 219]
              _writeText(response, out, _wl_block20, _wl_block20Bytes);
              out.print(String.valueOf(testElementID ));  //[ /SelectTestElement_Right.jsp; Line: 219]
              _writeText(response, out, _wl_block21, _wl_block21Bytes);
              //[ /SelectTestElement_Right.jsp; Line: 221]
            }while(rs.next()); //[ /SelectTestElement_Right.jsp; Line: 222]
            rs.close(); //[ /SelectTestElement_Right.jsp; Line: 223]
          } //[ /SelectTestElement_Right.jsp; Line: 224]
        } //[ /SelectTestElement_Right.jsp; Line: 225]
        _writeText(response, out, _wl_block22, _wl_block22Bytes);
        //[ /SelectTestElement_Right.jsp; Line: 229]
        if(noData==1){ //[ /SelectTestElement_Right.jsp; Line: 230]
          //[ /SelectTestElement_Right.jsp; Line: 231]
          _writeText(response, out, _wl_block23, _wl_block23Bytes);
          //[ /SelectTestElement_Right.jsp; Line: 242]
        } //[ /SelectTestElement_Right.jsp; Line: 243]
        _writeText(response, out, _wl_block24, _wl_block24Bytes);
        //[ /SelectTestElement_Right.jsp; Line: 284]
        myConn.close(); //[ /SelectTestElement_Right.jsp; Line: 285]
        myStatement1.close(); //[ /SelectTestElement_Right.jsp; Line: 286]
        myStatement2.close(); //[ /SelectTestElement_Right.jsp; Line: 287]
      } //[ /SelectTestElement_Right.jsp; Line: 288]
      _writeText(response, out, _wl_block25, _wl_block25Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
