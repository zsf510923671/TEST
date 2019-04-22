package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Contact;

public interface ContactMapper {
	//查询联系人
	List<Contact> getAllContacts(@Param(value="pageNo") Integer pageNo,@Param(value="pageSize") Integer pageSize,@Param(value="cname") String cname);
	//查询记录条数
	int pageCount(@Param(value="cname") String cname);
	//新增联系人
	int addContact(Contact contact);
	//根据ID查询联系人
	Contact getContactById(@Param(value="id") Integer id);
	//修改联系人
	int updateContact(Contact contact);
}
