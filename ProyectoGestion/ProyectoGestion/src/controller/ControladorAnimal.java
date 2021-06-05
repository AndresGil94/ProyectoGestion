package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.VistaGestionAnimal;
import Vista.VistaGestionEmpleado;
import exe.MenuGeneral;
import model.Animales;
import model.AnimalesDAO;
import model.Empleado;
import model.EmpleadoDAO;

public class ControladorAnimal implements ActionListener {
	
	private Animales model;
	private AnimalesDAO modelConsulting;
	private VistaGestionAnimal view;
	
	public ControladorAnimal(Animales model, AnimalesDAO modelConsulting, VistaGestionAnimal view) {
		this.model = model;
		this.modelConsulting = modelConsulting;
		this.view = view;
		this.view.btnSiguiente.addActionListener(this);
		this.view.btnGuardar.addActionListener(this);
		this.view.btnBorrar.addActionListener(this);
		this.view.btnMenu.addActionListener(this);
		this.view.btnAtras.addActionListener(this);
		this.view.btnEditar.addActionListener(this);


	}
	public void start() {
		view.setTitle("Proyecto Andrés");
		view.setLocationRelativeTo(null);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == view.btnEditar) {
			model.setRazaAnimal(view.textRaza.getText());
			model.setPesoAnimal(Integer.parseInt(view.textPeso.getText()));
			model.setPaisOrigenAnimal(view.textPais.getText());
			model.setHabitatAnimal(view.textHabitat.getText());
			model.setEdadAnimal(Integer.parseInt(view.textEdad.getText()));
			
			if (modelConsulting.updateAnimales(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente editado");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al editar");
				clean();
			}
		}
		
		if (e.getSource() == view.btnGuardar) {
			String aux;
			aux = view.textRaza.getText();
			model.setRazaAnimal(view.textRaza.getText());
			model.setPesoAnimal(Integer.parseInt(view.textPeso.getText()));
			model.setPaisOrigenAnimal(view.textPais.getText());
			model.setHabitatAnimal(view.textHabitat.getText());
			model.setEdadAnimal(Integer.parseInt(view.textEdad.getText()));
			
		if (modelConsulting.createAnimales(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente añadido");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al añadir");
				clean();
			}
		}
		
		if (e.getSource() == view.btnBorrar) {
			model.setRazaAnimal(view.textRaza.getText());

			if (modelConsulting.deleteAnimales(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente eliminado");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al eliminar");
				clean();
			}
		}
		
		if (e.getSource() == view.btnMenu) {
			view.dispose();
			MenuGeneral mg = new MenuGeneral();

			mg.showMenuPrincipal();		
	
		}

	}
	public void clean() {
		view.textRaza.setText(null);
		view.textPeso.setText(null);
		view.textPais.setText(null);
		view.textHabitat.setText(null);
		view.textEdad.setText(null);

	}
}


