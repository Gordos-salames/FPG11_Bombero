package cuartelbomberos.AccesoADatos;
import cuartelbomberos.Entidades.Bombero;
import cuartelbomberos.Entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BrigadaData {
    private Connection con=null;

    public BrigadaData() {
        con=Conexion.getconexion();
    }

    public void guardarBrigada(Brigada brigada) {
        String sql = "INSERT INTO brigada (nombre_br, especialidad, libre, nro_cuartel) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombreBr());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNroCuartel());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Brigada Guardada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
    }

    public ArrayList<Brigada> listarBrigadas() {
        ArrayList<Brigada> brigadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int codBrigada = rs.getInt("codBrigada");
                String nombreBrigada = rs.getString("nombre_br");
                String especialidad = rs.getString("especialidad");
                boolean libre = rs.getBoolean("libre");
                int nroCuartel = rs.getInt("nro_cuartel");
                
                Brigada brigada = new Brigada(codBrigada, nombreBrigada, especialidad, libre, nroCuartel);
                brigadas.add(brigada);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }

        return brigadas;
    }
    
    public Bombero buscarBomberoPorBrigada(int codBrigada) {
    Bombero bombero = null;
    String sql = "SELECT * FROM bombero WHERE codBrigada = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codBrigada);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            bombero = new Bombero();
            bombero.setIdBombero(rs.getInt("idBombero"));
            bombero.setDni(rs.getString("dni"));
            bombero.setNombreApellido(rs.getString("nombre_ape"));
            bombero.setFechaNacimiento(rs.getDate("fecha_nac"));
            bombero.setCelular(rs.getString("celular"));
            bombero.setCodBrigada(rs.getInt("codBrigada"));
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar bombero por brigada");
    }

    return bombero;
}

public Brigada buscarPorNombreBrigada(String nombreBrigada) {
    Brigada brigada = null;
    String sql = "SELECT * FROM brigada WHERE nombre_br = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombreBrigada);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int codBrigada = rs.getInt("codBrigada");
            String especialidad = rs.getString("especialidad");
            boolean libre = rs.getBoolean("libre");
            int nroCuartel = rs.getInt("nro_cuartel");
            
            brigada = new Brigada(codBrigada, nombreBrigada, especialidad, libre, nroCuartel);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar brigada por nombre");
    }

    return brigada;
}
    }