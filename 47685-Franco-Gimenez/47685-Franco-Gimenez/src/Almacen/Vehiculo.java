package Almacen;
import java.io.Serializable;
/**
 *
 * @author franc
 */

public class Vehiculo implements Serializable {
    public int peso;
    public Componente[] parte = new Componente[2];
    
    public Vehiculo(int peso, Motor motor, Carroceria carro) {
        this.peso = peso;
        parte[0] = motor;
        parte[1] = carro;
    }
    
    public float calcularPrecio(){
        return parte[0].getPrecio() + parte[1].getPrecio();
    }
    
}
