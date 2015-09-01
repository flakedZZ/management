package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Depart_info;
import entity.Org_info;
import entity.Sign_info;
import entity.Student_info;

public class Sign_infoDAOImpl extends HibernateDaoSupport implements Sign_infoDAO{

	@Override
	public void save(Sign_info sign) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(sign);
		
	}

	@Override
	public void delSign_info(int id) {
		// TODO Auto-generated method stub
		if(this.findById(id)!=null)
		{
			this.getHibernateTemplate().delete(findById(id));
		}
		
	}

	@Override
	public void update(Sign_info sign) {
		if(this.findById(sign.getSignment_id())!=null)
		{
			this.getHibernateTemplate().update(sign);
		}
		
	}

	@Override
	public List<Sign_info> findSomeByStuId(int student_id) {
		// TODO Auto-generated method stub
		String hsql=" from Sign_info sign where sign.student_id='"+student_id+"'";
		List<Sign_info> list =(List<Sign_info>)this.getHibernateTemplate().find(hsql);
		return  list;
	}

	@Override
	public List<Sign_info> findSomeByDepartId(int department_id) {
		// TODO Auto-generated method stub
		String hsql="from Sign_info sign  where  sign.department_id='"+department_id+"'";
		List<Sign_info> list=(List<Sign_info>)this.getHibernateTemplate().find(hsql);
		return list;
	}

	@Override
	public List<Sign_info> findAll() {
		// TODO Auto-generated method stub
		String queryString ="select  sign from Sign_info sign";
		List<Sign_info> list =(List<Sign_info>)this.getHibernateTemplate().find(queryString);
		return list;
	}

	@Override
	public Sign_info findById(int sign_id) {
		// TODO Auto-generated method stub
		Sign_info sign =(Sign_info)this.getHibernateTemplate().get(Sign_info.class, sign_id);
		return sign;
	}

	
	

}
