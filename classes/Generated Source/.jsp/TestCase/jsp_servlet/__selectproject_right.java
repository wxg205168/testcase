/* compiled from JSP: /SelectProject_Right.jsp
*
* This code was automatically generated at 11:25:10 on 2005-6-29
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
import java.sql.*; //[ /SelectProject_Right.jsp; Line: 38]


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
* This code was automatically generated at 11:25:10 on 2005-6-29
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __selectproject_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectProject_Right.jsp", 1120015488000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/SelectProject_Right.jsp", 1120015488000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title>Project</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n</head>\r\n\r\n<script language=\"JavaScript\">\r\n\r\nfunction testSubmit()\r\n{\r\ndocument.forms[0].action=\"SelectProjectConfirm.jsp\";\r\ndocument.forms[0].submit();\r\n}\r\n</script>\r\n\r\n<body>\r\n<form method=\"post\" >\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n<table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"left\" valign=\"top\"><img src=\"image/TT-Project-List.jpg\" width=\"285\" height=\"46\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">Error:";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n    <td background=\"image/T2.jpg\">You can select a Project form list:</td>\r\n    <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n  </tr>\r\n</table>\r\n\r\n\r\n<TABLE width=\"660\" border=1 cellPadding=0 cellSpacing=0\r\nstyle=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n  <TBODY>\r\n    <TR align=\"center\" bgColor=#74A5E8>\r\n      <TD width=\"23\" height=\"25\" align=\"left\" borderColorLight=#3458AC borderColorDark=#3458AC class=\"style4\" >&nbsp;</TD>\r\n      <TD width=\"230\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Project Name </span></TD>\r\n      <TD width=\"197\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style4 bold\">Project Manager </span></TD>\r\n      <TD width=\"200\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style4 bold\">Project Leader </span></TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n    <TR align=\"center\" bgColor=#f8f8f8>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = " checked=\"checked\"></TD>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n      <TD height=\"25\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC ><input type=\"radio\" name=\"radiobutton\" value=";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "></TD>\r\n";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "\r\n      <TD align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "<input type=\"hidden\" name=";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = " value=";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = "></TD>\r\n      <TD align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "</TD>\r\n      <TD align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "</TD>\r\n    </TR>\r\n";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = "\r\n  </TBODY>\r\n</TABLE>\r\n";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "\r\n\r\n<table width=\"660\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n    <td width=\"620\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\" ></td>\r\n    <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n    <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n  </tr>\r\n</table>\r\n";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "\r\n</form>\r\n</body>\r\n</html>\r\n";
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
      mydb.DatabaseBean tt = null; //[ /SelectProject_Right.jsp; Line: 39]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectProject_Right.jsp; Line: 39]
      if (tt == null) { // begin 'tt' instantiation block... //[ /SelectProject_Right.jsp; Line: 39]
        { // Don't need to synchronize on page scope //[ /SelectProject_Right.jsp; Line: 39]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /SelectProject_Right.jsp; Line: 39]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /SelectProject_Right.jsp; Line: 39]
            tt = new mydb.DatabaseBean(); //[ /SelectProject_Right.jsp; Line: 39]
            pageContext.setAttribute("tt", tt); //[ /SelectProject_Right.jsp; Line: 39]
          } // end synchronized bean instantiation block... //[ /SelectProject_Right.jsp; Line: 39]
        } // end synchronized bean scope block... //[ /SelectProject_Right.jsp; Line: 39]
      } // end bean instantiation block... //[ /SelectProject_Right.jsp; Line: 39]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /SelectProject_Right.jsp; Line: 46]
      String sql=new String(); //[ /SelectProject_Right.jsp; Line: 47]
      ResultSet rs; //[ /SelectProject_Right.jsp; Line: 48]
      String sError=(String)session.getAttribute("Error"); //[ /SelectProject_Right.jsp; Line: 49]
      String dis=new String(); //[ /SelectProject_Right.jsp; Line: 50]
      //[ /SelectProject_Right.jsp; Line: 51]
      if(sError.equals("1") || sError.equals("2.1")) //[ /SelectProject_Right.jsp; Line: 52]
      { //[ /SelectProject_Right.jsp; Line: 53]
        session.setAttribute("Error","null"); //[ /SelectProject_Right.jsp; Line: 54]
        sql="select error_dis from tctc_error where error_code='"+sError+"'"; //[ /SelectProject_Right.jsp; Line: 55]
        rs=tt.executeQuery(sql); //[ /SelectProject_Right.jsp; Line: 56]
        if(rs.next()) //[ /SelectProject_Right.jsp; Line: 57]
        { //[ /SelectProject_Right.jsp; Line: 58]
          dis=rs.getString("error_dis"); //[ /SelectProject_Right.jsp; Line: 59]
          //[ /SelectProject_Right.jsp; Line: 60]
          _writeText(response, out, _wl_block3, _wl_block3Bytes);
          out.print(String.valueOf(dis ));  //[ /SelectProject_Right.jsp; Line: 65]
          _writeText(response, out, _wl_block4, _wl_block4Bytes);
          //[ /SelectProject_Right.jsp; Line: 69]
        } //[ /SelectProject_Right.jsp; Line: 70]
      } //[ /SelectProject_Right.jsp; Line: 71]
      _writeText(response, out, _wl_block5, _wl_block5Bytes);
      //[ /SelectProject_Right.jsp; Line: 91]
      String radioName=new String(); //[ /SelectProject_Right.jsp; Line: 92]
      String textName=new String(); //[ /SelectProject_Right.jsp; Line: 93]
      String projectName=new String(); //[ /SelectProject_Right.jsp; Line: 94]
      String projectLeader=new String(); //[ /SelectProject_Right.jsp; Line: 95]
      String projectManager=new String(); //[ /SelectProject_Right.jsp; Line: 96]
      long projectID=0; //[ /SelectProject_Right.jsp; Line: 97]
      int number=0; //[ /SelectProject_Right.jsp; Line: 98]
      int noData=0; //[ /SelectProject_Right.jsp; Line: 99]
      //[ /SelectProject_Right.jsp; Line: 100]
      sql="select pro_id,pro_n,pro_r,pro_l,pro_m from tctc_project"; //[ /SelectProject_Right.jsp; Line: 101]
      rs=tt.executeQuery(sql); //[ /SelectProject_Right.jsp; Line: 102]
      //[ /SelectProject_Right.jsp; Line: 103]
      if(rs.next()){ //[ /SelectProject_Right.jsp; Line: 104]
        noData=1; //[ /SelectProject_Right.jsp; Line: 105]
        //[ /SelectProject_Right.jsp; Line: 106]
        do{ //[ /SelectProject_Right.jsp; Line: 107]
          projectName=rs.getString("pro_n"); //[ /SelectProject_Right.jsp; Line: 108]
          projectLeader=rs.getString("pro_l"); //[ /SelectProject_Right.jsp; Line: 109]
          projectManager=rs.getString("pro_m"); //[ /SelectProject_Right.jsp; Line: 110]
          projectID=rs.getLong("pro_id"); //[ /SelectProject_Right.jsp; Line: 111]
          number=number+1; //[ /SelectProject_Right.jsp; Line: 112]
          radioName=String.valueOf(number); //[ /SelectProject_Right.jsp; Line: 113]
          textName="t"+String.valueOf(number); //[ /SelectProject_Right.jsp; Line: 114]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /SelectProject_Right.jsp; Line: 117]
          if(number==1){ //[ /SelectProject_Right.jsp; Line: 118]
            _writeText(response, out, _wl_block7, _wl_block7Bytes);
            out.print(String.valueOf(radioName ));  //[ /SelectProject_Right.jsp; Line: 120]
            _writeText(response, out, _wl_block8, _wl_block8Bytes);
            //[ /SelectProject_Right.jsp; Line: 121]
          } //[ /SelectProject_Right.jsp; Line: 122]
          else{ //[ /SelectProject_Right.jsp; Line: 123]
            _writeText(response, out, _wl_block9, _wl_block9Bytes);
            out.print(String.valueOf(radioName ));  //[ /SelectProject_Right.jsp; Line: 125]
            _writeText(response, out, _wl_block10, _wl_block10Bytes);
            //[ /SelectProject_Right.jsp; Line: 126]
          } //[ /SelectProject_Right.jsp; Line: 127]
          _writeText(response, out, _wl_block11, _wl_block11Bytes);
          out.print(String.valueOf(projectName ));  //[ /SelectProject_Right.jsp; Line: 129]
          _writeText(response, out, _wl_block12, _wl_block12Bytes);
          out.print(String.valueOf(textName ));  //[ /SelectProject_Right.jsp; Line: 129]
          _writeText(response, out, _wl_block13, _wl_block13Bytes);
          out.print(String.valueOf(projectID ));  //[ /SelectProject_Right.jsp; Line: 129]
          _writeText(response, out, _wl_block14, _wl_block14Bytes);
          out.print(String.valueOf(projectManager ));  //[ /SelectProject_Right.jsp; Line: 130]
          _writeText(response, out, _wl_block15, _wl_block15Bytes);
          out.print(String.valueOf(projectLeader ));  //[ /SelectProject_Right.jsp; Line: 131]
          _writeText(response, out, _wl_block16, _wl_block16Bytes);
          //[ /SelectProject_Right.jsp; Line: 133]
        }while(rs.next()); //[ /SelectProject_Right.jsp; Line: 134]
        rs.close(); //[ /SelectProject_Right.jsp; Line: 135]
      } //[ /SelectProject_Right.jsp; Line: 136]
      else{ //[ /SelectProject_Right.jsp; Line: 137]
        noData=0; //[ /SelectProject_Right.jsp; Line: 138]
        rs.close(); //[ /SelectProject_Right.jsp; Line: 139]
      } //[ /SelectProject_Right.jsp; Line: 140]
      _writeText(response, out, _wl_block17, _wl_block17Bytes);
      //[ /SelectProject_Right.jsp; Line: 144]
      if(noData==1) //[ /SelectProject_Right.jsp; Line: 145]
      { //[ /SelectProject_Right.jsp; Line: 146]
        //[ /SelectProject_Right.jsp; Line: 147]
        //[ /SelectProject_Right.jsp; Line: 147]
        _writeText(response, out, _wl_block18, _wl_block18Bytes);
        //[ /SelectProject_Right.jsp; Line: 157]
      } //[ /SelectProject_Right.jsp; Line: 158]
      _writeText(response, out, _wl_block19, _wl_block19Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
