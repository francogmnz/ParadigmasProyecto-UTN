package Almacen;
/**
 *
 * @author franc
 */
public class Carroceria extends Componente {
    public final String descripcion;
    public final String color;
    
    public Carroceria(String color, String descripcion, Integer documento, float precio) {
        super(documento,precio);
        this.color = color;
        this.descripcion = descripcion;
    }

}
