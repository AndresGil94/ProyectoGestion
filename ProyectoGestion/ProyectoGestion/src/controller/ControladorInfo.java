package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaInfo;
import exe.MenuGeneral;

public class ControladorInfo implements ActionListener {

	private VistaInfo view;
	private MenuGeneral mg;
	
	public ControladorInfo(VistaInfo view) {
		
		this.view = view;
		this.view.btnVolver.addActionListener(this);
		
	}
	public void start() {
		view.setTitle("Proyecto Andrés");
		view.setLocationRelativeTo(null);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.btnVolver) {
			view.dispose();
			MenuGeneral mg = new MenuGeneral();

			mg.showMenuPrincipal();		
	
		}
	}
}
