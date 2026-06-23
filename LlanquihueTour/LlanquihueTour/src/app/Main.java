
package app;

import model.Direccion;
import model.Empleado;
import model.Rut;
import service.EmpleadoService;
import util.LectorArchivo;
import util.RutInvalidoException;

import java.util.ArrayList;

/**
 * Clase principal del sistema Llanquihue Tour.
 *
 * Se encarga de leer la información almacenada en el archivo
 * empleados.txt, crear los objetos Empleado y utilizar
 * EmpleadoService para almacenarlos y aplicar filtros.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA LLANQUIHUE TOUR =====\n");

        LectorArchivo lector = new LectorArchivo();
        EmpleadoService service = new EmpleadoService();

        ArrayList<String> lineas = lector.leerArchivo("empleados.txt");

        for (String linea : lineas) {

            try {

                String[] datos = linea.split(";");

                Rut rut = new Rut(datos[1]);

       Direccion direccion = new Direccion(
       datos[6],                 // calle
       Integer.parseInt(datos[7]), // número
       datos[8],                 // ciudad
       datos[9]                 // región
       );

        Empleado empleado = new Empleado(
        datos[3], // cargo
        datos[4], // area
        datos[5], // empresa
        datos[0], // nombre
        rut,
        datos[2], // correo
        direccion
);

                service.agregarEmpleado(empleado);

            } catch (RutInvalidoException e) {

                System.out.println("Error en el RUT del registro: "
                        + e.getMessage());

            } catch (Exception e) {

                System.out.println("Error al procesar un registro: "
                        + e.getMessage());
            }

        }

        System.out.println("\n===== EMPLEADOS REGISTRADOS =====");
        service.mostrarEmpleados();

        System.out.println("\n===== FILTRO POR CARGO =====");
        service.filtrarPorCargo("Guia Turistico");

        System.out.println("\n===== FILTRO POR AREA =====");
        service.filtrarPorArea("Logistica");

        System.out.println("\n===== FILTRO POR EMPRESA =====");
        service.filtrarPorEmpresa("Llanquihue Tour");

    }

}
