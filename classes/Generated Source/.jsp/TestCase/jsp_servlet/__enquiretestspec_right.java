/* compiled from JSP: /EnquireTestSpec_Right.jsp
*
* This code was automatically generated at 8:31:28 on 2005-6-30
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
* This code was automatically generated at 8:31:28 on 2005-6-30
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
    if (sci.isResourceStale("/EnquireTestSpec_Right.jsp", 1120091464000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestSpec_Right.jsp", 1120091464000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block2 = "\r\n\r\n<form method=\"post\">\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestCase-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">View Test Case from list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n<TABLE width=\"750\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"100\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style5\" >Test Object</TD>\r\n      <TD width=\"325\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></TD>\r\n      <TD width=\"325\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Result</span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'SelectProject.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC >";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "</TD>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=\"textarea\" cols=\"43\" rows=\"3\">";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "</textarea></TD>\r\n      <TD align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" ><textarea name=\"textarea2\" cols=\"43\" rows=\"3\">";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "</textarea></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n  </TBODY>\r\n</TABLE>\r\n\r\n";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\r\n<table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select2.gif\" width=\"52\" height=\"22\" onclick=\"testSubmit()\"></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = "\r\n\r\n</form>\r\n\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  
  
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
      //[ /EnquireTestSpec_Right.jsp; Line: 64]
      int noData=0; //[ /EnquireTestSpec_Right.jsp; Line: 65]
      //[ /EnquireTestSpec_Right.jsp; Line: 66]
      String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireTestSpec_Right.jsp; Line: 67]
      //[ /EnquireTestSpec_Right.jsp; Line: 68]
      String sql=new String(); //[ /EnquireTestSpec_Right.jsp; Line: 69]
      ResultSet rs1,rs2,rs3; //[ /EnquireTestSpec_Right.jsp; Line: 70]
      //[ /EnquireTestSpec_Right.jsp; Line: 71]
      long testCaseID=0; //[ /EnquireTestSpec_Right.jsp; Line: 72]
      int number=0; //[ /EnquireTestSpec_Right.jsp; Line: 73]
      //[ /EnquireTestSpec_Right.jsp; Line: 74]
      if(sProjectID.equals("null")){ //[ /EnquireTestSpec_Right.jsp; Line: 75]
        //[ /EnquireTestSpec_Right.jsp; Line: 76]
        session.setAttribute("Error","2.1"); //[ /EnquireTestSpec_Right.jsp; Line: 77]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /EnquireTestSpec_Right.jsp; Line: 82]
      } //[ /EnquireTestSpec_Right.jsp; Line: 83]
      else{ //[ /EnquireTestSpec_Right.jsp; Line: 84]
        long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestSpec_Right.jsp; Line: 85]
        long functionPointID=0; //[ /EnquireTestSpec_Right.jsp; Line: 86]
        String functionPointName=new String(); //[ /EnquireTestSpec_Right.jsp; Line: 87]
        String cDis = new String(); //[ /EnquireTestSpec_Right.jsp; Line: 88]
        String rDis = new String(); //[ /EnquireTestSpec_Right.jsp; Line: 89]
        int first=1; //[ /EnquireTestSpec_Right.jsp; Line: 90]
        //[ /EnquireTestSpec_Right.jsp; Line: 91]
        sql="select fun_p_id from tctc_test_case where pro_id=" +projectID + " group by fun_p_id"; //[ /EnquireTestSpec_Right.jsp; Line: 92]
        rs1=tt.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 93]
        if(rs1.next()) //[ /EnquireTestSpec_Right.jsp; Line: 94]
        { //[ /EnquireTestSpec_Right.jsp; Line: 95]
          noData=1; //[ /EnquireTestSpec_Right.jsp; Line: 96]
          do //[ /EnquireTestSpec_Right.jsp; Line: 97]
          { //[ /EnquireTestSpec_Right.jsp; Line: 98]
            first=1; //[ /EnquireTestSpec_Right.jsp; Line: 99]
            functionPointID=rs1.getLong("fun_p_id"); //[ /EnquireTestSpec_Right.jsp; Line: 100]
            sql="select fun_n from tctc_function_point where fun_p_id="+functionPointID; //[ /EnquireTestSpec_Right.jsp; Line: 101]
            rs2=tt.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 102]
            if(rs2.next()) //[ /EnquireTestSpec_Right.jsp; Line: 103]
            { //[ /EnquireTestSpec_Right.jsp; Line: 104]
              functionPointName=rs2.getString("fun_n"); //[ /EnquireTestSpec_Right.jsp; Line: 105]
              sql="select condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID; //[ /EnquireTestSpec_Right.jsp; Line: 106]
              rs3=tt.executeQuery(sql); //[ /EnquireTestSpec_Right.jsp; Line: 107]
              while(rs3.next()) //[ /EnquireTestSpec_Right.jsp; Line: 108]
              { //[ /EnquireTestSpec_Right.jsp; Line: 109]
                cDis=rs3.getString("condition"); //[ /EnquireTestSpec_Right.jsp; Line: 110]
                rDis=rs3.getString("result"); //[ /EnquireTestSpec_Right.jsp; Line: 111]
                //[ /EnquireTestSpec_Right.jsp; Line: 112]
                _writeText(response, out, _wl_block4, _wl_block4Bytes);
                //[ /EnquireTestSpec_Right.jsp; Line: 116]
                if(first==1){ //[ /EnquireTestSpec_Right.jsp; Line: 117]
                  first=0; //[ /EnquireTestSpec_Right.jsp; Line: 118]
                  _writeText(response, out, _wl_block5, _wl_block5Bytes);
                  out.print(String.valueOf(functionPointName ));  //[ /EnquireTestSpec_Right.jsp; Line: 121]
                  _writeText(response, out, _wl_block6, _wl_block6Bytes);
                  //[ /EnquireTestSpec_Right.jsp; Line: 122]
                } //[ /EnquireTestSpec_Right.jsp; Line: 123]
                else{ //[ /EnquireTestSpec_Right.jsp; Line: 124]
                  _writeText(response, out, _wl_block7, _wl_block7Bytes);
                  //[ /EnquireTestSpec_Right.jsp; Line: 127]
                } //[ /EnquireTestSpec_Right.jsp; Line: 128]
                _writeText(response, out, _wl_block8, _wl_block8Bytes);
                out.print(String.valueOf(cDis ));  //[ /EnquireTestSpec_Right.jsp; Line: 130]
                _writeText(response, out, _wl_block9, _wl_block9Bytes);
                out.print(String.valueOf(rDis ));  //[ /EnquireTestSpec_Right.jsp; Line: 131]
                _writeText(response, out, _wl_block10, _wl_block10Bytes);
                //[ /EnquireTestSpec_Right.jsp; Line: 133]
              } //[ /EnquireTestSpec_Right.jsp; Line: 134]
            } //[ /EnquireTestSpec_Right.jsp; Line: 135]
          }while(rs1.next()); //[ /EnquireTestSpec_Right.jsp; Line: 136]
        } //[ /EnquireTestSpec_Right.jsp; Line: 137]
      } //[ /EnquireTestSpec_Right.jsp; Line: 138]
      _writeText(response, out, _wl_block11, _wl_block11Bytes);
      //[ /EnquireTestSpec_Right.jsp; Line: 143]
      if(noData==1){ //[ /EnquireTestSpec_Right.jsp; Line: 144]
        _writeText(response, out, _wl_block12, _wl_block12Bytes);
        //[ /EnquireTestSpec_Right.jsp; Line: 154]
      } //[ /EnquireTestSpec_Right.jsp; Line: 155]
      _writeText(response, out, _wl_block13, _wl_block13Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
