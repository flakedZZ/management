package action.depart;

import java.util.Date;
import java.util.Map;

import service.Depart_infoService;
import service.Org_infoService;

import com.opensymphony.xwork2.ActionContext;

import entity.Depart_info;
import entity.Org_info;

public class UpdateDepartInfoAction {
	private Depart_info depart;
	private Org_info org_info;
	private int department_id;
	private String department_name;
	private int org_id;
	private String department_admin;
	private int admin_phone;
	private int department_qqgroup;
	private String department_intro;
	private Date date;
	private Date sys_date;
	private String info_publisher;
	private int flag;
	private String def1;
	private String def2;
	private String def3;
	

	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getDepartment_admin() {
		return department_admin;
	}
	public void setDepartment_admin(String department_admin) {
		this.department_admin = department_admin;
	}
	public int getAdmin_phone() {
		return admin_phone;
	}
	public void setAdmin_phone(int admin_phone) {
		this.admin_phone = admin_phone;
	}
	public int getDepartment_qqgroup() {
		return department_qqgroup;
	}
	public void setDepartment_qqgroup(int department_qqgroup) {
		this.department_qqgroup = department_qqgroup;
	}
	public String getDepartment_intro() {
		return department_intro;
	}
	public void setDepartment_intro(String department_intro) {
		this.department_intro = department_intro;
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
	
	public Depart_info getDepart() {
		return depart;
	}
	public void setDepart(Depart_info depart) {
		this.depart = depart;
	}

	public Org_info getOrg_info() {
		return org_info;
	}
	public void setOrg_info(Org_info org_info) {
		this.org_info = org_info;
	}



	//×¢Èë
	private Depart_infoService depart_infoService;
	private Org_infoService org_infoService;
	public Depart_infoService getDepart_infoService() {
		return depart_infoService;
	}
	public void setDepart_infoService(Depart_infoService depart_infoService) {
		this.depart_infoService = depart_infoService;
	}
	
	public Org_infoService getOrg_infoService() {
		return org_infoService;
	}
	public void setOrg_infoService(Org_infoService org_infoService) {
		this.org_infoService = org_infoService;
	}
	public String execute()
	{
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
      depart=(Depart_info)session.get("depart");
      depart.setDepartment_name(department_name);
      depart.setOrg_id(org_id);
      depart.setDepartment_admin(department_admin);
      depart.setDepartment_qqgroup(department_qqgroup);
      depart.setDepartment_intro(department_intro);
      org_info= org_infoService.findById(org_id);
      
      session.put("depart", depart);
      depart_infoService.update(depart);
     
        
		return "success";
	}

}
