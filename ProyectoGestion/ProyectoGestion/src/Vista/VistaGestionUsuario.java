package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaGestionUsuario extends JFrame {

	private JPanel contentPane;
	public JTextField textUsuario;
	public JTextField textContrasena;
	public JComboBox comboTipo;
	public JButton btnEditar;
	public JButton btnAtras;
	public JButton btnSiguiente;
	public JButton btnMenu;
	public JButton btnGuardar;
	public JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaGestionUsuario frame = new VistaGestionUsuario();
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
	public VistaGestionUsuario() {
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(53, 50, 56, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContrasea.setBounds(53, 88, 76, 13);
		contentPane.add(lblContrasea);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipo.setBounds(53, 124, 56, 13);
		contentPane.add(lblTipo);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textUsuario.setBounds(137, 48, 252, 19);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textContrasena = new JTextField();
		textContrasena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textContrasena.setColumns(10);
		textContrasena.setBounds(137, 86, 252, 19);
		contentPane.add(textContrasena);
		
		comboTipo = new JComboBox();
		comboTipo.addItem("Seleccione");
		comboTipo.addItem("Admin");
		comboTipo.addItem("Usuario");
		comboTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboTipo.setBounds(137, 121, 252, 21);
		contentPane.add(comboTipo);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(53, 195, 85, 21);
		contentPane.add(btnEditar);
		
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(53, 232, 85, 21);
		contentPane.add(btnAtras);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(304, 232, 85, 21);
		contentPane.add(btnSiguiente);
		
		btnMenu = new JButton("Men\u00FA P.");
		btnMenu.setBounds(175, 232, 85, 21);
		contentPane.add(btnMenu);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(175, 195, 85, 21);
		contentPane.add(btnGuardar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(304, 195, 85, 21);
		contentPane.add(btnBorrar);
	}
}
