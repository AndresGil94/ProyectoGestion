
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import bdConnection.DBConnection;

public class AnimalesDAO extends DBConnection implements IntAnimal{

	@Override
	public boolean createAnimales(Animales animales) {
		
		Connection con = getConnection();
		String sql = "INSERT INTO Empleado (razaAnimal,pesoAnimal,edadAnimal,paisOrigenAnimal,habitatAnimal) =VALUES (?)(?)(?)(?)(?)";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, animales.getRazaAnimal());
			ps.setInt(2, animales.getPesoAnimal());
			ps.setInt(3, animales.getEdadAnimal());
			ps.setString(4, animales.getPaisOrigenAnimal());
			ps.setString(5, animales.getHabitatAnimal());
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
	public boolean updateAnimales(Animales animales) {
		Connection con = getConnection();
		String sql = "UPDATE Animal SET RazaAnimal=? PesoAnimal=? EdadAnimal=? PaisOrigenAnimal=? HabitatAnimal=? WHERE IdAnimal=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, animales.getRazaAnimal());
			ps.setInt(2, animales.getPesoAnimal());
			ps.setInt(3, animales.getEdadAnimal());
			ps.setString(4, animales.getPaisOrigenAnimal());
			ps.setString(5, animales.getHabitatAnimal());
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
	public boolean deleteAnimales(Animales animales) {
		PreparedStatement ps = null;
		Connection con = getConnection();

		String sql = "DELETE FROM animales WHERE idAnimal=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(animales.getIdAnimal()));
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
