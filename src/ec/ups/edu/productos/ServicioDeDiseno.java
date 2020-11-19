
package ec.ups.edu.productos;

import ec.ups.edu.diseño.ServicioInformatico;

/**
 *
 * @author santi
 */
public class ServicioDeDiseno implements ServicioInformatico{

    @Override
    public void asignarTrabajo() {
        
        System.out.println("Hemos asignado el trabajo a realizar.");
        
    }

    @Override
    public void IndicarFechaEntrega() {
        
        System.out.println("La fecha limite de la entreda es el 30/12/2020.");
        
    }

    @Override
    public void informarSobrePago() {
        
        System.out.println("El pago se realizara en efectivo.");
        
    }
    
    
    
}
