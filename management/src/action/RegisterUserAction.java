package action;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import entity.Student_info;
import entity.User;
import service.Student_infoService;
import service.UserService;

public class RegisterUserAction {
	private int user_id	;//�û�id
	private String username;	//�û���
	private String password;	//����
	private int flag;	//0Ϊɾ�� 1Ϊѧ�� 2Ϊ����Ա
	private int student_number;//��student_info�����ѧ�Ź���
	private int student_id;//Ψһ��ţ�������
	private String student_name;//ѧ������
	private String student_sex;//�Ա�
	private int student_qq;//qq
	private int student_phone;//�ֻ�
	private String student_email;//����
	private String photo_path;
	private String sdept;
	private String smajor;
	private Date date;
	private String def1;//�������Ǳ����ֶ�
	private String def2;
	private String def3;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getStudent_number() {
		return student_number;
	}
	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}
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
	
	//����ҵ���߼����
	private UserService userService;
	private Student_infoService student_infoService;
	//����ҵ���߼����
	public void setUserService (UserService userService){
		this.userService=userService;
	}
	public void setStudent_infoService(Student_infoService student_infoService){
		this.student_infoService=student_infoService;
	}

	public String execute(){
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String tmp = dFormat.format(new Date());
		try {
			DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = df.parse(tmp);
			} catch(Exception ex) {
			}
		//Ĭ��ע���û�Ȩ��Ϊ1��ѧ��Ȩ��
		Student_info stuInfo=new Student_info(student_name,student_number,student_sex,
				student_qq, student_phone, student_email, photo_path, sdept, smajor, date);
		User user=new User(username, password, date, student_number);
		//�������ݿ�
		student_infoService.saveStu(stuInfo);
		userService.saveUser(user);
		return "success";
	}
}
