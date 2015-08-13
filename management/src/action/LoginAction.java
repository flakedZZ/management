package action;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import entity.Student_info;
import entity.User;
import service.Student_infoService;
import service.UserService;

public class LoginAction {
	private int user_id	;//�û�id
	private String username;	//�û���
	private String password;	//����
	private int flag;	//0Ϊɾ�� 1Ϊѧ�� 2Ϊ����Ա
	private Date date;	//ע������
	private Date sysdate;//ʱ���

	

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public Date getSysdate() {
		return sysdate;
	}

	public void setSysdate(Date sysdate) {
		this.sysdate = sysdate;
	}

	public UserService getUserService() {
		return userService;
	}

	//����ҵ���߼����
	private UserService userService;
	//����ҵ���߼����
	public void setUserService (UserService userService){
		this.userService=userService;
	}
	private Student_infoService stuInfoService;
	public void setStudent_infoService(Student_infoService stuInfoService){
		this.stuInfoService= stuInfoService;
	}
	
	
	
	
	public String execute(){
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        
		List<User> list=(List<User>)userService.findAll();//����findAll()
		User u=new User(username, password);
		Iterator<User> it=list.iterator();
		while(it.hasNext()){
			u=(User)it.next();
			if(username.trim().equals(u.getUsername())&&password.trim().equals(u.getPassword())){
				session.put("username", u.getUsername());
				Student_info stu=stuInfoService.getStu(u.getStudent_number());
				session.put("student_name", stu.getStudent_name());
				session.put("student_number", stu.getStudent_number());
				session.put("photo_path", stu.getPhoto_path());
				session.put("sdept", stu.getSdept());
				session.put("smajor", stu.getSmajor());
				session.put("student_email", stu.getStudent_email());
				session.put("student_phone", stu.getStudent_phone());
				session.put("student_qq", stu.getStudent_qq());
				session.put("student_sex", stu.getStudent_sex());
				
				if(u.getFlag()==1){
					session.put("pression", "student");
					return "stusuccess";}
				if(u.getFlag()==2){
					session.put("pression", "op");
					return "opsuccess";
				}
				if(u.getFlag()==3){
					session.put("pression", "superop");
					return "superop";
				}
				if(u.getFlag()==0)
					return "failer";
			}
			else{
				return "failer";
			}
			
		}
		String page="failer";
		return page;
	}
}
