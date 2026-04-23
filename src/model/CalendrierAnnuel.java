package model;

public class CalendrierAnnuel {
	
	private Mois[] calendrier;
 
	private static final int[] JOURSMOIS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final String[] MOIS = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
	
	public CalendrierAnnuel(Mois[] calendrier) {
		this.calendrier = calendrier;
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois-1].estLibre(jour);
			return true;
		}
		else {
			return false;
		}
	}	
}
