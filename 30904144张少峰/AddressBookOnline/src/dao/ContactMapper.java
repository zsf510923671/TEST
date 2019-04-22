package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Contact;

public interface ContactMapper {
	//��ѯ��ϵ��
	List<Contact> getAllContacts(@Param(value="pageNo") Integer pageNo,@Param(value="pageSize") Integer pageSize,@Param(value="cname") String cname);
	//��ѯ��¼����
	int pageCount(@Param(value="cname") String cname);
	//������ϵ��
	int addContact(Contact contact);
	//����ID��ѯ��ϵ��
	Contact getContactById(@Param(value="id") Integer id);
	//�޸���ϵ��
	int updateContact(Contact contact);
}
