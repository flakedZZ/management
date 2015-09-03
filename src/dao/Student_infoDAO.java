package dao;

import java.util.List;

import entity.Student_info;



public interface Student_infoDAO {
	int save(Student_info stu);
	Student_info getStudentInfo(int student_number,String student_name);//���������ѧ����Ϣ���ﲢû����
	Student_info getStudentInfo(int student_number);
	String delStudentInfo(int id);
	void update(Student_info stu);
	Student_info findById(int id);
	List<Student_info> findAll();
}
