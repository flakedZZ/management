package entity;

import java.util.Date;

//hibernate持久化类
public class User {
	private int user_id	;//用户id
	private String username;	//用户名
	private String password;	//密码
	private int flag;	//0为删除 1为学生 2为管理员
	private Date date;	//注册日期
	private Date sysdate;//时间戳
	private int student_number;//和student_info表里的学号关联

	//for all arg
	public User(int user_id, String username, String password, int flag,
			Date date, Date sysdate,int student_number) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.flag = flag;
		this.date = date;
		this.sysdate = sysdate;
		this.student_number=student_number;
	}
	//no-arg 
	public User(){
		
	}
	//for login action
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


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
	
	public int getStudent_number(){
		return student_number;
	}
	public void setStudent_number(int student_number){
		this.student_number=student_number;
	}
	public User(String username, String password, Date date, int student_number) {
		super();
		this.username = username;
		this.password = password;
		this.date = date;
		this.student_number = student_number;
	}

	

}
