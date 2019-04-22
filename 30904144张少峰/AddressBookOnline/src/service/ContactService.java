package service;

import java.util.List;


import entity.Contact;

public interface ContactService {
	public List<Contact> getAllContacts(Integer pageNo,Integer pageSize,String cname);
	
	public int pageCount(String cname);
	
	public int addContact(Contact contact);
	
	public Contact getContactById(Integer id);
	
	public int updateContact(Contact contact);
}
