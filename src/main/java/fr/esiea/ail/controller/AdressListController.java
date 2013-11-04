package fr.esiea.ail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.esiea.ail.model.Contact;

@Controller
public class AdressListController {
	
	@RequestMapping(value = "/show_address", method = RequestMethod.GET)
	public String printAddress(@RequestParam("id") String id) {
		
		System.out.println("MARCHE" + id);
//		model.addAttribute("contacts",contact);
		return "hello";

	}
}