package Dispositivos;
import Almacen.*;
/**
 *
 * @author franc
 */
public class Impresora {
    public void imprimir(Inventario inv) {
        System.out.println("||----------INVENTARIO " + inv.marca + "----------||");
        for(Vehiculo auxiliar : inv.item){
            Motor motor = (Motor) auxiliar.parte[0];
            Carroceria carroceria = (Carroceria) auxiliar.parte[1];
            System.out.print(
                    "\n Peso --> " + auxiliar.peso + "\n" + " MOTOR \n|||| Cantidad de Cilindros --> "
                     + motor.cantidadCilindros + "\n|||| Cilindrada --> " + motor.cilindrada + "\n|||| Numero --> "+motor.documento+
                    "\n CARROCERIA \n|||| "+carroceria.descripcion+"\n|||| Color --> " + carroceria.color + "\n|||| Numero --> " + carroceria.documento
                     + "\n\n PRECIO --> "
                     + auxiliar.calcularPrecio());
            System.out.print("\n----------------------------------");
        }
    }
   
}
