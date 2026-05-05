package dialog;

import interface_noyau_fonctionnel.AdaptateurDuNoyauFonctionnel;

import model.CarnetClientele;
import model.Restaurant;

import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import presentation.FrameReservation;

import control.ControlReserverTable;
import control.ControlVisualiserCarnetClientele;

public class DialogReservation {

	private FrameReservation frameReservation;
	private AdaptateurDuNoyauFonctionnel inf;

	private LocalDate date;
	private String time;
	private int nbPersons = -1;
	private int numTable = -1;
	private int numClient;

	public DialogReservation(AdaptateurDuNoyauFonctionnel inf) {
		this.inf = inf;
	}

	public void initDialog() {
		frameReservation = new FrameReservation();
		frameReservation.initFrame();
		frameReservation.setDialog(this);
		frameReservation.setVisible(true);
	}

	private void updateTables() {
		if (date != null && time != null && !time.isBlank() && nbPersons > 0) {
			String[] tablesDisponibles = inf.trouverTableDisponible(date.getDayOfMonth(), date.getMonthValue(),
					nbPersons, time);
			frameReservation.modifierListeTables(tablesDisponibles);
		}
	}

	public void handleDateSelectedEvent(LocalDate date) {
		this.date = date;
		updateTables();
	}

	public void handleTimeSelectedEvent(String time) {
		this.time = time;
		updateTables();
	}

	public void handleNumOfPersonsSelectedEvent(int nbPersons) {
		this.nbPersons = nbPersons;
		updateTables();
	}

	public void handleTableSelectedEvent(int numTable) {
		this.numTable = numTable;
		frameReservation.activerButonValider(true);
	}

	public void handleCancelEvent() {
		frameReservation.dispose();
	}

	public void handleValidationEvent() {
		if (date != null && time != null && nbPersons > 0 && numTable != -1) {
			String recap = "Réservation confirmée :\n Date : " + date + "\n" + "Heure : " + time + "\n" + "Table n° : "
					+ numTable;
			javax.swing.JOptionPane.showMessageDialog(frameReservation, recap);
			frameReservation.dispose();
		} else {
			JOptionPane.showMessageDialog(frameReservation,
					"la reservation est incomplète. Veuillez choisir une date, une heure, le nombre de personnes et une table.",
					"Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void handleUserConnected(int numClient) {
		this.numClient = numClient;
		frameReservation.setVisible(true);
	}

	public static void main(String[] args) {
		CarnetClientele carnet = new CarnetClientele();
		Restaurant resto = new Restaurant();
		
		ControlReserverTable controlReserver = new ControlReserverTable(resto, carnet);
		ControlVisualiserCarnetClientele controlVisu = new ControlVisualiserCarnetClientele(carnet);
		
		AdaptateurDuNoyauFonctionnel adaptateur = new AdaptateurDuNoyauFonctionnel(controlReserver, controlVisu);
		
		DialogReservation dialog = new DialogReservation(adaptateur);
		EventQueue.invokeLater(() -> {
			dialog.initDialog();
		});
	}

}