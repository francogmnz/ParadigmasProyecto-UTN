package Main;
import Almacen.*;
import Dispositivos.Impresora;
import java.util.ArrayList;
/**
 *
 * @author franc
 */

public class Principal {
    static final String directorioTrabajo = System.getProperty("user.dir");
    public static void main (String[] a) {
        
        System.out.println("Directorio de trabajo: " + directorioTrabajo);
        Impresora impresora = new Impresora();
        Inventario inventario = new Inventario("Ferrari");

        inventario.agregar(1000, new Motor(6,5000,322,5458400), new Carroceria("rojo", "deluxe",65656,4398291));
        inventario.agregar(1200, new Motor(12,7100,434,4134100), new Carroceria("amarillo", "premium",412431,439994));
        inventario.listar(impresora);
        
        try {
            Inventario.crearArchivo(directorioTrabajo + "/Archivos/ArchivosMain.dat");
            inventario.guardarDatos(directorioTrabajo + "/Archivos/ArchivosMain.dat");
        } catch(Exception e) { e.printStackTrace(); }
        System.out.println("\nEL INVENTARIO SE HA GUARDADO CORRECTAMENTE");
        
        ArrayList<Inventario> auxiliar = null;
        try {
            auxiliar = Inventario.leerDatos(directorioTrabajo + "/Archivos/ArchivosMain.dat");
        } catch(Exception e) { e.printStackTrace(); }
        assert auxiliar != null;
        auxiliar.get(auxiliar.size() - 1).listar(impresora);
        
    }
}
