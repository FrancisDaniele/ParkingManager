package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import dao.DBConnection;
import dao.UsuarioDao;

import dto.Usuario;

public class UsuarioDao {

	/*
	 * Lista los usuarios de la base de datos
	 * 
	 */
	public List<Usuario> listar() {
		String SQL_SELECT = "SELECT use_id, use_document, use_mail, use_name, use_surnames, use_telephone, use_veh1, use_veh1Electrico, use_veh2, use_veh2Electrico, use_veh3, use_veh3Electrico, use_password  "  + " FROM users";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Usuario usuario = null;
		List<Usuario> usuarios = new ArrayList<>();
		
		try {
			conn = DBConnection.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("use_id");
				String nieDni = rs.getString("use_document");
				String email = rs.getString("use_mail");
				String nombre = rs.getString("use_name");
				String apellidos = rs.getString("use_surnames");
				String telefono = rs.getString("use_telephone");
				String vehiculo1 = rs.getString("use_veh1");
				Boolean vehiculo1Electrico = Boolean.valueOf(rs.getString("use_veh1Electrico"));
				String vehiculo2 = rs.getString("use_veh2");
				Boolean vehiculo2Electrico = Boolean.valueOf(rs.getString("use_veh2Electrico"));
				String vehiculo3 = rs.getString("use_veh3");
				Boolean vehiculo3Electrico = Boolean.valueOf(rs.getString("use_veh3Electrico"));
				String password = rs.getString("use_password");
				

				usuario = new Usuario(id, nieDni, email, nombre, apellidos, telefono, vehiculo1, vehiculo1Electrico, vehiculo2, vehiculo2Electrico, vehiculo3, vehiculo3Electrico, password);
				usuarios.add(usuario);
			}
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			DBConnection.close(rs);
			DBConnection.close(stmt);
			DBConnection.close(conn);
		}
		return usuarios;
	}
	
	public Usuario loginUserPass(Usuario usuario) {
        String SQL_SELECT_BY_USER_AND_PASS = "SELECT use_email,  use_password "
                + " FROM users WHERE use_email = ? AND use_password = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_USER_AND_PASS);

            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getPassword());
            rs = stmt.executeQuery();
            rs.absolute(1);

            String email = rs.getString("use_email");
            String password = rs.getString("use_password");

            usuario.setEmail(email);
            usuario.setPassword(password);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return usuario;
    }

	

	/*
	 * Crea un client a la base de dades
	 * 
	 */
	public int create(Usuario usuario) {
		String SQL_INSERT = "INSERT INTO users( use_id, use_document, use_mail, use_name, use_surnames, use_telephone, use_veh1, use_veh1Electrico, use_veh2, use_veh2Electrico, use_veh3, use_veh3Electrico, use_password) "
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = DBConnection.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setInt(1, usuario.getId());
			stmt.setString(2, usuario.getNieDni());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getNombre());
			stmt.setString(5, usuario.getApellidos());
			stmt.setString(6, usuario.getTelefono());
			stmt.setString(7, usuario.getVehiculo1());
			stmt.setBoolean(8, usuario.getVehiculo1Electrico());
			stmt.setString(9, usuario.getVehiculo2());
			stmt.setBoolean(10, usuario.getVehiculo2Electrico());
			stmt.setString(11, usuario.getVehiculo3());
			stmt.setBoolean(12, usuario.getVehiculo3Electrico());
			stmt.setString(13, usuario.getPassword());

			rows = stmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			DBConnection.close(stmt);
			DBConnection.close(conn);
		}
		return rows;
	}

	

}
