package fr.esiea.ail.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.esiea.ail.model.Adresse;
import fr.esiea.ail.model.Contact;

public class PersistenceManager {
	
	private static HashMap<String,Adresse> adresses = new HashMap<String,Adresse>();
	public static List<Contact> contacts = new ArrayList<Contact>();
	
	public static void saveAdresse(Adresse adresse){
		System.out.println("putting address : "+adresse.getAlias());
		adresses.put(adresse.getAlias(), adresse);
	}
	
	public static void saveContact(Contact contact){
		System.out.println("putting nom : "+contact.getNom());
		contacts.add(contact);
	}
	
	public static Adresse getAdresse(String alias){
		return adresses.get(alias);
	}
	

	public static Contact getContact(int id) {
		for(int i=0; i<contacts.size();i++){
			if( contacts.get(i).getId().equals(id)){
				return contacts.get(i);			
			}
		}
				return null;
	}

	public static void setContacts(List<Contact> contacts) {
		PersistenceManager.contacts = contacts;
	}

	public static List<Contact> getContacts() {
		return contacts;
	}
	
	public static HashMap<String,Adresse> getAdresses() {
		return adresses;
	}
	

}
