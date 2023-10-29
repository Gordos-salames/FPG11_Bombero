package cuartelbomberos;

import com.sun.jdi.connect.spi.Connection;
import cuartelbomberos.AccesoADatos.BomberoData;
import cuartelbomberos.AccesoADatos.BrigadaData;
import cuartelbomberos.AccesoADatos.Conexion;
import cuartelbomberos.AccesoADatos.CuartelData;
import cuartelbomberos.AccesoADatos.SiniestroData;
import cuartelbomberos.Entidades.Bombero;
import cuartelbomberos.Entidades.Brigada;
import cuartelbomberos.Entidades.Cuartel;
import cuartelbomberos.Entidades.Siniestro;
import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CuartelBomberos {
   
    public static void main(String[] args) throws ParseException {
        
    CuartelData cuartelData = new CuartelData();

    Cuartel nuevoCuartel = new Cuartel();
    nuevoCuartel.setNombreCuartel("Cuartel de Prueba");
    nuevoCuartel.setDireccion("Dirección de Prueba");
    nuevoCuartel.setCoordX(123);
    nuevoCuartel.setCoordY(456);
    nuevoCuartel.setTelefono("123-456-789");
    nuevoCuartel.setCorreo("correo@prueba.com");
    cuartelData.guardarCuartel(nuevoCuartel);
        
    /*BrigadaData brigadaData = new BrigadaData();

    Brigada nuevaBrigada = new Brigada("Brigada de Rescates", "Especialidad de Rescates", true, 1);
    brigadaData.guardarBrigada(nuevaBrigada);*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* Bombero bombero = new Bombero();
        bombero.setDni("41348369");
        bombero.setNombreApellido("Francisco Torrez");
        bombero.setFechaNacimiento(new Date(System.currentTimeMillis()));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date fechaDeseada = dateFormat.parse("1994-10-08"); 
bombero.setFechaNacimiento(fechaDeseada);
        bombero.setCelular("265-2058-9516");
        bombero.setCodBrigada(4); 


        BomberoData bomberoData = new BomberoData();


        bomberoData.guardarBombero(bombero);

        System.out.println("Bombero guardado exitosamente.");*/
        
        
         /*BomberoData bomberoData = new BomberoData();

    
    int idBomberoAActualizar = 1;

    Bombero bomberoExistente = bomberoData.buscarBomberoPorId(idBomberoAActualizar);

    if (bomberoExistente != null) {
        
        bomberoExistente.setDni("40528301");
        bomberoExistente.setNombreApellido("Juan Perez");
        bomberoExistente.setFechaNacimiento(new Date(System.currentTimeMillis())); 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Formato de fecha deseado
Date fechaDeseada = dateFormat.parse("2000-05-25"); // Establece la fecha deseada
bomberoExistente.setFechaNacimiento(fechaDeseada);
        bomberoExistente.setCelular("2664102850");
        bomberoExistente.setCodBrigada(1);

        // Llama al método actualizarBombero para guardar los cambios
        bomberoData.actualizarBombero(bomberoExistente);
        System.out.println("Bombero actualizado exitosamente.");
    } else {
        System.out.println("No se encontró el bombero con ID " + idBomberoAActualizar);
    }*/
         
         
         
         
         
         
         
         
         
        /*SiniestroData siniestroData = new SiniestroData();

    // Crea un objeto Siniestro con los datos del siniestro que deseas insertar
    Siniestro nuevoSiniestro = new Siniestro();
    nuevoSiniestro.setTipo("Incendio");
    nuevoSiniestro.setFechaSiniestro(new Date(System.currentTimeMillis()));
    nuevoSiniestro.setCoordX(123);
    nuevoSiniestro.setCoordY(456);
    nuevoSiniestro.setDetalles("Detalles del siniestro");
    nuevoSiniestro.setFechaResolucion(null); 
    nuevoSiniestro.setPuntuacion(7);
    nuevoSiniestro.setCodBrigada(4);

    // Llama al método guardarSiniestro para insertar el siniestro en la base de datos
    siniestroData.guardarSiniestro(nuevoSiniestro); */
         
         
         
}
}
