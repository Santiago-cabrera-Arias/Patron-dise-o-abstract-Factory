
package ec.ups.edu.productos;

import ec.ups.edu.diseño.ServicioInformatico;

/**
 *
 * @author santi
 */
public class ServicioPaginasWeb implements ServicioInformatico{

    @Override
    public void asignarTrabajo() {
        
        System.out.println("El trabajo ha sido aceptado.");
        
    }

    @Override
    public void IndicarFechaEntrega() {
        
        System.out.println("La fecha a entregar el trabajo es el 30/11/2020");
        
    }

    @Override
    public void informarSobrePago() {
        
        System.out.println("El pago a realizar incluira dominio y hosting.");
        
    }
    
}
