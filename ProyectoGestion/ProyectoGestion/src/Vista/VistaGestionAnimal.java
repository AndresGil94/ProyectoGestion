package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class VistaGestionAnimal extends JFrame {

	private JPanel contentPane;
	public JTextPane textRaza;
	public JTextPane textEdad;
	public JTextPane textPeso;
	public JTextPane textPais;
	public JTextPane textHabitat;
	public JButton btnEditar;
	public JButton btnSalir;
	public JButton btnBorrar;
	public JButton btnSiguiente;
	public JButton btnAtras;
	public JButton btnGuardar;
	public JButton btnMenu;

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
	public VistaGestionAnimal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRaza.setBounds(60, 81, 45, 13);
		contentPane.add(lblRaza);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEdad.setBounds(60, 140, 45, 13);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPeso.setBounds(60, 198, 45, 13);
		contentPane.add(lblPeso);
		
		JLabel lblPais = new JLabel("Pa\u00EDs de Origen");
		lblPais.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPais.setBounds(42, 257, 97, 13);
		contentPane.add(lblPais);
		
		JLabel lblHabitat = new JLabel("H\u00E1bitat");
		lblHabitat.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHabitat.setBounds(60, 313, 45, 13);
		contentPane.add(lblHabitat);
	
		textRaza = new JTextPane();
		textRaza.setBounds(149, 75, 252, 19);
		contentPane.add(textRaza);
		
		textEdad = new JTextPane();
		textEdad.setBounds(149, 134, 252, 19);
		contentPane.add(textEdad);
		
		textPeso = new JTextPane();
		textPeso.setBounds(149, 192, 252, 19);
		contentPane.add(textPeso);
		
		textPais = new JTextPane();
		textPais.setBounds(149, 251, 252, 19);
		contentPane.add(textPais);
		
		textHabitat = new JTextPane();
		textHabitat.setBounds(149, 307, 252, 19);
		contentPane.add(textHabitat);
		
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
	}
}
