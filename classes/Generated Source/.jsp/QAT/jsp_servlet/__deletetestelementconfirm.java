/* compiled from JSP: /DeleteTestElementConfirm.jsp
*
* This code was automatically generated at 11:30:29 on 2005-8-8
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
import java.sql.*; //[ /DeleteTestElementConfirm.jsp; Line: 10]
import javax.sql.*; //[ /DeleteTestElementConfirm.jsp; Line: 10]
import java.util.Enumeration; //[ /DeleteTestElementConfirm.jsp; Line: 10]


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
* This code was automatically generated at 11:30:29 on 2005-8-8
* by weblogic.servlet.jsp.Jsp2Java -- do not edit.
*
* Copyright (c) 2005 by BEA Systems, Inc. All Rights Reserved.
*/
public final class __deletetestelementconfirm
extends
weblogic.servlet.jsp.JspBase
implements weblogic.servlet.jsp.StaleIndicator
{
  
  // StaleIndicator interface
  public boolean _isStale() {
    weblogic.servlet.jsp.StaleChecker sci =(weblogic.servlet.jsp.StaleChecker)(getServletConfig().getServletContext());
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestElementConfirm.jsp", 1123471792000L, "8.1.2.0", "Asia/Shanghai")) return true;
    return false;
  }
  
  public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
    java.io.File f = null;
    long lastModWhenBuilt = 0L;
    if (sci.isResourceStale("/DeleteTestElementConfirm.jsp", 1123471792000L, "8.1.2.0", "Asia/Shanghai")) return true;
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
  private final static String _wl_block0 = "\r\n<html>\r\n<head>\r\n<title>\r\nDeleteTestElementConfirm\r\n</title>\r\n</head>\r\n<body bgcolor=\"#ffffff\">\r\n\r\n";
  private final static byte[] _wl_block0Bytes = _getBytes(_wl_block0);
  private final static String _wl_block1 = "\r\n";
  private final static byte[] _wl_block1Bytes = _getBytes(_wl_block1);
  private final static String _wl_block2 = "\r\n\r\n";
  private final static byte[] _wl_block2Bytes = _getBytes(_wl_block2);
  private final static String _wl_block3 = "\r\n<script LANGUAGE=\"javascript\">\r\n  parent.location.href=\'login.htm\'\r\n</script>\r\n";
  private final static byte[] _wl_block3Bytes = _getBytes(_wl_block3);
  private final static String _wl_block4 = "\r\n\r\n";
  private final static byte[] _wl_block4Bytes = _getBytes(_wl_block4);
  private final static String _wl_block5 = "\r\n<script language=\"JavaScript\">\r\n  parent.location.href=\'SelectTestElement.jsp\'\r\n</script>\r\n";
  private final static byte[] _wl_block5Bytes = _getBytes(_wl_block5);
  private final static String _wl_block6 = "\r\n</body>\r\n</html>\r\n";
  private final static byte[] _wl_block6Bytes = _getBytes(_wl_block6);
  
  
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
    
    response.setHeader("Content-Type", "text/html; charset=GBK");
    out = pageContext.getOut();
    JspWriter _originalOut = out;
    
    javax.servlet.http.HttpSession session = request.getSession(true);
    
    
    
    try { // error page try block
      
      response.setContentType("text/html; charset=GBK");
      
      _writeText(response, out, _wl_block0, _wl_block0Bytes);
      _writeText(response, out, _wl_block1, _wl_block1Bytes);
      mydb.DatabaseBean tt = null; //[ /DeleteTestElementConfirm.jsp; Line: 11]
      tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestElementConfirm.jsp; Line: 11]
      if (tt == null) { // begin 'tt' instantiation block... //[ /DeleteTestElementConfirm.jsp; Line: 11]
        { // Don't need to synchronize on page scope //[ /DeleteTestElementConfirm.jsp; Line: 11]
          tt = (mydb.DatabaseBean)pageContext.getAttribute("tt"); //[ /DeleteTestElementConfirm.jsp; Line: 11]
          if (tt == null) { // begin 'tt' synchronized instantiation block... //[ /DeleteTestElementConfirm.jsp; Line: 11]
            tt = new mydb.DatabaseBean(); //[ /DeleteTestElementConfirm.jsp; Line: 11]
            pageContext.setAttribute("tt", tt); //[ /DeleteTestElementConfirm.jsp; Line: 11]
          } // end synchronized bean instantiation block... //[ /DeleteTestElementConfirm.jsp; Line: 11]
        } // end synchronized bean scope block... //[ /DeleteTestElementConfirm.jsp; Line: 11]
      } // end bean instantiation block... //[ /DeleteTestElementConfirm.jsp; Line: 11]
      _writeText(response, out, _wl_block2, _wl_block2Bytes);
      //[ /DeleteTestElementConfirm.jsp; Line: 13]
      Enumeration ss=session.getAttributeNames(); //[ /DeleteTestElementConfirm.jsp; Line: 14]
      //[ /DeleteTestElementConfirm.jsp; Line: 15]
      if(!ss.hasMoreElements()){ //[ /DeleteTestElementConfirm.jsp; Line: 16]
        _writeText(response, out, _wl_block3, _wl_block3Bytes);
        //[ /DeleteTestElementConfirm.jsp; Line: 21]
      } //[ /DeleteTestElementConfirm.jsp; Line: 22]
      else{ //[ /DeleteTestElementConfirm.jsp; Line: 23]
        DataSource ds=null; //[ /DeleteTestElementConfirm.jsp; Line: 24]
        ds=tt.getDataSource(); //[ /DeleteTestElementConfirm.jsp; Line: 25]
        Connection myConn=null; //[ /DeleteTestElementConfirm.jsp; Line: 26]
        Statement myStatement1=null; //[ /DeleteTestElementConfirm.jsp; Line: 27]
        Statement myStatement2=null; //[ /DeleteTestElementConfirm.jsp; Line: 28]
        Statement myStatement3=null; //[ /DeleteTestElementConfirm.jsp; Line: 29]
        Statement myStatement4=null; //[ /DeleteTestElementConfirm.jsp; Line: 30]
        Statement myStatement5=null; //[ /DeleteTestElementConfirm.jsp; Line: 31]
        Statement myStatement6=null; //[ /DeleteTestElementConfirm.jsp; Line: 32]
        Statement myStatement7=null; //[ /DeleteTestElementConfirm.jsp; Line: 33]
        myConn=ds.getConnection(); //[ /DeleteTestElementConfirm.jsp; Line: 34]
        myStatement1=myConn.createStatement(); //[ /DeleteTestElementConfirm.jsp; Line: 35]
        myStatement2=myConn.createStatement(); //[ /DeleteTestElementConfirm.jsp; Line: 36]
        myStatement3=myConn.createStatement(); //[ /DeleteTestElementConfirm.jsp; Line: 37]
        myStatement4=myConn.createStatement(); //[ /DeleteTestElementConfirm.jsp; Line: 38]
        myStatement5=myConn.createStatement(); //[ /DeleteTestElementConfirm.jsp; Line: 39]
        myStatement6=myConn.createStatement(); //[ /DeleteTestElementConfirm.jsp; Line: 40]
        myStatement7=myConn.createStatement(); //[ /DeleteTestElementConfirm.jsp; Line: 41]
        _writeText(response, out, _wl_block4, _wl_block4Bytes);
        //[ /DeleteTestElementConfirm.jsp; Line: 44]
        String sql=new String(); //[ /DeleteTestElementConfirm.jsp; Line: 45]
        ResultSet rs,rs1; //[ /DeleteTestElementConfirm.jsp; Line: 46]
        String textName=new String(); //[ /DeleteTestElementConfirm.jsp; Line: 47]
        String testElementName=new String(); //[ /DeleteTestElementConfirm.jsp; Line: 48]
        long testElementID=0; //[ /DeleteTestElementConfirm.jsp; Line: 49]
        long informationID=0; //[ /DeleteTestElementConfirm.jsp; Line: 50]
        String sInformationID=new String(); //[ /DeleteTestElementConfirm.jsp; Line: 51]
        String[] inforID; //[ /DeleteTestElementConfirm.jsp; Line: 52]
        int num=0; //[ /DeleteTestElementConfirm.jsp; Line: 53]
        int i=0; //[ /DeleteTestElementConfirm.jsp; Line: 54]
        //[ /DeleteTestElementConfirm.jsp; Line: 55]
        textName="t"+request.getParameter("radiobutton"); //[ /DeleteTestElementConfirm.jsp; Line: 56]
        testElementID=Integer.parseInt(request.getParameter(textName)); //[ /DeleteTestElementConfirm.jsp; Line: 57]
        //[ /DeleteTestElementConfirm.jsp; Line: 58]
        sql="select * from tctc_element where element_id="+testElementID; //[ /DeleteTestElementConfirm.jsp; Line: 59]
        rs=myStatement1.executeQuery(sql); //[ /DeleteTestElementConfirm.jsp; Line: 60]
        //[ /DeleteTestElementConfirm.jsp; Line: 61]
        if(rs.next()){ //[ /DeleteTestElementConfirm.jsp; Line: 62]
          if(((String)request.getParameter(textName)).equals((String)session.getAttribute("TestElementID"))){ //[ /DeleteTestElementConfirm.jsp; Line: 63]
            //[ /DeleteTestElementConfirm.jsp; Line: 64]
            session.setAttribute("TestElementName","null"); //[ /DeleteTestElementConfirm.jsp; Line: 65]
            session.setAttribute("TestElementID","null"); //[ /DeleteTestElementConfirm.jsp; Line: 66]
            session.setAttribute("Type","c"); //[ /DeleteTestElementConfirm.jsp; Line: 67]
            session.setAttribute("CR_Number","null"); //[ /DeleteTestElementConfirm.jsp; Line: 68]
          } //[ /DeleteTestElementConfirm.jsp; Line: 69]
          sql="select count(*) from tctc_information where element_id="+testElementID+" and inf_type='c'"; //[ /DeleteTestElementConfirm.jsp; Line: 70]
          rs1=myStatement2.executeQuery(sql); //[ /DeleteTestElementConfirm.jsp; Line: 71]
          //[ /DeleteTestElementConfirm.jsp; Line: 72]
          if(rs1.next()){ //[ /DeleteTestElementConfirm.jsp; Line: 73]
            num=rs1.getInt("count(*)"); //[ /DeleteTestElementConfirm.jsp; Line: 74]
          } //[ /DeleteTestElementConfirm.jsp; Line: 75]
          //[ /DeleteTestElementConfirm.jsp; Line: 76]
          inforID=new String[num]; //[ /DeleteTestElementConfirm.jsp; Line: 77]
          //[ /DeleteTestElementConfirm.jsp; Line: 78]
          if(num>0){ //[ /DeleteTestElementConfirm.jsp; Line: 79]
            sql="select inf_id from tctc_information where element_id="+testElementID+" and inf_type='c'"; //[ /DeleteTestElementConfirm.jsp; Line: 80]
            rs1=myStatement3.executeQuery(sql); //[ /DeleteTestElementConfirm.jsp; Line: 81]
            if(rs1.next()){ //[ /DeleteTestElementConfirm.jsp; Line: 82]
              do{ //[ /DeleteTestElementConfirm.jsp; Line: 83]
                informationID=rs1.getLong("inf_id"); //[ /DeleteTestElementConfirm.jsp; Line: 84]
                sInformationID="%"+String.valueOf(informationID)+"%"; //[ /DeleteTestElementConfirm.jsp; Line: 85]
                inforID[i]=sInformationID; //[ /DeleteTestElementConfirm.jsp; Line: 86]
                i++; //[ /DeleteTestElementConfirm.jsp; Line: 87]
              }while(rs1.next()); //[ /DeleteTestElementConfirm.jsp; Line: 88]
            } //[ /DeleteTestElementConfirm.jsp; Line: 89]
          } //[ /DeleteTestElementConfirm.jsp; Line: 90]
          //[ /DeleteTestElementConfirm.jsp; Line: 91]
          for(i=0;i<inforID.length;i++){ //[ /DeleteTestElementConfirm.jsp; Line: 92]
            //[ /DeleteTestElementConfirm.jsp; Line: 93]
            sInformationID=inforID[i]; //[ /DeleteTestElementConfirm.jsp; Line: 94]
            //[ /DeleteTestElementConfirm.jsp; Line: 95]
            sql="delete from tctc_test_case where  condition like '"+sInformationID+"'"; //[ /DeleteTestElementConfirm.jsp; Line: 96]
            myStatement4.executeUpdate(sql); //[ /DeleteTestElementConfirm.jsp; Line: 97]
            //[ /DeleteTestElementConfirm.jsp; Line: 98]
            sql="delete from tctc_information where inf_dis like '"+sInformationID+"'"; //[ /DeleteTestElementConfirm.jsp; Line: 99]
            myStatement5.executeUpdate(sql); //[ /DeleteTestElementConfirm.jsp; Line: 100]
          } //[ /DeleteTestElementConfirm.jsp; Line: 101]
          //[ /DeleteTestElementConfirm.jsp; Line: 102]
          sql="delete from tctc_element where element_id="+testElementID; //[ /DeleteTestElementConfirm.jsp; Line: 103]
          myStatement6.executeUpdate(sql); //[ /DeleteTestElementConfirm.jsp; Line: 104]
          //[ /DeleteTestElementConfirm.jsp; Line: 105]
          sql="delete from tctc_information where element_id="+testElementID; //[ /DeleteTestElementConfirm.jsp; Line: 106]
          myStatement7.executeUpdate(sql); //[ /DeleteTestElementConfirm.jsp; Line: 107]
          //[ /DeleteTestElementConfirm.jsp; Line: 108]
          //[ /DeleteTestElementConfirm.jsp; Line: 109]
          rs1.close(); //[ /DeleteTestElementConfirm.jsp; Line: 110]
        } //[ /DeleteTestElementConfirm.jsp; Line: 111]
        else //[ /DeleteTestElementConfirm.jsp; Line: 112]
        { //[ /DeleteTestElementConfirm.jsp; Line: 113]
          session.setAttribute("Error","4.2"); //[ /DeleteTestElementConfirm.jsp; Line: 114]
          //[ /DeleteTestElementConfirm.jsp; Line: 115]
        } //[ /DeleteTestElementConfirm.jsp; Line: 116]
        //[ /DeleteTestElementConfirm.jsp; Line: 117]
        //[ /DeleteTestElementConfirm.jsp; Line: 118]
        rs.close(); //[ /DeleteTestElementConfirm.jsp; Line: 119]
        _writeText(response, out, _wl_block5, _wl_block5Bytes);
        //[ /DeleteTestElementConfirm.jsp; Line: 124]
        myConn.close(); //[ /DeleteTestElementConfirm.jsp; Line: 125]
        myStatement1.close(); //[ /DeleteTestElementConfirm.jsp; Line: 126]
        myStatement2.close(); //[ /DeleteTestElementConfirm.jsp; Line: 127]
        myStatement3.close(); //[ /DeleteTestElementConfirm.jsp; Line: 128]
        myStatement4.close(); //[ /DeleteTestElementConfirm.jsp; Line: 129]
        myStatement5.close(); //[ /DeleteTestElementConfirm.jsp; Line: 130]
        myStatement6.close(); //[ /DeleteTestElementConfirm.jsp; Line: 131]
        myStatement7.close(); //[ /DeleteTestElementConfirm.jsp; Line: 132]
      } //[ /DeleteTestElementConfirm.jsp; Line: 133]
      _writeText(response, out, _wl_block6, _wl_block6Bytes);
    } catch (Throwable __ee) {
      while (out != null && out != _originalOut) out = pageContext.popBody();
      ((weblogic.servlet.jsp.PageContextImpl)pageContext).handlePageException((Throwable)__ee);
    }
    
    
    //before final close brace...
  }
  
  
}
