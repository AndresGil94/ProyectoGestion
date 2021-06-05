package controller;
			
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
			
import javax.swing.JMenuItem;
			
import Vista.Login;
import Vista.VistaPrincipal;
import exe.MenuGeneral;
import model.UsuarioDAO;
import model.Usuarios;
			
public class MenuPrincipalController implements ActionListener{
			
	private Usuarios usuarios;
	private VistaPrincipal view;
	private MenuGeneral mg;
	
	UsuarioDAO userDAO = new UsuarioDAO();
			
	public MenuPrincipalController(VistaPrincipal view) {
			
		this.view = view;
		this.view.menuItemEmpleados.addActionListener(this);
		this.view.menuItemAnimales.addActionListener(this);
		this.view.menuItemUsuarios.addActionListener(this);
		this.view.menuItemConsultaE.addActionListener(this);
		this.view.menuItemConsultaA.addActionListener(this);
		this.view.menuItemInformacion.addActionListener(this);
		this.view.menuItemSalir.addActionListener(this);
			
	}		
	public void start() {
		view.setTitle("Proyecto Andrés");
		view.setLocationRelativeTo(null);
			
	}		
	
	public void privilegiosUsuario(Usuarios usuario) {
		
		if(userDAO.searchUser(usuarios).getTipoUsuario() != "admin") {
			mg = new MenuGeneral();	
			mg.showMenuUsuarios();
		}
		mg = new MenuGeneral();
		view.menuItemUsuarios.hide();
		view.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			
			
		if (e.getSource() == view.menuItemAnimales) {
			mg = new MenuGeneral();
			view.dispose();
			mg.showMenuAnimales();
				
		}	
		if (e.getSource() == view.menuItemUsuarios) {

			mg = new MenuGeneral();
			view.dispose();
				
		}	
			
		if (e.getSource() == view.menuItemEmpleados) {
			mg = new MenuGeneral();
			view.dispose();
			mg.showMenuEmpleados();
			
		}	
		if (e.getSource() == view.menuItemInformacion) {
			mg = new MenuGeneral();
			view.dispose();
			mg.showInformacion();
	}		
		if (e.getSource() == view.menuItemSalir) {
			
			view.dispose();
			System.exit(0);
	}		
			
						
}			
}			

