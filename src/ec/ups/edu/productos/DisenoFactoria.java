
package ec.ups.edu.productos;

import ec.ups.edu.diseño.ServicioCreador;
import ec.ups.edu.diseño.ServicioInformatico;

/**
 *
 * @author santi
 */
public class DisenoFactoria implements ServicioCreador{

    @Override
    public ServicioInformatico crearServicio() {
        
        return new ServicioDeDiseno();
        
    }
    
}
