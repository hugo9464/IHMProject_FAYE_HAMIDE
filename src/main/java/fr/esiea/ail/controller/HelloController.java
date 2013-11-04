package fr.esiea.ail.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.esiea.ail.persistence.PersistenceManager;

@Controller
@RequestMapping({"/","/welcome"})
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("contacts",PersistenceManager.getContacts());
		System.out.println(PersistenceManager.contacts.toString());
		return "hello";

	}
}