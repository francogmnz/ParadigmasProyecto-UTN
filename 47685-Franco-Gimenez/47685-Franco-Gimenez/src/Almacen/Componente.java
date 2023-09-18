package Almacen;
import java.io.Serializable;
/**
 *
 * @author franc
 */
public abstract class Componente implements Serializable {
    public Integer documento;
    private float precio; 
    
    public Componente(Integer documento, float precio) {
        this.documento = documento;
        this.precio = precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    public float getPrecio(){
        return precio;
    }
    
}
