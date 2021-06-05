package exe;


import Vista.Login;
import Vista.VistaGestionAnimal;
import Vista.VistaGestionEmpleado;
import Vista.VistaGestionUsuario;
import Vista.VistaInfo;
import Vista.VistaPrincipal;
import controller.ControladorAnimal;
import controller.ControladorEmpleado;
import controller.ControladorInfo;
import controller.ControladorUsuario;
import controller.LoginController;
import controller.MenuPrincipalController;
import model.Animales;
import model.AnimalesDAO;
import model.Empleado;
import model.EmpleadoDAO;
import model.UsuarioDAO;
import model.Usuarios;

public class MenuGeneral {

	static Login viewLogin = new Login();
	static VistaInfo viewInfo = new VistaInfo();
	static VistaPrincipal viewMenuP = new VistaPrincipal();
	Empleado modelEmpleado = new Empleado();
	EmpleadoDAO modelConsultingEmpleado = new EmpleadoDAO();
	static VistaGestionEmpleado viewEmpleado = new VistaGestionEmpleado();
	
	Animales modelAnimales = new Animales();
	AnimalesDAO modelConsultingAnimales = new AnimalesDAO();
	static VistaGestionAnimal viewAnimales = new VistaGestionAnimal();
	
	Usuarios modelUsuarios = new Usuarios();
	UsuarioDAO modelConsultingUsuarios = new UsuarioDAO();
	static VistaGestionUsuario viewUsuarios = new VistaGestionUsuario();
	

	
	public static void main(String[] args) {
		Login viewLogin = new Login();
		LoginController lc = new LoginController(viewLogin);
		lc.start();
		viewLogin.setVisible(true);
		}
	public void showMenuPrincipal() {
		
		MenuPrincipalController mpc = new MenuPrincipalController(viewMenuP);
		mpc.start();
		viewMenuP.setVisible(true);
	}


	public void showMenuEmpleados() {
		
		ControladorEmpleado empleadoC = new ControladorEmpleado(modelEmpleado, modelConsultingEmpleado, viewEmpleado);
		empleadoC.start();
		viewEmpleado.setVisible(true);
	}
	
	public void showMenuAnimales() {
		
		ControladorAnimal animalC = new ControladorAnimal(modelAnimales, modelConsultingAnimales, viewAnimales);
		animalC.start();
		viewAnimales.setVisible(true);
	}
	
	public void showMenuUsuarios() {
		
		ControladorUsuario usuarioC = new ControladorUsuario(modelUsuarios, modelConsultingUsuarios, viewUsuarios);
		usuarioC.start();
		viewUsuarios.setVisible(true);
	}
	public void showInfo() {
		
		ControladorInfo infoC = new ControladorInfo(viewInfo);
		infoC.start();
		viewLogin.setVisible(true);
	}
	public void showInformacion() {
		
		ControladorInfo infoC = new ControladorInfo(viewInfo);
		infoC.start();
		viewInfo.setVisible(true);
	}
}
