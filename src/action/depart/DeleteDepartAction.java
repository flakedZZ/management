package action.depart;


import java.util.Date;
import java.util.List;
import java.util.Map;

import service.Depart_infoService;
import service.Org_infoService;

import com.opensymphony.xwork2.ActionContext;

import entity.Depart_info;
import entity.Org_info;

public class DeleteDepartAction {
	private int department_id;
	private int org_id;
	

	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}


	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}


	//定义业务逻辑组件
	private Depart_infoService depart_infoService;
	
	//设置业务逻辑组件
	public Depart_infoService getDepart_infoService() {
		return depart_infoService;
	}
	public void setDepart_infoService(Depart_infoService depart_infoService) {
		this.depart_infoService = depart_infoService;
	}
	
	
	public String execute(){
		depart_infoService.delDepartInfo(department_id);
		return "success";
	}
	
}
