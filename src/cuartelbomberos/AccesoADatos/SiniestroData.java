package cuartelbomberos.AccesoADatos;

import cuartelbomberos.Entidades.Siniestro;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SiniestroData {
    private Connection con=null;

    public SiniestroData() {
     con=Conexion.getconexion();
    }

    public void guardarSiniestro(Siniestro siniestro) {
        String sql = "INSERT INTO siniestro (tipo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, puntuacion, codBrigada) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps=con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getTipo());
           ps.setDate(2, new java.sql.Date(siniestro.getFechaSiniestro().getTime()));
         
            ps.setInt(3, siniestro.getCoordX());
            ps.setInt(4, siniestro.getCoordY());
            ps.setString(5, siniestro.getDetalles());
            if (siniestro.getFechaResolucion() == null) {
                ps.setDate(6, null);
            } else {
                ps.setDate(6, new java.sql.Date(siniestro.getFechaResolucion().getTime()));
            }
            ps.setInt(7, siniestro.getPuntuacion());
            ps.setInt(8, siniestro.getCodBrigada());

            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Siniestro Guardado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro");
        }
    }

    public ArrayList<Siniestro> listarSiniestros() {
        ArrayList<Siniestro> siniestros = new ArrayList<>();
        String sql = "SELECT * FROM siniestro";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String tipo = rs.getString("tipo");
                java.util.Date fechaSiniestro = rs.getDate("fecha_siniestro");
                int coordX = rs.getInt("coord_X");
                int coordY = rs.getInt("coord_Y");
                String detalles = rs.getString("detalles");
                java.util.Date fechaResolucion = rs.getDate("fecha_resol");
                int puntuacion = rs.getInt("puntuacion");
                int codBrigada = rs.getInt("codBrigada");

                Siniestro siniestro = new Siniestro(codigo, tipo, fechaSiniestro, coordX, coordY, detalles, fechaResolucion, puntuacion, codBrigada);
                siniestros.add(siniestro);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla siniestro");
        }

        return siniestros;
    }
}