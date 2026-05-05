package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant>  {
	private CentraleReservation<Table, FormulaireRestaurant> centrale;
	
	
	public Restaurant() {
		Table[] tableauTables = new Table[100];
		this.centrale = new CentraleReservation<>(tableauTables);
	}

	public void ajouterTable(int nbChaise) {
		Table table = new Table(nbChaise);
		centrale.ajouterEntite(table);
	}

	@Override
	public int[] donnerPossibilites(FormulaireRestaurant f) {
		return centrale.donnerPossibilites(f);
	}

	@Override
	public Reservation reserver(int numEntite, FormulaireRestaurant f) {
		return centrale.reserver(numEntite, f);
	}
	
	private class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaise;
		private CalendrierAnnuel calendrierDeuxiemeService;

		public Table(int nbChaise) {
			super();
			this.nbChaise = nbChaise;
			this.calendrierDeuxiemeService = new CalendrierAnnuel();
		}

		@Override
		public Reservation reserver(FormulaireRestaurant f) {
			if (!(compatible(f))) {
				return null;
			}
			
			boolean reservationOk = false;
			if (f.getNumService()==1) {
				reservationOk = calendrier.reserver(f.getJour(), f.getMois());
			}
			else {
				reservationOk = calendrierDeuxiemeService.reserver(f.getJour(), f.getMois());
			}
			
			if (reservationOk) {
				return new ReservationRestaurant(f.getJour(), f.getMois(), f.getNumService(), this.numero);
			}
			
			return null;
		}

		@Override 
		public boolean estLibre(FormulaireRestaurant f) {
			if (f.getNumService() == 1) {
				return calendrier.estLibre(f.getJour(), f.getMois());
			}
			else {
				return calendrierDeuxiemeService.estLibre(f.getJour(), f.getMois());
			}
		}
		
		@Override
		public boolean compatible(FormulaireRestaurant f) {
			boolean taille = (nbChaise==f.getNombrePersonnes() || nbChaise == f.getNombrePersonnes() + 1);
			if (taille && estLibre(f)) {
				return true;
			}
			return false;
		}

	}
}
