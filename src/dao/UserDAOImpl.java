package dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Student_info;
import entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		String hsql="from User u where u.username='"+name+"'";
		//User result=(User) ((Query)this.getHibernateTemplate().find(hsql)).uniqueResult();

		List <User> list=(List <User>) (this.getHibernateTemplate().find(hsql));
		if(list.size()==1){
		User result=(User)list.get(0);		
		return result;}
		else
			return null;
	}

	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findById(id));
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		User user=(User)this.getHibernateTemplate().get(User.class, id);
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		String queryString="select u from User u";
		List<User> list=this.getHibernateTemplate().find(queryString);
		return list;
	}
	

}
