package model;

public class CentraleReservation<P extends EntiteReservable<F>, F extends Formulaire> {

	private int nbEntites;
	private P[] entites;

	public CentraleReservation(P[] tableauEntites) {
		this.nbEntites = 0;
		this.entites = tableauEntites;
	}

	public int ajouterEntite(P entite) {
		entites[nbEntites] = entite;
		nbEntites++;
		entite.setNumero(nbEntites);
		return nbEntites;
	}

	public int[] donnerPossibilites(F formulaire) {
		int[] tableau = new int[nbEntites];

		for (int i = 0; i < nbEntites; i++) {
			if (entites[i].estLibre(formulaire) && entites[i].compatible(formulaire)) {
				tableau[i] = entites[i].getNumero();
			} else {
				tableau[i] = 0;
			}
		}
		return tableau;
	}

	public Reservation reserver(int numEntite, F formulaire) {
		int index = numEntite - 1;

		if (index >= 0 && index < nbEntites) {

			formulaire.setIdentificationEntite(numEntite);
			return entites[index].reserver(formulaire);
		}
		return null;
	}
}
