package service;

import java.util.List;

import dao.UserDAO;
import dao.Student_infoDAO;
import entity.Student_info;

public class Student_infoServiceImpl implements Student_infoService{
	private Student_infoDAO stuInfoDAO;
	//提供student_infoDAO对象的注入通道
	public void setStudent_infoDAO(Student_infoDAO stuInfoDAO){
		this.stuInfoDAO=stuInfoDAO;
	}
	@Override
	public void saveStu(Student_info stu) {
		// TODO Auto-generated method stub
		if(stuInfoDAO.findById(stu.getStudent_id())==null){
			stuInfoDAO.save(stu);
		}
	}

	@Override
	public Student_info getStu(int id,String name) {
		// TODO Auto-generated method stub
		return stuInfoDAO.getStudentInfo(id,name);
	}

	@Override
	public void delStu(int id) {
		// TODO Auto-generated method stub
		if(stuInfoDAO.findById(id)!=null){
			stuInfoDAO.delStudentInfo(id);
		}
	}

	@Override
	public void updateStu(Student_info stu) {
		// TODO Auto-generated method stub
		if(stuInfoDAO.findById(stu.getStudent_id())!=null){
			stuInfoDAO.update(stu);
		}
	}

	@Override
	public Student_info findById(int id) {
		// TODO Auto-generated method stub
		return stuInfoDAO.findById(id);
	}

	@Override
	public List<Student_info> findAll() {
		// TODO Auto-generated method stub
		return stuInfoDAO.findAll();
	}
	@Override
	public Student_info getStu(int id) {
		// TODO Auto-generated method stub
		return stuInfoDAO.getStudentInfo(id);
	}

}
