package model;

public abstract class Formulaire {
	protected int jour;
	protected int mois;
	protected int numIdentite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getIdentificationEntite() {
		return numIdentite;
	}

	public void setIdentificationEntite(int numIdentite) {
		this.numIdentite = numIdentite;
	}
}
