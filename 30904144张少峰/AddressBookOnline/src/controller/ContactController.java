package controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Contact;

import service.ContactService;
import utils.Page;

@Controller
public class ContactController {

	@Resource
	private ContactService contactService;
	
	
	@RequestMapping(value="index")
	public String index(HttpSession session,@RequestParam(required=false)Integer pageNo,@RequestParam(required=false)Integer pageSize,@RequestParam(required=false)String cname){
		if(pageNo==null){
			pageNo=1;
		}
		int pageCount = contactService.pageCount(cname);
		Page page = new Page();
		page.setPageNo(pageNo);
		page.setPageCount(pageCount);
		page.setPageSize(2);
		List<Contact> list = contactService.getAllContacts((page.getPageNo()-1)*page.getPageSize(), page.getPageSize(), cname);
		session.setAttribute("page", page);
		session.setAttribute("list", list);
		session.setAttribute("cname", cname);
		return "index";
	}
	
	@RequestMapping(value="add")
	public String add(@ModelAttribute("contact")Contact contact){
		return "add";
	}
	
	@RequestMapping(value="doAdd",method=RequestMethod.POST)
	public String doAdd(Contact contact){
		if(contactService.addContact(contact)>0){
			System.out.print("新增成功!");
			return "redirect:index";
		}
		System.out.print("新增失败!");
		return "add";
	}
	
	@RequestMapping(value="update")
	public String update(@ModelAttribute("contact")Contact contact,@RequestParam(required=false) Integer id,HttpSession session){
		Contact con = contactService.getContactById(id);
		session.setAttribute("con", con);
		return "update";
	}
	
	@RequestMapping(value="doUpdate",method=RequestMethod.POST)
	public String doUpdate(Contact contact){
		if(contactService.updateContact(contact)>0){
			System.out.print("修改成功!");
			return "redirect:index";
		}
		System.out.print("修改失败!");
		return "update";
	}
	
	
	
}
