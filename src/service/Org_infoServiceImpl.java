package service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.Org_infoDAO;
import dao.Student_infoDAO;
import entity.Org_info;

public class Org_infoServiceImpl implements Org_infoService{

	
	private Org_infoDAO orgInfoDAO;
	//提供student_infoDAO对象的注入通道
	public void setOrg_infoDAO(Org_infoDAO orgInfoDAO){
		this.orgInfoDAO=orgInfoDAO;
	}
	@Override
	public void save(Org_info org) {
		// TODO Auto-generated method stub
	
			orgInfoDAO.save(org);
		
		
	}

	@Override
	public Org_info getStudentInfo(int id) {
		// TODO Auto-generated method stub
		return orgInfoDAO.getStudentInfo(id);
	}

	@Override
	public Org_info getStudentInfo(String org_name) {
		// TODO Auto-generated method stub
		return orgInfoDAO.getStudentInfo(org_name);
	}

	@Override
	public void delStudentInfo(int id) {
		if(orgInfoDAO.findById(id)!=null)
		{
			orgInfoDAO.delStudentInfo(id);
		}
		
	}

	@Override
	public void update(Org_info org) {
		// TODO Auto-generated method stub
		if(orgInfoDAO.findById(org.getOrg_id())!=null)
		{
			orgInfoDAO.update(org);
		}
		
	}

	@Override
	public Org_info findById(int id) {
		// TODO Auto-generated method stub
		return orgInfoDAO.findById(id);
	}

	@Override
	public List<Org_info> findAll() {
		// TODO Auto-generated method stub
		return orgInfoDAO.findAll();
	}

}
