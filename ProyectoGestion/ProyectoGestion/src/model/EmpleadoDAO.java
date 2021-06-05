package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import bdConnection.DBConnection;

public class EmpleadoDAO extends DBConnection implements IntEmpleado{

	@Override
	public boolean createEmpleado(Empleado empleado) {
		PreparedStatement ps = null;
		Connection  con = getConnection();
		String sql = "INSERT INTO Empleado (dniEmpleado,nombreEmpleado,formacionEmpleado,atiguedadEmpleado) =VALUES (?)(?)(?)(?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, empleado.getDniEmpleado());
			ps.setString(2, empleado.getNombreEmpleado());
			ps.setString(3, empleado.getFormacionEmpleado());
			ps.setInt(4, empleado.getAntiguedadEmpleado());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}		
	}

	@Override
	public boolean updateEmpleado(Empleado empleado) {
		PreparedStatement ps = null;
		Connection  con = getConnection();
		String sql = "UPDATE Empleado SET dniEmpleado=?,nombreEmpleado=?,formacionEmpleado=?,atiguedadEmpleado=? WHERE IdEmpleado=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, empleado.getDniEmpleado());
			ps.setString(2, empleado.getNombreEmpleado());
			ps.setString(3, empleado.getFormacionEmpleado());
			ps.setInt(4, empleado.getAntiguedadEmpleado());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
		
	}

	@Override
	public boolean deleteEmpleado(Empleado empleado) {
		PreparedStatement ps = null;
		Connection con = getConnection();

		String sql = "DELETE FROM empleado WHERE idEmpleado=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(empleado.getIdEmpleado()));
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}

	}		
	

	
}
