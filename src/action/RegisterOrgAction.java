package action;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import service.Org_infoService;
import entity.Org_info;

public class RegisterOrgAction {
	private Org_info orgInfo;
	private int org_id;
	private String org_name;
	private String org_admin;
	private String org_intro;
	private int org_qq;
	private String org_email;
	private String org_email_username;
	private String org_email_password;
	private Date date;
	private Date sys_date;
	private Date finish_date;
	private String info_publisher;
	private int flag;
	private String def1;
	private String def2;
	private String def3;
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_admin() {
		return org_admin;
	}
	public void setOrg_admin(String org_admin) {
		this.org_admin = org_admin;
	}
	public String getOrg_intro() {
		return org_intro;
	}
	public void setOrg_intro(String org_intro) {
		this.org_intro = org_intro;
	}
	public int getOrg_qq() {
		return org_qq;
	}
	public void setOrg_qq(int org_qq) {
		this.org_qq = org_qq;
	}
	public String getOrg_email() {
		return org_email;
	}
	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}
	public String getOrg_email_username() {
		return org_email_username;
	}
	public void setOrg_email_username(String org_email_username) {
		this.org_email_username = org_email_username;
	}
	public String getOrg_email_password() {
		return org_email_password;
	}
	public void setOrg_email_password(String org_email_password) {
		this.org_email_password = org_email_password;
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
	public Date getFinish_date() {
		return finish_date;
	}
	public void setFinish_date(Date finish_date) {
		this.finish_date = finish_date;
	}
	public String getInfo_publisher() {
		return info_publisher;
	}
	public void setInfo_publisher(String info_publisher) {
		this.info_publisher = info_publisher;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
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
	public Org_info getOrgInfo() {
		return orgInfo;
	}
	public void setOrgInfo(Org_info orgInfo) {
		this.orgInfo = orgInfo;
	}

	//定义业务逻辑组件

	


	private Org_infoService org_infoService;
	//设置业务逻辑组件
	public Org_infoService getOrg_infoService() {
		return org_infoService;
	}
	public void setOrg_infoService(Org_infoService org_infoService) {
		this.org_infoService = org_infoService;
	}
	public String execute(){
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String tmp = dFormat.format(new Date());
		try {
			DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = df.parse(tmp);
			} catch(Exception ex) {
			}
		//System.out.print(student_name);
		//默认注册用户权限为1【学生权限
		 orgInfo=new Org_info(org_id,org_name,org_admin,org_intro,org_qq,org_email,date);
		//存入数据库
		org_infoService.save(orgInfo);
		return "success";
	}
	
}
