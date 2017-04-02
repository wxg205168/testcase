/* compiled from JSP: /SelectUseCase_Right.jsp
*
* This code was automatically generated at 10:00:26 on 2005-8-8
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
import java.sql.*; //[ /SelectUseCase_Right.jsp; Line: 61]
import java.util.Enumeration; //[ /SelectUseCase_Right.jsp; Line: 61]
import javax.sql.*; //[ /SelectUseCase_Right.jsp; Line: 61]


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
* This code was automatically generated at 10:00:26 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selectusecase_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectUseCase_Right.jsp", 1123466306000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectUseCase_Right.jsp", 1123466306000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n.style66 {color: #FF0000}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n\r\n<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\n  document.forms[0].action=\"SelectUseCaseConfirm.jsp\";\r\n  document.forms[0].submit();\r\n}\r\n\r\nfunction testSubmit1()\r\n{\r\n  if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n    document.forms[0].action=\"DeleteUseCaseConfirm.jsp\";\r\n    document.forms[0].submit();\r\n  }\r\n}\r\n\r\nfunction testSubmit2()\r\n{\r\n  document.forms[1].action=\"CreateUseCaseConfirm.jsp\";\r\n  document.forms[1].submit();\r\n}\r\n\r\nfunction testSubmit3()\r\n{\r\n  document.forms[0].action=\"UpdateUseCaseConfirm.jsp\";\r\n  document.forms[0].submit();\r\n}\r\n\r\n</script>\r\n\r\n\r\n<body>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n<form method=\"post\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-UseCase-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\"><span class=\"style66\">Error:";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "</span></td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">You can select a Usecase form list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"547\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">UseCase Name </span></TD>\r\n      <TD width=\"180\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">UseCase Abbreviate</span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n<script LANGUAGE=\"javascript\">\r\n\r\n  parent.location.href=\'SelectProject.jsp\'\r\n\r\n</script>\r\n\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = " checked=\"checked\" /></TD>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = " /></TD>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><input name=";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = " type=\"text\" size=\"75\" maxlength=\"200\" value=";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "><input type=\"hidden\" name=";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = " value=";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "></TD>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><input name=";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = " type=\"text\" size=\"25\" maxlength=\"25\" value=";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = "><input type=\"hidden\" name=";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = " value=";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "></TD>\r\n    </TR>\r\n\r\n";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = "\r\n\r\n  </TBODY>\r\n</TABLE>\r\n";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\">&nbsp;&nbsp;&nbsp;<img src=\"image/but_select4.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit3()\">&nbsp;&nbsp;&nbsp;<img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n\r\n</form>\r\n\r\n<form method=\"POST\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-Create-UseCase.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Please input UseCase information:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD height=\"25\" width=\"570\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">UseCase Name </span></TD>\r\n      <TD height=\"25\" width=\"180\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">UseCase Abbreviate</span></TD>\r\n    </TR>\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><input name=\"usecase\" type=\"text\" size=\"78\" maxlength=\"200\"></TD>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><input name=\"ab\" type=\"text\" size=\"25\" maxlength=\"25\"></TD>\r\n    </TR>\r\n  </TBODY>\r\n</TABLE>\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\"  onClick=\"testSubmit2()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n\r\n\r\n</form>\r\n\r\n";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  
  
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
      mydb.DatabaseBean tt = null; //[ /SelectUseCase_Right.jsp; Line: 62]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectUseCase_Right.jsp; Line: 62]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectUseCase_Right.jsp; Line: 62]
        { // Don't need to synchronize on page scope //[ /SelectUseCase_Right.jsp; Line: 62]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectUseCase_Right.jsp; Line: 62]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectUseCase_Right.jsp; Line: 62]
            tt = new mydb.DatabaseBean(); //[ /SelectUseCase_Right.jsp; Line: 62]
            pageContext.setAttribute("tt", tt); //[ /SelectUseCase_Right.jsp; Line: 62]
          } // end synchronized bean instantiation block... //[ /SelectUseCase_Right.jsp; Line: 62]
        } // end synchronized bean scope block... //[ /SelectUseCase_Right.jsp; Line: 62]
      } // end bean instantiation block... //[ /SelectUseCase_Right.jsp; Line: 62]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /SelectUseCase_Right.jsp; Line: 63]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /SelectUseCase_Right.jsp; Line: 63]
      if (rr == null) { // begin 'rr' instantiation block... //[ /SelectUseCase_Right.jsp; Line: 63]
        { // Don't need to synchronize on page scope //[ /SelectUseCase_Right.jsp; Line: 63]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /SelectUseCase_Right.jsp; Line: 63]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /SelectUseCase_Right.jsp; Line: 63]
            rr = new managestring.mystring(); //[ /SelectUseCase_Right.jsp; Line: 63]
            pageContext.setAttribute("rr", rr); //[ /SelectUseCase_Right.jsp; Line: 63]
          } // end synchronized bean instantiation block... //[ /SelectUseCase_Right.jsp; Line: 63]
        } // end synchronized bean scope block... //[ /SelectUseCase_Right.jsp; Line: 63]
      } // end bean instantiation block... //[ /SelectUseCase_Right.jsp; Line: 63]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /SelectUseCase_Right.jsp; Line: 65]
      Enumeration ss=session.getAttributeNames(); //[ /SelectUseCase_Right.jsp; Line: 66]
      //[ /SelectUseCase_Right.jsp; Line: 67]
      if(!ss.hasMoreElements()){ //[ /SelectUseCase_Right.jsp; Line: 68]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /SelectUseCase_Right.jsp; Line: 74]
      } //[ /SelectUseCase_Right.jsp; Line: 75]
      else{ //[ /SelectUseCase_Right.jsp; Line: 76]
        DataSource ds=null; //[ /SelectUseCase_Right.jsp; Line: 77]
        ds=tt.getDataSource(); //[ /SelectUseCase_Right.jsp; Line: 78]
        Connection myConn=null; //[ /SelectUseCase_Right.jsp; Line: 79]
        Statement myStatement1=null; //[ /SelectUseCase_Right.jsp; Line: 80]
        Statement myStatement2=null; //[ /SelectUseCase_Right.jsp; Line: 81]
        myConn=ds.getConnection(); //[ /SelectUseCase_Right.jsp; Line: 82]
        myStatement1=myConn.createStatement(); //[ /SelectUseCase_Right.jsp; Line: 83]
        myStatement2=myConn.createStatement(); //[ /SelectUseCase_Right.jsp; Line: 84]
        //[ /SelectUseCase_Right.jsp; Line: 85]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /SelectUseCase_Right.jsp; Line: 95]
        //[ /SelectUseCase_Right.jsp; Line: 96]
        String sql=new String(); //[ /SelectUseCase_Right.jsp; Line: 97]
        ResultSet rs; //[ /SelectUseCase_Right.jsp; Line: 98]
        String sError=(String)session.getAttribute("Error"); //[ /SelectUseCase_Right.jsp; Line: 99]
        String dis=new String(); //[ /SelectUseCase_Right.jsp; Line: 100]
        //[ /SelectUseCase_Right.jsp; Line: 101]
        if(sError.equals("2.1") || sError.equals("2.2") || sError.equals("2.3") || sError.equals("2.4") || sError.equals("3.1") || sError.equals("2.5")) //[ /SelectUseCase_Right.jsp; Line: 102]
        { //[ /SelectUseCase_Right.jsp; Line: 103]
          session.setAttribute("Error","null"); //[ /SelectUseCase_Right.jsp; Line: 104]
          sql="select error_dis from tctc_error where error_code='"+sError+"'"; //[ /SelectUseCase_Right.jsp; Line: 105]
          rs=myStatement1.executeQuery(sql); //[ /SelectUseCase_Right.jsp; Line: 106]
          if(rs.next()) //[ /SelectUseCase_Right.jsp; Line: 107]
          { //[ /SelectUseCase_Right.jsp; Line: 108]
            dis=rs.getString("error_dis"); //[ /SelectUseCase_Right.jsp; Line: 109]
            //[ /SelectUseCase_Right.jsp; Line: 110]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            out.print(String.valueOf(dis ));  //[ /SelectUseCase_Right.jsp; Line: 115]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            //[ /SelectUseCase_Right.jsp; Line: 119]
          } //[ /SelectUseCase_Right.jsp; Line: 120]
        } //[ /SelectUseCase_Right.jsp; Line: 121]
        _writeText(response, out, _wl_block8, _wl_block8Bytes);
        //[ /SelectUseCase_Right.jsp; Line: 140]
        String radioName=new String(); //[ /SelectUseCase_Right.jsp; Line: 141]
        String textName=new String(); //[ /SelectUseCase_Right.jsp; Line: 142]
        String textName1=new String(); //[ /SelectUseCase_Right.jsp; Line: 143]
        String textName2=new String(); //[ /SelectUseCase_Right.jsp; Line: 144]
        String UseCaseName=new String(); //[ /SelectUseCase_Right.jsp; Line: 145]
        String UseCaseAB=new String(); //[ /SelectUseCase_Right.jsp; Line: 146]
        int noData=0; //[ /SelectUseCase_Right.jsp; Line: 147]
        //[ /SelectUseCase_Right.jsp; Line: 148]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /SelectUseCase_Right.jsp; Line: 149]
        //[ /SelectUseCase_Right.jsp; Line: 150]
        if(sProjectID.equals("null")){ //[ /SelectUseCase_Right.jsp; Line: 151]
          //[ /SelectUseCase_Right.jsp; Line: 152]
          session.setAttribute("Error","2.1"); //[ /SelectUseCase_Right.jsp; Line: 153]
          _writeText(response, out, _wl_block9, _wl_block9Bytes);
          //[ /SelectUseCase_Right.jsp; Line: 161]
          //[ /SelectUseCase_Right.jsp; Line: 162]
        } //[ /SelectUseCase_Right.jsp; Line: 163]
        else{ //[ /SelectUseCase_Right.jsp; Line: 164]
          //[ /SelectUseCase_Right.jsp; Line: 165]
          long projectID=Integer.parseInt(sProjectID); //[ /SelectUseCase_Right.jsp; Line: 166]
          long UseCaseID=0; //[ /SelectUseCase_Right.jsp; Line: 167]
          //[ /SelectUseCase_Right.jsp; Line: 168]
          int number=0; //[ /SelectUseCase_Right.jsp; Line: 169]
          //[ /SelectUseCase_Right.jsp; Line: 170]
          sql="select uc_id,uc_name,uc_ab from tctc_uc where project_id=" +projectID; //[ /SelectUseCase_Right.jsp; Line: 171]
          rs=myStatement2.executeQuery(sql); //[ /SelectUseCase_Right.jsp; Line: 172]
          //[ /SelectUseCase_Right.jsp; Line: 173]
          if(rs.next()){ //[ /SelectUseCase_Right.jsp; Line: 174]
            noData=1; //[ /SelectUseCase_Right.jsp; Line: 175]
            //[ /SelectUseCase_Right.jsp; Line: 176]
            do{ //[ /SelectUseCase_Right.jsp; Line: 177]
              UseCaseID=rs.getLong("uc_id"); //[ /SelectUseCase_Right.jsp; Line: 178]
              UseCaseName=rs.getString("uc_name"); //[ /SelectUseCase_Right.jsp; Line: 179]
              UseCaseAB=rs.getString("uc_ab"); //[ /SelectUseCase_Right.jsp; Line: 180]
              UseCaseName=rr.replace(UseCaseName); //[ /SelectUseCase_Right.jsp; Line: 181]
              UseCaseName=rr.replaceBlank(UseCaseName); //[ /SelectUseCase_Right.jsp; Line: 182]
              UseCaseAB=rr.replace(UseCaseAB); //[ /SelectUseCase_Right.jsp; Line: 183]
              UseCaseAB=rr.replaceBlank(UseCaseAB); //[ /SelectUseCase_Right.jsp; Line: 184]
              //[ /SelectUseCase_Right.jsp; Line: 185]
              number=number+1; //[ /SelectUseCase_Right.jsp; Line: 186]
              radioName=String.valueOf(number); //[ /SelectUseCase_Right.jsp; Line: 187]
              textName="t"+String.valueOf(number); //[ /SelectUseCase_Right.jsp; Line: 188]
              textName1="u"+String.valueOf(number); //[ /SelectUseCase_Right.jsp; Line: 189]
              textName2="uu"+String.valueOf(number); //[ /SelectUseCase_Right.jsp; Line: 190]
              _writeText(response, out, _wl_block10, _wl_block10Bytes);
              //[ /SelectUseCase_Right.jsp; Line: 194]
              if(number==1){ //[ /SelectUseCase_Right.jsp; Line: 195]
                _writeText(response, out, _wl_block11, _wl_block11Bytes);
                out.print(String.valueOf(radioName ));  //[ /SelectUseCase_Right.jsp; Line: 198]
                _writeText(response, out, _wl_block12, _wl_block12Bytes);
                //[ /SelectUseCase_Right.jsp; Line: 199]
              } //[ /SelectUseCase_Right.jsp; Line: 200]
              else{ //[ /SelectUseCase_Right.jsp; Line: 201]
                _writeText(response, out, _wl_block13, _wl_block13Bytes);
                out.print(String.valueOf(radioName ));  //[ /SelectUseCase_Right.jsp; Line: 203]
                _writeText(response, out, _wl_block14, _wl_block14Bytes);
                //[ /SelectUseCase_Right.jsp; Line: 204]
              } //[ /SelectUseCase_Right.jsp; Line: 205]
              _writeText(response, out, _wl_block15, _wl_block15Bytes);
              out.print(String.valueOf(textName1 ));  //[ /SelectUseCase_Right.jsp; Line: 208]
              _writeText(response, out, _wl_block16, _wl_block16Bytes);
              out.print(String.valueOf(UseCaseName ));  //[ /SelectUseCase_Right.jsp; Line: 208]
              _writeText(response, out, _wl_block17, _wl_block17Bytes);
              out.print(String.valueOf(textName ));  //[ /SelectUseCase_Right.jsp; Line: 208]
              _writeText(response, out, _wl_block18, _wl_block18Bytes);
              out.print(String.valueOf(UseCaseID ));  //[ /SelectUseCase_Right.jsp; Line: 208]
              _writeText(response, out, _wl_block19, _wl_block19Bytes);
              out.print(String.valueOf(textName2 ));  //[ /SelectUseCase_Right.jsp; Line: 209]
              _writeText(response, out, _wl_block20, _wl_block20Bytes);
              out.print(String.valueOf(UseCaseAB ));  //[ /SelectUseCase_Right.jsp; Line: 209]
              _writeText(response, out, _wl_block21, _wl_block21Bytes);
              out.print(String.valueOf(textName ));  //[ /SelectUseCase_Right.jsp; Line: 209]
              _writeText(response, out, _wl_block22, _wl_block22Bytes);
              out.print(String.valueOf(UseCaseID ));  //[ /SelectUseCase_Right.jsp; Line: 209]
              _writeText(response, out, _wl_block23, _wl_block23Bytes);
              //[ /SelectUseCase_Right.jsp; Line: 212]
            }while(rs.next()); //[ /SelectUseCase_Right.jsp; Line: 213]
            rs.close(); //[ /SelectUseCase_Right.jsp; Line: 214]
            //[ /SelectUseCase_Right.jsp; Line: 215]
          } //[ /SelectUseCase_Right.jsp; Line: 216]
        } //[ /SelectUseCase_Right.jsp; Line: 217]
        _writeText(response, out, _wl_block24, _wl_block24Bytes);
        //[ /SelectUseCase_Right.jsp; Line: 222]
        if(noData==1){ //[ /SelectUseCase_Right.jsp; Line: 223]
          _writeText(response, out, _wl_block25, _wl_block25Bytes);
          //[ /SelectUseCase_Right.jsp; Line: 234]
        } //[ /SelectUseCase_Right.jsp; Line: 235]
        //[ /SelectUseCase_Right.jsp; Line: 236]
        _writeText(response, out, _wl_block26, _wl_block26Bytes);
        //[ /SelectUseCase_Right.jsp; Line: 281]
        myConn.close(); //[ /SelectUseCase_Right.jsp; Line: 282]
        myStatement1.close(); //[ /SelectUseCase_Right.jsp; Line: 283]
        myStatement2.close(); //[ /SelectUseCase_Right.jsp; Line: 284]
      } //[ /SelectUseCase_Right.jsp; Line: 285]
      _writeText(response, out, _wl_block27, _wl_block27Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
