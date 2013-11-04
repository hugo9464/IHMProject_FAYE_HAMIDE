package fr.esiea.ail.model;

import java.util.List;
import java.util.Map;

public class Carnet {
	private Map<Integer, List<Adresse>> carnet;
	
	public Map<Integer, List<Adresse>> getCarnet() {
		return carnet;
	}

	public void setCarnet(Map<Integer, List<Adresse>> carnet) {
		this.carnet = carnet;
	}
	
	public void addElement(Contact contact){
		carnet.put(contact.getId(), contact.getAdresses());
	}
	
	public String deleteElement(Contact contact){
		if(contact.getAdresses().isEmpty()){
			carnet.remove(contact.getId());
			return "Contact supprimé";
		}
		return "Carnet d'adresse du contact non vide";
	}

}
