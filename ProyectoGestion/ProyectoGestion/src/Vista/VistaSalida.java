package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class VistaSalida extends JFrame{

	private JFrame frame;
	public JButton btnSalir;
	public JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaSalida window = new VistaSalida();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaSalida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00BFEst\u00E1s seguro de que quieres salir?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 60, 436, 13);
		frame.getContentPane().add(lblNewLabel);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(85, 201, 85, 21);
		frame.getContentPane().add(btnSalir);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(265, 201, 85, 21);
		frame.getContentPane().add(btnVolver);
	}

}
