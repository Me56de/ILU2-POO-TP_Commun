package model;

public class CalendrierAnnuel {
	 
	private static final int[] JOURSMOIS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final String[] MOIS = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
	
	private Mois[] calendrier;

	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		
		for (int i=0; i<MOIS.length;i++) {
			calendrier[i] = new Mois(MOIS[i], JOURSMOIS[i]);
		}
	}

	// PRIVATE CLASS MOIS
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois (String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}
		
		private boolean estLibre(int jour) {
			return ! jours[jour-1];
		}
		
		private void reserver(int jour) {
			if (!(estLibre(jour))) {
				throw new IllegalStateException("Jour déjà réservé !\n");
			}
			else {
				jours[jour-1] = true;
				System.out.println("Réservation pris en compte !\n");
			}
		}	
 	}	// FIN
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois-1].reserver(jour);
			return true;
		}
		return false;
	}
}
