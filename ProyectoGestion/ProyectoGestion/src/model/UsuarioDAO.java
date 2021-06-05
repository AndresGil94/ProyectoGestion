package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import bdConnection.DBConnection;

public class UsuarioDAO extends DBConnection implements IntUsuarios {

	@Override
	public boolean consult(Usuarios usuarios) {
		Connection con = getConnection();
		String sql = "SELECT * FROM usuario WHERE nombreUsuario=?,contrasenaUsuario=?";
		PreparedStatement ps = null;
		 try {
			 ps.setString(1, usuarios.getNombreUsuario());
			 ps.setString(2, usuarios.getContrasenaUsuario());
			 ps.execute();
			 return true;			 
		 }catch (SQLException e){
			 System.err.println(e);
			 return false;
		 }finally {
			 try {
				 con.close();
			 
		 }catch (SQLException e) {
			 System.err.println(e);
		 }
		 }
	}
	
	public Usuarios searchUser(Usuarios u) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		String sql = "SELECT * FROM usuarios WHERE username = ?, password = ?";

		

		try {
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Usuarios(rs.getString("nombreUsuario"),rs.getString("contrasenaUsuario"),rs.getString("tipoUsuario"));
			}
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
		return null;


	}
	
	
	public boolean createUsuario(Usuarios usuarios) {
		
		Connection  con = getConnection();
		String sql = "INSERT INTO usuarios (nombreUsuario,contrasenaUsuario,tipoUsuario) =VALUES (?)(?)(?)";
		PreparedStatement ps = null;
		try {
			ps.setString(1, usuarios.getNombreUsuario());
			ps.setString(2, usuarios.getContrasenaUsuario());
			ps.setString(3, usuarios.getTipoUsuario());
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
	public boolean updateUsuario(Usuarios usuarios) {
		Connection  con = getConnection();
		String sql = "UPDATE Animal SET nombreUsuario=? contrasenaUsuario=? tipoUsuario=? privileges=? WHERE IdUsuario=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, usuarios.getNombreUsuario());
			ps.setString(2, usuarios.getContrasenaUsuario());
			ps.setString(3, usuarios.getTipoUsuario());
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
	public boolean deleteUsuario(Usuarios usuarios) {
		PreparedStatement ps = null;
		Connection con = getConnection();

		String sql = "DELETE FROM usuarios WHERE idUsuario=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(usuarios.getIdUsuario()));
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
