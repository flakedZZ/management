package action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;

import com.opensymphony.xwork2.ActionContext;

import entity.Student_info;
import entity.User;
import service.Student_infoService;
/*
 * ���action��Ȼ������update����ʵ���ϻ�ͬʱ�ӹ�save������update����
 * 
 */
public class UpdateStuInfoAction {
	private int student_id;//Ψһ��ţ�������
	private String student_name;//ѧ������
	private int student_number;//�����student_id��ͻ��
	private String student_sex;//�Ա�
	private int student_qq;//qq
	private int student_phone;//�ֻ�
	private String student_email;//����
	private String photo_path;
	private String sdept;
	private String smajor;
	private Date date;
	private Date sys_date;
	private int flag;//ɾ�����
	private String def1;//�������Ǳ����ֶ�
	private String def2;
	private String def3;
	private String student_numberStr=student_number+"";
	//��������Ϊsetget����
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
	//��������Ϊsetget����
	//����ҵ���߼����
	private Student_infoService student_infoService;
	//����ҵ���߼����
	public void setStudent_infoService(Student_infoService stuInfoService){
		this.student_infoService=stuInfoService;
	}
	
	public String execute(){
		
		
		
		Student_info result=student_infoService.getStu(student_number);
		//��user��ҹ������Բ������ѧ�Ŵ�������
		result.setStudent_name(student_name);
		result.setPhoto_path(photo_path);
		result.setSdept(sdept);
		result.setSmajor(smajor);
		result.setStudent_email(student_email);
		result.setStudent_phone(student_phone);
		result.setStudent_qq(student_qq);
		result.setStudent_sex(student_sex);
		
		//������ݿ��������ID�Ķ���
		student_infoService.updateStu(result);//�͸����������
		
		
		return "success";
		
		
	}
	
}
