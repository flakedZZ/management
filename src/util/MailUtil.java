package util;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailUtil {


public static void  sendMail(String receiver,String title,String text) throws Exception {
      
         Properties prop = new Properties();
         prop.setProperty("mail.host", "smtp.qq.com");
         prop.setProperty("mail.transport.protocol", "smtp");
         prop.setProperty("mail.smtp.auth", "true");
      // ���Խ׶� �Ȱ�receiver������һ��
    	// receiver="352498881@qq.com";
         //ʹ��JavaMail�����ʼ���5������
         //1������session
         Session session = Session.getInstance(prop);
         //����Session��debugģʽ�������Ϳ��Բ鿴��������Email������״̬
         session.setDebug(true);
         //2��ͨ��session�õ�transport����
         Transport ts = session.getTransport();
         //3��ʹ��������û��������������ʼ��������������ʼ�ʱ����������Ҫ�ύ������û����������smtp���������û��������붼ͨ����֤֮����ܹ����������ʼ����ռ��ˡ�
         ts.connect("smtp.qq.com", "1805648841", "GFJ.0814");
         //4�������ʼ�
         Message message = createSimpleMail( session,receiver,title,text);
         //5�������ʼ�
         ts.sendMessage(message, message.getAllRecipients());
         ts.close();
         
        
     }

/**
     * @Method: createSimpleMail
     * @Description: ����һ��ֻ�����ı����ʼ�
     * @Anthor:flakedzz
     *
     * @param session
     * @return
     * @throws Exception
     */ 
     public static MimeMessage createSimpleMail(Session session,String receiver,String title,String text)
             throws Exception {
    	 
         //�����ʼ�����
         MimeMessage message = new MimeMessage(session);
         //ָ���ʼ��ķ�����
         message.setFrom(new InternetAddress("1805648841@qq.com"));
         //ָ���ʼ����ռ��ˣ����ڷ����˺��ռ�����һ���ģ��Ǿ����Լ����Լ���
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
         //�ʼ��ı���
         message.setSubject(title);
         //�ʼ����ı�����
         message.setContent(text, "text/html;charset=UTF-8");
         //���ش����õ��ʼ�����
         return message;
     }
     
    
}   