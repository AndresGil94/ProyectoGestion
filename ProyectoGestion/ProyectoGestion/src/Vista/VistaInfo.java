package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class VistaInfo extends JFrame {

	private JPanel contentPane;
	public JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaInfo frame = new VistaInfo();
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
	public VistaInfo() {
		setTitle("Informaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Creado por Andr\u00E9s A. Gil Prieto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 44, 426, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrcticaDeProgramacin = new JLabel("Pr\u00E1ctica de Programaci\u00F3n");
		lblPrcticaDeProgramacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrcticaDeProgramacin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrcticaDeProgramacin.setBounds(10, 141, 426, 13);
		contentPane.add(lblPrcticaDeProgramacin);
		
		JLabel lblVersin = new JLabel("Versi\u00F3n 1.0");
		lblVersin.setForeground(Color.GRAY);
		lblVersin.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVersin.setBounds(10, 93, 426, 13);
		contentPane.add(lblVersin);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(170, 214, 85, 21);
		contentPane.add(btnVolver);
	}
}
