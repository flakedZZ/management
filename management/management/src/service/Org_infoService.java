package service;

import java.util.List;

import entity.Org_info;

public interface Org_infoService {
	void save(Org_info org);
	Org_info getStudentInfo(int id);
	Org_info getStudentInfo(String org_name);
	void delStudentInfo(int id);
	void update(Org_info org);
	Org_info findById(int id);
	List<Org_info> findAll();
}
