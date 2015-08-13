package test;

import java.util.List;

import service.UserService;
import service.UserServiceImpl;
import entity.User;

public class TestFindAllUsers {
	public static void main(String[] args) {
		
		UserService us=new UserServiceImpl();
		List<User> list=(List<User>)us.findAll();
		if(list!=null)
		{
			for(User u:list)
			{
				System.out.println(u.getUsername()+"  "+u.getPassword());
			}
		}
	
		
	}

}
