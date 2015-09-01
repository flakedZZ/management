package dao;

import java.util.List;


import entity.Sign_info;

public interface Sign_infoDAO {
	void save(Sign_info sign);//���汨����Ϣ
	void delSign_info(int id);//ɾ��������Ϣ
	void update(Sign_info sign);//�޸ı�����Ϣ
	Sign_info findById(int sign_id);//����id����
	List<Sign_info> findSomeByStuId(int student_id);//��ѯ����ѧ���û��ı�����Ϣ
	List<Sign_info> findSomeByDepartId(int department_id);//��ѯ�������ŵı������
	List<Sign_info> findAll();//�������б�����Ϣ
	
}
