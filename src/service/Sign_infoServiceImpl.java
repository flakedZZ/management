package service;

import java.util.List;

import dao.Org_infoDAO;
import dao.Sign_infoDAO;
import entity.Org_info;
import entity.Sign_info;

public class Sign_infoServiceImpl implements Sign_infoService{

	
	private Sign_infoDAO signInfoDAO;
	//提供student_infoDAO对象的注入通道
	public Sign_infoDAO getSignInfoDAO() {
		return signInfoDAO;
	}

	public void setSignInfoDAO(Sign_infoDAO signInfoDAO) {
		this.signInfoDAO = signInfoDAO;
	}
	
	//重写方法
	@Override
	public void save(Sign_info sign) {
		// TODO Auto-generated method stub
		signInfoDAO.save(sign);
	}

	@Override
	public void delSign_info(int id) {
		// TODO Auto-generated method stub
		if(signInfoDAO.findById(id)!=null)
		{
			signInfoDAO.delSign_info(id);
		}
	
	}

	@Override
	public void update(Sign_info sign) {
		// TODO Auto-generated method stub
		if(signInfoDAO.findById(sign.getSignment_id())!=null)
		{
			signInfoDAO.update(sign);
		}
	
	}

	@Override
	public Sign_info findById(int sign_id) {
		// TODO Auto-generated method stub
		return signInfoDAO.findById(sign_id);
	}

	@Override
	public List<Sign_info> findSomeByStuId(int student_id) {
		// TODO Auto-generated method stub
		return signInfoDAO.findSomeByStuId(student_id);
	}

	@Override
	public List<Sign_info> findSomeByDepartId(int department_id) {
		// TODO Auto-generated method stub
		return signInfoDAO.findSomeByDepartId(department_id);
	}

	@Override
	public List<Sign_info> findAll() {
		// TODO Auto-generated method stub
		return signInfoDAO.findAll();
	}
	
	

	

}
