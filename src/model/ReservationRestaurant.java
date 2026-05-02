package model;

public class ReservationRestaurant extends Reservation{
	int numService;
	int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}

	@Override
	public String toString() {
		String service = (numService==1) ? "premier" : "deuxi�me";
		return "Le " + jour + "/" + mois + "\nTable " +numTable+ " pour le "+service+" service." ;
	}
	
	
}
