package entity;

import java.sql.Date;

public class Sign_info {
	private int signment_id;
	private int student_id;//����user��student_number
	private int department_id;//����id
	private String personal_intro;//�ı���
	private int adjust;//�������
	private int check_state;//���״̬
	private int other;//����������
	private Date date;//��¼��������
	private Date sys_date;//��������
	//����set��get����
	public int getSignment_id() {
		return signment_id;
	}
	public void setSignment_id(int signment_id) {
		this.signment_id = signment_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getPersonal_intro() {
		return personal_intro;
	}
	public void setPersonal_intro(String personal_intro) {
		this.personal_intro = personal_intro;
	}
	public int getAdjust() {
		return adjust;
	}
	public void setAdjust(int adjust) {
		this.adjust = adjust;
	}
	public int getCheck_state() {
		return check_state;
	}
	public void setCheck_state(int check_state) {
		this.check_state = check_state;
	}
	public int getOther() {
		return other;
	}
	public void setOther(int other) {
		this.other = other;
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
	//���췽��
	public Sign_info() {
		super();
	}
	public Sign_info(int signment_id, int student_id, int department_id,
			String personal_intro, int adjust, int check_state, int other,
			Date date) {
		super();
		this.signment_id = signment_id;
		this.student_id = student_id;
		this.department_id = department_id;
		this.personal_intro = personal_intro;
		this.adjust = adjust;
		this.check_state = check_state;
		this.other = other;
		this.date = date;
	}
	
	 
	
}
