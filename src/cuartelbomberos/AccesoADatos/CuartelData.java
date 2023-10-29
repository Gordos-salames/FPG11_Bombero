package cuartelbomberos.AccesoADatos;

import cuartelbomberos.Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CuartelData {
     private Connection con=null;

    public CuartelData() {
          con=Conexion.getconexion();
    }

    public void guardarCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel (nomCuartel, direccion, coord_X, coord_Y, telefono, correo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps=con.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoordX());
            ps.setInt(4, cuartel.getCoordY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());

            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Cuartel Guardado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
    }

    public ArrayList<Cuartel> listarCuarteles() {
        ArrayList<Cuartel> cuarteles = new ArrayList<>();
        String sql = "SELECT * FROM cuartel";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int codCuartel = rs.getInt("codCuartel");
                String nombreCuartel = rs.getString("nombre_cuartel");
                String direccion = rs.getString("direccion");
                int coordX = rs.getInt("coord_X");
                int coordY = rs.getInt("coord_Y");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");

                Cuartel cuartel = new Cuartel(codCuartel, nombreCuartel, direccion, coordX, coordY, telefono, correo);
                cuarteles.add(cuartel);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }

        return cuarteles;
    }
}