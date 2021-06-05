package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	public JMenuItem menuItemUsuarios;
	public 	JMenuItem menuItemEmpleados;
	public JMenuItem menuItemAnimales;
	public JMenuItem menuItemConsultaE;
	public JMenuItem menuItemConsultaA;
	public JMenuItem menuItemInformacion;
	public JMenuItem menuItemSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setTitle("Men\u00FA Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Gestion");
		menuBar.add(mnNewMenu);
		
		menuItemEmpleados = new JMenuItem("Empleados");
		mnNewMenu.add(menuItemEmpleados);
		
		menuItemAnimales = new JMenuItem("Animales");
		mnNewMenu.add(menuItemAnimales);
		
		menuItemUsuarios = new JMenuItem("Usuarios");
		mnNewMenu.add(menuItemUsuarios);
		
		JMenu mnNewMenu_1 = new JMenu("Consultas");
		menuBar.add(mnNewMenu_1);
		
		menuItemConsultaE = new JMenuItem("Empleados");
		mnNewMenu_1.add(menuItemConsultaE);
		
		menuItemConsultaA = new JMenuItem("Animales");
		mnNewMenu_1.add(menuItemConsultaA);
		
		JMenu mnNewMenu_2 = new JMenu("Salir");
		menuBar.add(mnNewMenu_2);
		
		menuItemInformacion = new JMenuItem("Info");
		mnNewMenu_2.add(menuItemInformacion);
		
		menuItemSalir = new JMenuItem("Salir");
		mnNewMenu_2.add(menuItemSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
