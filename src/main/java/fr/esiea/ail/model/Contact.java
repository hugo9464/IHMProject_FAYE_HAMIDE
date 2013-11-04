package fr.esiea.ail.model;

import java.util.List;

public class Contact {

	private String nom;
	private String prenom;
	private Integer id;
	private List<Adresse> adresses;

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}
	
	public void addAdresse(Adresse adresse){
		adresses.add(adresse);
	}
	
	public void deleteAdresse(Adresse adresse){
		adresses.remove(adresse);
	}
}
