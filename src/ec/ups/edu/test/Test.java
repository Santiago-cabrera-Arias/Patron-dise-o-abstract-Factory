
package ec.ups.edu.test;

import ec.ups.edu.diseño.ServicioCreador;
import ec.ups.edu.diseño.ServicioInformatico;
import ec.ups.edu.productos.DisenoFactoria;
import ec.ups.edu.productos.EstudiantilFactoria;
import ec.ups.edu.productos.PaginasWebFactoria;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Test {

    private static Scanner sc = new Scanner(System.in);

    public static void usarServicio(ServicioCreador factory) { 
        ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.IndicarFechaEntrega();
        servicio.informarSobrePago();

    }

    public static void main(String[] args) {

        int opcion = 0;

        do {

            System.out.println("\nSeleccione una opcion");
            System.out.println("1.Servicio de diseño");
            System.out.println("2.Servicio  de paginas web");
            System.out.println("3.Servicio Estudiatil");
            System.out.println("4.Salir");
            System.out.println("----------------------------");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    usarServicio(new DisenoFactoria());

                    break;

                case 2:

                    usarServicio(new PaginasWebFactoria());

                    break;

                case 3:

                    usarServicio(new EstudiantilFactoria());

                    break;
                    
                case 4:
                    
                    System.exit(0);
                    
                    break;

                default:
                    System.out.println("Ingrese una opcion dentro del rango");

            }
        } while (opcion != 4);

    }

}
