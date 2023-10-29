package cuartelbomberos.AccesoADatos;

import cuartelbomberos.Entidades.Bombero;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BomberoData {
    private Connection con=null;
    
    public BomberoData(){
    con=Conexion.getconexion();
}
    
    public void guardarBombero(Bombero bombero){
        String sql="INSERT INTO bombero(dni, nombreApellido, fechaNacimiento, celular, codBrigada )"
                + "VALUES ( ?, ?, ?, ?, ?) ";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
            ps.setDate(3, new java.sql.Date(bombero.getFechaNacimiento().getTime()));
            ps.setString(4, bombero.getCelular());
            ps.setInt(5, bombero.getCodBrigada());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                bombero.setIdBombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero Guardado");
            ps.close();
        } }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
        }
    }
    
     public void actualizarBombero(Bombero bombero) {
        String sql = "UPDATE bombero SET dni=?, nombreApellido=?, fechaNacimiento=?, celular=?, codBrigada=? WHERE idBombero=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
            ps.setDate(3, new java.sql.Date(bombero.getFechaNacimiento().getTime()));
            ps.setString(4, bombero.getCelular());
            ps.setInt(5, bombero.getCodBrigada());
            ps.setInt(6, bombero.getIdBombero());

            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
        }
    }
     
      public void darBajaBombero(int idBombero) {
        String sql = "DELETE FROM bombero WHERE idBombero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idBombero);

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al dar de baja el bombero: " + ex.getMessage());
        }
    }
            public Bombero buscarBomberoPorNombre(String nombre) {
        Bombero bombero = null;
        String sql = "SELECT * FROM bombero WHERE nombreApellido LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bombero = new Bombero();
                bombero.setIdBombero(rs.getInt("idBombero"));
                bombero.setDni(rs.getString("dni"));
                bombero.setNombreApellido(rs.getString("nombreApellido"));
                bombero.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodBrigada(rs.getInt("codBrigada"));
            }

            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar el bombero: " + ex.getMessage());
        }

        return bombero;
    }
            
    public Bombero buscarBomberoPorId(int idBombero) {
    Bombero bombero = null;
    String sql = "SELECT * FROM bombero WHERE idBombero = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idBombero);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            bombero = new Bombero();
            bombero.setIdBombero(rs.getInt("idBombero"));
            bombero.setDni(rs.getString("dni"));
            bombero.setNombreApellido(rs.getString("nombreApellido"));
            bombero.setFechaNacimiento(rs.getDate("fechaNacimiento"));
            bombero.setCelular(rs.getString("celular"));
            bombero.setCodBrigada(rs.getInt("codBrigada"));
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar bombero por ID");
    }

    return bombero;
}
            
            public Bombero buscarBomberoPorDni(String dni) {
        Bombero bombero = null;
        String sql = "SELECT * FROM bombero WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idBombero = rs.getInt("idBombero");
                String nombreApellido = rs.getString("nombre_ape");
                Date fechaNacimiento = rs.getDate("fecha_nac");
                String celular = rs.getString("celular");
            int codBrigada = rs.getInt("codBrigada");
                
                
                
                bombero = new Bombero(idBombero, dni, nombreApellido, fechaNacimiento, celular, codBrigada, null);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
            
        }

        return bombero;
    }
            
      public ArrayList<Bombero> listarBomberos() {
    ArrayList<Bombero> bomberos = new ArrayList<>();
    String sql = "SELECT * FROM bombero";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int idBombero = rs.getInt("idBombero");
            String dni = rs.getString("dni");
            String nombreApellido = rs.getString("nombre_ape");
            Date fechaNacimiento = rs.getDate("fecha_nac");
            String celular = rs.getString("celular");
            int codBrigada = rs.getInt("codBrigada");
            

            Bombero bombero = new Bombero(idBombero, dni, nombreApellido, fechaNacimiento, celular, codBrigada, null);
            bomberos.add(bombero);
        }

        ps.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
       
    }

    return bomberos;
}
}