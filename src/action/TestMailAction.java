package action;
import util.MailUtil;
public class TestMailAction {
	private String receiver;
	private String title;
	private String text;
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	//定义&设置业务逻辑组件
	private MailUtil mailUtil;
	
	public MailUtil getMailUtil() {
		return mailUtil;
	}
	public void setMailUtil(MailUtil mailUtil) {
		this.mailUtil = mailUtil;
	}
	public String execute(){
		try {
			mailUtil.sendMail(receiver, title, text);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failer";
		}
		
	}

}
