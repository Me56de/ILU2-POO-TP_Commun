package model;

public abstract class EntiteReservable <F extends Formulaire> {
	protected CalendrierAnnuel calendrier;
	protected int numero;
	
	public EntiteReservable() {
		this.calendrier = new CalendrierAnnuel();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract Reservation reserver(F formulaire);
	public abstract boolean compatible(F formulaire);
	
}
