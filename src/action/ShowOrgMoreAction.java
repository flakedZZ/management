package action;


import java.util.Date;
import java.util.List;
import java.util.Map;

import service.Depart_infoService;
import service.Org_infoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Depart_info;
import entity.Org_info;

public class ShowOrgMoreAction extends ActionSupport{
	private Org_info orgInfo;
	private List<Depart_info> list;
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
	public List<Depart_info> getList() {
		return list;
	}
	public void setList(List<Depart_info> list) {
		this.list = list;
	}

	//定义业务逻辑组件
	private Org_infoService org_infoService;
	private Depart_infoService depart_infoService;
	//设置业务逻辑组件
	public Org_infoService getOrg_infoService() {
		return org_infoService;
	}
	public void setOrg_infoService(Org_infoService org_infoService) {
		this.org_infoService = org_infoService;
	}
	
	
	public Depart_infoService getDepart_infoService() {
		return depart_infoService;
	}
	public void setDepart_infoService(Depart_infoService depart_infoService) {
		this.depart_infoService = depart_infoService;
	}
	public String execute(){
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
		orgInfo=org_infoService.findById(org_id);
		org_name=orgInfo.getOrg_name();
		org_admin=orgInfo.getOrg_admin();
		org_qq=orgInfo.getOrg_qq();
		org_email=orgInfo.getOrg_email();
		org_intro=orgInfo.getOrg_intro();
		
		session.put("orgInfo", orgInfo);
		return "success";
	}
	public String ShowOrgById()
	{
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
       
		orgInfo=org_infoService.findById(org_id);
		list=depart_infoService.findSomeByOrg_id(org_id);
		
		return "ShowOrgById";
	}
	
}
