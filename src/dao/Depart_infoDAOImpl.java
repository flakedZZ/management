package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Depart_info;
import entity.Org_info;
import entity.Student_info;

public class Depart_infoDAOImpl extends HibernateDaoSupport implements Depart_infoDAO{

	@Override
	public void save(Depart_info depart) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(depart);
		
	}
//根据id查找部门
	@Override
	public Depart_info getDepartInfo(int id) {
		// TODO Auto-generated method stub
		String hsql="from Depart_info de where de.department_id='"+id+"'";
		List<Depart_info> list=(List<Depart_info>)this.getHibernateTemplate().find(hsql);
		Depart_info result=(Depart_info)list.get(0);
		return result;
	}
//根据名字查找部门
	@Override
	public Depart_info getDepartInfo(String depart_name) {
		// TODO Auto-generated method stub
		String  hsql="from Depart_info de where de.department_name='"+depart_name+"'";
		List<Depart_info> list=(List<Depart_info>)this.getHibernateTemplate().find(hsql);
		Depart_info result=(Depart_info)list.get(0);
		return result;
	}

	@Override
	public void delDepartInfo(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findById(id));
	}

	@Override
	public void update(Depart_info depart) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(depart);
	}

	@Override
	public Depart_info findById(int id) {
		// TODO Auto-generated method stub
		Depart_info department=(Depart_info)this.getHibernateTemplate().get(Depart_info.class, id);
		return department;
	}

	@Override
	public List<Depart_info> findAll() {
		// TODO Auto-generated method stub
		String queryString="select de from Depart_info de";
		List<Depart_info> list=(List<Depart_info>)this.getHibernateTemplate().find(queryString);
		return list;
	}
	//根据所属的组织id查找对应的部门
	@Override
	public List<Depart_info> findSomeByOrg_id(int org_id) {
		// TODO Auto-generated method stub
		String queryString="select de from  Depart_info de where de.org_id='"+org_id+"'";
		List<Depart_info> list=(List<Depart_info>)this.getHibernateTemplate().find(queryString);
		return list;
	}
	

	

}
