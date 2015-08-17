package entity;

import java.util.Date;

public class Email_info {
	private Integer email_id;
	private Integer department_id;
	private String mail_title;
	private String mail_text;
	private String sender;
	private Integer  check_state;
	private String def1;
	private String def2;
	private String def3;
	private Integer flag;
	private Date date;
	private Date sys_date;
	public Integer getEmail_id() {
		return email_id;
	}
	public void setEmail_id(Integer email_id) {
		this.email_id = email_id;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getMail_title() {
		return mail_title;
	}
	public void setMail_title(String mail_title) {
		this.mail_title = mail_title;
	}
	public String getMail_text() {
		return mail_text;
	}
	public void setMail_text(String mail_text) {
		this.mail_text = mail_text;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public Integer getCheck_state() {
		return check_state;
	}
	public void setCheck_state(Integer check_state) {
		this.check_state = check_state;
	}
	public String getDef1() {
		return def1;
	}
	public void setDef1(String def1) {
		this.def1 = def1;
	}
	public String getDef2() {
		return def2;
	}
	public void setDef2(String def2) {
		this.def2 = def2;
	}
	public String getDef3() {
		return def3;
	}
	public void setDef3(String def3) {
		this.def3 = def3;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getSys_date() {
		return sys_date;
	}
	public void setSys_date(Date sys_date) {
		this.sys_date = sys_date;
	}
	

}
