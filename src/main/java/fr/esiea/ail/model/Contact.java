package fr.esiea.ail.model;


public class Contact {

	private String nom;
	private String prenom;
	private String id;

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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String toString(){
		return nom+"  " +prenom +" "+id;
	}
}
