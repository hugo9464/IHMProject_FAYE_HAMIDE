package fr.esiea.ail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.esiea.ail.model.Adresse;
import fr.esiea.ail.persistence.PersistenceManager;


@Controller

public class FormController {
	
	
	@RequestMapping(value="/adresse",method=RequestMethod.GET)
	public String ajoutAdresse(Model model)	{
		model.addAttribute("adresse", new Adresse());	
		model.addAttribute("contacts", PersistenceManager.getContacts());
		return "editAdresse";
	}
	
	
	@RequestMapping(value="/adresse",method=RequestMethod.POST)
	public String adresseSubmit(@ModelAttribute Adresse adresse, @RequestParam("id") String id, Model model){
		PersistenceManager.saveAdresse(adresse,id);
		model.addAttribute(adresse);
		return "added";
	}
	
	@RequestMapping(value="/deleteadr",method=RequestMethod.GET)
	public String adresseDelete(@RequestParam("id") String id, Model model){
		Adresse adresse = PersistenceManager.getAdresseById(id);
		PersistenceManager.deleteAdresse(adresse);
		model.addAttribute(adresse);
		return "deleteadr";
	}
	
	@RequestMapping(value="/modifadr",method=RequestMethod.GET)
	public String adresseModif(@ModelAttribute Adresse adresse, @RequestParam("id") String id, Model model){
		adresse = PersistenceManager.getAdresseById(id);
		model.addAttribute(adresse);
		return "modifadr";
	}
	
	@RequestMapping(value="/modifadr",method=RequestMethod.POST)
	public String adresseModifSubmit(@ModelAttribute Adresse adresse, @RequestParam("id") String id, Model model){
		PersistenceManager.modifAdresse(id, adresse);
		Adresse adresse_a_modif = PersistenceManager.getAdresseById(id);
		model.addAttribute("adresse",adresse_a_modif);
		return "added";
	}
		
}
	


