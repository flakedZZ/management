package service;

import java.util.List;

import dao.Depart_infoDAO;
import dao.Org_infoDAO;
import entity.Depart_info;
import entity.Org_info;

public class Depart_infoServiceImpl implements Depart_infoService{

	
	private Depart_infoDAO departInfoDAO;
	//提供student_infoDAO对象的注入通道
	public Depart_infoDAO getDepartInfoDAO() {
		return departInfoDAO;
	}

	public void setDepartInfoDAO(Depart_infoDAO departInfoDAO) {
		this.departInfoDAO = departInfoDAO;
	}
	@Override
	public void save(Depart_info depart) {
		// TODO Auto-generated method stub
				departInfoDAO.save(depart);
		
	}

	@Override
	public Depart_info getDepartInfo(int id) {
		// TODO Auto-generated method stub
		return departInfoDAO.getDepartInfo(id);
	}

	@Override
	public Depart_info getDepartInfo(String depart_name) {
		// TODO Auto-generated method stub
		return departInfoDAO.getDepartInfo(depart_name);
	}

	@Override
	public void delDepartInfo(int id) {
		// TODO Auto-generated method stub
		if(departInfoDAO.findById(id)!=null)
		{
			 departInfoDAO.delDepartInfo(id);
		}
		
		
	}

	@Override
	public void update(Depart_info depart) {
		// TODO Auto-generated method stub
	
			departInfoDAO.update(depart);
		
	}

	@Override
	public Depart_info findById(int id) {
		// TODO Auto-generated method stub
		return departInfoDAO.findById(id);
	}

	@Override
	public List<Depart_info> findAll() {
		// TODO Auto-generated method stub
		return departInfoDAO.findAll();
	}

	@Override
	public List<Depart_info> findSomeByOrg_id(int org_id) {
		// TODO Auto-generated method stub
		return departInfoDAO.findSomeByOrg_id(org_id);
	}
	
	

}
