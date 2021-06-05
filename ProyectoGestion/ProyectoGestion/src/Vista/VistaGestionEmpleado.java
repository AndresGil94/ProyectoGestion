package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class VistaGestionEmpleado extends JFrame {

	private JPanel contentPane;
	public JTextPane textDni;
	public JTextPane textNombre;
	public JTextPane textFormacion;
	public JTextPane textAntiguedad;
	public JButton btnEditar;
	public JButton btnSalir;
	public JButton btnBorrar;
	public JButton btnSiguiente;
	public JButton btnAtras;
	public JButton btnGuardar;
	public JButton btnMenu;
	public JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaGestionAnimal frame = new VistaGestionAnimal();
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
	public VistaGestionEmpleado() {
		setTitle("Gesti\u00F3n Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDni.setBounds(60, 81, 45, 13);
		contentPane.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(60, 140, 79, 13);
		contentPane.add(lblNombre);
		
		JLabel lblFormacion = new JLabel("Formaci\u00F3n");
		lblFormacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFormacion.setBounds(60, 198, 79, 13);
		contentPane.add(lblFormacion);
		
		JLabel lblAntiguedad = new JLabel("Antiguedad");
		lblAntiguedad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAntiguedad.setBounds(60, 257, 79, 13);
		contentPane.add(lblAntiguedad);
		
		JLabel lblEncargado = new JLabel("Encargado");
		lblEncargado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEncargado.setBounds(60, 313, 79, 13);
		contentPane.add(lblEncargado);
	
		textDni = new JTextPane();
		textDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textDni.setBounds(149, 75, 252, 19);
		contentPane.add(textDni);
		
		textNombre = new JTextPane();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNombre.setBounds(149, 134, 252, 19);
		contentPane.add(textNombre);
		
		textFormacion = new JTextPane();
		textFormacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFormacion.setBounds(149, 192, 252, 19);
		contentPane.add(textFormacion);
		
		textAntiguedad = new JTextPane();
		textAntiguedad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textAntiguedad.setBounds(149, 251, 252, 19);
		contentPane.add(textAntiguedad);
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEditar.setBounds(60, 371, 85, 21);
		contentPane.add(btnEditar);
		
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAtras.setBounds(60, 443, 85, 21);
		contentPane.add(btnAtras);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGuardar.setBounds(189, 372, 85, 21);
		contentPane.add(btnGuardar);
		
		btnMenu = new JButton("M.Principal");
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMenu.setBounds(189, 444, 85, 21);
		contentPane.add(btnMenu);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSiguiente.setBounds(316, 444, 85, 21);
		contentPane.add(btnSiguiente);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBorrar.setBounds(316, 372, 85, 21);
		contentPane.add(btnBorrar);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.addItem("Seleccione");
		comboBox.addItem("Sí");
		comboBox.addItem("No");
		comboBox.setBounds(149, 310, 252, 21);
		contentPane.add(comboBox);
	}
}

