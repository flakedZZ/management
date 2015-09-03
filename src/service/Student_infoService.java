package service;

import java.util.List;

import entity.Student_info;



public interface Student_infoService {
	int saveStu(Student_info stu);
	Student_info getStu(int id,String name);
	Student_info getStu(int id);
	String delStu(int id);
	void updateStu(Student_info stu);
	Student_info findById(int id);
	List<Student_info> findAll();
}
