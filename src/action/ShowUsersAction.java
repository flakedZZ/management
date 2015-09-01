package action;

import java.util.List;
import java.util.Map;

import service.Student_infoService;

import com.opensymphony.xwork2.ActionContext;

import entity.Student_info;

public class ShowUsersAction {
	
	//×¢Èë
		private Student_infoService student_infoService;
	
	public Student_infoService getStudent_infoService() {
			return student_infoService;
		}

		public void setStudent_infoService(Student_infoService student_infoService) {
			this.student_infoService = student_infoService;
		}



	public String execute(){
		ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
		List<Student_info> list=student_infoService.findAll();
		session.put("stuList", list);
		return "success";
	}
}
