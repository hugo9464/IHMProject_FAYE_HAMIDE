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
	public String ajoutContact(Model model)	{
		model.addAttribute("contact", new Contact());	
		return "contact";
	}
	
	
	@RequestMapping(value="/contact",method=RequestMethod.POST)
	public String contactSubmit(@ModelAttribute Contact contact, Model model){
		PersistenceManager.saveContact(contact);
		model.addAttribute(contact);
		return "addedcontact";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String contactDelete(@RequestParam("id") String id, Model model){
		Contact contact = PersistenceManager.getContactById(id);
		PersistenceManager.deleteContact(contact);
		model.addAttribute(contact);
		return "delete";
	}
	
	@RequestMapping(value="/modif",method=RequestMethod.GET)
	public String contactModif(@ModelAttribute Contact contact, @RequestParam("id") String id, Model model){
		contact = PersistenceManager.getContactById(id);
		model.addAttribute(contact);
		return "modif";
	}
	
	@RequestMapping(value="/modif",method=RequestMethod.POST)
	public String contactModifSubmit(@ModelAttribute Contact contact, @RequestParam("id") String id, Model model){
		PersistenceManager.modifContact(id, contact);
		Contact contact_a_modif = PersistenceManager.getContactById(id);
		model.addAttribute("contact",contact_a_modif);
		return "addedcontact";
	}
}