package dao;

import java.util.List;


import entity.Sign_info;

public interface Sign_infoDAO {
	void save(Sign_info sign);//保存报名信息
	void delSign_info(int id);//删除报名信息
	void update(Sign_info sign);//修改报名信息
	Sign_info findById(int sign_id);//根据id查找
	List<Sign_info> findSomeByStuId(int student_id);//查询单个学生用户的报名信息
	List<Sign_info> findSomeByDepartId(int department_id);//查询各个部门的报名情况
	List<Sign_info> findAll();//返回所有报名信息
	
}
