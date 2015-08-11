package test;

import java.util.List;

import service.Student_infoService;
import service.Student_infoServiceImpl;
import entity.Student_info;
import entity.User;

public class TestFindAllStudents {
	public static void main(String[] args) {
		
		Student_infoService us=new Student_infoServiceImpl();
		List<Student_info>  list=(List<Student_info>)us.findAll();
		if(list!=null)
		{
			for(Student_info st:list)
			{
				System.out.println(st.getStudent_name()+"    "+st.getStudent_email());
			}
		}
	
		
	}

}
