package dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Student_info;
import entity.User;

public class Student_infoDAOImpl extends HibernateDaoSupport implements Student_infoDAO{

	@Override
	public void save(Student_info stu) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(stu);
	}

	//@Override
	//public Student_info getStudentInfo(String name) {
		// TODO Auto-generated method stub
	//	String hsql="from Student_info u where u.student_name='"+name+"'";
	//	Student_info result=(Student_info) ((Query)this.getHibernateTemplate().find(hsql)).uniqueResult();
	//	return result;
	//}

	@Override
	public void delStudentInfo(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findById(id));
	}

	@Override
	public void update(Student_info stu) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(stu);
	}
	

	@Override
	public Student_info findById(int id) {
		// TODO Auto-generated method stub
		Student_info stu=(Student_info)this.getHibernateTemplate().get(Student_info.class, id);
		return stu;
	}

	@Override
	public List<Student_info> findAll() {
		// TODO Auto-generated method stub
		String queryString="select u from Student_info u";
		List<Student_info> list=this.getHibernateTemplate().find(queryString);
		return list;
	}

	@Override
	public Student_info getStudentInfo(int student_number,String student_name) {
		// TODO Auto-generated method stub
		//String hql = "from Student_info u where u.student_number='"+student_number+"'";// HQLÓï¾ä
		//List<Student_info> list=this.getHibernateTemplate().find(hql);
		//return list;
		String hsql="from Student_info u where u.student_number='"+
		student_number+"' and u.student_name='"+student_name+"'";
		List <Student_info> list=(List <Student_info>) (this.getHibernateTemplate().find(hsql));
		Student_info result=(Student_info)list.get(0);		
		return result;
	}

	@Override
	public Student_info getStudentInfo(int student_number) {
		// TODO Auto-generated method stub
		Student_info result;
		String hsql="from Student_info u where u.student_number='"+student_number+"'";
		List<Student_info> list =(List<Student_info>)this.getHibernateTemplate().find(hsql);
		result=(Student_info)list.get(0);
		return result;
	}

}
