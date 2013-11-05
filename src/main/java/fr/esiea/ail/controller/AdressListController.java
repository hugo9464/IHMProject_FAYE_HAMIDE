package fr.esiea.ail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.esiea.ail.model.Contact;
import fr.esiea.ail.persistence.PersistenceManager;

@Controller
public class AdressListController {
	
	@RequestMapping(value = "/show_address", method = RequestMethod.GET)
	public String printAddress(@RequestParam("name") String name, ModelMap model) {
		
		Contact contact = PersistenceManager.getContactByName(name);
		model.addAttribute("adresses",PersistenceManager.getContactAddressList(contact));
		
		return "show_address";

	}
}