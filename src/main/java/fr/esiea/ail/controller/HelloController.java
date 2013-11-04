package fr.esiea.ail.controller;


import java.util.ArrayList;
import java.util.List;

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

		model.addAttribute("adresses",PersistenceManager.getAdresses());
		System.out.println(PersistenceManager.getAdresses().toString());
		return "hello";

	}
}