package test;

import dao.Org_infoDAO;
import dao.Org_infoDAOImpl;
import entity.Org_info;

public class TestSaveOri {
	public static void main(String[] args) {
		Org_info org=new Org_info();
		Org_infoDAO dao=new Org_infoDAOImpl();
		org.setOrg_name("ÓÒ¼ü");
		org.setOrg_admin("¹ù·½¾ü");
		dao.save(org);
		
	}

}
