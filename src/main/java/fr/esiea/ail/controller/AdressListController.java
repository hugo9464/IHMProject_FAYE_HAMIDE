package fr.esiea.ail.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.esiea.ail.model.Adresse;
import fr.esiea.ail.model.Contact;
import fr.esiea.ail.persistence.PersistenceManager;

@Controller
public class AdressListController {
	
	@RequestMapping(value = "/show_address", method = RequestMethod.GET)
	public String printAddress(@RequestParam("name") String name, ModelMap model) {
		
		Contact contact = PersistenceManager.getContactByName(name);
		System.out.println("MARCHE   " + contact.toString()+contact.getAdresses().toString());
		//model.addAttribute("adresses",contact.getAdresses());
		return "show_address";

	}
}