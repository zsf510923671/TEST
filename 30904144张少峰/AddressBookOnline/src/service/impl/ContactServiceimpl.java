package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.ContactMapper;

import entity.Contact;

import service.ContactService;

@Service
public class ContactServiceimpl implements ContactService{

	@Resource
	private ContactMapper contactMapper;
	
	public List<Contact> getAllContacts(Integer pageNo, Integer pageSize,
			String cname) {
		// TODO Auto-generated method stub
		return contactMapper.getAllContacts(pageNo, pageSize, cname);
	}

	public int pageCount(String cname) {
		// TODO Auto-generated method stub
		return contactMapper.pageCount(cname);
	}

	public int addContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactMapper.addContact(contact);
	}

	public Contact getContactById(Integer id) {
		// TODO Auto-generated method stub
		return contactMapper.getContactById(id);
	}

	public int updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactMapper.updateContact(contact);
	}

}
