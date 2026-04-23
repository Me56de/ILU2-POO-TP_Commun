package model;

public class Mois {
	private String nom;
	private boolean[] jours;
	
	
	
	public Mois(String nom, int nbJours) {
		this.nom = nom;
		this.jours = new boolean[nbJours];
		for (int i=0 ;i<nbJours; i++) {
			jours[i] = true;
		}
	}
	


	public boolean estLibre(int jour) {
		return jours[jour-1];
	}
	
	
	public void reserver(int jour) {
		if (!(estLibre(jour))) {
			throw new IllegalArgumentException();
		}
	}
}
