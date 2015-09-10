package action.Sign_info;

import java.util.Date;
import java.util.List;
import java.util.Map;

import service.Depart_infoService;
import service.Org_infoService;
import service.Sign_infoService;
import service.Student_infoService;

import com.opensymphony.xwork2.ActionContext;

import entity.Sign_info;
import entity.Student_info;

public class ShowSignListByStuIdAction{
	private Student_info student_info;
	private Sign_info sign;
	private List<Sign_info> list;
	private int signment_id;
	private int student_id;//����user��student_number
	private int department_id;//����id
	private String personal_intro;//�ı���
	private int adjust;//�������
	private int check_state;//���״̬
	private int other;//����������
	private Date date;//��¼��������
	private Date sys_date;//��������
	
	
	
	public Student_info getStudent_info() {
		return student_info;
	}
	public void setStudent_info(Student_info student_info) {
		this.student_info = student_info;
	}
	public Sign_info getSign() {
		return sign;
	}
	public void setSign(Sign_info sign) {
		this.sign = sign;
	}
	public List<Sign_info> getList() {
		return list;
	}
	public void setList(List<Sign_info> list) {
		this.list = list;
	}
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
		//ע��
	private Sign_infoService sign_infoService;
	private Depart_infoService depart_infoService;
	private Org_infoService  org_infoService;
	private Student_infoService student_infoService;
	public Sign_infoService getSign_infoService() {
		return sign_infoService;
	}
	public void setSign_infoService(Sign_infoService sign_infoService) {
		this.sign_infoService = sign_infoService;
	}
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
	
	public Student_infoService getStudent_infoService() {
		return student_infoService;
	}
	public void setStudent_infoService(Student_infoService student_infoService) {
		this.student_infoService = student_infoService;
	}
	public String execute(){
	ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
		student_id=(Integer)session.get("student_number");
		 list=sign_infoService.findSomeByStuId(student_id);
		 //���ݲ��ű�Ų����������������֯
		 
		//session.put("orgList", list);
		return "success";
	}
	public String findAllSigns()
	{
		list=sign_infoService.findAll();
		return "findAllSigns";
	}
	public String updateSignInfo()
	{
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
      //���ݴ������ı�����Ϣidֵ�ҵ���Ӧ�ı�����Ϣ 
		sign=(Sign_info)session.get("sign");
		//�޸ĸö������������ֵ
		sign.setCheck_state(check_state);
		sign.setOther(other);
		//Ȼ���ٵ����޸ķ���������޸�
		sign_infoService.update(sign);
		//��session�����ֵ�滻��
	    session.put("sign", sign);
		
		return findAllSigns();
	}
	public String deleteSignInfo()
	{
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
		sign_infoService.delSign_info(signment_id);
		student_id=(Integer)session.get("student_number");
		return "deleteSignInfo";
	}
	
	public String saveUpdateSignInfo()
	{
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        sign=(Sign_info)session.get("sign");
        sign.setCheck_state(check_state);
        sign.setOther(other);
        
        sign_infoService.update(sign);
        session.put("sign", sign);
		return "saveUpdateSignInfo";
	}
	
	public String showStuInfo()
	{
		sign=sign_infoService.findById(signment_id);
		student_info=student_infoService.getStu(sign.getStudent_id());
		return "showStuInfo";
	}
	public String toUpdate()
	{
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
      //���ݴ������ı�����Ϣidֵ�ҵ���Ӧ�ı�����Ϣ 
		sign=sign_infoService.findById(signment_id);
		//���ö������session��
		session.put("sign", sign);
		return "toUpdate";
	}
}
