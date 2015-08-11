package service;

import java.util.List;

import dao.UserDAO;
import entity.User;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	//提供UserDAO对象的注入通道
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	@Override
	//添加用户
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		if(userDAO.findById(user.getUser_id())==null){
			userDAO.save(user);
		}
	}

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		return userDAO.getUser(name);
	}

	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		if(userDAO.findById(id)!=null){
			userDAO.delUser(id);
		}
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		if(userDAO.findById(user.getUser_id())!=null){
			userDAO.update(user);
		}
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

}
