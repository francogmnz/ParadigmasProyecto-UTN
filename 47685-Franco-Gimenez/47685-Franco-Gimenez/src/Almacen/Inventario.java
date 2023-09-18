package Almacen;
import java.util.ArrayList;
import java.io.*;
import Dispositivos.Impresora;
/**
 *
 * @author franc
 */

public class Inventario implements Serializable {
    public String marca;
    public ArrayList<Vehiculo> item = new ArrayList<>();
   
    
    public Inventario(String marca) {
        this.marca = marca;
    }

    public void guardarDatos(String ruta) throws FileNotFoundException, IOException {
        File archivo = new File(ruta);
        if(archivo.exists()){
            try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
                salida.writeObject(this);
            }
        } else System.out.println("El archivo no se ha encontrado");
    }

    public static ArrayList<Inventario> leerDatos(String ruta) {
        ArrayList<Inventario> auxiliar = new ArrayList<>();
        try (ObjectInputStream salida = new ObjectInputStream(new FileInputStream(new File(ruta)))) {
            auxiliar.add((Inventario)salida.readObject());
        }
        catch(FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
        catch(IOException e) {
            System.out.println("Error al leer");
        }
        catch(ClassNotFoundException e) {
            System.out.println("La clase leida no corresponde a una inventario");
        }
        if (auxiliar.size() != 0) return auxiliar;
        return null;
    }

    public void agregar(int peso, Motor motor, Carroceria carroceria) {
        item.add(new Vehiculo(peso, motor, carroceria));
    }

    public void listar(Impresora impresora){
      impresora.imprimir(this);
   }
    
    public static void crearArchivo(String ruta) throws IOException {
        File archivo = new File (ruta);
        try {
            archivo.createNewFile();
        } catch(IOException e) {
            System.out.println("NO SE HA PODIDO CREAR EL ARCHIVO");
        }
    }
}
