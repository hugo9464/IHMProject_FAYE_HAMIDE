package fr.esiea.ail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.esiea.ail.model.Contact;
import fr.esiea.ail.persistence.PersistenceManager;


@Controller

public class ContactController {
	
	
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public String ajoutAdresse(Model model)	{
		model.addAttribute("contact", new Contact());	
		return "contact";
	}
	
	
	@RequestMapping(value="/contact",method=RequestMethod.POST)
	public String adresseSubmit(@ModelAttribute Contact contact, Model model){
		PersistenceManager.saveContact(contact);
		model.addAttribute(contact);
		return "addedcontact";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String adresseDelete(@RequestParam("name") String name, Model model){
		Contact contact = PersistenceManager.getContactByName(name);
		PersistenceManager.deleteContact(contact);
		model.addAttribute(contact);
		return "delete";
	}
		
}
	


