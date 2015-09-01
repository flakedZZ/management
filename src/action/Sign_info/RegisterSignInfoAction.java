package action.Sign_info;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import service.Sign_infoService;
import service.Sign_infoServiceImpl;

import com.opensymphony.xwork2.ActionContext;

import entity.Sign_info;

public class RegisterSignInfoAction {
	
	private int signment_id;
	private int student_id;//����user��student_number
	private int department_id;//����id
	private String personal_intro;//�ı���
	private int adjust;//�������
	private int check_state;//���״̬
	private int other;//����������
	private Date date;//��¼��������
	private Date sys_date;//��������
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
	

	//����ҵ���߼����
	private Sign_infoService sign_infoService;
	//����ҵ���߼����
	public Sign_infoService getSign_infoService() {
		return sign_infoService;
	}
	public void setSign_infoService(Sign_infoService sign_infoService) {
		this.sign_infoService = sign_infoService;
	}
	public String execute(){
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String tmp = dFormat.format(new Date());
		try {
			DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = df.parse(tmp);
			} catch(Exception ex) {
			}
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        student_id=(Integer)session.get("student_number");
        department_id=(Integer)session.get("department_id");
        Sign_info sign=new Sign_info(signment_id,student_id,department_id,personal_intro,adjust, date,sys_date);			
		//�������ݿ�
      
        sign_infoService.save(sign);
		return "success";
	}
	
	
	
}
