package action;

import java.util.List;

import service.Org_infoService;
import entity.Org_info;



public class FindAllOrgsAction{
	
	private  Org_infoService org_infoService;
	private List<Org_info>   list;
	public Org_infoService getOrg_infoService() {
		return org_infoService;
	}

	public void setOrg_infoService(Org_infoService org_infoService) {
		this.org_infoService = org_infoService;
	}

	public List<Org_info> getList() {
		return list;
	}

	public void setList(List<Org_info> list) {
		this.list = list;
	}

	public String execute()
	{
		  list=(List<Org_info>)org_infoService.findAll();
		return "success";
	}

}
