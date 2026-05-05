package test_fonctionnel;

import control.ControlConnecterClient;
import control.ControlCreerClient;
import control.ControlReserverTable;
import frontiere.BoundaryConnecterClient;
import frontiere.BoundaryCreerClient;
import frontiere.BoundaryReserverTable;
import model.CarnetClientele;
import model.Restaurant;

public class ScenarioTest {
	public static void main(String[] args) {
		CarnetClientele carnetClientele = new CarnetClientele();
		Restaurant restaurant = new Restaurant();
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(8);

		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientele);
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientele);
		ControlReserverTable controlReserverTable = new ControlReserverTable(restaurant, carnetClientele);

		BoundaryCreerClient boundaryCreerClient = new BoundaryCreerClient(controlCreerClient);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		BoundaryReserverTable boundaryReserverTable = new BoundaryReserverTable(controlReserverTable);
		
		System.out.println("---------- CREATION CLIENT ----------");
		boundaryCreerClient.creerClient();
		
		System.out.println("\n---------- CONNECTION CLIENT ----------");
		int numClient = boundaryConnecterClient.connecterClient();
		
		if (numClient != -1) {
			System.out.println("\n---------- RESERVER TABLE ----------");
			boundaryReserverTable.reserverTable(numClient);
			
			System.out.println("\n---------- CONTROL DES DONNEES ----------");
			System.out.println("Client");
			System.out.println(carnetClientele.getClient(numClient));
		} else {
			System.out.println("Echec de la connexion. Impossible de réserver.");
		}
	}
}
