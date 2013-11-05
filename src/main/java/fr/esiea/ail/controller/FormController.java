package fr.esiea.ail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.esiea.ail.model.Adresse;
import fr.esiea.ail.model.Contact;
import fr.esiea.ail.persistence.PersistenceManager;


@Controller

public class FormController {
	
	
	@RequestMapping(value="/adresse",method=RequestMethod.GET)
<<<<<<< HEAD
	public String ajoutAdresse(@RequestParam("name") String name, Model model)	{
		Adresse adresse = new Adresse();
		adresse.setContact_name(name);
		model.addAttribute("adresse", adresse);	
=======
	public String ajoutAdresse(Model model)	{
		model.addAttribute("adresse", new Adresse());	
		model.addAttribute("contacts", PersistenceManager.getContacts());
>>>>>>> ajout du css
		return "editAdresse";
	}
	
	
	@RequestMapping(value="/adresse",method=RequestMethod.POST)
	public String adresseSubmit(@ModelAttribute Adresse adresse, @RequestParam("name") String name, Model model){
		adresse.setContact_name(name);
		System.out.println("name"+name);
		PersistenceManager.saveAdresse(adresse,name);
		model.addAttribute(adresse);
		
		Contact contact = new Contact();
		contact.addAdresse(adresse);
		return "added";
	}		
		
}
	


