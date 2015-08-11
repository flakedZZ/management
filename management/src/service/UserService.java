package service;

import java.util.List;

import entity.User;

public interface UserService {
	void saveUser(User user);
	User getUser(String name);
	void delUser(int id);
	void updateUser(User user);
	User findById(int id);
	List<User> findAll();

}
