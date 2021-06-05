package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;

public class VistaConsultaEmpleado extends JFrame {

	private JPanel contentPane;
	public JButton btnPdf;
	public JButton btnVolver;
	public JTabbedPane tablaEmpleado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaConsultaEmpleado frame = new VistaConsultaEmpleado();
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
	public VistaConsultaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnPdf = new JButton("Exportar a PDF");
		btnPdf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPdf.setBounds(59, 217, 127, 21);
		contentPane.add(btnPdf);
		
		tablaEmpleado = new JTabbedPane(JTabbedPane.TOP);
		tablaEmpleado.setBounds(21, 10, 392, 199);
		contentPane.add(tablaEmpleado);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.setBounds(281, 218, 127, 21);
		contentPane.add(btnVolver);
	}
}
