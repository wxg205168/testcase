/* compiled from JSP: /DeleteTestCondition_Right.jsp
*
* This code was automatically generated at 10:37:47 on 2005-8-8
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
import java.sql.*; //[ /DeleteTestCondition_Right.jsp; Line: 45]
import javax.sql.*; //[ /DeleteTestCondition_Right.jsp; Line: 45]
import java.util.Enumeration; //[ /DeleteTestCondition_Right.jsp; Line: 45]


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
* This code was automatically generated at 10:37:47 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletetestcondition_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestCondition_Right.jsp", 1123464060000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestCondition_Right.jsp", 1123464060000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\n  if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n    document.forms[0].action=\"DeleteTestConditionConfirm.jsp\";\r\n    document.forms[0].submit();\r\n  }\r\n}\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[1].action=\"CreateTestConditionConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\n\r\n</script>\r\n\r\n<body>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n<form method=\"POST\">\r\n\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestCondition-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Select any Test Condition to delete from list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = " /></TD>\r\n      <TD width=\"725\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "<input type = \"hidden\" name = ";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = " value =";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = " /></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "\r\n  </TBODY>\r\n</TABLE>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n\r\n</form>\r\n\r\n<form method=\"POST\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-CreateTestCondition.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Create Test Condition by Test Element Condition:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" >Test Element</TD>\r\n      <TD width=\"23\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">&nbsp;</span></TD>\r\n      <TD width=\"577\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Condition</span></TD>\r\n    </TR>\r\n</TABLE>\r\n\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "\r\n\r\n<TABLE width=\"750\" border=1>\r\n\r\n";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "\r\n      <TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" bgColor=#74A5E8>";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "</TD>\r\n      <TD width=\"23\"  align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC widt=\"23\" ><input type=\"radio\" name=";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = " value=";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = " checked=\"checked\" /></TD>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n      <TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" bgColor=#74A5E8>&nbsp;</TD>\r\n      <TD width=\"23\"  align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC widt=\"23\" ><input type=\"radio\" name=";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = " value=";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = " /></TD>\r\n";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = "\r\n      <TD width=\"577\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" widt=\"627\" >";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "<input type = \"hidden\" name = ";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = " value =";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  private final static String _wl_block32 = " /></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block32Bytes = _getBytes(_wl_block32);
  private final static String _wl_block33 = "\r\n\r\n</TABLE>\r\n";
  private final static byte[] _wl_block33Bytes = _getBytes(_wl_block33);
  private final static String _wl_block34 = "\r\n\r\n\r\n";
  private final static byte[] _wl_block34Bytes = _getBytes(_wl_block34);
  private final static String _wl_block35 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block35Bytes = _getBytes(_wl_block35);
  private final static String _wl_block36 = "\r\n\r\n</form>\r\n";
  private final static byte[] _wl_block36Bytes = _getBytes(_wl_block36);
  private final static String _wl_block37 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block37Bytes = _getBytes(_wl_block37);
  
  
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
      mydb.DatabaseBean tt = null; //[ /DeleteTestCondition_Right.jsp; Line: 46]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestCondition_Right.jsp; Line: 46]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 46]
        { // Don't need to synchronize on page scope //[ /DeleteTestCondition_Right.jsp; Line: 46]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestCondition_Right.jsp; Line: 46]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 46]
            tt = new mydb.DatabaseBean(); //[ /DeleteTestCondition_Right.jsp; Line: 46]
            pageContext.setAttribute("tt", tt); //[ /DeleteTestCondition_Right.jsp; Line: 46]
          } // end synchronized bean instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 46]
        } // end synchronized bean scope block... //[ /DeleteTestCondition_Right.jsp; Line: 46]
      } // end bean instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 46]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /DeleteTestCondition_Right.jsp; Line: 47]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /DeleteTestCondition_Right.jsp; Line: 47]
      if (rr == null) { // begin 'rr' instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 47]
        { // Don't need to synchronize on page scope //[ /DeleteTestCondition_Right.jsp; Line: 47]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /DeleteTestCondition_Right.jsp; Line: 47]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 47]
            rr = new managestring.mystring(); //[ /DeleteTestCondition_Right.jsp; Line: 47]
            pageContext.setAttribute("rr", rr); //[ /DeleteTestCondition_Right.jsp; Line: 47]
          } // end synchronized bean instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 47]
        } // end synchronized bean scope block... //[ /DeleteTestCondition_Right.jsp; Line: 47]
      } // end bean instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 47]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /DeleteTestCondition_Right.jsp; Line: 49]
      Enumeration ss=session.getAttributeNames(); //[ /DeleteTestCondition_Right.jsp; Line: 50]
      //[ /DeleteTestCondition_Right.jsp; Line: 51]
      if(!ss.hasMoreElements()){ //[ /DeleteTestCondition_Right.jsp; Line: 52]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 57]
      } //[ /DeleteTestCondition_Right.jsp; Line: 58]
      else{ //[ /DeleteTestCondition_Right.jsp; Line: 59]
        DataSource ds=null; //[ /DeleteTestCondition_Right.jsp; Line: 60]
        ds=tt.getDataSource(); //[ /DeleteTestCondition_Right.jsp; Line: 61]
        Connection myConn=null; //[ /DeleteTestCondition_Right.jsp; Line: 62]
        Statement myStatement1=null; //[ /DeleteTestCondition_Right.jsp; Line: 63]
        Statement myStatement2=null; //[ /DeleteTestCondition_Right.jsp; Line: 64]
        Statement myStatement3=null; //[ /DeleteTestCondition_Right.jsp; Line: 65]
        Statement myStatement4=null; //[ /DeleteTestCondition_Right.jsp; Line: 66]
        myConn=ds.getConnection(); //[ /DeleteTestCondition_Right.jsp; Line: 67]
        myStatement1=myConn.createStatement(); //[ /DeleteTestCondition_Right.jsp; Line: 68]
        myStatement2=myConn.createStatement(); //[ /DeleteTestCondition_Right.jsp; Line: 69]
        myStatement3=myConn.createStatement(); //[ /DeleteTestCondition_Right.jsp; Line: 70]
        myStatement4=myConn.createStatement(); //[ /DeleteTestCondition_Right.jsp; Line: 71]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 97]
        int noData=0; //[ /DeleteTestCondition_Right.jsp; Line: 98]
        //[ /DeleteTestCondition_Right.jsp; Line: 99]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /DeleteTestCondition_Right.jsp; Line: 100]
        String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /DeleteTestCondition_Right.jsp; Line: 101]
        String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /DeleteTestCondition_Right.jsp; Line: 102]
        //[ /DeleteTestCondition_Right.jsp; Line: 103]
        String sql,sql1; //[ /DeleteTestCondition_Right.jsp; Line: 104]
        ResultSet rs,rs1,rs2,rs3; //[ /DeleteTestCondition_Right.jsp; Line: 105]
        rs3=null; //[ /DeleteTestCondition_Right.jsp; Line: 106]
        //[ /DeleteTestCondition_Right.jsp; Line: 107]
        String checkName=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 108]
        String textName=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 109]
        //[ /DeleteTestCondition_Right.jsp; Line: 110]
        long informationID=0; //[ /DeleteTestCondition_Right.jsp; Line: 111]
        String information=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 112]
        int number=0; //[ /DeleteTestCondition_Right.jsp; Line: 113]
        //[ /DeleteTestCondition_Right.jsp; Line: 114]
        //[ /DeleteTestCondition_Right.jsp; Line: 115]
        if(sProjectID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 116]
          //[ /DeleteTestCondition_Right.jsp; Line: 117]
          session.setAttribute("Error","2.1"); //[ /DeleteTestCondition_Right.jsp; Line: 118]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 123]
        } //[ /DeleteTestCondition_Right.jsp; Line: 124]
        else if(sUseCaseID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 125]
          session.setAttribute("Error","3.1"); //[ /DeleteTestCondition_Right.jsp; Line: 126]
          _writeText(response, out, _wl_block7, _wl_block7Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 131]
        } //[ /DeleteTestCondition_Right.jsp; Line: 132]
        else if(sFunctionPointID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 133]
          session.setAttribute("Error","4.1"); //[ /DeleteTestCondition_Right.jsp; Line: 134]
          _writeText(response, out, _wl_block8, _wl_block8Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 139]
        } //[ /DeleteTestCondition_Right.jsp; Line: 140]
        else{ //[ /DeleteTestCondition_Right.jsp; Line: 141]
          long functionPointID = Integer.parseInt(sFunctionPointID); //[ /DeleteTestCondition_Right.jsp; Line: 142]
          long projectID = Integer.parseInt(sProjectID); //[ /DeleteTestCondition_Right.jsp; Line: 143]
          long useCaseID = Integer.parseInt(sUseCaseID); //[ /DeleteTestCondition_Right.jsp; Line: 144]
          String[] temp; //[ /DeleteTestCondition_Right.jsp; Line: 145]
          String condition1=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 146]
          int first=1; //[ /DeleteTestCondition_Right.jsp; Line: 147]
          //[ /DeleteTestCondition_Right.jsp; Line: 148]
          sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='condition' and project_id="+projectID+" and uc_id="+useCaseID; //[ /DeleteTestCondition_Right.jsp; Line: 149]
          rs=myStatement1.executeQuery(sql); //[ /DeleteTestCondition_Right.jsp; Line: 150]
          //[ /DeleteTestCondition_Right.jsp; Line: 151]
          if(rs.next()){ //[ /DeleteTestCondition_Right.jsp; Line: 152]
            noData=1; //[ /DeleteTestCondition_Right.jsp; Line: 153]
            do{ //[ /DeleteTestCondition_Right.jsp; Line: 154]
              number++; //[ /DeleteTestCondition_Right.jsp; Line: 155]
              informationID=rs.getLong("inf_id"); //[ /DeleteTestCondition_Right.jsp; Line: 156]
              information=rs.getString("inf_dis"); //[ /DeleteTestCondition_Right.jsp; Line: 157]
              //[ /DeleteTestCondition_Right.jsp; Line: 158]
              first=1; //[ /DeleteTestCondition_Right.jsp; Line: 159]
              temp=rr.getID(information); //[ /DeleteTestCondition_Right.jsp; Line: 160]
              //[ /DeleteTestCondition_Right.jsp; Line: 161]
              sql="select inf_dis from tctc_information where inf_id in ( "; //[ /DeleteTestCondition_Right.jsp; Line: 162]
              for(int i=0;i<temp.length;i++){ //[ /DeleteTestCondition_Right.jsp; Line: 163]
                if(first==1){ //[ /DeleteTestCondition_Right.jsp; Line: 164]
                  sql=sql+Integer.parseInt(temp[i]); //[ /DeleteTestCondition_Right.jsp; Line: 165]
                  first=0; //[ /DeleteTestCondition_Right.jsp; Line: 166]
                } //[ /DeleteTestCondition_Right.jsp; Line: 167]
                else{ //[ /DeleteTestCondition_Right.jsp; Line: 168]
                  sql=sql+","+Integer.parseInt(temp[i]); //[ /DeleteTestCondition_Right.jsp; Line: 169]
                } //[ /DeleteTestCondition_Right.jsp; Line: 170]
                //[ /DeleteTestCondition_Right.jsp; Line: 171]
              } //[ /DeleteTestCondition_Right.jsp; Line: 172]
              sql=sql+")"; //[ /DeleteTestCondition_Right.jsp; Line: 173]
              //[ /DeleteTestCondition_Right.jsp; Line: 174]
              rs3=myStatement2.executeQuery(sql); //[ /DeleteTestCondition_Right.jsp; Line: 175]
              first=1; //[ /DeleteTestCondition_Right.jsp; Line: 176]
              //[ /DeleteTestCondition_Right.jsp; Line: 177]
              while(rs3.next()){ //[ /DeleteTestCondition_Right.jsp; Line: 178]
                condition1=rs3.getString("inf_dis"); //[ /DeleteTestCondition_Right.jsp; Line: 179]
                condition1=rr.replace(condition1); //[ /DeleteTestCondition_Right.jsp; Line: 180]
                if(first==1){ //[ /DeleteTestCondition_Right.jsp; Line: 181]
                  information=condition1; //[ /DeleteTestCondition_Right.jsp; Line: 182]
                  first=0; //[ /DeleteTestCondition_Right.jsp; Line: 183]
                } //[ /DeleteTestCondition_Right.jsp; Line: 184]
                else{ //[ /DeleteTestCondition_Right.jsp; Line: 185]
                  information=information+"<br>"+condition1; //[ /DeleteTestCondition_Right.jsp; Line: 186]
                } //[ /DeleteTestCondition_Right.jsp; Line: 187]
              } //[ /DeleteTestCondition_Right.jsp; Line: 188]
              //[ /DeleteTestCondition_Right.jsp; Line: 189]
              rs3.close(); //[ /DeleteTestCondition_Right.jsp; Line: 190]
              //[ /DeleteTestCondition_Right.jsp; Line: 191]
              checkName="C"+number; //[ /DeleteTestCondition_Right.jsp; Line: 192]
              textName="T"+number; //[ /DeleteTestCondition_Right.jsp; Line: 193]
              _writeText(response, out, _wl_block9, _wl_block9Bytes);
              out.print(String.valueOf(checkName ));  //[ /DeleteTestCondition_Right.jsp; Line: 196]
              _writeText(response, out, _wl_block10, _wl_block10Bytes);
              out.print(String.valueOf(information ));  //[ /DeleteTestCondition_Right.jsp; Line: 197]
              _writeText(response, out, _wl_block11, _wl_block11Bytes);
              out.print(String.valueOf(textName ));  //[ /DeleteTestCondition_Right.jsp; Line: 197]
              _writeText(response, out, _wl_block12, _wl_block12Bytes);
              out.print(String.valueOf(informationID ));  //[ /DeleteTestCondition_Right.jsp; Line: 197]
              _writeText(response, out, _wl_block13, _wl_block13Bytes);
              //[ /DeleteTestCondition_Right.jsp; Line: 199]
            }while(rs.next()); //[ /DeleteTestCondition_Right.jsp; Line: 200]
          } //[ /DeleteTestCondition_Right.jsp; Line: 201]
          rs.close(); //[ /DeleteTestCondition_Right.jsp; Line: 202]
          session.setAttribute("CR_Number", String.valueOf(number)); //[ /DeleteTestCondition_Right.jsp; Line: 203]
          //[ /DeleteTestCondition_Right.jsp; Line: 204]
        } //[ /DeleteTestCondition_Right.jsp; Line: 205]
        _writeText(response, out, _wl_block14, _wl_block14Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 209]
        if(noData==1){ //[ /DeleteTestCondition_Right.jsp; Line: 210]
          _writeText(response, out, _wl_block15, _wl_block15Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 221]
          noData=0; //[ /DeleteTestCondition_Right.jsp; Line: 222]
        } //[ /DeleteTestCondition_Right.jsp; Line: 223]
        _writeText(response, out, _wl_block16, _wl_block16Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 252]
        int first=1; //[ /DeleteTestCondition_Right.jsp; Line: 253]
        int number1=0; //[ /DeleteTestCondition_Right.jsp; Line: 254]
        int elementNumber=0; //[ /DeleteTestCondition_Right.jsp; Line: 255]
        String ElementName=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 256]
        long ElementID=0; //[ /DeleteTestCondition_Right.jsp; Line: 257]
        long InformationID=0; //[ /DeleteTestCondition_Right.jsp; Line: 258]
        String condition=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 259]
        //[ /DeleteTestCondition_Right.jsp; Line: 260]
        //[ /DeleteTestCondition_Right.jsp; Line: 261]
        if(sProjectID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 262]
          //[ /DeleteTestCondition_Right.jsp; Line: 263]
          session.setAttribute("Error","2.1"); //[ /DeleteTestCondition_Right.jsp; Line: 264]
          _writeText(response, out, _wl_block17, _wl_block17Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 269]
        } //[ /DeleteTestCondition_Right.jsp; Line: 270]
        else if(sUseCaseID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 271]
          session.setAttribute("Error","3.1"); //[ /DeleteTestCondition_Right.jsp; Line: 272]
          _writeText(response, out, _wl_block18, _wl_block18Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 277]
        } //[ /DeleteTestCondition_Right.jsp; Line: 278]
        else if(sFunctionPointID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 279]
          session.setAttribute("Error","4.1"); //[ /DeleteTestCondition_Right.jsp; Line: 280]
          _writeText(response, out, _wl_block19, _wl_block19Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 285]
        } //[ /DeleteTestCondition_Right.jsp; Line: 286]
        else{ //[ /DeleteTestCondition_Right.jsp; Line: 287]
          long ProjectID=Integer.parseInt(sProjectID); //[ /DeleteTestCondition_Right.jsp; Line: 288]
          long UseCaseID=Integer.parseInt(sUseCaseID); //[ /DeleteTestCondition_Right.jsp; Line: 289]
          long FunctionPointID=Integer.parseInt(sFunctionPointID); //[ /DeleteTestCondition_Right.jsp; Line: 290]
          //[ /DeleteTestCondition_Right.jsp; Line: 291]
          sql="select element_id,element_name from tctc_element where project_id="+ProjectID+" and uc_id="+UseCaseID+" and functionpoint_id="+FunctionPointID; //[ /DeleteTestCondition_Right.jsp; Line: 292]
          rs1=myStatement3.executeQuery(sql); //[ /DeleteTestCondition_Right.jsp; Line: 293]
          //[ /DeleteTestCondition_Right.jsp; Line: 294]
          if(rs1.next()) //[ /DeleteTestCondition_Right.jsp; Line: 295]
          { //[ /DeleteTestCondition_Right.jsp; Line: 296]
            do //[ /DeleteTestCondition_Right.jsp; Line: 297]
            { //[ /DeleteTestCondition_Right.jsp; Line: 298]
              _writeText(response, out, _wl_block20, _wl_block20Bytes);
              //[ /DeleteTestCondition_Right.jsp; Line: 303]
              //[ /DeleteTestCondition_Right.jsp; Line: 304]
              ElementID=rs1.getLong("element_id"); //[ /DeleteTestCondition_Right.jsp; Line: 305]
              ElementName=rs1.getString("element_name"); //[ /DeleteTestCondition_Right.jsp; Line: 306]
              first=1; //[ /DeleteTestCondition_Right.jsp; Line: 307]
              number=0; //[ /DeleteTestCondition_Right.jsp; Line: 308]
              //[ /DeleteTestCondition_Right.jsp; Line: 309]
              //[ /DeleteTestCondition_Right.jsp; Line: 310]
              sql1="select inf_id,inf_dis from tctc_information where inf_type='c' and project_id="+ProjectID+" and uc_id="+UseCaseID+" and fun_p_id="+FunctionPointID+" and element_id="+ElementID; //[ /DeleteTestCondition_Right.jsp; Line: 311]
              rs2=myStatement4.executeQuery(sql1); //[ /DeleteTestCondition_Right.jsp; Line: 312]
              //[ /DeleteTestCondition_Right.jsp; Line: 313]
              if(rs2.next()) //[ /DeleteTestCondition_Right.jsp; Line: 314]
              { //[ /DeleteTestCondition_Right.jsp; Line: 315]
                elementNumber++; //[ /DeleteTestCondition_Right.jsp; Line: 316]
                checkName="C"+elementNumber; //[ /DeleteTestCondition_Right.jsp; Line: 317]
                //[ /DeleteTestCondition_Right.jsp; Line: 318]
                noData=1; //[ /DeleteTestCondition_Right.jsp; Line: 319]
                do //[ /DeleteTestCondition_Right.jsp; Line: 320]
                { //[ /DeleteTestCondition_Right.jsp; Line: 321]
                  number++; //[ /DeleteTestCondition_Right.jsp; Line: 322]
                  condition=rs2.getString("inf_dis"); //[ /DeleteTestCondition_Right.jsp; Line: 323]
                  condition=rr.replace(condition); //[ /DeleteTestCondition_Right.jsp; Line: 324]
                  InformationID=rs2.getLong("inf_id"); //[ /DeleteTestCondition_Right.jsp; Line: 325]
                  textName="T"+number+checkName; //[ /DeleteTestCondition_Right.jsp; Line: 326]
                  //[ /DeleteTestCondition_Right.jsp; Line: 327]
                  _writeText(response, out, _wl_block21, _wl_block21Bytes);
                  //[ /DeleteTestCondition_Right.jsp; Line: 330]
                  if(first==1) //[ /DeleteTestCondition_Right.jsp; Line: 331]
                  { //[ /DeleteTestCondition_Right.jsp; Line: 332]
                    first=0; //[ /DeleteTestCondition_Right.jsp; Line: 333]
                    _writeText(response, out, _wl_block22, _wl_block22Bytes);
                    out.print(String.valueOf(ElementName ));  //[ /DeleteTestCondition_Right.jsp; Line: 335]
                    _writeText(response, out, _wl_block23, _wl_block23Bytes);
                    out.print(String.valueOf(checkName ));  //[ /DeleteTestCondition_Right.jsp; Line: 336]
                    _writeText(response, out, _wl_block24, _wl_block24Bytes);
                    out.print(String.valueOf(number ));  //[ /DeleteTestCondition_Right.jsp; Line: 336]
                    _writeText(response, out, _wl_block25, _wl_block25Bytes);
                    //[ /DeleteTestCondition_Right.jsp; Line: 337]
                    //[ /DeleteTestCondition_Right.jsp; Line: 338]
                  } //[ /DeleteTestCondition_Right.jsp; Line: 339]
                  else //[ /DeleteTestCondition_Right.jsp; Line: 340]
                  { //[ /DeleteTestCondition_Right.jsp; Line: 341]
                    _writeText(response, out, _wl_block26, _wl_block26Bytes);
                    out.print(String.valueOf(checkName ));  //[ /DeleteTestCondition_Right.jsp; Line: 344]
                    _writeText(response, out, _wl_block27, _wl_block27Bytes);
                    out.print(String.valueOf(number ));  //[ /DeleteTestCondition_Right.jsp; Line: 344]
                    _writeText(response, out, _wl_block28, _wl_block28Bytes);
                    //[ /DeleteTestCondition_Right.jsp; Line: 345]
                  } //[ /DeleteTestCondition_Right.jsp; Line: 346]
                  _writeText(response, out, _wl_block29, _wl_block29Bytes);
                  out.print(String.valueOf(condition ));  //[ /DeleteTestCondition_Right.jsp; Line: 348]
                  _writeText(response, out, _wl_block30, _wl_block30Bytes);
                  out.print(String.valueOf(textName ));  //[ /DeleteTestCondition_Right.jsp; Line: 348]
                  _writeText(response, out, _wl_block31, _wl_block31Bytes);
                  out.print(String.valueOf(InformationID ));  //[ /DeleteTestCondition_Right.jsp; Line: 348]
                  _writeText(response, out, _wl_block32, _wl_block32Bytes);
                  //[ /DeleteTestCondition_Right.jsp; Line: 350]
                }while(rs2.next()); //[ /DeleteTestCondition_Right.jsp; Line: 351]
              } //[ /DeleteTestCondition_Right.jsp; Line: 352]
              rs2.close(); //[ /DeleteTestCondition_Right.jsp; Line: 353]
              _writeText(response, out, _wl_block33, _wl_block33Bytes);
              //[ /DeleteTestCondition_Right.jsp; Line: 357]
            }while(rs1.next()); //[ /DeleteTestCondition_Right.jsp; Line: 358]
            session.setAttribute("CR_Number2",String.valueOf(elementNumber)); //[ /DeleteTestCondition_Right.jsp; Line: 359]
          } //[ /DeleteTestCondition_Right.jsp; Line: 360]
          rs1.close(); //[ /DeleteTestCondition_Right.jsp; Line: 361]
          //[ /DeleteTestCondition_Right.jsp; Line: 362]
        } //[ /DeleteTestCondition_Right.jsp; Line: 363]
        _writeText(response, out, _wl_block34, _wl_block34Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 367]
        if(noData==1){ //[ /DeleteTestCondition_Right.jsp; Line: 368]
          _writeText(response, out, _wl_block35, _wl_block35Bytes);
          //[ /DeleteTestCondition_Right.jsp; Line: 379]
        } //[ /DeleteTestCondition_Right.jsp; Line: 380]
        _writeText(response, out, _wl_block36, _wl_block36Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 384]
        myConn.close(); //[ /DeleteTestCondition_Right.jsp; Line: 385]
        myStatement1.close(); //[ /DeleteTestCondition_Right.jsp; Line: 386]
        myStatement2.close(); //[ /DeleteTestCondition_Right.jsp; Line: 387]
        myStatement3.close(); //[ /DeleteTestCondition_Right.jsp; Line: 388]
        myStatement4.close(); //[ /DeleteTestCondition_Right.jsp; Line: 389]
        //[ /DeleteTestCondition_Right.jsp; Line: 390]
      } //[ /DeleteTestCondition_Right.jsp; Line: 391]
      _writeText(response, out, _wl_block37, _wl_block37Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
