package Pantalla;
import java.util.ArrayList;
import Almacen.*;
import Dispositivos.*;
/**
 *
 * @author franco
 */
public class Controladora {
    
    ArrayList<Vehiculo> autos = new ArrayList<>();
    Impresora impresora = new Impresora();
    
    public void grabarCoche(int peso, int cantidadCilindros, int cilindrada, 
            Integer documentoMotor, float precioMotor, String color, String descripcion, Integer documentoCarroceria, float precioCarroceria) {
      
        autos.add(new Vehiculo(peso,  new Motor(cantidadCilindros, cilindrada, documentoMotor, precioMotor),
                  new Carroceria(color, descripcion, documentoCarroceria, precioCarroceria)));
    }
    
    public void grabarInventario(String marca) {
        Inventario inventario = new Inventario(marca);
        inventario.item = autos;
        String ruta = "Archivos/" + marca + ".dat";
        try {
            Inventario.crearArchivo(ruta);
            inventario.guardarDatos(ruta);
        } catch(Exception e) {
            e.printStackTrace();
        }
        autos.clear();
    }  
    
    public void listarInventario(String marca) {
        Inventario auxiliar = new Inventario(marca);
        auxiliar.item = autos;
        impresora.imprimir(auxiliar);
    }
}
