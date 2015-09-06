package action;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;

import com.opensymphony.xwork2.ActionContext;

import entity.Student_info;
import entity.User;
import service.Student_infoService;
import util.FileUtil;
/*
 * 这个action虽然名字是update但是实际上会同时接管save方法和update方法
 * 
 */
public class UpdateStuInfoAction {
	private FileUtil fileUtil;
	private int student_id;//唯一编号，自增？
	private String student_name;//学生姓名
	private File image;//文件类型
	private String imageFileName;//文件名
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
	private String student_numberStr=student_number+"";
	//此行以下为setget方法
	
	public int getStudent_id() {
		return student_id;
	}
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

	public FileUtil getFileUtil() {
		return fileUtil;
	}
	public void setFileUtil(FileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}


	//此行以上为setget方法
	//定义业务逻辑组件
	private Student_infoService student_infoService;
	//设置业务逻辑组件
	public void setStudent_infoService(Student_infoService stuInfoService){
		this.student_infoService=stuInfoService;
	}
	
	
	
	
	public String execute(){
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
		Student_info result=student_infoService.getStu(student_number);
	
		//和user表挂钩，所以不会出现学号错误的情况
		result.setStudent_name(student_name);
		//result.setPhoto_path(image_url);
		result.setSdept(sdept);
		result.setSmajor(smajor);
		result.setStudent_email(student_email);
		result.setStudent_phone(student_phone);
		result.setStudent_qq(student_qq);
		result.setStudent_sex(student_sex);
		
  		 if(image == null){
  		    String new_image_url=result.getPhoto_path();
  			
  			session.put("photo_path", new_image_url);
  			
		
  			student_infoService.updateStu(result);//就更新这个对象
  			return "success";
	}
	else{
		String old_image_url =result.getPhoto_path();
		
		String newFileName = fileUtil.getFileName(imageFileName);
		 String new_image_url = photo_path + newFileName;
		result.setPhoto_path(new_image_url);
		session.put("photo_path",new_image_url);
		
		student_infoService.updateStu(result);//就更新这个对象
		
		if(old_image_url != null){
			
			//删除原来的图片
			fileUtil.deleteFile(getPhoto_path(), old_image_url);
			//上传新的图片
			fileUtil.uploadFile(image, newFileName, getPhoto_path());
			}
		return "success";
		}
	}
	
}
