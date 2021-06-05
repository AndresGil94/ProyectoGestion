package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	public JTextField textUsuario;
	public JTextField textContrasena;
	public JButton btnEntrar;
	public JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(55, 44, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContrasena.setBounds(55, 90, 72, 13);
		contentPane.add(lblContrasena);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(138, 42, 241, 19);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textContrasena = new JTextField();
		textContrasena.setColumns(10);
		textContrasena.setBounds(138, 88, 241, 19);
		contentPane.add(textContrasena);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(55, 186, 85, 21);
		contentPane.add(btnEntrar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(294, 186, 85, 21);
		contentPane.add(btnSalir);
	}

}
