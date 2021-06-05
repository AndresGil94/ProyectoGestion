package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.Login;
import exe.MenuGeneral;
import model.UsuarioDAO;
import model.Usuarios;

public class LoginController implements ActionListener {

	private Login view;
	private MenuGeneral mg;
	private Usuarios model;
	
	
	public LoginController(Login view) {

		this.view = view;
		this.view.btnEntrar.addActionListener(this);
		this.view.btnSalir.addActionListener(this);

	}
	public void start() {

	
		view.setLocationRelativeTo(null);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == view.btnEntrar) {
			
			UsuarioDAO userDAO = new UsuarioDAO();
			MenuGeneral mg = new MenuGeneral();
			Usuarios model = new Usuarios();
			model.setNombreUsuario(view.textUsuario.getText());
			model.setContrasenaUsuario(view.textContrasena.getText());
			if(userDAO.consult(model)) {
				
				mg.showMenuPrincipal();
				
			}else {
				JOptionPane.showMessageDialog(view, "El nombre o contraseña insertadas no concuerdan con las de la base de datos.");
			}


			view.dispose();
		}
		
		if (e.getSource() == view.btnSalir) {
			view.dispose();
			System.exit(0);
		}
		

		// Boton objetos, que cargara el menu de operaciones de objetos

		
	}
	

}
