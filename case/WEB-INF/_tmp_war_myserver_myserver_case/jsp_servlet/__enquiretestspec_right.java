/* compiled from JSP: /EnquireTestSpec_Right.jsp
*
* This code was automatically generated at 12:45:44 on 2005-8-29
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
import java.sql.*; //[ /EnquireTestSpec_Right.jsp; Line: 37]
import javax.sql.*; //[ /EnquireTestSpec_Right.jsp; Line: 37]
import java.util.Enumeration; //[ /EnquireTestSpec_Right.jsp; Line: 37]


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
* This code was automatically generated at 12:45:44 on 2005-8-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __enquiretestspec_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestSpec_Right.jsp", 1123573654000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestSpec_Right.jsp", 1123573654000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title>无标题文档</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"SendTestSpecConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n\r\n</script>\r\n\r\n<body>\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n<form method=\"post\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestSpec-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">View Test Case from list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"100\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" >Test Object</TD>\r\n      <TD width=\"325\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></TD>\r\n      <TD width=\"325\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Result</span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n      <TD width=\"100\" height=\"25\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC >";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "</TD>\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n      <TD width=\"100\" height=\"25\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n\r\n\r\n      <TD width=\"325\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "</TD>\r\n      <TD width=\"325\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "</TD>\r\n\r\n\r\n    </TR>\r\n";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "\r\n  </TBODY>\r\n</TABLE>\r\n\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select2.gif\" width=\"52\" height=\"22\" onclick=\"testSubmit()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n\r\n</form>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  
  
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
      mydb.DatabaseBean tt = null; //[ /EnquireTestSpec_Right.jsp; Line: 38]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestSpec_Right.jsp; Line: 38]
      if (tt == null) { // begin 'tt' instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 38]
        { // Don't need to synchronize on page scope //[ /EnquireTestSpec_Right.jsp; Line: 38]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestSpec_Right.jsp; Line: 38]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 38]
            tt = new mydb.DatabaseBean(); //[ /EnquireTestSpec_Right.jsp; Line: 38]
            pageContext.setAttribute("tt", tt); //[ /EnquireTestSpec_Right.jsp; Line: 38]
          } // end synchronized bean instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 38]
        } // end synchronized bean scope block... //[ /EnquireTestSpec_Right.jsp; Line: 38]
      } // end bean instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 38]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /EnquireTestSpec_Right.jsp; Line: 39]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestSpec_Right.jsp; Line: 39]
      if (rr == null) { // begin 'rr' instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 39]
        { // Don't need to synchronize on page scope //[ /EnquireTestSpec_Right.jsp; Line: 39]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestSpec_Right.jsp; Line: 39]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 39]
            rr = new managestring.mystring(); //[ /EnquireTestSpec_Right.jsp; Line: 39]
            pageContext.setAttribute("rr", rr); //[ /EnquireTestSpec_Right.jsp; Line: 39]
          } // end synchronized bean instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 39]
        } // end synchronized bean scope block... //[ /EnquireTestSpec_Right.jsp; Line: 39]
      } // end bean instantiation block... //[ /EnquireTestSpec_Right.jsp; Line: 39]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      //[ /EnquireTestSpec_Right.jsp; Line: 41]
      Enumeration ss=session.getAttributeNames(); //[ /EnquireTestSpec_Right.jsp; Line: 42]
      //[ /EnquireTestSpec_Right.jsp; Line: 43]
      if(!ss.hasMoreElements()){ //[ /EnquireTestSpec_Right.jsp; Line: 44]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /EnquireTestSpec_Right.jsp; Line: 49]
      } //[ /EnquireTestSpec_Right.jsp; Line: 50]
      else{ //[ /EnquireTestSpec_Right.jsp; Line: 51]
        DataSource ds=null; //[ /EnquireTestSpec_Right.jsp; Line: 52]
        ds=tt.getDataSource(); //[ /EnquireTestSpec_Right.jsp; Line: 53]
        Connection myConn=null; //[ /EnquireTestSpec_Right.jsp; Line: 54]
        Statement myStatement1=null; //[ /EnquireTestSpec_Right.jsp; Line: 55]
        Statement myStatement2=null; //[ /EnquireTestSpec_Right.jsp; Line: 56]
        Statement myStatement3=null; //[ /EnquireTestSpec_Right.jsp; Line: 57]
        Statement myStatement4=null; //[ /EnquireTestSpec_Right.jsp; Line: 58]
        Statement myStatement5=null; //[ /EnquireTestSpec_Right.jsp; Line: 59]
        myConn=ds.getConnection(); //[ /EnquireTestSpec_Right.jsp; Line: 60]
        myStatement1=myConn.createStatement(); //[ /EnquireTestSpec_Right.jsp; Line: 61]
        myStatement2=myConn.createStatement(); //[ /EnquireTestSpec_Right.jsp; Line: 62]
        myStatement3=myConn.createStatement(); //[ /EnquireTestSpec_Right.jsp; Line: 63]
        myStatement4=myConn.createStatement(); //[ /EnquireTestSpec_Right.jsp; Line: 64]
        myStatement5=myConn.createStatement(); //[ /EnquireTestSpec_Right.jsp; Line: 65]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /EnquireTestSpec_Right.jsp; Line: 92]
        int noData=0; //[ /EnquireTestSpec_Right.jsp; Line: 93]
        //[ /EnquireTestSpec_Right.jsp; Line: 94]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireTestSpec_Right.jsp; Line: 95]
        //[ /EnquireTestSpec_Right.jsp; Line: 96]
        String sql=new String(); //[ /EnquireTestSpec_Right.jsp; Line: 97]
        ResultSet rs1,rs2,rs3,rs4; //[ /EnquireTestSpec_Right.jsp; Line: 98]
        rs4=null; //[ /EnquireTestSpec_Right.jsp; Line: 99]
        //[ /EnquireTestSpec_Right.jsp; Line: 100]
        long testCaseID=0; //[ /EnquireTestSpec_Right.jsp; Line: 101]
        int number=0; //[ /EnquireTestSpec_Right.jsp; Line: 102]
        //[ /EnquireTestSpec_Right.jsp; Line: 103]
        if(sProjectID.equals("null")){ //[ /EnquireTestSpec_Right.jsp; Line: 104]
          //[ /EnquireTestSpec_Right.jsp; Line: 105]
          session.setAttribute("Error","2.1"); //[ /EnquireTestSpec_Right.jsp; Line: 106]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /EnquireTestSpec_Right.jsp; Line: 111]
        } //[ /EnquireTestSpec_Right.jsp; Line: 112]
        else{ //[ /EnquireTestSpec_Right.jsp; Line: 113]
          long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestSpec_Right.jsp; Line: 114]
          long functionPointID=0; //[ /EnquireTestSpec_Right.jsp; Line: 115]
          String functionPointName=new String(); //[ /EnquireTestSpec_Right.jsp; Line: 116]
          String cDis = new String(); //[ /EnquireTestSpec_Right.jsp; Line: 117]
          String rDis = new String(); //[ /EnquireTestSpec_Right.jsp; Line: 118]
          int first=1; //[ /EnquireTestSpec_Right.jsp; Line: 119]
          int first2=1; //[ /EnquireTestSpec_Right.jsp; Line: 120]
          int first3=1; //[ /EnquireTestSpec_Right.jsp; Line: 121]
          String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /EnquireTestSpec_Right.jsp; Line: 122]
          long useCaseID=0; //[ /EnquireTestSpec_Right.jsp; Line: 123]
          String[] temp; //[ /EnquireTestSpec_Right.jsp; Line: 124]
          String condition1=new String(); //[ /EnquireTestSpec_Right.jsp; Line: 125]
          //[ /EnquireTestSpec_Right.jsp; Line: 126]
          //   if(sUseCaseID.equals(null) || sUseCaseID.equals("null")){ //[ /EnquireTestSpec_Right.jsp; Line: 127]
            //     sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id"; //[ /EnquireTestSpec_Right.jsp; Line: 128]
            //   } //[ /EnquireTestSpec_Right.jsp; Line: 129]
          //[ /EnquireTestSpec_Right.jsp; Line: 130]
          //   else{ //[ /EnquireTestSpec_Right.jsp; Line: 131]
            //     useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestSpec_Right.jsp; Line: 132]
            //     sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id" +" and uc_id="+useCaseID; //[ /EnquireTestSpec_Right.jsp; Line: 133]
            //   } //[ /EnquireTestSpec_Right.jsp; Line: 134]
          //[ /EnquireTestSpec_Right.jsp; Line: 135]
          try{ //[ /EnquireTestSpec_Right.jsp; Line: 136]
            useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestSpec_Right.jsp; Line: 137]
            sql="select fun_p_id from tctc_test_case where pro_id=" +projectID +" and uc_id="+useCaseID + " group by fun_p_id"; //[ /EnquireTestSpec_Right.jsp; Line: 138]
          } //[ /EnquireTestSpec_Right.jsp; Line: 139]
          catch(NumberFormatException ex){ //[ /EnquireTestSpec_Right.jsp; Line: 140]
            sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id"; //[ /EnquireTestSpec_Right.jsp; Line: 141]
          } //[ /EnquireTestSpec_Right.jsp; Line: 142]
          //[ /EnquireTestSpec_Right.jsp; Line: 143]
          rs1=myStatement1.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 144]
          if(rs1.next()) //[ /EnquireTestSpec_Right.jsp; Line: 145]
          { //[ /EnquireTestSpec_Right.jsp; Line: 146]
            noData=1; //[ /EnquireTestSpec_Right.jsp; Line: 147]
            do //[ /EnquireTestSpec_Right.jsp; Line: 148]
            { //[ /EnquireTestSpec_Right.jsp; Line: 149]
              first=1; //[ /EnquireTestSpec_Right.jsp; Line: 150]
              functionPointID=rs1.getLong("fun_p_id"); //[ /EnquireTestSpec_Right.jsp; Line: 151]
              sql="select fun_n from tctc_function_point where fun_p_id="+functionPointID; //[ /EnquireTestSpec_Right.jsp; Line: 152]
              //[ /EnquireTestSpec_Right.jsp; Line: 153]
              rs2=myStatement2.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 154]
              if(rs2.next()) //[ /EnquireTestSpec_Right.jsp; Line: 155]
              { //[ /EnquireTestSpec_Right.jsp; Line: 156]
                functionPointName=rs2.getString("fun_n"); //[ /EnquireTestSpec_Right.jsp; Line: 157]
                functionPointName=rr.replace(functionPointName); //[ /EnquireTestSpec_Right.jsp; Line: 158]
                sql="select condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID; //[ /EnquireTestSpec_Right.jsp; Line: 159]
                rs3=myStatement3.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 160]
                while(rs3.next()) //[ /EnquireTestSpec_Right.jsp; Line: 161]
                { //[ /EnquireTestSpec_Right.jsp; Line: 162]
                  cDis=rs3.getString("condition"); //[ /EnquireTestSpec_Right.jsp; Line: 163]
                  rDis=rs3.getString("result"); //[ /EnquireTestSpec_Right.jsp; Line: 164]
                  //[ /EnquireTestSpec_Right.jsp; Line: 165]
                  first2=1; //[ /EnquireTestSpec_Right.jsp; Line: 166]
                  first3=1; //[ /EnquireTestSpec_Right.jsp; Line: 167]
                  //[ /EnquireTestSpec_Right.jsp; Line: 168]
                  temp=rr.getID(cDis); //[ /EnquireTestSpec_Right.jsp; Line: 169]
                  //[ /EnquireTestSpec_Right.jsp; Line: 170]
                  sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestSpec_Right.jsp; Line: 171]
                  for(int i=0;i<temp.length;i++){ //[ /EnquireTestSpec_Right.jsp; Line: 172]
                    if(first2==1){ //[ /EnquireTestSpec_Right.jsp; Line: 173]
                      sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestSpec_Right.jsp; Line: 174]
                      first2=0; //[ /EnquireTestSpec_Right.jsp; Line: 175]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 176]
                    else{ //[ /EnquireTestSpec_Right.jsp; Line: 177]
                      sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestSpec_Right.jsp; Line: 178]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 179]
                    //[ /EnquireTestSpec_Right.jsp; Line: 180]
                  } //[ /EnquireTestSpec_Right.jsp; Line: 181]
                  sql=sql+") order by inf_id"; //[ /EnquireTestSpec_Right.jsp; Line: 182]
                  //[ /EnquireTestSpec_Right.jsp; Line: 183]
                  rs4=myStatement4.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 184]
                  first2=1; //[ /EnquireTestSpec_Right.jsp; Line: 185]
                  //[ /EnquireTestSpec_Right.jsp; Line: 186]
                  while(rs4.next()){ //[ /EnquireTestSpec_Right.jsp; Line: 187]
                    condition1=rs4.getString("inf_dis"); //[ /EnquireTestSpec_Right.jsp; Line: 188]
                    condition1=rr.replace(condition1); //[ /EnquireTestSpec_Right.jsp; Line: 189]
                    if(first2==1){ //[ /EnquireTestSpec_Right.jsp; Line: 190]
                      cDis=condition1; //[ /EnquireTestSpec_Right.jsp; Line: 191]
                      first2=0; //[ /EnquireTestSpec_Right.jsp; Line: 192]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 193]
                    else{ //[ /EnquireTestSpec_Right.jsp; Line: 194]
                      cDis=cDis+"<br>"+condition1; //[ /EnquireTestSpec_Right.jsp; Line: 195]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 196]
                  } //[ /EnquireTestSpec_Right.jsp; Line: 197]
                  //[ /EnquireTestSpec_Right.jsp; Line: 198]
                  temp=rr.getID(rDis); //[ /EnquireTestSpec_Right.jsp; Line: 199]
                  //[ /EnquireTestSpec_Right.jsp; Line: 200]
                  sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestSpec_Right.jsp; Line: 201]
                  for(int i=0;i<temp.length;i++){ //[ /EnquireTestSpec_Right.jsp; Line: 202]
                    if(first3==1){ //[ /EnquireTestSpec_Right.jsp; Line: 203]
                      sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestSpec_Right.jsp; Line: 204]
                      first3=0; //[ /EnquireTestSpec_Right.jsp; Line: 205]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 206]
                    else{ //[ /EnquireTestSpec_Right.jsp; Line: 207]
                      sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestSpec_Right.jsp; Line: 208]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 209]
                    //[ /EnquireTestSpec_Right.jsp; Line: 210]
                  } //[ /EnquireTestSpec_Right.jsp; Line: 211]
                  sql=sql+")"; //[ /EnquireTestSpec_Right.jsp; Line: 212]
                  //[ /EnquireTestSpec_Right.jsp; Line: 213]
                  rs4=myStatement5.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 214]
                  first3=1; //[ /EnquireTestSpec_Right.jsp; Line: 215]
                  //[ /EnquireTestSpec_Right.jsp; Line: 216]
                  while(rs4.next()){ //[ /EnquireTestSpec_Right.jsp; Line: 217]
                    condition1=rs4.getString("inf_dis"); //[ /EnquireTestSpec_Right.jsp; Line: 218]
                    condition1=rr.replace(condition1); //[ /EnquireTestSpec_Right.jsp; Line: 219]
                    if(first3==1){ //[ /EnquireTestSpec_Right.jsp; Line: 220]
                      rDis=condition1; //[ /EnquireTestSpec_Right.jsp; Line: 221]
                      first3=0; //[ /EnquireTestSpec_Right.jsp; Line: 222]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 223]
                    else{ //[ /EnquireTestSpec_Right.jsp; Line: 224]
                      rDis=rDis+"<br>"+condition1; //[ /EnquireTestSpec_Right.jsp; Line: 225]
                    } //[ /EnquireTestSpec_Right.jsp; Line: 226]
                    //[ /EnquireTestSpec_Right.jsp; Line: 227]
                  } //[ /EnquireTestSpec_Right.jsp; Line: 228]
                  //[ /EnquireTestSpec_Right.jsp; Line: 229]
                  //[ /EnquireTestSpec_Right.jsp; Line: 230]
                  //[ /EnquireTestSpec_Right.jsp; Line: 231]
                  rs4.close(); //[ /EnquireTestSpec_Right.jsp; Line: 232]
                  //[ /EnquireTestSpec_Right.jsp; Line: 233]
                  _writeText(response, out, _wl_block7, _wl_block7Bytes);
                  //[ /EnquireTestSpec_Right.jsp; Line: 237]
                  if(first==1){ //[ /EnquireTestSpec_Right.jsp; Line: 238]
                    first=0; //[ /EnquireTestSpec_Right.jsp; Line: 239]
                    _writeText(response, out, _wl_block8, _wl_block8Bytes);
                    out.print(String.valueOf(functionPointName ));  //[ /EnquireTestSpec_Right.jsp; Line: 241]
                    _writeText(response, out, _wl_block9, _wl_block9Bytes);
                    //[ /EnquireTestSpec_Right.jsp; Line: 242]
                  } //[ /EnquireTestSpec_Right.jsp; Line: 243]
                  else{ //[ /EnquireTestSpec_Right.jsp; Line: 244]
                    _writeText(response, out, _wl_block10, _wl_block10Bytes);
                    //[ /EnquireTestSpec_Right.jsp; Line: 247]
                  } //[ /EnquireTestSpec_Right.jsp; Line: 248]
                  _writeText(response, out, _wl_block11, _wl_block11Bytes);
                  out.print(String.valueOf(cDis ));  //[ /EnquireTestSpec_Right.jsp; Line: 252]
                  _writeText(response, out, _wl_block12, _wl_block12Bytes);
                  out.print(String.valueOf(rDis ));  //[ /EnquireTestSpec_Right.jsp; Line: 253]
                  _writeText(response, out, _wl_block13, _wl_block13Bytes);
                  //[ /EnquireTestSpec_Right.jsp; Line: 257]
                } //[ /EnquireTestSpec_Right.jsp; Line: 258]
              } //[ /EnquireTestSpec_Right.jsp; Line: 259]
            }while(rs1.next()); //[ /EnquireTestSpec_Right.jsp; Line: 260]
          } //[ /EnquireTestSpec_Right.jsp; Line: 261]
        } //[ /EnquireTestSpec_Right.jsp; Line: 262]
        _writeText(response, out, _wl_block14, _wl_block14Bytes);
        //[ /EnquireTestSpec_Right.jsp; Line: 267]
        if(noData==1){ //[ /EnquireTestSpec_Right.jsp; Line: 268]
          _writeText(response, out, _wl_block15, _wl_block15Bytes);
          //[ /EnquireTestSpec_Right.jsp; Line: 278]
        } //[ /EnquireTestSpec_Right.jsp; Line: 279]
        _writeText(response, out, _wl_block16, _wl_block16Bytes);
        //[ /EnquireTestSpec_Right.jsp; Line: 283]
        myConn.close(); //[ /EnquireTestSpec_Right.jsp; Line: 284]
        myStatement1.close(); //[ /EnquireTestSpec_Right.jsp; Line: 285]
        myStatement2.close(); //[ /EnquireTestSpec_Right.jsp; Line: 286]
        myStatement3.close(); //[ /EnquireTestSpec_Right.jsp; Line: 287]
        myStatement4.close(); //[ /EnquireTestSpec_Right.jsp; Line: 288]
        myStatement5.close(); //[ /EnquireTestSpec_Right.jsp; Line: 289]
      } //[ /EnquireTestSpec_Right.jsp; Line: 290]
      _writeText(response, out, _wl_block17, _wl_block17Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
