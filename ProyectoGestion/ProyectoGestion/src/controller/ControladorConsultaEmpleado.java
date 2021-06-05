package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaConsultaEmpleado;
import exe.MenuGeneral;
import model.Empleado;
import model.EmpleadoDAO;

public class ControladorConsultaEmpleado implements ActionListener{

	private Empleado empleado;
	private EmpleadoDAO modelConsulting;
	private VistaConsultaEmpleado view;
	public ControladorConsultaEmpleado(Empleado empleado, EmpleadoDAO modelConsulting, VistaConsultaEmpleado view) {

		this.empleado = empleado;
		this.modelConsulting = modelConsulting;
		this.view = view;
		this.view.btnPdf.addActionListener(this);
		this.view.btnVolver.addActionListener(this);
		//this.view.tablaEmpleado.add();
		
		
 	}
	public void start() {
		view.setTitle("Consulta Empleado");
		view.setLocationRelativeTo(null);

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		/*
		 * Botón encargado de volver al menu principal.
		 */
		if(e.getSource() == view.btnVolver) {
			view.dispose();
			MenuGeneral exe = new MenuGeneral();
			exe.showMenuPrincipal();
		}
		
	}
	
	
	
	
}
