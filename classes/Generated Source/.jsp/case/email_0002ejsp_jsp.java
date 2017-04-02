import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.*;

public class email_0002ejsp_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    javax.servlet.jsp.PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n");
      out.write("<html>\r\n\r\n");
      out.write("<head>\r\n\r\n");
      out.write("<TITLE>JavaMail");
      out.write("</TITLE>\r\n\r\n");
      out.write("</HEAD>\r\n\r\n");
      out.write("<BODY>\r\n\r\n");


try{

Properties props = new Properties();

Session sendMailSession;

Store store;

Transport transport;

sendMailSession = Session.getInstance(props, null);

props.put("mail.smtp.host", "smtp.bhr.com.cn");

Message newMessage = new MimeMessage(sendMailSession);

newMessage.setFrom(new InternetAddress("wangxiaoguang@bhr.com.cn"));

newMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("wangxianzao@bhr.com.cn"));

newMessage.setSubject("test");

newMessage.setSentDate(new Date());

newMessage.setText("test");

transport = sendMailSession.getTransport("smtp");

transport.send(newMessage);


      out.write("\r\n\r\n");
      out.write("<p>OK");
      out.write("<p>\r\n\r\n");


}

catch(MessagingException m)

{

out.println(m.toString());

}


      out.write("\r\n\r\n");
      out.write("</BODY>\r\n\r\n");
      out.write("</HTML>\r\n");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }
}
