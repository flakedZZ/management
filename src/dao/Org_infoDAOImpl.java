package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Org_info;
import entity.Student_info;

public class Org_infoDAOImpl extends HibernateDaoSupport implements Org_infoDAO{

	@Override
	public void save(Org_info org) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(org);
	}

	//根据id查找某一个组织对象
	@Override
	public Org_info getStudentInfo(int id) {
		// TODO Auto-generated method stub
		String hsql="from Org_info u where u.org_id='"+
		id+"'";
		List <Org_info> list=(List <Org_info>) (this.getHibernateTemplate().find(hsql));
		Org_info result=(Org_info)list.get(0);		
		return result;
	}
//根据名字查找某一个组织对象
	@Override
	public Org_info getStudentInfo(String org_name) {
		// TODO Auto-generated method stub
		String hsql="from Org_info u where u.org_name='"+
				org_name+"'";
				List <Org_info> list=(List <Org_info>) (this.getHibernateTemplate().find(hsql));
				Org_info result=(Org_info)list.get(0);		
				return result;
	}
//根据id删除组织
	@Override
	public void delStudentInfo(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findById(id));
	}
//根据id更新组织
	@Override
	public void update(Org_info org) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(org);
	}
//根据id查找单一对象
	@Override
	public Org_info findById(int id) {
		// TODO Auto-generated method stub
		Org_info org=(Org_info)this.getHibernateTemplate().get(Org_info.class, id);
		return org;
	}
//查找所有的组织信息
	@Override
	public List<Org_info> findAll() {
		// TODO Auto-generated method stub
		String queryString="select u from Org_info u";
		List<Org_info> list=this.getHibernateTemplate().find(queryString);
		return list;
	}

}
