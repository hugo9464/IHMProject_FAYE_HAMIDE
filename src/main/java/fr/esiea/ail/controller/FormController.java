package fr.esiea.ail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.esiea.ail.model.Adresse;
import fr.esiea.ail.persistence.PersistenceManager;


@Controller

public class FormController {
	
	
	@RequestMapping(value="/adresse",method=RequestMethod.GET)
	public String ajoutAdresse(Model model)	{
		model.addAttribute("adresse", new Adresse());	
		return "editAdresse";
	}
	
	
	@RequestMapping(value="/adresse",method=RequestMethod.POST)
	public String adresseSubmit(@ModelAttribute Adresse adresse, Model model){
		PersistenceManager.saveAdresse(adresse);
		model.addAttribute(adresse);
		return "added";
	}		
		
}
	


