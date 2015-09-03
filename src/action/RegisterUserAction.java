package action;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import service.Student_infoService;
import service.UserService;
import util.FileUtil;
import entity.Student_info;
import entity.User;

public class RegisterUserAction {
	private FileUtil fileUtil;
	private int user_id	;//用户id
	private File image;//文件类型
	private String imageFileName;//文件名
	private String username;	//用户名
	private String password;	//密码
	private int flag;	//0为删除 1为学生 2为管理员
	private int student_number;//和student_info表里的学号关联
	private int student_id;//唯一编号，自增？
	private String student_name;//学生姓名
	private String student_sex;//性别
	private int student_qq;//qq
	private int student_phone;//手机
	private String student_email;//邮箱
	private String photo_path;
	private String sdept;
	private String smajor;
	private Date date;
	private String def1;//这三个是备用字段
	private String def2;
	private String def3;
	
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
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
		return ServletActionContext.getServletContext().getRealPath(photo_path);
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
	
	public FileUtil getFileUtil() {
		return fileUtil;
	}
	public void setFileUtil(FileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	//定义业务逻辑组件
	private UserService userService;
	private Student_infoService student_infoService;
	//设置业务逻辑组件
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
		//System.out.print(student_name);
		//照片上传部分
		String fileName = fileUtil.getFileName(imageFileName);//给文件名生成新名字，，
		String image_url = photo_path+ fileName;
		//真是路径
		String realPath =getPhoto_path();
		System.out.println(realPath);
		
		//默认注册用户权限为1【学生权限
		Student_info stuInfo=new Student_info(student_name,student_number,student_sex,
				student_qq, student_phone, student_email, image_url, sdept, smajor, date);
		User user=new User(username, password, date, student_number);
		user.setFlag(1);
		//存入数据库

		if(student_infoService.saveStu(stuInfo)==1&&userService.saveUser(user)==1)
		{
			
			fileUtil.uploadFile(image, fileName, realPath);
			System.out.println("文件上传了");
			return "success";
		}
		System.out.println("文件上传失败");
		return "failer";
	}
}
