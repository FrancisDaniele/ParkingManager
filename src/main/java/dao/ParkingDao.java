package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Parking;

public class ParkingDao {
    public List<Parking> listar() {
        String SQL_SELECT = "SELECT par_id, par_name, par_municipio, par_pDisponibles, par_pTotales  "  + " FROM parkings";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Parking parking = null;
        List<Parking> parkings = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("par_id");
                String nombre = rs.getString("par_name");
                String municipio = rs.getString("par_municipio");
                Integer disponibles = rs.getInt("par_pDisponibles");
                Integer totales = rs.getInt("par_pTotales");



                parking = new Parking(id, nombre, municipio, disponibles, totales);
                parking.add(parking);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return parkings;
    }






}

