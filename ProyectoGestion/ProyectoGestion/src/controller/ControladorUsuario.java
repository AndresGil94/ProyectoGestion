package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import Vista.VistaGestionUsuario;
import exe.MenuGeneral;
import model.UsuarioDAO;
import model.Usuarios;

public class ControladorUsuario implements ActionListener {

	private Usuarios model;
	private UsuarioDAO modelConsulting;
	private VistaGestionUsuario view;
	
	public ControladorUsuario(Usuarios modelUsuarios, UsuarioDAO modelConsultingUsuarios, VistaGestionUsuario viewUsuarios) {
		this.model = modelUsuarios;
		this.modelConsulting = modelConsultingUsuarios;
		this.view = viewUsuarios;
		this.view.btnGuardar.addActionListener(this);
		this.view.btnBorrar.addActionListener(this);
		this.view.btnEditar.addActionListener(this);
		this.view.btnSiguiente.addActionListener(this);
		this.view.btnAtras.addActionListener(this);
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
			aux = view.textUsuario.getText();
			model.setNombreUsuario(view.textUsuario.getText());
			model.setContrasenaUsuario(view.textContrasena.getText());			
			model.setTipoUsuario(view.comboTipo.getToolTipText());

		
			if (modelConsulting.createUsuario(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente añadido");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al añadir");
				clean();
			}
		}

		// Boton borrar

		if (e.getSource() == view.btnBorrar) {
			model.setNombreUsuario((view.textUsuario.getText()));

			if (modelConsulting.deleteUsuario(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente eliminado");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al eliminar");
				clean();
			}
		}

		// Boton Editar

		if (e.getSource() == view.btnEditar) {
			model.setNombreUsuario(view.textUsuario.getText());
			model.setContrasenaUsuario(view.textContrasena.getText());		
			model.setTipoUsuario(view.comboTipo.getToolTipText());
			
			if (modelConsulting.updateUsuario(model)) {
				JOptionPane.showMessageDialog(null, "Registro correctamente editado");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Se ha producido un error al editar");
				clean();
			}
		}

		// Botón Menú Principal, utilizado para volver al menú.

		if (e.getSource() == view.btnMenu) {
			view.dispose();
			MenuGeneral mg = new MenuGeneral();

			mg.showMenuPrincipal();		
	
		}

	}
	
	public void clean() {
		
		view.textUsuario.setText(null);
		view.textContrasena.setText(null);
		view.comboTipo.setToolTipText(null);
	
	}
}
