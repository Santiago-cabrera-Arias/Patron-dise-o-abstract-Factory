
package ec.ups.edu.productos;

import ec.ups.edu.diseño.ServicioInformatico;

/**
 *
 * @author santi
 */
public class ServicioEstudiatil implements ServicioInformatico{

    @Override
    public void asignarTrabajo() {
        
        System.out.println("El trabajo ha sido asignado");
        
    }

    @Override
    public void IndicarFechaEntrega() {
        
        System.out.println("Fecha limite: 30/11/20");
        
    }

    @Override
    public void informarSobrePago() {
        
        System.out.println("El pago sera dispuesto por la cantidad de estudiantes.");
        
    }
    
}
