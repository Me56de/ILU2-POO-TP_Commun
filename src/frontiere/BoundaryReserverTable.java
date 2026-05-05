package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	private ControlReserverTable controlReserverTable;
	private Scanner scanner = new Scanner(System.in);
	
	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}
	
	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez-vous réserver");
		System.out.println("Pour quel mois ? ");
		int mois = scanner.nextInt();
		System.out.println("Pour quel jour ? ");
		int jour = scanner.nextInt();
		System.out.println("Pour combien de personnes ? ");
		int nbPersonnes = scanner.nextInt();
		System.out.println("Pour quel service ? ");
		int numService = scanner.nextInt();
		
		int[] retour = controlReserverTable.trouverPossibilite(jour, mois, nbPersonnes, numService);
		int numeroFormulaire = retour[0];
		System.out.println("Tables disponibles :");
		for (int i = 1; i< retour.length; i++) {
			if (retour[i] !=0) {
				System.out.println("Numéro de table : " + retour[i]);
			}
		}
		
		System.out.println("Choisissez votre table : ");
		int numTable = scanner.nextInt();
		
		controlReserverTable.reserver(numClient, numTable, numeroFormulaire);
		System.out.println("Réservation effectuée.");
	}
}
