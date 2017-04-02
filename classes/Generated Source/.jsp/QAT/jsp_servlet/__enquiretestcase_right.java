/* compiled from JSP: /EnquireTestCase_Right.jsp
*
* This code was automatically generated at 17:04:21 on 2005-8-10
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
import java.sql.*; //[ /EnquireTestCase_Right.jsp; Line: 26]
import javax.sql.*; //[ /EnquireTestCase_Right.jsp; Line: 26]
import java.util.Enumeration; //[ /EnquireTestCase_Right.jsp; Line: 26]
import java.util.ArrayList; //[ /EnquireTestCase_Right.jsp; Line: 26]


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
* This code was automatically generated at 17:04:21 on 2005-8-10
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __enquiretestcase_right
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right.jsp", 1123663998000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/EnquireTestCase_Right.jsp", 1123663998000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n\"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tbackground-color: #F6F6F6;\r\n\tmargin-left: 20px;\r\n\tmargin-top: 0px;\r\n}\r\n.bold {FONT-WEIGHT: bold\r\n}\r\n.style4 {color: #FFFFFF}\r\n-->\r\n</style>\r\n<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n.style5 {color: #FFFFFF; font-weight: bold; }\r\n-->\r\n</style>\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectProject.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  private final static String _wl_block7 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectUseCase.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block7Bytes = _getBytes(_wl_block7);
  private final static String _wl_block8 = "\r\n      <script LANGUAGE=\"javascript\">\r\n        parent.location.href=\'SelectFunctionPoint.jsp\'\r\n      </script>\r\n";
  private final static byte[] _wl_block8Bytes = _getBytes(_wl_block8);
  private final static String _wl_block9 = "\r\n        <SCRIPT language=\"JavaScript\">\r\n<!--\r\n          bname=navigator.appName;\r\n          bversion=parseInt(navigator.appVersion)\r\n\r\n          if(bname==\"Netscape\")\r\n            brows=true\r\n          else\r\n            brows=false\r\n\r\n          var x=0;\r\n          var link=new Array();\r\n\r\n          function dspl(msg,bgcolor,dtop,delft){\r\n            this.msg=msg;\r\n            this.bgcolor=bgcolor;\r\n            this.dtop=dtop;\r\n            this.dleft=delft;\r\n          }\r\n";
  private final static byte[] _wl_block9Bytes = _getBytes(_wl_block9);
  private final static String _wl_block10 = "\r\n            link[";
  private final static byte[] _wl_block10Bytes = _getBytes(_wl_block10);
  private final static String _wl_block11 = "]=new dspl(\'";
  private final static byte[] _wl_block11Bytes = _getBytes(_wl_block11);
  private final static String _wl_block12 = "\',\'bisque\',";
  private final static byte[] _wl_block12Bytes = _getBytes(_wl_block12);
  private final static String _wl_block13 = ",";
  private final static byte[] _wl_block13Bytes = _getBytes(_wl_block13);
  private final static String _wl_block14 = ")\r\n";
  private final static byte[] _wl_block14Bytes = _getBytes(_wl_block14);
  private final static String _wl_block15 = "\r\n          function don(x){\r\n            if ((bname==\"Netscape\" && bversion>=4) || (bname==\"Microsoft Internet Explorer\" && bversion>=4)){\r\n              if (brows){\r\n                with(link[x]){\r\n                  document.layers[\'linkex\'].bgColor=bgcolor;\r\n                  document.layers[\'linkex\'].document.writeln(msg);\r\n                  document.layers[\'linkex\'].document.close();\r\n                  document.layers[\'linkex\'].top=dtop;\r\n                  document.layers[\'linkex\'].left=dleft;\r\n                }\r\n                document.layers[\'linkex\'].visibility=\"show\";\r\n              }\r\n              else{\r\n                with(link[x]){\r\n                  linkex.innerHTML=msg;\r\n                  linkex.style.top=dtop;\r\n                  linkex.style.left=dleft;\r\n                  linkex.style.background=bgcolor;\r\n                }\r\n                linkex.style.visibility=\"visible\";\r\n              }\r\n            }\r\n          }\r\n\r\n          function doff(){\r\n            if ((bname==\"Netscape\" && bversion>=4) || (bname==\"Microsoft Internet Explorer\" && bversion>=4)){\r\n              if (brows)\r\n                document.layers[\'linkex\'].visibility=\"hide\";\r\n              else\r\n                linkex.style.visibility=\"hidden\";\r\n              }\r\n            }\r\n//-->\r\n        </SCRIPT>\r\n\r\n        <SCRIPT language=\"JavaScript\">\r\n\r\n          function testSubmit(){\r\n            if(confirm(\"Warning: The correlative information will been deleted!\")){\r\n              document.forms[0].action=\"DeleteTestCaseConfirm.jsp\";\r\n              document.forms[0].submit();\r\n            }\r\n          }\r\n\r\n          function testSubmit1(){\r\n            document.forms[1].action=\"CreateTestCaseConfirm.jsp\";\r\n            document.forms[1].submit();\r\n          }\r\n        </SCRIPT>\r\n</head>\r\n<body>\r\n\r\n<Div id=\"linkex\" style=\"position: absolute; visibility: hidden; width=80%;font-weight: bold;\">\r\n</Div>\r\n<Layer name=\"linkex\" visibility=\"hide\" width=80%>\r\n</Layer>\r\n\r\n<form method=\"post\">\r\n\r\n          <table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n            <tr>\r\n              <td align=\"left\" valign=\"top\"><img src=\"image/TT-TestCase-List.jpg\" width=\"285\" height=\"46\"></td>\r\n            </tr>\r\n          </table>\r\n          <table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n              <td width=\"31\"><img src=\"image/T1.jpg\" width=\"31\" height=\"26\"></td>\r\n              <td background=\"image/T2.jpg\">Select Test Case to delete from list:</td>\r\n              <td width=\"17\"><img src=\"image/T3.jpg\" width=\"17\" height=\"26\"></td>\r\n            </tr>\r\n          </table>\r\n          <table width=\"750\" border=1 cellpadding=0 cellspacing=0\r\n            style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n            <tbody>\r\n              <tr align=\"center\" bgcolor=#74A5E8>\r\n                <td width=\"23\" height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC class=\"style4\" >&nbsp;</td>\r\n                <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Condition</span></td>\r\n    \t        <td width=\"230\" align=\"center\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\">Test Result</span></td>\r\n              </tr>\r\n\r\n";
  private final static byte[] _wl_block15Bytes = _getBytes(_wl_block15);
  private final static String _wl_block16 = "\r\n                  <tr align=\"center\" bgcolor=#f8f8f8>\r\n                    <td height=\"25\" align=\"left\" bordercolorlight=#3458AC bordercolordark=#3458AC ><input type=\"checkbox\" name=";
  private final static byte[] _wl_block16Bytes = _getBytes(_wl_block16);
  private final static String _wl_block17 = " /></td>\r\n                    <td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block17Bytes = _getBytes(_wl_block17);
  private final static String _wl_block18 = "</td>\r\n                    <td width=\"363\" align=\"left\" valign=\"top\" bordercolorlight=#3458AC bordercolordark=#3458AC bgcolor=\"#FFFFFF\" >";
  private final static byte[] _wl_block18Bytes = _getBytes(_wl_block18);
  private final static String _wl_block19 = "<input type = \"hidden\" name = ";
  private final static byte[] _wl_block19Bytes = _getBytes(_wl_block19);
  private final static String _wl_block20 = " value =";
  private final static byte[] _wl_block20Bytes = _getBytes(_wl_block20);
  private final static String _wl_block21 = " /></td>\r\n                  </tr>\r\n";
  private final static byte[] _wl_block21Bytes = _getBytes(_wl_block21);
  private final static String _wl_block22 = "\r\n            </tbody>\r\n          </table>\r\n";
  private final static byte[] _wl_block22Bytes = _getBytes(_wl_block22);
  private final static String _wl_block23 = "\r\n            <table width=\"750\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              <tr>\r\n                <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n                <td width=\"710\" align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select1.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit()\"></td>\r\n                <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n                <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n              </tr>\r\n            </table>\r\n";
  private final static byte[] _wl_block23Bytes = _getBytes(_wl_block23);
  private final static String _wl_block24 = "\r\n</form>\r\n\r\n<form method=\"post\" >\r\n\r\n          <table width=\"660\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n            <tr>\r\n              <td align=\"left\" valign=\"top\"><img src=\"image/TT-Testmatrix.jpg\" width=\"285\" height=\"46\"></td>\r\n            </tr>\r\n          </table>\r\n\r\n          <TABLE width=\"0\" border=1 cellPadding=0 cellSpacing=0\r\n            style=\"BORDER-BOTTOM: #3458AC 0px; BORDER-COLLAPSE: collapse; BORDER-LEFT: #3458AC 0px; BORDER-RIGHT: #3458AC 0px; BORDER-TOP: #3458AC 0px; MARGIN-LEFT: 0pt; \" >\r\n            <TBODY>\r\n";
  private final static byte[] _wl_block24Bytes = _getBytes(_wl_block24);
  private final static String _wl_block25 = "\r\n                       <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block25Bytes = _getBytes(_wl_block25);
  private final static String _wl_block26 = "\r\n                             <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"></td>\r\n";
  private final static byte[] _wl_block26Bytes = _getBytes(_wl_block26);
  private final static String _wl_block27 = "\r\n                             <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><select name=";
  private final static byte[] _wl_block27Bytes = _getBytes(_wl_block27);
  private final static String _wl_block28 = "><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>\r\n";
  private final static byte[] _wl_block28Bytes = _getBytes(_wl_block28);
  private final static String _wl_block29 = "\r\n                             <TD height=\"25\" width=\"150\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block29Bytes = _getBytes(_wl_block29);
  private final static String _wl_block30 = "\r\n                             <TD width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block30Bytes = _getBytes(_wl_block30);
  private final static String _wl_block31 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block31Bytes = _getBytes(_wl_block31);
  private final static String _wl_block32 = " value=";
  private final static byte[] _wl_block32Bytes = _getBytes(_wl_block32);
  private final static String _wl_block33 = "></span></TD>\r\n";
  private final static byte[] _wl_block33Bytes = _getBytes(_wl_block33);
  private final static String _wl_block34 = "\r\n                             <td width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block34Bytes = _getBytes(_wl_block34);
  private final static String _wl_block35 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block35Bytes = _getBytes(_wl_block35);
  private final static String _wl_block36 = " value=";
  private final static byte[] _wl_block36Bytes = _getBytes(_wl_block36);
  private final static String _wl_block37 = "></span></td>\r\n";
  private final static byte[] _wl_block37Bytes = _getBytes(_wl_block37);
  private final static String _wl_block38 = "\r\n                               <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block38Bytes = _getBytes(_wl_block38);
  private final static String _wl_block39 = " value=\"checkbox\"  checked=\"checked\" onmouseover=\"don(";
  private final static byte[] _wl_block39Bytes = _getBytes(_wl_block39);
  private final static String _wl_block40 = ")\" onmouseout=\"doff()\"></td>\r\n";
  private final static byte[] _wl_block40Bytes = _getBytes(_wl_block40);
  private final static String _wl_block41 = "\r\n                               <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block41Bytes = _getBytes(_wl_block41);
  private final static String _wl_block42 = " value=\"checkbox\" onmouseover=\"don(";
  private final static byte[] _wl_block42Bytes = _getBytes(_wl_block42);
  private final static String _wl_block43 = ")\" onmouseout=\"doff()\"></td>\r\n";
  private final static byte[] _wl_block43Bytes = _getBytes(_wl_block43);
  private final static String _wl_block44 = "\r\n                      </TR>\r\n";
  private final static byte[] _wl_block44Bytes = _getBytes(_wl_block44);
  private final static String _wl_block45 = "\r\n                      <TR align=\"center\" bgColor=#74A5E8>\r\n";
  private final static byte[] _wl_block45Bytes = _getBytes(_wl_block45);
  private final static String _wl_block46 = "\r\n                          <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"></td>\r\n";
  private final static byte[] _wl_block46Bytes = _getBytes(_wl_block46);
  private final static String _wl_block47 = "\r\n                          <td width=\"100\" align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><select name=";
  private final static byte[] _wl_block47Bytes = _getBytes(_wl_block47);
  private final static String _wl_block48 = "><option selected>Main Flow</option><option>Alternative</option><option>Exceptional</option><option>Abnormal</option><option>Concurrency</option><option>Logging</option><option>Security</option><option>System Dependency</option></select></td>\r\n";
  private final static byte[] _wl_block48Bytes = _getBytes(_wl_block48);
  private final static String _wl_block49 = "\r\n                          <TD height=\"25\" width=\"150\" align=\"center\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" >&nbsp;</TD>\r\n";
  private final static byte[] _wl_block49Bytes = _getBytes(_wl_block49);
  private final static String _wl_block50 = "\r\n                          <TD width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block50Bytes = _getBytes(_wl_block50);
  private final static String _wl_block51 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block51Bytes = _getBytes(_wl_block51);
  private final static String _wl_block52 = " value=";
  private final static byte[] _wl_block52Bytes = _getBytes(_wl_block52);
  private final static String _wl_block53 = "></span></TD>\r\n";
  private final static byte[] _wl_block53Bytes = _getBytes(_wl_block53);
  private final static String _wl_block54 = "\r\n                          <td width=\"150\" align=\"left\" valign=\"top\" borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\" ><span class=\"style5\"><textarea name=\"testarea\" cols=\"20\" rows=\"5\" readonly=\"true\">";
  private final static byte[] _wl_block54Bytes = _getBytes(_wl_block54);
  private final static String _wl_block55 = "</textarea><input type=\"hidden\" name=";
  private final static byte[] _wl_block55Bytes = _getBytes(_wl_block55);
  private final static String _wl_block56 = " value=";
  private final static byte[] _wl_block56Bytes = _getBytes(_wl_block56);
  private final static String _wl_block57 = "></span></td>\r\n";
  private final static byte[] _wl_block57Bytes = _getBytes(_wl_block57);
  private final static String _wl_block58 = "\r\n                          <td align=\"center\" valign=\"middle\"  borderColorLight=#3458AC borderColorDark=#3458AC bgcolor=\"#74A5E8\"><input type=\"checkbox\" name=";
  private final static byte[] _wl_block58Bytes = _getBytes(_wl_block58);
  private final static String _wl_block59 = " value=\"checkbox\" onmouseover=\"don(";
  private final static byte[] _wl_block59Bytes = _getBytes(_wl_block59);
  private final static String _wl_block60 = ")\" onmouseout=\"doff()\"></td>\r\n";
  private final static byte[] _wl_block60Bytes = _getBytes(_wl_block60);
  private final static String _wl_block61 = "\r\n                      </TR>\r\n";
  private final static byte[] _wl_block61Bytes = _getBytes(_wl_block61);
  private final static String _wl_block62 = "\r\n            </TBODY>\r\n          </TABLE>\r\n\r\n";
  private final static byte[] _wl_block62Bytes = _getBytes(_wl_block62);
  private final static String _wl_block63 = "\r\n\r\n            <table width=";
  private final static byte[] _wl_block63Bytes = _getBytes(_wl_block63);
  private final static String _wl_block64 = " border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              <tr>\r\n                <td width=\"17\"><img src=\"image/table_left.jpg\" width=\"17\" height=\"27\"></td>\r\n                <td align=\"right\" background=\"image/table_left1.jpg\"><img src=\"image/but_select3.gif\" width=\"52\" height=\"22\" onClick=\"testSubmit1()\"></td>\r\n                <td width=\"14\" align=\"right\" background=\"image/table_left1.jpg\">&nbsp;</td>\r\n                <td width=\"9\" background=\"image/T2.jpg\"><img src=\"image/table_left2.jpg\" width=\"9\" height=\"27\"></td>\r\n              </tr>\r\n            </table>\r\n";
  private final static byte[] _wl_block64Bytes = _getBytes(_wl_block64);
  private final static String _wl_block65 = "\r\n</form>\r\n\r\n</body>\r\n";
  private final static byte[] _wl_block65Bytes = _getBytes(_wl_block65);
  private final static String _wl_block66 = "\r\n</html>\r\n";
  private final static byte[] _wl_block66Bytes = _getBytes(_wl_block66);
  
  
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
      mydb.DatabaseBean tt = null; //[ /EnquireTestCase_Right.jsp; Line: 27]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right.jsp; Line: 27]
      if (tt == null) { // begin 'tt' instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 27]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right.jsp; Line: 27]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /EnquireTestCase_Right.jsp; Line: 27]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 27]
            tt = new mydb.DatabaseBean(); //[ /EnquireTestCase_Right.jsp; Line: 27]
            pageContext.setAttribute("tt", tt); //[ /EnquireTestCase_Right.jsp; Line: 27]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 27]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right.jsp; Line: 27]
      } // end bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 27]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      managestring.mystring rr = null; //[ /EnquireTestCase_Right.jsp; Line: 28]
      rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right.jsp; Line: 28]
      if (rr == null) { // begin 'rr' instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 28]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right.jsp; Line: 28]
          rr = (managestring.mystring)pageContext.getAttribute("rr"); //[ /EnquireTestCase_Right.jsp; Line: 28]
          if (rr == null) { // begin 'rr' synchronized instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 28]
            rr = new managestring.mystring(); //[ /EnquireTestCase_Right.jsp; Line: 28]
            pageContext.setAttribute("rr", rr); //[ /EnquireTestCase_Right.jsp; Line: 28]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 28]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right.jsp; Line: 28]
      } // end bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 28]
      _writeText(response, out, _wl_block3, _wl_block3Bytes);
      compages.compagesData cc = null; //[ /EnquireTestCase_Right.jsp; Line: 29]
      cc = (compages.compagesData)pageContext.getAttribute("cc"); //[ /EnquireTestCase_Right.jsp; Line: 29]
      if (cc == null) { // begin 'cc' instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 29]
        { // Don't need to synchronize on page scope //[ /EnquireTestCase_Right.jsp; Line: 29]
          cc = (compages.compagesData)pageContext.getAttribute("cc"); //[ /EnquireTestCase_Right.jsp; Line: 29]
          if (cc == null) { // begin 'cc' synchronized instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 29]
            cc = new compages.compagesData(); //[ /EnquireTestCase_Right.jsp; Line: 29]
            pageContext.setAttribute("cc", cc); //[ /EnquireTestCase_Right.jsp; Line: 29]
          } // end synchronized bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 29]
        } // end synchronized bean scope block... //[ /EnquireTestCase_Right.jsp; Line: 29]
      } // end bean instantiation block... //[ /EnquireTestCase_Right.jsp; Line: 29]
      _writeText(response, out, _wl_block4, _wl_block4Bytes);
      //[ /EnquireTestCase_Right.jsp; Line: 31]
      Enumeration ss=session.getAttributeNames(); //[ /EnquireTestCase_Right.jsp; Line: 32]
      //[ /EnquireTestCase_Right.jsp; Line: 33]
      if(!ss.hasMoreElements()){ //[ /EnquireTestCase_Right.jsp; Line: 34]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /EnquireTestCase_Right.jsp; Line: 39]
      } //[ /EnquireTestCase_Right.jsp; Line: 40]
      else{ //[ /EnquireTestCase_Right.jsp; Line: 41]
        String sProjectID=(String)session.getAttribute("ProjectID"); //[ /EnquireTestCase_Right.jsp; Line: 42]
        String sUseCaseID=(String)session.getAttribute("UseCaseID"); //[ /EnquireTestCase_Right.jsp; Line: 43]
        String sFunctionPointID=(String)session.getAttribute("FunctionPointID"); //[ /EnquireTestCase_Right.jsp; Line: 44]
        //[ /EnquireTestCase_Right.jsp; Line: 45]
        if(sProjectID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 46]
          session.setAttribute("Error","2.1"); //[ /EnquireTestCase_Right.jsp; Line: 47]
          _writeText(response, out, _wl_block6, _wl_block6Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 52]
        } //[ /EnquireTestCase_Right.jsp; Line: 53]
        else if(sUseCaseID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 54]
          session.setAttribute("Error","3.1"); //[ /EnquireTestCase_Right.jsp; Line: 55]
          _writeText(response, out, _wl_block7, _wl_block7Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 60]
        } //[ /EnquireTestCase_Right.jsp; Line: 61]
        else if(sFunctionPointID.equals("null")){ //[ /EnquireTestCase_Right.jsp; Line: 62]
          session.setAttribute("Error","4.1"); //[ /EnquireTestCase_Right.jsp; Line: 63]
          _writeText(response, out, _wl_block8, _wl_block8Bytes);
          //[ /EnquireTestCase_Right.jsp; Line: 68]
        } //[ /EnquireTestCase_Right.jsp; Line: 69]
        else{ //[ /EnquireTestCase_Right.jsp; Line: 70]
          //[ /EnquireTestCase_Right.jsp; Line: 71]
          long projectID=Integer.parseInt(sProjectID); //[ /EnquireTestCase_Right.jsp; Line: 72]
          long useCaseID=Integer.parseInt(sUseCaseID); //[ /EnquireTestCase_Right.jsp; Line: 73]
          long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right.jsp; Line: 74]
          //[ /EnquireTestCase_Right.jsp; Line: 75]
          DataSource ds=null; //[ /EnquireTestCase_Right.jsp; Line: 76]
          ds=tt.getDataSource(); //[ /EnquireTestCase_Right.jsp; Line: 77]
          Connection myConn=null; //[ /EnquireTestCase_Right.jsp; Line: 78]
          Statement myStatement1=null; //[ /EnquireTestCase_Right.jsp; Line: 79]
          Statement myStatement2=null; //[ /EnquireTestCase_Right.jsp; Line: 80]
          Statement myStatement3=null; //[ /EnquireTestCase_Right.jsp; Line: 81]
          Statement myStatement4=null; //[ /EnquireTestCase_Right.jsp; Line: 82]
          Statement myStatement5=null; //[ /EnquireTestCase_Right.jsp; Line: 83]
          Statement myStatement6=null; //[ /EnquireTestCase_Right.jsp; Line: 84]
          Statement myStatement7=null; //[ /EnquireTestCase_Right.jsp; Line: 85]
          Statement myStatement8=null; //[ /EnquireTestCase_Right.jsp; Line: 86]
          Statement myStatement9=null; //[ /EnquireTestCase_Right.jsp; Line: 87]
          Statement myStatement10=null; //[ /EnquireTestCase_Right.jsp; Line: 88]
          Statement myStatement11=null; //[ /EnquireTestCase_Right.jsp; Line: 89]
          Statement myStatement12=null; //[ /EnquireTestCase_Right.jsp; Line: 90]
          Statement myStatement14=null; //[ /EnquireTestCase_Right.jsp; Line: 91]
          //[ /EnquireTestCase_Right.jsp; Line: 92]
          myConn=ds.getConnection(); //[ /EnquireTestCase_Right.jsp; Line: 93]
          myStatement1=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 94]
          myStatement2=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 95]
          myStatement3=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 96]
          myStatement4=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 97]
          myStatement5=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 98]
          myStatement6=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 99]
          myStatement7=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 100]
          myStatement8=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 101]
          myStatement9=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 102]
          myStatement10=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 103]
          myStatement11=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 104]
          myStatement12=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 105]
          myStatement14=myConn.createStatement(); //[ /EnquireTestCase_Right.jsp; Line: 106]
          //[ /EnquireTestCase_Right.jsp; Line: 107]
          String sql=new String(); //[ /EnquireTestCase_Right.jsp; Line: 108]
          String condition1=new String(); //[ /EnquireTestCase_Right.jsp; Line: 109]
          //[ /EnquireTestCase_Right.jsp; Line: 110]
          ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7; //[ /EnquireTestCase_Right.jsp; Line: 111]
          rs1=null; //[ /EnquireTestCase_Right.jsp; Line: 112]
          rs2=null; //[ /EnquireTestCase_Right.jsp; Line: 113]
          rs3=null; //[ /EnquireTestCase_Right.jsp; Line: 114]
          rs4=null; //[ /EnquireTestCase_Right.jsp; Line: 115]
          rs5=null; //[ /EnquireTestCase_Right.jsp; Line: 116]
          rs6=null; //[ /EnquireTestCase_Right.jsp; Line: 117]
          rs7=null; //[ /EnquireTestCase_Right.jsp; Line: 118]
          int l=0; //[ /EnquireTestCase_Right.jsp; Line: 119]
          int resultNumber=0; //[ /EnquireTestCase_Right.jsp; Line: 120]
          int abc1=0; //[ /EnquireTestCase_Right.jsp; Line: 121]
          int abc2=0; //[ /EnquireTestCase_Right.jsp; Line: 122]
          String[] rArray; //[ /EnquireTestCase_Right.jsp; Line: 123]
          String[] temp; //[ /EnquireTestCase_Right.jsp; Line: 124]
          String rTemp=new String(); //[ /EnquireTestCase_Right.jsp; Line: 125]
          //[ /EnquireTestCase_Right.jsp; Line: 126]
          try{ //[ /EnquireTestCase_Right.jsp; Line: 127]
            sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 128]
            rs7=myStatement12.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 129]
            rs7.next(); //[ /EnquireTestCase_Right.jsp; Line: 130]
            resultNumber=rs7.getInt("count(*)"); //[ /EnquireTestCase_Right.jsp; Line: 131]
            rArray=new String[resultNumber]; //[ /EnquireTestCase_Right.jsp; Line: 132]
            //[ /EnquireTestCase_Right.jsp; Line: 133]
            sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 134]
            rs7=myStatement9.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 135]
            if(rs7.next()){ //[ /EnquireTestCase_Right.jsp; Line: 136]
              do{ //[ /EnquireTestCase_Right.jsp; Line: 137]
                rTemp=rs7.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 138]
                rTemp=rr.replace(rTemp); //[ /EnquireTestCase_Right.jsp; Line: 139]
                rTemp=rr.replaceBlank(rTemp); //[ /EnquireTestCase_Right.jsp; Line: 140]
                rArray[l]=rTemp; //[ /EnquireTestCase_Right.jsp; Line: 141]
                l++; //[ /EnquireTestCase_Right.jsp; Line: 142]
              }while(rs7.next()); //[ /EnquireTestCase_Right.jsp; Line: 143]
            } //[ /EnquireTestCase_Right.jsp; Line: 144]
            rs7.close(); //[ /EnquireTestCase_Right.jsp; Line: 145]
            _writeText(response, out, _wl_block9, _wl_block9Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 166]
            for(int t=0;t<resultNumber;t++){ //[ /EnquireTestCase_Right.jsp; Line: 167]
              //[ /EnquireTestCase_Right.jsp; Line: 168]
              _writeText(response, out, _wl_block10, _wl_block10Bytes);
              out.print(String.valueOf(t ));  //[ /EnquireTestCase_Right.jsp; Line: 170]
              _writeText(response, out, _wl_block11, _wl_block11Bytes);
              out.print(String.valueOf(rArray[t] ));  //[ /EnquireTestCase_Right.jsp; Line: 170]
              _writeText(response, out, _wl_block12, _wl_block12Bytes);
              out.print(String.valueOf(300+t*150 ));  //[ /EnquireTestCase_Right.jsp; Line: 170]
              _writeText(response, out, _wl_block13, _wl_block13Bytes);
              out.print(String.valueOf(400+t*140 ));  //[ /EnquireTestCase_Right.jsp; Line: 170]
              _writeText(response, out, _wl_block14, _wl_block14Bytes);
              //[ /EnquireTestCase_Right.jsp; Line: 171]
            } //[ /EnquireTestCase_Right.jsp; Line: 172]
            _writeText(response, out, _wl_block15, _wl_block15Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 254]
            int noData=0; //[ /EnquireTestCase_Right.jsp; Line: 255]
            int x=0; //[ /EnquireTestCase_Right.jsp; Line: 256]
            //[ /EnquireTestCase_Right.jsp; Line: 257]
            String checkBoxName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 258]
            String hideName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 259]
            //[ /EnquireTestCase_Right.jsp; Line: 260]
            long testCaseID=0; //[ /EnquireTestCase_Right.jsp; Line: 261]
            int number=0; //[ /EnquireTestCase_Right.jsp; Line: 262]
            //[ /EnquireTestCase_Right.jsp; Line: 263]
            String functionPointName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 264]
            String useCaseName=new String(); //[ /EnquireTestCase_Right.jsp; Line: 265]
            String cDis = new String(); //[ /EnquireTestCase_Right.jsp; Line: 266]
            String rDis = new String(); //[ /EnquireTestCase_Right.jsp; Line: 267]
            int first=1; //[ /EnquireTestCase_Right.jsp; Line: 268]
            int first1=1; //[ /EnquireTestCase_Right.jsp; Line: 269]
            int nn=0; //[ /EnquireTestCase_Right.jsp; Line: 270]
            //[ /EnquireTestCase_Right.jsp; Line: 271]
            sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right.jsp; Line: 272]
            rs1=myStatement1.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 273]
            //[ /EnquireTestCase_Right.jsp; Line: 274]
            if(rs1.next()) //[ /EnquireTestCase_Right.jsp; Line: 275]
            { //[ /EnquireTestCase_Right.jsp; Line: 276]
              noData=1; //[ /EnquireTestCase_Right.jsp; Line: 277]
              do //[ /EnquireTestCase_Right.jsp; Line: 278]
              { //[ /EnquireTestCase_Right.jsp; Line: 279]
                number++; //[ /EnquireTestCase_Right.jsp; Line: 280]
                cDis=rs1.getString("condition"); //[ /EnquireTestCase_Right.jsp; Line: 281]
                rDis=rs1.getString("result"); //[ /EnquireTestCase_Right.jsp; Line: 282]
                first=1; //[ /EnquireTestCase_Right.jsp; Line: 283]
                first1=1; //[ /EnquireTestCase_Right.jsp; Line: 284]
                //[ /EnquireTestCase_Right.jsp; Line: 285]
                temp=rr.getID(cDis); //[ /EnquireTestCase_Right.jsp; Line: 286]
                sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right.jsp; Line: 287]
                for(int i=0;i<temp.length;i++){ //[ /EnquireTestCase_Right.jsp; Line: 288]
                  if(first==1){ //[ /EnquireTestCase_Right.jsp; Line: 289]
                    sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 290]
                    first=0; //[ /EnquireTestCase_Right.jsp; Line: 291]
                  } //[ /EnquireTestCase_Right.jsp; Line: 292]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 293]
                    sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 294]
                  } //[ /EnquireTestCase_Right.jsp; Line: 295]
                } //[ /EnquireTestCase_Right.jsp; Line: 296]
                sql=sql+") order by inf_id"; //[ /EnquireTestCase_Right.jsp; Line: 297]
                rs3=myStatement2.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 298]
                first=1; //[ /EnquireTestCase_Right.jsp; Line: 299]
                //[ /EnquireTestCase_Right.jsp; Line: 300]
                while(rs3.next()){ //[ /EnquireTestCase_Right.jsp; Line: 301]
                  condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 302]
                  condition1=rr.replace(condition1); //[ /EnquireTestCase_Right.jsp; Line: 303]
                  if(first==1){ //[ /EnquireTestCase_Right.jsp; Line: 304]
                    cDis=condition1; //[ /EnquireTestCase_Right.jsp; Line: 305]
                    first=0; //[ /EnquireTestCase_Right.jsp; Line: 306]
                  } //[ /EnquireTestCase_Right.jsp; Line: 307]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 308]
                    cDis=cDis+"<br>"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 309]
                  } //[ /EnquireTestCase_Right.jsp; Line: 310]
                } //[ /EnquireTestCase_Right.jsp; Line: 311]
                //[ /EnquireTestCase_Right.jsp; Line: 312]
                temp=rr.getID(rDis); //[ /EnquireTestCase_Right.jsp; Line: 313]
                sql="select inf_dis from tctc_information where inf_id in ( "; //[ /EnquireTestCase_Right.jsp; Line: 314]
                for(int i=0;i<temp.length;i++){ //[ /EnquireTestCase_Right.jsp; Line: 315]
                  if(first1==1){ //[ /EnquireTestCase_Right.jsp; Line: 316]
                    sql=sql+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 317]
                    first1=0; //[ /EnquireTestCase_Right.jsp; Line: 318]
                  } //[ /EnquireTestCase_Right.jsp; Line: 319]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 320]
                    sql=sql+","+Integer.parseInt(temp[i]); //[ /EnquireTestCase_Right.jsp; Line: 321]
                  } //[ /EnquireTestCase_Right.jsp; Line: 322]
                } //[ /EnquireTestCase_Right.jsp; Line: 323]
                sql=sql+")"; //[ /EnquireTestCase_Right.jsp; Line: 324]
                //[ /EnquireTestCase_Right.jsp; Line: 325]
                rs3=myStatement3.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 326]
                first1=1; //[ /EnquireTestCase_Right.jsp; Line: 327]
                //[ /EnquireTestCase_Right.jsp; Line: 328]
                while(rs3.next()){ //[ /EnquireTestCase_Right.jsp; Line: 329]
                  condition1=rs3.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 330]
                  condition1=rr.replace(condition1); //[ /EnquireTestCase_Right.jsp; Line: 331]
                  if(first1==1){ //[ /EnquireTestCase_Right.jsp; Line: 332]
                    rDis=condition1; //[ /EnquireTestCase_Right.jsp; Line: 333]
                    first1=0; //[ /EnquireTestCase_Right.jsp; Line: 334]
                  } //[ /EnquireTestCase_Right.jsp; Line: 335]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 336]
                    rDis=rDis+"<br>"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 337]
                  } //[ /EnquireTestCase_Right.jsp; Line: 338]
                } //[ /EnquireTestCase_Right.jsp; Line: 339]
                //[ /EnquireTestCase_Right.jsp; Line: 340]
                rs3.close(); //[ /EnquireTestCase_Right.jsp; Line: 341]
                //[ /EnquireTestCase_Right.jsp; Line: 342]
                testCaseID=rs1.getLong("test_case_id"); //[ /EnquireTestCase_Right.jsp; Line: 343]
                checkBoxName="C"+number; //[ /EnquireTestCase_Right.jsp; Line: 344]
                hideName="H"+number; //[ /EnquireTestCase_Right.jsp; Line: 345]
                //[ /EnquireTestCase_Right.jsp; Line: 346]
                _writeText(response, out, _wl_block16, _wl_block16Bytes);
                out.print(String.valueOf(checkBoxName ));  //[ /EnquireTestCase_Right.jsp; Line: 349]
                _writeText(response, out, _wl_block17, _wl_block17Bytes);
                out.print(String.valueOf(cDis ));  //[ /EnquireTestCase_Right.jsp; Line: 350]
                _writeText(response, out, _wl_block18, _wl_block18Bytes);
                out.print(String.valueOf(rDis ));  //[ /EnquireTestCase_Right.jsp; Line: 351]
                _writeText(response, out, _wl_block19, _wl_block19Bytes);
                out.print(String.valueOf(hideName ));  //[ /EnquireTestCase_Right.jsp; Line: 351]
                _writeText(response, out, _wl_block20, _wl_block20Bytes);
                out.print(String.valueOf(testCaseID ));  //[ /EnquireTestCase_Right.jsp; Line: 351]
                _writeText(response, out, _wl_block21, _wl_block21Bytes);
                //[ /EnquireTestCase_Right.jsp; Line: 353]
              }while(rs1.next()); //[ /EnquireTestCase_Right.jsp; Line: 354]
              session.setAttribute("CR_Number", String.valueOf(number)); //[ /EnquireTestCase_Right.jsp; Line: 355]
            } //[ /EnquireTestCase_Right.jsp; Line: 356]
            _writeText(response, out, _wl_block22, _wl_block22Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 360]
            if(noData==1){ //[ /EnquireTestCase_Right.jsp; Line: 361]
              _writeText(response, out, _wl_block23, _wl_block23Bytes);
              //[ /EnquireTestCase_Right.jsp; Line: 371]
              noData=0; //[ /EnquireTestCase_Right.jsp; Line: 372]
            } //[ /EnquireTestCase_Right.jsp; Line: 373]
            _writeText(response, out, _wl_block24, _wl_block24Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 388]
            //      long functionPointID=Integer.parseInt(sFunctionPointID); //[ /EnquireTestCase_Right.jsp; Line: 389]
            sql="select count(*) from tctc_information where inf_type='c' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 390]
            rs1=myStatement4.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 391]
            int y=0; //[ /EnquireTestCase_Right.jsp; Line: 392]
            if(rs1.next()){ //[ /EnquireTestCase_Right.jsp; Line: 393]
              //        y=rs1.getInt("Expr1000"); //[ /EnquireTestCase_Right.jsp; Line: 394]
              y=rs1.getInt("count(*)"); //[ /EnquireTestCase_Right.jsp; Line: 395]
            } //[ /EnquireTestCase_Right.jsp; Line: 396]
            else{ //[ /EnquireTestCase_Right.jsp; Line: 397]
              y=0; //[ /EnquireTestCase_Right.jsp; Line: 398]
            } //[ /EnquireTestCase_Right.jsp; Line: 399]
            //[ /EnquireTestCase_Right.jsp; Line: 400]
            sql="select count(*) from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 401]
            rs2=myStatement5.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 402]
            //      int x=0; //[ /EnquireTestCase_Right.jsp; Line: 403]
            if(rs2.next()){ //[ /EnquireTestCase_Right.jsp; Line: 404]
              x=rs2.getInt("count(*)"); //[ /EnquireTestCase_Right.jsp; Line: 405]
            } //[ /EnquireTestCase_Right.jsp; Line: 406]
            else{ //[ /EnquireTestCase_Right.jsp; Line: 407]
              x=0; //[ /EnquireTestCase_Right.jsp; Line: 408]
            } //[ /EnquireTestCase_Right.jsp; Line: 409]
            //[ /EnquireTestCase_Right.jsp; Line: 410]
            String CheckName = new String(); //[ /EnquireTestCase_Right.jsp; Line: 411]
            String content = new String(); //[ /EnquireTestCase_Right.jsp; Line: 412]
            long id=0; //[ /EnquireTestCase_Right.jsp; Line: 413]
            rs1=null; //[ /EnquireTestCase_Right.jsp; Line: 414]
            rs2=null; //[ /EnquireTestCase_Right.jsp; Line: 415]
            int first2=1; //[ /EnquireTestCase_Right.jsp; Line: 416]
            //      String[] temp; //[ /EnquireTestCase_Right.jsp; Line: 417]
            //      String condition1=new String(); //[ /EnquireTestCase_Right.jsp; Line: 418]
            String information=new String(); //[ /EnquireTestCase_Right.jsp; Line: 419]
            String condition2=new String(); //[ /EnquireTestCase_Right.jsp; Line: 420]
            String result2=new String(); //[ /EnquireTestCase_Right.jsp; Line: 421]
            String[] con; //[ /EnquireTestCase_Right.jsp; Line: 422]
            String[] rel; //[ /EnquireTestCase_Right.jsp; Line: 423]
            //[ /EnquireTestCase_Right.jsp; Line: 424]
            l=0; //[ /EnquireTestCase_Right.jsp; Line: 425]
            int lll=0; //[ /EnquireTestCase_Right.jsp; Line: 426]
            int cPosition=0; //[ /EnquireTestCase_Right.jsp; Line: 427]
            int rPosition=0; //[ /EnquireTestCase_Right.jsp; Line: 428]
            int have1=1; //[ /EnquireTestCase_Right.jsp; Line: 429]
            int have2=1; //[ /EnquireTestCase_Right.jsp; Line: 430]
            nn=0; //[ /EnquireTestCase_Right.jsp; Line: 431]
            long element_ID=0; //[ /EnquireTestCase_Right.jsp; Line: 432]
            String[] elementCondition=new String[y]; //[ /EnquireTestCase_Right.jsp; Line: 433]
            int[] infID=new int[y]; //[ /EnquireTestCase_Right.jsp; Line: 434]
            int[] conditionPos=new int[y]; //[ /EnquireTestCase_Right.jsp; Line: 435]
            int[] conditionEle=new int[y]; //[ /EnquireTestCase_Right.jsp; Line: 436]
            int len=0; //[ /EnquireTestCase_Right.jsp; Line: 437]
            int eleLen=0; //[ /EnquireTestCase_Right.jsp; Line: 438]
            ArrayList resultList=new ArrayList(); //[ /EnquireTestCase_Right.jsp; Line: 439]
            int aa=0; //[ /EnquireTestCase_Right.jsp; Line: 440]
            //[ /EnquireTestCase_Right.jsp; Line: 441]
            if(x>0 && y>0){ //[ /EnquireTestCase_Right.jsp; Line: 442]
              //[ /EnquireTestCase_Right.jsp; Line: 443]
              sql="select element_id from tctc_information where inf_type='c' and fun_p_id=" + functionPointID +" group by element_id"; //[ /EnquireTestCase_Right.jsp; Line: 444]
              rs1=myStatement6.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 445]
              while(rs1.next()){ //[ /EnquireTestCase_Right.jsp; Line: 446]
                element_ID=rs1.getLong("element_id") ; //[ /EnquireTestCase_Right.jsp; Line: 447]
                sql="select inf_id,inf_dis from tctc_information where inf_type='c' and fun_p_id=" + functionPointID +" and element_id="+element_ID+" order by inf_id"; //[ /EnquireTestCase_Right.jsp; Line: 448]
                rs6=myStatement14.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 449]
                //[ /EnquireTestCase_Right.jsp; Line: 450]
                if(rs6.next()){ //[ /EnquireTestCase_Right.jsp; Line: 451]
                  eleLen++; //[ /EnquireTestCase_Right.jsp; Line: 452]
                  //[ /EnquireTestCase_Right.jsp; Line: 453]
                  do{ //[ /EnquireTestCase_Right.jsp; Line: 454]
                    elementCondition[len]=rs6.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 455]
                    infID[len]=rs6.getInt("inf_id"); //[ /EnquireTestCase_Right.jsp; Line: 456]
                    conditionPos[len]=len; //[ /EnquireTestCase_Right.jsp; Line: 457]
                    conditionEle[len]=eleLen; //[ /EnquireTestCase_Right.jsp; Line: 458]
                    len++; //[ /EnquireTestCase_Right.jsp; Line: 459]
                  }while(rs6.next()); //[ /EnquireTestCase_Right.jsp; Line: 460]
                } //[ /EnquireTestCase_Right.jsp; Line: 461]
              } //[ /EnquireTestCase_Right.jsp; Line: 462]
              aa=eleLen; //[ /EnquireTestCase_Right.jsp; Line: 463]
              //[ /EnquireTestCase_Right.jsp; Line: 464]
              rs6.close(); //[ /EnquireTestCase_Right.jsp; Line: 465]
              resultList=cc.combine(conditionPos,conditionEle,aa); //[ /EnquireTestCase_Right.jsp; Line: 466]
              y=resultList.size(); //[ /EnquireTestCase_Right.jsp; Line: 467]
              //[ /EnquireTestCase_Right.jsp; Line: 468]
              session.setAttribute("R_Number",String.valueOf(x)); //[ /EnquireTestCase_Right.jsp; Line: 469]
              session.setAttribute("C_Number",String.valueOf(y)); //[ /EnquireTestCase_Right.jsp; Line: 470]
              //[ /EnquireTestCase_Right.jsp; Line: 471]
              String[] resultArray=new String[x]; //[ /EnquireTestCase_Right.jsp; Line: 472]
              String[] conditionArray=new String[y]; //[ /EnquireTestCase_Right.jsp; Line: 473]
              //[ /EnquireTestCase_Right.jsp; Line: 474]
              sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 475]
              rs2=myStatement7.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 476]
              rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 477]
              //[ /EnquireTestCase_Right.jsp; Line: 478]
              sql="select inf_dis,inf_id from tctc_information where inf_type='r' and fun_p_id=" + functionPointID; //[ /EnquireTestCase_Right.jsp; Line: 479]
              rs4=myStatement8.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 480]
              if(rs4.next()){ //[ /EnquireTestCase_Right.jsp; Line: 481]
                do{ //[ /EnquireTestCase_Right.jsp; Line: 482]
                  resultArray[l]=rs4.getString("inf_id"); //[ /EnquireTestCase_Right.jsp; Line: 483]
                  l++; //[ /EnquireTestCase_Right.jsp; Line: 484]
                }while(rs4.next()); //[ /EnquireTestCase_Right.jsp; Line: 485]
              } //[ /EnquireTestCase_Right.jsp; Line: 486]
              //[ /EnquireTestCase_Right.jsp; Line: 487]
              int llll=0; //[ /EnquireTestCase_Right.jsp; Line: 488]
              int test[]=new int[aa]; //[ /EnquireTestCase_Right.jsp; Line: 489]
              String cString=new String(); //[ /EnquireTestCase_Right.jsp; Line: 490]
              int first11=1; //[ /EnquireTestCase_Right.jsp; Line: 491]
              //[ /EnquireTestCase_Right.jsp; Line: 492]
              for(int aaaa=0;aaaa<y;aaaa++){ //[ /EnquireTestCase_Right.jsp; Line: 493]
                //[ /EnquireTestCase_Right.jsp; Line: 494]
                test=(int[])resultList.get(aaaa); //[ /EnquireTestCase_Right.jsp; Line: 495]
                llll=test.length; //[ /EnquireTestCase_Right.jsp; Line: 496]
                //[ /EnquireTestCase_Right.jsp; Line: 497]
                for(int aaa=0;aaa<llll;aaa++){ //[ /EnquireTestCase_Right.jsp; Line: 498]
                  if(first11==1){ //[ /EnquireTestCase_Right.jsp; Line: 499]
                    cString=String.valueOf(infID[test[aaa]]); //[ /EnquireTestCase_Right.jsp; Line: 500]
                    first11=0; //[ /EnquireTestCase_Right.jsp; Line: 501]
                  } //[ /EnquireTestCase_Right.jsp; Line: 502]
                  else{ //[ /EnquireTestCase_Right.jsp; Line: 503]
                    cString=cString+" "+ String.valueOf(infID[test[aaa]]); //[ /EnquireTestCase_Right.jsp; Line: 504]
                  } //[ /EnquireTestCase_Right.jsp; Line: 505]
                } //[ /EnquireTestCase_Right.jsp; Line: 506]
                cString.trim(); //[ /EnquireTestCase_Right.jsp; Line: 507]
                conditionArray[aaaa]=cString; //[ /EnquireTestCase_Right.jsp; Line: 508]
                first11=1; //[ /EnquireTestCase_Right.jsp; Line: 509]
              } //[ /EnquireTestCase_Right.jsp; Line: 510]
              lll=0; //[ /EnquireTestCase_Right.jsp; Line: 511]
              //[ /EnquireTestCase_Right.jsp; Line: 512]
              sql="select count(*) from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right.jsp; Line: 513]
              rs4=myStatement10.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 514]
              if(rs4.next()){ //[ /EnquireTestCase_Right.jsp; Line: 515]
                nn=rs4.getInt("count(*)"); //[ /EnquireTestCase_Right.jsp; Line: 516]
              } //[ /EnquireTestCase_Right.jsp; Line: 517]
              //[ /EnquireTestCase_Right.jsp; Line: 518]
              if(nn>0){ //[ /EnquireTestCase_Right.jsp; Line: 519]
                con=new String[nn]; //[ /EnquireTestCase_Right.jsp; Line: 520]
                rel=new String[nn]; //[ /EnquireTestCase_Right.jsp; Line: 521]
                //[ /EnquireTestCase_Right.jsp; Line: 522]
                sql="select test_case_id,condition,result from tctc_test_case where fun_p_id=" +functionPointID+" and pro_id=" +projectID+" and uc_id=" + useCaseID;; //[ /EnquireTestCase_Right.jsp; Line: 523]
                rs5=myStatement11.executeQuery(sql); //[ /EnquireTestCase_Right.jsp; Line: 524]
                //[ /EnquireTestCase_Right.jsp; Line: 525]
                if(rs5.next()){ //[ /EnquireTestCase_Right.jsp; Line: 526]
                  nn=0; //[ /EnquireTestCase_Right.jsp; Line: 527]
                  do{ //[ /EnquireTestCase_Right.jsp; Line: 528]
                    cDis=rs5.getString("condition"); //[ /EnquireTestCase_Right.jsp; Line: 529]
                    rDis=rs5.getString("result"); //[ /EnquireTestCase_Right.jsp; Line: 530]
                    con[nn]=cDis; //[ /EnquireTestCase_Right.jsp; Line: 531]
                    rel[nn]=rDis; //[ /EnquireTestCase_Right.jsp; Line: 532]
                    nn++; //[ /EnquireTestCase_Right.jsp; Line: 533]
                  }while(rs5.next()); //[ /EnquireTestCase_Right.jsp; Line: 534]
                } //[ /EnquireTestCase_Right.jsp; Line: 535]
                //[ /EnquireTestCase_Right.jsp; Line: 536]
                if(x>0 && y>0){ //[ /EnquireTestCase_Right.jsp; Line: 537]
                  noData=1; //[ /EnquireTestCase_Right.jsp; Line: 538]
                  //[ /EnquireTestCase_Right.jsp; Line: 539]
                  for(int i=0;i<(y+1);i++){ //[ /EnquireTestCase_Right.jsp; Line: 540]
                    _writeText(response, out, _wl_block25, _wl_block25Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 543]
                    abc1=0; //[ /EnquireTestCase_Right.jsp; Line: 544]
                    for(int j=0;j<(x+1);j++){ //[ /EnquireTestCase_Right.jsp; Line: 545]
                      CheckName = null; //[ /EnquireTestCase_Right.jsp; Line: 546]
                      //[ /EnquireTestCase_Right.jsp; Line: 547]
                      if(j==1 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 548]
                        _writeText(response, out, _wl_block26, _wl_block26Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 551]
                      } //[ /EnquireTestCase_Right.jsp; Line: 552]
                      if(j==1 && i!=0){ //[ /EnquireTestCase_Right.jsp; Line: 553]
                        _writeText(response, out, _wl_block27, _wl_block27Bytes);
                        out.print(String.valueOf(String.valueOf(i) ));  //[ /EnquireTestCase_Right.jsp; Line: 555]
                        _writeText(response, out, _wl_block28, _wl_block28Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 556]
                      } //[ /EnquireTestCase_Right.jsp; Line: 557]
                      if(i==0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 558]
                        _writeText(response, out, _wl_block29, _wl_block29Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 561]
                      } //[ /EnquireTestCase_Right.jsp; Line: 562]
                      if(j>0 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 563]
                        CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right.jsp; Line: 564]
                        content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 565]
                        id=rs2.getLong("inf_id"); //[ /EnquireTestCase_Right.jsp; Line: 566]
                        content=rr.replace(content); //[ /EnquireTestCase_Right.jsp; Line: 567]
                        _writeText(response, out, _wl_block30, _wl_block30Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 569]
                        _writeText(response, out, _wl_block31, _wl_block31Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 569]
                        _writeText(response, out, _wl_block32, _wl_block32Bytes);
                        out.print(String.valueOf(id ));  //[ /EnquireTestCase_Right.jsp; Line: 569]
                        _writeText(response, out, _wl_block33, _wl_block33Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 570]
                        rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 571]
                      } //[ /EnquireTestCase_Right.jsp; Line: 572]
                      else if(i>0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 573]
                        CheckName = "C" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 574]
                        content=conditionArray[i-1]; //[ /EnquireTestCase_Right.jsp; Line: 575]
                        first2=1; //[ /EnquireTestCase_Right.jsp; Line: 576]
                        //                  temp=rr.getID(content); //[ /EnquireTestCase_Right.jsp; Line: 577]
                        content="\""+content+"\""; //[ /EnquireTestCase_Right.jsp; Line: 578]
                        test=(int[])resultList.get(i-1); //[ /EnquireTestCase_Right.jsp; Line: 579]
                        llll=test.length; //[ /EnquireTestCase_Right.jsp; Line: 580]
                        //[ /EnquireTestCase_Right.jsp; Line: 581]
                        for(int aaa=0;aaa<llll;aaa++){ //[ /EnquireTestCase_Right.jsp; Line: 582]
                          condition1=String.valueOf(elementCondition[test[aaa]]); //[ /EnquireTestCase_Right.jsp; Line: 583]
                          if(first2==1){ //[ /EnquireTestCase_Right.jsp; Line: 584]
                            information=condition1; //[ /EnquireTestCase_Right.jsp; Line: 585]
                            first2=0; //[ /EnquireTestCase_Right.jsp; Line: 586]
                          } //[ /EnquireTestCase_Right.jsp; Line: 587]
                          else{ //[ /EnquireTestCase_Right.jsp; Line: 588]
                            information=information+"\n"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 589]
                          } //[ /EnquireTestCase_Right.jsp; Line: 590]
                        } //[ /EnquireTestCase_Right.jsp; Line: 591]
                        //[ /EnquireTestCase_Right.jsp; Line: 592]
                        information=rr.replace(information); //[ /EnquireTestCase_Right.jsp; Line: 593]
                        _writeText(response, out, _wl_block34, _wl_block34Bytes);
                        out.print(String.valueOf(information ));  //[ /EnquireTestCase_Right.jsp; Line: 595]
                        _writeText(response, out, _wl_block35, _wl_block35Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 595]
                        _writeText(response, out, _wl_block36, _wl_block36Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 595]
                        _writeText(response, out, _wl_block37, _wl_block37Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 596]
                        lll++; //[ /EnquireTestCase_Right.jsp; Line: 597]
                      } //[ /EnquireTestCase_Right.jsp; Line: 598]
                      else if(j>0 && i>0){ //[ /EnquireTestCase_Right.jsp; Line: 599]
                        CheckName = String.valueOf(j) + "-" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 600]
                        //[ /EnquireTestCase_Right.jsp; Line: 601]
                        result2=resultArray[j-1]; //[ /EnquireTestCase_Right.jsp; Line: 602]
                        condition2=conditionArray[i-1]; //[ /EnquireTestCase_Right.jsp; Line: 603]
                        //[ /EnquireTestCase_Right.jsp; Line: 604]
                        cPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 605]
                        rPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 606]
                        have1=0; //[ /EnquireTestCase_Right.jsp; Line: 607]
                        have2=0; //[ /EnquireTestCase_Right.jsp; Line: 608]
                        //[ /EnquireTestCase_Right.jsp; Line: 609]
                        for(int ll=0;ll<con.length;ll++){ //[ /EnquireTestCase_Right.jsp; Line: 610]
                          cPosition=con[ll].indexOf(condition2); //[ /EnquireTestCase_Right.jsp; Line: 611]
                          if(cPosition!=-1){ //[ /EnquireTestCase_Right.jsp; Line: 612]
                            rPosition=rel[ll].indexOf(result2); //[ /EnquireTestCase_Right.jsp; Line: 613]
                            if(rPosition!=-1){ //[ /EnquireTestCase_Right.jsp; Line: 614]
                              have1=1; //[ /EnquireTestCase_Right.jsp; Line: 615]
                              cPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 616]
                              rPosition=-1; //[ /EnquireTestCase_Right.jsp; Line: 617]
                            } //[ /EnquireTestCase_Right.jsp; Line: 618]
                          } //[ /EnquireTestCase_Right.jsp; Line: 619]
                        } //[ /EnquireTestCase_Right.jsp; Line: 620]
                        //[ /EnquireTestCase_Right.jsp; Line: 621]
                        if(have1==1){ //[ /EnquireTestCase_Right.jsp; Line: 622]
                          _writeText(response, out, _wl_block38, _wl_block38Bytes);
                          out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 624]
                          _writeText(response, out, _wl_block39, _wl_block39Bytes);
                          out.print(String.valueOf(abc1 ));  //[ /EnquireTestCase_Right.jsp; Line: 624]
                          _writeText(response, out, _wl_block40, _wl_block40Bytes);
                          //[ /EnquireTestCase_Right.jsp; Line: 625]
                        } //[ /EnquireTestCase_Right.jsp; Line: 626]
                        else{ //[ /EnquireTestCase_Right.jsp; Line: 627]
                          _writeText(response, out, _wl_block41, _wl_block41Bytes);
                          out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 629]
                          _writeText(response, out, _wl_block42, _wl_block42Bytes);
                          out.print(String.valueOf(abc1 ));  //[ /EnquireTestCase_Right.jsp; Line: 629]
                          _writeText(response, out, _wl_block43, _wl_block43Bytes);
                          //[ /EnquireTestCase_Right.jsp; Line: 630]
                        } //[ /EnquireTestCase_Right.jsp; Line: 631]
                        abc1++; //[ /EnquireTestCase_Right.jsp; Line: 632]
                      } //[ /EnquireTestCase_Right.jsp; Line: 633]
                    } //[ /EnquireTestCase_Right.jsp; Line: 634]
                    _writeText(response, out, _wl_block44, _wl_block44Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 637]
                  } //[ /EnquireTestCase_Right.jsp; Line: 638]
                } //[ /EnquireTestCase_Right.jsp; Line: 639]
                rs1.close(); //[ /EnquireTestCase_Right.jsp; Line: 640]
                rs2.close(); //[ /EnquireTestCase_Right.jsp; Line: 641]
                rs3.close(); //[ /EnquireTestCase_Right.jsp; Line: 642]
                rs4.close(); //[ /EnquireTestCase_Right.jsp; Line: 643]
                rs5.close(); //[ /EnquireTestCase_Right.jsp; Line: 644]
              } //[ /EnquireTestCase_Right.jsp; Line: 645]
              else{ //[ /EnquireTestCase_Right.jsp; Line: 646]
                //[ /EnquireTestCase_Right.jsp; Line: 647]
                if(x>0 && y>0) //[ /EnquireTestCase_Right.jsp; Line: 648]
                { //[ /EnquireTestCase_Right.jsp; Line: 649]
                  noData=1; //[ /EnquireTestCase_Right.jsp; Line: 650]
                  for(int i=0;i<(y+1);i++) //[ /EnquireTestCase_Right.jsp; Line: 651]
                  { //[ /EnquireTestCase_Right.jsp; Line: 652]
                    _writeText(response, out, _wl_block45, _wl_block45Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 655]
                    abc2=0; //[ /EnquireTestCase_Right.jsp; Line: 656]
                    for(int j=0;j<(x+1);j++) //[ /EnquireTestCase_Right.jsp; Line: 657]
                    { //[ /EnquireTestCase_Right.jsp; Line: 658]
                      CheckName = null; //[ /EnquireTestCase_Right.jsp; Line: 659]
                      //[ /EnquireTestCase_Right.jsp; Line: 660]
                      if(j==1 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 661]
                        _writeText(response, out, _wl_block46, _wl_block46Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 664]
                      } //[ /EnquireTestCase_Right.jsp; Line: 665]
                      //[ /EnquireTestCase_Right.jsp; Line: 666]
                      if(j==1 && i!=0){ //[ /EnquireTestCase_Right.jsp; Line: 667]
                        _writeText(response, out, _wl_block47, _wl_block47Bytes);
                        out.print(String.valueOf(String.valueOf(i) ));  //[ /EnquireTestCase_Right.jsp; Line: 669]
                        _writeText(response, out, _wl_block48, _wl_block48Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 670]
                      } //[ /EnquireTestCase_Right.jsp; Line: 671]
                      //[ /EnquireTestCase_Right.jsp; Line: 672]
                      if(i==0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 673]
                        _writeText(response, out, _wl_block49, _wl_block49Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 676]
                      } //[ /EnquireTestCase_Right.jsp; Line: 677]
                      if(j>0 && i==0){ //[ /EnquireTestCase_Right.jsp; Line: 678]
                        CheckName = "R" + String.valueOf(j); //[ /EnquireTestCase_Right.jsp; Line: 679]
                        content = rs2.getString("inf_dis"); //[ /EnquireTestCase_Right.jsp; Line: 680]
                        id=rs2.getLong("inf_id"); //[ /EnquireTestCase_Right.jsp; Line: 681]
                        content=rr.replace(content); //[ /EnquireTestCase_Right.jsp; Line: 682]
                        _writeText(response, out, _wl_block50, _wl_block50Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 684]
                        _writeText(response, out, _wl_block51, _wl_block51Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 684]
                        _writeText(response, out, _wl_block52, _wl_block52Bytes);
                        out.print(String.valueOf(id ));  //[ /EnquireTestCase_Right.jsp; Line: 684]
                        _writeText(response, out, _wl_block53, _wl_block53Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 685]
                        rs2.next(); //[ /EnquireTestCase_Right.jsp; Line: 686]
                      } //[ /EnquireTestCase_Right.jsp; Line: 687]
                      else if(i>0 && j==0){ //[ /EnquireTestCase_Right.jsp; Line: 688]
                        CheckName = "C" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 689]
                        content=conditionArray[i-1]; //[ /EnquireTestCase_Right.jsp; Line: 690]
                        //[ /EnquireTestCase_Right.jsp; Line: 691]
                        first2=1; //[ /EnquireTestCase_Right.jsp; Line: 692]
                        //                  temp=rr.getID(content); //[ /EnquireTestCase_Right.jsp; Line: 693]
                        content="\""+content+"\""; //[ /EnquireTestCase_Right.jsp; Line: 694]
                        test=(int[])resultList.get(i-1); //[ /EnquireTestCase_Right.jsp; Line: 695]
                        llll=test.length; //[ /EnquireTestCase_Right.jsp; Line: 696]
                        //[ /EnquireTestCase_Right.jsp; Line: 697]
                        for(int aaa=0;aaa<llll;aaa++){ //[ /EnquireTestCase_Right.jsp; Line: 698]
                          condition1=String.valueOf(elementCondition[test[aaa]]); //[ /EnquireTestCase_Right.jsp; Line: 699]
                          if(first2==1){ //[ /EnquireTestCase_Right.jsp; Line: 700]
                            information=condition1; //[ /EnquireTestCase_Right.jsp; Line: 701]
                            first2=0; //[ /EnquireTestCase_Right.jsp; Line: 702]
                          } //[ /EnquireTestCase_Right.jsp; Line: 703]
                          else{ //[ /EnquireTestCase_Right.jsp; Line: 704]
                            information=information+"\n"+condition1; //[ /EnquireTestCase_Right.jsp; Line: 705]
                          } //[ /EnquireTestCase_Right.jsp; Line: 706]
                        } //[ /EnquireTestCase_Right.jsp; Line: 707]
                        //[ /EnquireTestCase_Right.jsp; Line: 708]
                        information=rr.replace(information); //[ /EnquireTestCase_Right.jsp; Line: 709]
                        _writeText(response, out, _wl_block54, _wl_block54Bytes);
                        out.print(String.valueOf(information ));  //[ /EnquireTestCase_Right.jsp; Line: 711]
                        _writeText(response, out, _wl_block55, _wl_block55Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 711]
                        _writeText(response, out, _wl_block56, _wl_block56Bytes);
                        out.print(String.valueOf(content ));  //[ /EnquireTestCase_Right.jsp; Line: 711]
                        _writeText(response, out, _wl_block57, _wl_block57Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 712]
                        lll++; //[ /EnquireTestCase_Right.jsp; Line: 713]
                      } //[ /EnquireTestCase_Right.jsp; Line: 714]
                      else if(j>0 && i>0){ //[ /EnquireTestCase_Right.jsp; Line: 715]
                        CheckName = String.valueOf(j) + "-" + String.valueOf(i); //[ /EnquireTestCase_Right.jsp; Line: 716]
                        _writeText(response, out, _wl_block58, _wl_block58Bytes);
                        out.print(String.valueOf(CheckName ));  //[ /EnquireTestCase_Right.jsp; Line: 718]
                        _writeText(response, out, _wl_block59, _wl_block59Bytes);
                        out.print(String.valueOf(abc2 ));  //[ /EnquireTestCase_Right.jsp; Line: 718]
                        _writeText(response, out, _wl_block60, _wl_block60Bytes);
                        //[ /EnquireTestCase_Right.jsp; Line: 719]
                        abc2++; //[ /EnquireTestCase_Right.jsp; Line: 720]
                      } //[ /EnquireTestCase_Right.jsp; Line: 721]
                    } //[ /EnquireTestCase_Right.jsp; Line: 722]
                    _writeText(response, out, _wl_block61, _wl_block61Bytes);
                    //[ /EnquireTestCase_Right.jsp; Line: 725]
                  } //[ /EnquireTestCase_Right.jsp; Line: 726]
                } //[ /EnquireTestCase_Right.jsp; Line: 727]
                rs1.close(); //[ /EnquireTestCase_Right.jsp; Line: 728]
                rs2.close(); //[ /EnquireTestCase_Right.jsp; Line: 729]
                rs4.close(); //[ /EnquireTestCase_Right.jsp; Line: 730]
              } //[ /EnquireTestCase_Right.jsp; Line: 731]
            } //[ /EnquireTestCase_Right.jsp; Line: 732]
            _writeText(response, out, _wl_block62, _wl_block62Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 737]
            if(noData==1){ //[ /EnquireTestCase_Right.jsp; Line: 738]
              x=x+1; //[ /EnquireTestCase_Right.jsp; Line: 739]
              _writeText(response, out, _wl_block63, _wl_block63Bytes);
              out.print(String.valueOf(x*163+147 ));  //[ /EnquireTestCase_Right.jsp; Line: 742]
              _writeText(response, out, _wl_block64, _wl_block64Bytes);
              //[ /EnquireTestCase_Right.jsp; Line: 750]
            } //[ /EnquireTestCase_Right.jsp; Line: 751]
            _writeText(response, out, _wl_block65, _wl_block65Bytes);
            //[ /EnquireTestCase_Right.jsp; Line: 756]
            myConn.close(); //[ /EnquireTestCase_Right.jsp; Line: 757]
            myStatement1.close(); //[ /EnquireTestCase_Right.jsp; Line: 758]
            myStatement2.close(); //[ /EnquireTestCase_Right.jsp; Line: 759]
            myStatement3.close(); //[ /EnquireTestCase_Right.jsp; Line: 760]
            myStatement4.close(); //[ /EnquireTestCase_Right.jsp; Line: 761]
            myStatement5.close(); //[ /EnquireTestCase_Right.jsp; Line: 762]
            myStatement6.close(); //[ /EnquireTestCase_Right.jsp; Line: 763]
            myStatement7.close(); //[ /EnquireTestCase_Right.jsp; Line: 764]
            myStatement8.close(); //[ /EnquireTestCase_Right.jsp; Line: 765]
            myStatement9.close(); //[ /EnquireTestCase_Right.jsp; Line: 766]
            myStatement10.close(); //[ /EnquireTestCase_Right.jsp; Line: 767]
            myStatement11.close(); //[ /EnquireTestCase_Right.jsp; Line: 768]
            myStatement12.close(); //[ /EnquireTestCase_Right.jsp; Line: 769]
            //      myStatement13.close(); //[ /EnquireTestCase_Right.jsp; Line: 770]
            myStatement14.close(); //[ /EnquireTestCase_Right.jsp; Line: 771]
          } //[ /EnquireTestCase_Right.jsp; Line: 772]
          catch(SQLException ex){ //[ /EnquireTestCase_Right.jsp; Line: 773]
            System.err.println("aq.executeQuery: " + ex.getMessage()); //[ /EnquireTestCase_Right.jsp; Line: 774]
            System.err.println("aq.executeQuery: " + sql); //[ /EnquireTestCase_Right.jsp; Line: 775]
          } //[ /EnquireTestCase_Right.jsp; Line: 776]
        } //[ /EnquireTestCase_Right.jsp; Line: 777]
      } //[ /EnquireTestCase_Right.jsp; Line: 778]
      _writeText(response, out, _wl_block66, _wl_block66Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
