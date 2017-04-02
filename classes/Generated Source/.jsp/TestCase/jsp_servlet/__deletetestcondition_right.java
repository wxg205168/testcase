/* compiled from JSP: /DeleteTestCondition_Right.jsp
*
* This code was automatically generated at 9:23:12 on 2005-6-30
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
import java.sql.*; //[ /DeleteTestCondition_Right.jsp; Line: 43]


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
* This code was automatically generated at 9:23:12 on 2005-6-30
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
    if (sci.isResourceStale("/DeleteTestCondition_Right.jsp", 1120094586000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestCondition_Right.jsp", 1120094586000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title>无标题文档</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"DeleteTestConditionConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\nfunction testSubmit1()\r\n{\r\ndocument.forms[1].action=\"CreateTestConditionConfirm.jsp\";\r\ndocument.forms[1].submit();\r\n}\r\n\r\n</script>\r\n\r\n<body>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n<form method=\"POST\">\r\n\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestCondition-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<table width=\"400\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Select any Test Condition to delete from list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = " /></TD>\r\n      <TD width=\"725\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=\"textarea\" cols=\"99\" rows=\"3\">";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "</textarea><input type = \"hidden\" name = ";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = " value =";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = " /></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n  </TBODY>\r\n</TABLE>\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n\r\n</form>\r\n\r\n<form method=\"POST\">\r\n\r\n<table width=\"400\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Create Test Condition by Test Element Condition:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" >Test Element</TD>\r\n      <TD width=\"23\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">&nbsp;</span></TD>\r\n      <TD width=\"577\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Condition</span></TD>\r\n    </TR>\r\n</TABLE>\r\n\r\n";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectUseCase.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectFunctionPoint.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n\r\n<TABLE width=\"750\" border=1>\r\n\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n      <TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" bgColor=#74A5E8>";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = "</TD>\r\n      <TD width=\"23\"  align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC widt=\"23\" ><input type=\"radio\" name=";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = " value=";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = " checked=\"checked\" /></TD>\r\n";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "\r\n      <TD width=\"150\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" bgColor=#74A5E8>&nbsp;</TD>\r\n      <TD width=\"23\"  align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC widt=\"23\" ><input type=\"radio\" name=";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = " value=";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = " /></TD>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n      <TD width=\"577\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" widt=\"627\" ><textarea name=\"textarea\" cols=\"80\" rows=\"3\">";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = "</textarea><input type = \"hidden\" name = ";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = " value =";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = " /></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "\r\n\r\n</TABLE>\r\n";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = "\r\n\r\n\r\n";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  private final static String _wl_block32 = "\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block32Bytes = _getBytes(_wl_block32);
  private final static String _wl_block33 = "\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block33Bytes = _getBytes(_wl_block33);
  
  
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
      mydb.DatabaseBean tt = null; //[ /DeleteTestCondition_Right.jsp; Line: 44]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestCondition_Right.jsp; Line: 44]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 44]
        { // Don't need to synchronize on page scope //[ /DeleteTestCondition_Right.jsp; Line: 44]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestCondition_Right.jsp; Line: 44]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 44]
            tt = new mydb.DatabaseBean(); //[ /DeleteTestCondition_Right.jsp; Line: 44]
            pageContext.setAttribute("tt", tt); //[ /DeleteTestCondition_Right.jsp; Line: 44]
          } // end synchronized bean instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 44]
        } // end synchronized bean scope block... //[ /DeleteTestCondition_Right.jsp; Line: 44]
      } // end bean instantiation block... //[ /DeleteTestCondition_Right.jsp; Line: 44]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteTestCondition_Right.jsp; Line: 69]
      int noData=0; //[ /DeleteTestCondition_Right.jsp; Line: 70]
      //[ /DeleteTestCondition_Right.jsp; Line: 71]
      String sProjectID=(String)session.getAttribute("ProjectID"); //[ /DeleteTestCondition_Right.jsp; Line: 72]
      String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /DeleteTestCondition_Right.jsp; Line: 73]
      String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /DeleteTestCondition_Right.jsp; Line: 74]
      //[ /DeleteTestCondition_Right.jsp; Line: 75]
      String sql,sql1; //[ /DeleteTestCondition_Right.jsp; Line: 76]
      ResultSet rs,rs1,rs2,rs3; //[ /DeleteTestCondition_Right.jsp; Line: 77]
      //[ /DeleteTestCondition_Right.jsp; Line: 78]
      String checkName=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 79]
      String textName=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 80]
      //[ /DeleteTestCondition_Right.jsp; Line: 81]
      long informationID=0; //[ /DeleteTestCondition_Right.jsp; Line: 82]
      String information=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 83]
      int number=0; //[ /DeleteTestCondition_Right.jsp; Line: 84]
      //[ /DeleteTestCondition_Right.jsp; Line: 85]
      //[ /DeleteTestCondition_Right.jsp; Line: 86]
      if(sProjectID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 87]
        //[ /DeleteTestCondition_Right.jsp; Line: 88]
        session.setAttribute("Error","2.1"); //[ /DeleteTestCondition_Right.jsp; Line: 89]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 94]
      } //[ /DeleteTestCondition_Right.jsp; Line: 95]
      else if(sUseCaseID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 96]
        session.setAttribute("Error","3.1"); //[ /DeleteTestCondition_Right.jsp; Line: 97]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 102]
      } //[ /DeleteTestCondition_Right.jsp; Line: 103]
      else if(sFunctionPointID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 104]
        session.setAttribute("Error","4.1"); //[ /DeleteTestCondition_Right.jsp; Line: 105]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 110]
      } //[ /DeleteTestCondition_Right.jsp; Line: 111]
      else{ //[ /DeleteTestCondition_Right.jsp; Line: 112]
        long functionPointID = Integer.parseInt(sFunctionPointID); //[ /DeleteTestCondition_Right.jsp; Line: 113]
        long projectID = Integer.parseInt(sProjectID); //[ /DeleteTestCondition_Right.jsp; Line: 114]
        long useCaseID = Integer.parseInt(sUseCaseID); //[ /DeleteTestCondition_Right.jsp; Line: 115]
        //[ /DeleteTestCondition_Right.jsp; Line: 116]
        sql="select inf_id, inf_dis from tctc_information where fun_p_id="+functionPointID+" and inf_type='condition' and project_id="+projectID+" and uc_id="+useCaseID; //[ /DeleteTestCondition_Right.jsp; Line: 117]
        rs=tt.executeQuery(sql); //[ /DeleteTestCondition_Right.jsp; Line: 118]
        //[ /DeleteTestCondition_Right.jsp; Line: 119]
        if(rs.next()){ //[ /DeleteTestCondition_Right.jsp; Line: 120]
          noData=1; //[ /DeleteTestCondition_Right.jsp; Line: 121]
          do{ //[ /DeleteTestCondition_Right.jsp; Line: 122]
            number++; //[ /DeleteTestCondition_Right.jsp; Line: 123]
            informationID=rs.getLong("inf_id"); //[ /DeleteTestCondition_Right.jsp; Line: 124]
            information=rs.getString("inf_dis"); //[ /DeleteTestCondition_Right.jsp; Line: 125]
            //[ /DeleteTestCondition_Right.jsp; Line: 126]
            checkName="C"+number; //[ /DeleteTestCondition_Right.jsp; Line: 127]
            textName="T"+number; //[ /DeleteTestCondition_Right.jsp; Line: 128]
            _writeText(response, out, _wl_block6, _wl_block6Bytes);
            out.print(String.valueOf(checkName ));  //[ /DeleteTestCondition_Right.jsp; Line: 131]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            out.print(String.valueOf(information ));  //[ /DeleteTestCondition_Right.jsp; Line: 132]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            out.print(String.valueOf(textName ));  //[ /DeleteTestCondition_Right.jsp; Line: 132]
            _writeText(response, out, _wl_block9, _wl_block9Bytes);
            out.print(String.valueOf(informationID ));  //[ /DeleteTestCondition_Right.jsp; Line: 132]
            _writeText(response, out, _wl_block10, _wl_block10Bytes);
            //[ /DeleteTestCondition_Right.jsp; Line: 134]
          }while(rs.next()); //[ /DeleteTestCondition_Right.jsp; Line: 135]
        } //[ /DeleteTestCondition_Right.jsp; Line: 136]
        rs.close(); //[ /DeleteTestCondition_Right.jsp; Line: 137]
        session.setAttribute("CR_Number", String.valueOf(number)); //[ /DeleteTestCondition_Right.jsp; Line: 138]
        //[ /DeleteTestCondition_Right.jsp; Line: 139]
      } //[ /DeleteTestCondition_Right.jsp; Line: 140]
      _writeText(response, out, _wl_block11, _wl_block11Bytes);
      //[ /DeleteTestCondition_Right.jsp; Line: 144]
      if(noData==1){ //[ /DeleteTestCondition_Right.jsp; Line: 145]
        _writeText(response, out, _wl_block12, _wl_block12Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 156]
        noData=0; //[ /DeleteTestCondition_Right.jsp; Line: 157]
      } //[ /DeleteTestCondition_Right.jsp; Line: 158]
      _writeText(response, out, _wl_block13, _wl_block13Bytes);
      //[ /DeleteTestCondition_Right.jsp; Line: 181]
      int first=1; //[ /DeleteTestCondition_Right.jsp; Line: 182]
      int number1=0; //[ /DeleteTestCondition_Right.jsp; Line: 183]
      int elementNumber=0; //[ /DeleteTestCondition_Right.jsp; Line: 184]
      String ElementName=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 185]
      long ElementID=0; //[ /DeleteTestCondition_Right.jsp; Line: 186]
      long InformationID=0; //[ /DeleteTestCondition_Right.jsp; Line: 187]
      String condition=new String(); //[ /DeleteTestCondition_Right.jsp; Line: 188]
      //[ /DeleteTestCondition_Right.jsp; Line: 189]
      //[ /DeleteTestCondition_Right.jsp; Line: 190]
      if(sProjectID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 191]
        //[ /DeleteTestCondition_Right.jsp; Line: 192]
        session.setAttribute("Error","2.1"); //[ /DeleteTestCondition_Right.jsp; Line: 193]
        _writeText(response, out, _wl_block14, _wl_block14Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 198]
      } //[ /DeleteTestCondition_Right.jsp; Line: 199]
      else if(sUseCaseID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 200]
        session.setAttribute("Error","3.1"); //[ /DeleteTestCondition_Right.jsp; Line: 201]
        _writeText(response, out, _wl_block15, _wl_block15Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 206]
      } //[ /DeleteTestCondition_Right.jsp; Line: 207]
      else if(sFunctionPointID.equals("null")){ //[ /DeleteTestCondition_Right.jsp; Line: 208]
        session.setAttribute("Error","4.1"); //[ /DeleteTestCondition_Right.jsp; Line: 209]
        _writeText(response, out, _wl_block16, _wl_block16Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 214]
      } //[ /DeleteTestCondition_Right.jsp; Line: 215]
      else{ //[ /DeleteTestCondition_Right.jsp; Line: 216]
        long ProjectID=Integer.parseInt(sProjectID); //[ /DeleteTestCondition_Right.jsp; Line: 217]
        long UseCaseID=Integer.parseInt(sUseCaseID); //[ /DeleteTestCondition_Right.jsp; Line: 218]
        long FunctionPointID=Integer.parseInt(sFunctionPointID); //[ /DeleteTestCondition_Right.jsp; Line: 219]
        //[ /DeleteTestCondition_Right.jsp; Line: 220]
        sql="select element_id,element_name from tctc_element where project_id="+ProjectID+" and uc_id="+UseCaseID+" and functionpoint_id="+FunctionPointID; //[ /DeleteTestCondition_Right.jsp; Line: 221]
        rs1=tt.executeQuery(sql); //[ /DeleteTestCondition_Right.jsp; Line: 222]
        //[ /DeleteTestCondition_Right.jsp; Line: 223]
        if(rs1.next()) //[ /DeleteTestCondition_Right.jsp; Line: 224]
        { //[ /DeleteTestCondition_Right.jsp; Line: 225]
          do //[ /DeleteTestCondition_Right.jsp; Line: 226]
          { //[ /DeleteTestCondition_Right.jsp; Line: 227]
            _writeText(response, out, _wl_block17, _wl_block17Bytes);
            //[ /DeleteTestCondition_Right.jsp; Line: 232]
            //[ /DeleteTestCondition_Right.jsp; Line: 233]
            ElementID=rs1.getLong("element_id"); //[ /DeleteTestCondition_Right.jsp; Line: 234]
            ElementName=rs1.getString("element_name"); //[ /DeleteTestCondition_Right.jsp; Line: 235]
            first=1; //[ /DeleteTestCondition_Right.jsp; Line: 236]
            number=0; //[ /DeleteTestCondition_Right.jsp; Line: 237]
            //[ /DeleteTestCondition_Right.jsp; Line: 238]
            //[ /DeleteTestCondition_Right.jsp; Line: 239]
            sql1="select inf_id,inf_dis from tctc_information where inf_type='c' and project_id="+ProjectID+" and uc_id="+UseCaseID+" and fun_p_id="+FunctionPointID+" and element_id="+ElementID; //[ /DeleteTestCondition_Right.jsp; Line: 240]
            rs2=tt.executeQuery(sql1); //[ /DeleteTestCondition_Right.jsp; Line: 241]
            //[ /DeleteTestCondition_Right.jsp; Line: 242]
            if(rs2.next()) //[ /DeleteTestCondition_Right.jsp; Line: 243]
            { //[ /DeleteTestCondition_Right.jsp; Line: 244]
              elementNumber++; //[ /DeleteTestCondition_Right.jsp; Line: 245]
              checkName="C"+elementNumber; //[ /DeleteTestCondition_Right.jsp; Line: 246]
              //[ /DeleteTestCondition_Right.jsp; Line: 247]
              noData=1; //[ /DeleteTestCondition_Right.jsp; Line: 248]
              do //[ /DeleteTestCondition_Right.jsp; Line: 249]
              { //[ /DeleteTestCondition_Right.jsp; Line: 250]
                number++; //[ /DeleteTestCondition_Right.jsp; Line: 251]
                condition=rs2.getString("inf_dis"); //[ /DeleteTestCondition_Right.jsp; Line: 252]
                InformationID=rs2.getLong("inf_id"); //[ /DeleteTestCondition_Right.jsp; Line: 253]
                textName="T"+number+checkName; //[ /DeleteTestCondition_Right.jsp; Line: 254]
                //[ /DeleteTestCondition_Right.jsp; Line: 255]
                _writeText(response, out, _wl_block18, _wl_block18Bytes);
                //[ /DeleteTestCondition_Right.jsp; Line: 258]
                if(first==1) //[ /DeleteTestCondition_Right.jsp; Line: 259]
                { //[ /DeleteTestCondition_Right.jsp; Line: 260]
                  first=0; //[ /DeleteTestCondition_Right.jsp; Line: 261]
                  _writeText(response, out, _wl_block19, _wl_block19Bytes);
                  out.print(String.valueOf(ElementName ));  //[ /DeleteTestCondition_Right.jsp; Line: 263]
                  _writeText(response, out, _wl_block20, _wl_block20Bytes);
                  out.print(String.valueOf(checkName ));  //[ /DeleteTestCondition_Right.jsp; Line: 264]
                  _writeText(response, out, _wl_block21, _wl_block21Bytes);
                  out.print(String.valueOf(number ));  //[ /DeleteTestCondition_Right.jsp; Line: 264]
                  _writeText(response, out, _wl_block22, _wl_block22Bytes);
                  //[ /DeleteTestCondition_Right.jsp; Line: 265]
                  //[ /DeleteTestCondition_Right.jsp; Line: 266]
                } //[ /DeleteTestCondition_Right.jsp; Line: 267]
                else //[ /DeleteTestCondition_Right.jsp; Line: 268]
                { //[ /DeleteTestCondition_Right.jsp; Line: 269]
                  _writeText(response, out, _wl_block23, _wl_block23Bytes);
                  out.print(String.valueOf(checkName ));  //[ /DeleteTestCondition_Right.jsp; Line: 272]
                  _writeText(response, out, _wl_block24, _wl_block24Bytes);
                  out.print(String.valueOf(number ));  //[ /DeleteTestCondition_Right.jsp; Line: 272]
                  _writeText(response, out, _wl_block25, _wl_block25Bytes);
                  //[ /DeleteTestCondition_Right.jsp; Line: 273]
                } //[ /DeleteTestCondition_Right.jsp; Line: 274]
                _writeText(response, out, _wl_block26, _wl_block26Bytes);
                out.print(String.valueOf(condition ));  //[ /DeleteTestCondition_Right.jsp; Line: 276]
                _writeText(response, out, _wl_block27, _wl_block27Bytes);
                out.print(String.valueOf(textName ));  //[ /DeleteTestCondition_Right.jsp; Line: 276]
                _writeText(response, out, _wl_block28, _wl_block28Bytes);
                out.print(String.valueOf(InformationID ));  //[ /DeleteTestCondition_Right.jsp; Line: 276]
                _writeText(response, out, _wl_block29, _wl_block29Bytes);
                //[ /DeleteTestCondition_Right.jsp; Line: 278]
              }while(rs2.next()); //[ /DeleteTestCondition_Right.jsp; Line: 279]
            } //[ /DeleteTestCondition_Right.jsp; Line: 280]
            rs2.close(); //[ /DeleteTestCondition_Right.jsp; Line: 281]
            _writeText(response, out, _wl_block30, _wl_block30Bytes);
            //[ /DeleteTestCondition_Right.jsp; Line: 285]
          }while(rs1.next()); //[ /DeleteTestCondition_Right.jsp; Line: 286]
          session.setAttribute("CR_Number2",String.valueOf(elementNumber)); //[ /DeleteTestCondition_Right.jsp; Line: 287]
        } //[ /DeleteTestCondition_Right.jsp; Line: 288]
        rs1.close(); //[ /DeleteTestCondition_Right.jsp; Line: 289]
        //[ /DeleteTestCondition_Right.jsp; Line: 290]
      } //[ /DeleteTestCondition_Right.jsp; Line: 291]
      _writeText(response, out, _wl_block31, _wl_block31Bytes);
      //[ /DeleteTestCondition_Right.jsp; Line: 295]
      if(noData==1){ //[ /DeleteTestCondition_Right.jsp; Line: 296]
        _writeText(response, out, _wl_block32, _wl_block32Bytes);
        //[ /DeleteTestCondition_Right.jsp; Line: 307]
      } //[ /DeleteTestCondition_Right.jsp; Line: 308]
      _writeText(response, out, _wl_block33, _wl_block33Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
