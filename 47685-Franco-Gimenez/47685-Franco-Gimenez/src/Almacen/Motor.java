package Almacen;
/**
 *
 * @author franc
 */
public class Motor extends Componente {
    public final int cantidadCilindros;
    public final int cilindrada;
    
    public Motor(int cantidadCilindros, int cilindrada, Integer documento, float precio) {
        super(documento, precio);
        this.cantidadCilindros = cantidadCilindros;
        this.cilindrada = cilindrada;
    }
}
