package entity;

import java.util.Date;

public class Depart_info {
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
	public Depart_info() {
		super();
	}
	public Depart_info(int department_id, String department_name, int org_id,
			String department_admin, int admin_phone, int department_qqgroup,
			String department_intro, Date date, Date sys_date,
			String info_publisher, int flag, String def1, String def2,
			String def3) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.org_id = org_id;
		this.department_admin = department_admin;
		this.admin_phone = admin_phone;
		this.department_qqgroup = department_qqgroup;
		this.department_intro = department_intro;
		this.date = date;
		this.sys_date = sys_date;
		this.info_publisher = info_publisher;
		this.flag = flag;
		this.def1 = def1;
		this.def2 = def2;
		this.def3 = def3;
	}

	
	
	
}
