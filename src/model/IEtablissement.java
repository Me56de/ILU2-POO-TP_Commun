package model;

public interface IEtablissement<T> {
	public int[] donnerPossibilites(FormulaireRestaurant f);
	public Reservation reserver(int numEntite, FormulaireRestaurant f);
}
