package entity;

import java.util.Date;

public class Student_info {
	private int student_id;//唯一编号，自增？
	private String student_name;//学生姓名
	private int student_number;//好像和student_id冲突了
	private String student_sex;//性别
	private int student_qq;//qq
	private int student_phone;//手机
	private String student_email;//邮箱
	private String photo_path;
	private String sdept;
	private String smajor;
	private Date date;
	private Date sys_date;
	private int flag;//删除标记
	private String def1;//这三个是备用字段
	private String def2;
	private String def3;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_number() {
		return student_number;
	}
	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}
	public String getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}
	public int getStudent_qq() {
		return student_qq;
	}
	public void setStudent_qq(int student_qq) {
		this.student_qq = student_qq;
	}
	public int getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(int student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getPhoto_path() {
		return photo_path;
	}
	public void setPhoto_path(String photo_path) {
		this.photo_path = photo_path;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public String getSmajor() {
		return smajor;
	}
	public void setSmajor(String smajor) {
		this.smajor = smajor;
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
	public Student_info() {
		super();
	}
	public Student_info(int student_id, String studnet_name,
			int student_number, String student_sex, int student_qq,
			int student_phone, String student_email, String photo_path,
			String sdept, String smajor, Date date, Date sys_date, int flag,
			String def1, String def2, String def3) {
		super();
		this.student_id = student_id;
		this.student_name = studnet_name;
		this.student_number = student_number;
		this.student_sex = student_sex;
		this.student_qq = student_qq;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.photo_path = photo_path;
		this.sdept = sdept;
		this.smajor = smajor;
		this.date = date;
		this.sys_date = sys_date;
		this.flag = flag;
		this.def1 = def1;
		this.def2 = def2;
		this.def3 = def3;
	}
	public Student_info(String student_name, int student_number,
			String student_sex, int student_qq, int student_phone,
			String student_email, String photo_path, String sdept,
			String smajor, Date date) {
		super();
		this.student_name = student_name;
		this.student_number = student_number;
		this.student_sex = student_sex;
		this.student_qq = student_qq;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.photo_path = photo_path;
		this.sdept = sdept;
		this.smajor = smajor;
		this.date = date;
	}
	public Student_info(String student_name, String student_sex,
			int student_qq, int student_phone, String student_email,
			String photo_path, String sdept, String smajor, Date date) {
		super();
		this.student_name = student_name;
		this.student_sex = student_sex;
		this.student_qq = student_qq;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.photo_path = photo_path;
		this.sdept = sdept;
		this.smajor = smajor;
		this.date = date;
	}
	public Student_info(int student_qq, int student_phone,
			String student_email, String photo_path, String sdept, String smajor) {
		super();
		this.student_qq = student_qq;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.photo_path = photo_path;
		this.sdept = sdept;
		this.smajor = smajor;
	}
	public Student_info(int student_id, String student_name,
			int student_number, String student_sex, int student_qq,
			int student_phone, String student_email, String photo_path,
			String sdept, String smajor, Date date) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_number = student_number;
		this.student_sex = student_sex;
		this.student_qq = student_qq;
		this.student_phone = student_phone;
		this.student_email = student_email;
		this.photo_path = photo_path;
		this.sdept = sdept;
		this.smajor = smajor;
		this.date = date;
	}

	
	
}
