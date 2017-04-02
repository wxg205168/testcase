package email;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Multipart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.InternetAddress;
import javax.activation.*;
import java.util.Properties;
import java.util.*;
import java.io.*;

public class SendEmail {

    private static String pnetSMTPHost;
    private Session pnetSMTPSession;
    File statusFile;


    public SendEmail()
    {
        init();
    }
    /**
     * Initializes the email service to use the specified mail server.
     *
     * @param mail_host The IP name or address of the mail server to use.
     */
    void init(){
        Properties props = System.getProperties();
        //need your update
        pnetSMTPHost = "SMTP.BHR.COM.CN";
        //end
        trace("pnetSMTPHost = "+pnetSMTPHost);
        props.put("mail.smtp.host", pnetSMTPHost);
        pnetSMTPSession = Session.getInstance(props, null);

    }
//    public static void main(String[] args) {
//        BtmsSendReportByEmail sendMail = new BtmsSendReportByEmail();
//        sendMail.send("caosheng@bhr.com.cn","","d:/tmp/","send attchment subject","caosheng@bhr.com.cn","the email content is test");
//    }

    /**
     * Sends an email message.
     *
     * @param from The sender of the mail. Must be a in the format of an
     * internet email address and cannot be null.
     * @param to The receipient(2) of the mail. Can be a list of email addresses
     * separated by space or commas. Each address must be a in the format of an
     * internet email address and there must be at least one.
     * @param cc CC receipient(2). Can be a list of email addresses
     * separated by space or commas. Each address must be a in the format of an
     * internet email address. Can be null.
     * @param subject Subject of the email message.
     * @param msgbody Text content of email message.
     *
     * @exception pow.workflow.MessagingException Error in sending the message
     * or setting the "from" field.
     * @exception InvalidEmailAddressException Email addresses in arguments are
     * null or of the wrong format.
     */
//    public void send(String emailAddress,String attachmentName,String attachmentFilePath,String subjectStr,String ccName,String contentStr) {
//        return;
//    }
//
    public void send(String fromAddress,String emailAddress,String attachmentName,String attachmentFilePath,String subjectStr,String ccName,String contentStr) {
        try {
            String from;
            String to;
            String cc;
            String subject;
            String msgbody;
            String fileName;
            String fileList[];
            String FilePath;
            trace(" Loading adhoc method send(3)");
            //need your update
            //from     = "wangxianzao@bhr.com.cn";
//            from     = "btms@bhr.com.cn";
            //end
            //FilePath = "e:/tmp/";
            subject = subjectStr;
            String fileAndPath = attachmentFilePath + attachmentName;
            if(attachmentName==null||attachmentName.equalsIgnoreCase(""))
            {
                msgbody =contentStr;
            }else
            {
                msgbody = contentStr;
                File statusFile = new File(fileAndPath);
                if (!statusFile.exists()) {
                    trace("the file doesnot exist!!!!!!!!!");
                    return;
                }
            }
            to = emailAddress;
            cc = ccName;
            from = fromAddress;
            MimeMessage msg = initMessage(from, to, cc, subject);
            trace("****** 1 ***** " );
            MimeBodyPart mbp1 = new MimeBodyPart();
            trace("*****2 ***** " );
            mbp1.setText(msgbody);
            trace("****** test mbp1 ***** "+mbp1 );
            Multipart mp = new MimeMultipart();
            trace("*****3 ***** " );
            mp.addBodyPart(mbp1);
            trace("*****4 ***** " );
            if(attachmentName!=null&&!attachmentName.equalsIgnoreCase(""))
            {
                MimeBodyPart mbps = new MimeBodyPart();
                FileDataSource fds = new FileDataSource(fileAndPath);
                mbps.setDataHandler(new DataHandler(fds));
                mbps.setFileName(attachmentName);
                mp.addBodyPart(mbps);
            }
            msg.setContent(mp);
            Transport.send(msg);
            trace("attachmentName = "+attachmentName);
            removeFile(attachmentName);
            trace("****** msg = ***** "+msg );
            //trace("****** 100 ***** " );
        } catch (Exception expt) {
            trace("expt*** = "+expt);
        }
    }

    /**
     * A method that abstracts out the common tasks in the 2 sends in order to
     * reduce code.
     */
    private MimeMessage initMessage(String from_,String to_,String cc_,String subject_) {
        int i = 0;
        String tempCCAddress;
        //trace("****** 11 ***** " );
        if (from_ == null || to_ == null) {
            trace("Sender and receipient addresses cannot be null!");
        }
        Session session = pnetSMTPSession;
        //trace("****** 12 ***** " );
        if (session == null) {
            trace("SMTP Host not specified. Unable to send email to " + to_ + ".");

        }
        MimeMessage msg = null;
        //trace("****** 13 ***** " );
        try {
            msg = new MimeMessage(session);
            //trace("****** 14 ***** " );
            msg.setFrom(new InternetAddress(from_));
            //trace("****** 15 ***** " );
            msg.setReplyTo(InternetAddress.parse(from_, false));
            msg.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(to_, false));
            StringTokenizer st = new StringTokenizer(cc_, ",");
            //trace("****** 17 ***** " );
            i = 0;
            while (st.hasMoreTokens()) {
                tempCCAddress = st.nextToken();
                //trace("****** 18 ***** " );
                if (tempCCAddress != null)
                    msg.addRecipient(
                    Message.RecipientType.CC,
                    new InternetAddress(tempCCAddress));
                i++;
                //trace("****** 19 ***** " );
            }
            msg.setSubject(subject_);
            //trace("****** 199 ***** " );
        } catch (Exception expt) {
            trace("****expt***= "+expt);
        }
        return (msg);
    }



    //**************for delete csv file*******************
    public void removeFile(String fileNameStr)
    {
        File movedFile;
        //need your update
        String csvFilePath = "the faile name that need be delete";
        //end
        int fileLength=csvFilePath.length();
        String lastcharacter =csvFilePath.substring(fileLength-1);

        System.out.println(" lastcharacter is "+lastcharacter);

        //processedFile = configReader.getStringValue(PROCESSEDFILEPATH);
        try
        {
            if(lastcharacter.equals("/"))
            {
                movedFile = new File(csvFilePath + fileNameStr);
            }else
            {
                movedFile = new File(csvFilePath + "/" + fileNameStr);
            }
            trace(csvFilePath + "/" + fileNameStr );
            if (!movedFile.isDirectory())
            {
                if (movedFile.exists())
                {

                    movedFile.delete();
                }
                trace("remove csv File is successful ");
            }
            trace("remove csv File is Directory ");
        }catch(Exception e)
        {
            System.out.println(" e = "+e);
            return;
        }
    }
    //*************************end of for delete csv file

    private void trace(String s)
    {
        System.out.println("[SendEmail] "+ s);
    }
}
