package fr.esiea.ail.persistence;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.ail.model.Adresse;
import fr.esiea.ail.model.Contact;

public class PersistenceManager {

	private static List<Adresse> adresses = new ArrayList<Adresse>();
	public static List<Contact> contacts = new ArrayList<Contact>();
	
	static int contact_id = 0;
	static int adresse_id = 0;

	

	public static void saveContact(Contact contact) {
		String id = contact.getNom() + contact_id;
		contact.setId(id);
		contacts.add(contact);
		contact_id++;
	}

	public static void saveAdresse(Adresse adresse, String id) {
		String adr_id = "adresse" + adresse_id;
		adresse.setId(adr_id);
		adresse.setContact_id(id);
		adresses.add(adresse);
		adresse_id++;
	}
	public static Adresse getAdresse(String alias) {
		for(int i=0 ; i<adresses.size() ; i++)
			if(adresses.get(i).getAlias().equals(alias))
				return adresses.get(i);
		return null;
	}

	public static Contact getContact(int id) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId().equals(id)) {
				return contacts.get(i);
			}
		}
		return null;
	}
	
	public static List<Adresse> getContactAddressList(Contact contact){
		List<Adresse> contact_ad = new ArrayList<Adresse>();
		for(int i=0; i<adresses.size() ; i++){
			Adresse current_adresse = adresses.get(i);
			if(current_adresse.getContact_id().equals(contact.getId()))
				contact_ad.add(current_adresse);
		}
		
		return contact_ad;
	}

	public static Contact getContactById(String id){
		for(int i=0 ; i<contacts.size() ; i++)
			if(contacts.get(i).getId().equals(id))
				return contacts.get(i);					
	return null;
	}
	
	public static Adresse getAdresseById(String id){
		for(int i=0 ; i<adresses.size() ; i++)
			if(adresses.get(i).getId().equals(id))
				return adresses.get(i);					
	return null;
	}
	
	public static void deleteContact(Contact contact){
		contacts.remove(contact);
	}
	
	public static void deleteAdresse(Adresse adresse) {
		adresses.remove(adresse);
		
	}

	public static void setContacts(List<Contact> contacts) {
		PersistenceManager.contacts = contacts;
	}

	public static List<Contact> getContacts() {
		return contacts;
	}

	public static void modifContact(String id, Contact contact) {
		PersistenceManager.getContactById(id).setNom(contact.getNom());
		PersistenceManager.getContactById(id).setPrenom(contact.getPrenom());
	}

	public static void modifAdresse(String id, Adresse adresse) {
		PersistenceManager.getAdresseById(id).setRue(adresse.getRue());
		PersistenceManager.getAdresseById(id).setNumero(adresse.getNumero());
		PersistenceManager.getAdresseById(id).setCodepostal(adresse.getCodepostal());
		PersistenceManager.getAdresseById(id).setVille(adresse.getVille());
		
	}
}
