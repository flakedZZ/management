package dao;

import java.util.List;

import entity.User;

public interface UserDAO {
	void save(User user);
	User getUser(String name);
	void delUser(int id);
	void update(User user);
	User findById(int id);
	List<User> findAll();
}
