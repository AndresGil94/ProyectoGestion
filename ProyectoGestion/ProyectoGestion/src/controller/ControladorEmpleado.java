package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import Vista.VistaGestionEmpleado;
import exe.MenuGeneral;
import model.Empleado;
import model.EmpleadoDAO;

public class ControladorEmpleado implements ActionListener {

	private Empleado model;
	private EmpleadoDAO modelConsulting;
	private VistaGestionEmpleado view;
	
	public ControladorEmpleado(Empleado model, EmpleadoDAO modelConsulting, VistaGestionEmpleado view) {
		this.model = model;
		this.modelConsulting = modelConsulting;
		this.view = view;
		this.view.btnEditar.addActionListener(this);
		this.view.btnGuardar.addActionListener(this);
		this.view.btnBorrar.addActionListener(this);
		this.view.btnAtras.addActionListener(this);
		this.view.comboBox.addActionListener(this);
		this.view.btnSiguiente.addActionListener(this);
		this.view.btnMenu.addActionListener(this);


	}
	public void start() {
		view.setTitle("Proyecto Andrés");
		view.setLocationRelativeTo(null);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == view.btnGuardar) {
			String aux;
			aux = view.textDni.getText();
			model.setDniEmpleado(view.textDni.getText());
			model.setNombreEmpleado(view.textNombre.getText());
			model.setFormacionEmpleado(view.textFormacion.getText());
			model.setAntiguedadEmpleado(Integer.parseInt(view.textAntiguedad.getText()));
			model.setPuestoEmpleado(view.comboBox.getToolTipText());
			
			if (modelConsulting.createEmpleado(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente añadido");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al añadir");
				clean();
			}
		}
		
		if (e.getSource() == view.btnBorrar) {
			model.setDniEmpleado(view.textDni.getText());

			if (modelConsulting.deleteEmpleado(model)) {
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
		
		if (e.getSource() == view.btnEditar) {
			model.setDniEmpleado(view.textDni.getText());
			model.setNombreEmpleado(view.textNombre.getText());
			model.setFormacionEmpleado(view.textFormacion.getText());
			model.setAntiguedadEmpleado(Integer.parseInt(view.textAntiguedad.getText()));
			model.setPuestoEmpleado(view.comboBox.getToolTipText());
			
			if (modelConsulting.updateEmpleado(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente editado");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al editar");
				clean();
			}
		}
	}
	public void clean() {
		view.textDni.setText(null);
		view.textNombre.setText(null);
		view.textFormacion.setText(null);
		view.textAntiguedad.setText(null);
		view.comboBox.setToolTipText(null);

	}
}
