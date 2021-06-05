package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaInfo;
import Vista.VistaSalida;
import exe.MenuGeneral;

public class ControladorSalida implements ActionListener {

	private VistaSalida view;
	private MenuGeneral mg;
	
	public ControladorSalida(VistaSalida view) {

		this.view = view;
		this.view.btnVolver.addActionListener(this);
		this.view.btnSalir.addActionListener(this);

	}
	public void start() {
		view.setTitle("Proyecto Andrés");
		view.setLocationRelativeTo(null);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == view.btnVolver) {
			mg = new MenuGeneral();
			view.dispose();
			mg.showMenuPrincipal();
		
		}	
		if (e.getSource() == view.btnSalir) {
			view.dispose();
			MenuGeneral em = new MenuGeneral();
			System.exit(0);
		}
	}
}
