package fr.esiea.ail.persistence;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.ail.model.Adresse;
import fr.esiea.ail.model.Contact;

public class PersistenceManager {

	private static List<Adresse> adresses = new ArrayList<Adresse>();
	public static List<Contact> contacts = new ArrayList<Contact>();

	public static void saveAdresse(Adresse adresse, String name) {
		System.out.println("putting address adresse : " + adresse);
		adresses.add(adresse);
	}

	public static void saveContact(Contact contact) {
		System.out.println("putting nom : " + contact.getNom());
		contacts.add(contact);
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
			if(current_adresse.getContact_name().equals(contact.getNom()))
				contact_ad.add(current_adresse);
		}
		
		return contact_ad;
	}

	public static Contact getContactByName(String name){
		for(int i=0 ; i<contacts.size() ; i++)
			if(contacts.get(i).getNom().equals(name))
				return contacts.get(i);					
	return null;
	}

	public static void setContacts(List<Contact> contacts) {
		PersistenceManager.contacts = contacts;
	}

	public static List<Contact> getContacts() {
		return contacts;
	}


}
