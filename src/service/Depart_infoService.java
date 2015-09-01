package service;

import java.util.List;

import entity.Depart_info;
import entity.Org_info;

public interface Depart_infoService {
	void save(Depart_info depart);
	Depart_info getDepartInfo(int id);
	Depart_info getDepartInfo(String depart_name);
	void delDepartInfo(int id);
	void update(Depart_info depart);
	Depart_info findById(int id);
	List<Depart_info> findAll();
	List<Depart_info> findSomeByOrg_id(int org_id);
}
