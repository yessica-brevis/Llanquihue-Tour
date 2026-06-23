
package service;

import java.util.ArrayList;
import model.Empleado;

/**
 * Clase encargada de administrar los empleados registrados
 * en la agencia de turismo Llanquihue Tour.
 *
 * Permite agregar, mostrar, buscar y filtrar empleados
 * almacenados en una colección dinámica.
 */
public class EmpleadoService {

    // Colección dinámica donde se almacenan los empleados
    private ArrayList<Empleado> empleados;

    /**
     * Constructor de la clase.
     * Inicializa la lista de empleados.
     */
    public EmpleadoService() {
        empleados = new ArrayList<>();
    }

    /**
     * Agrega un empleado a la colección.
     *
     * @param empleado objeto Empleado que se desea almacenar.
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);

    }

    /**
     * Muestra todos los empleados registrados en la colección.
     */
    public void mostrarEmpleados() {

        for (Empleado empleado : empleados) {

            System.out.println(empleado);
            System.out.println();

        }

    }

    /**
     * Busca un empleado por su RUT.
     *
     * @param rut RUT del empleado a buscar.
     * @return el empleado encontrado o null si no existe.
     */
    public Empleado buscarEmpleadoPorRut(String rut) {

        for (Empleado empleado : empleados) {

            if (empleado.getRut().toString().equalsIgnoreCase(rut)) {

                return empleado;

            }

        }

        return null;
    }

    /**
     * Muestra los empleados que poseen un cargo determinado.
     *
     * @param cargo cargo que se desea buscar.
     */
    public void filtrarPorCargo(String cargo) {

        for (Empleado empleado : empleados) {

            if (empleado.getCargo().equalsIgnoreCase(cargo)) {

                System.out.println(empleado);
                System.out.println();

            }

        }

    }

    /**
     * Muestra los empleados pertenecientes a un área de trabajo.
     *
     * @param area área de trabajo que se desea buscar.
     */
    public void filtrarPorArea(String area) {

        for (Empleado empleado : empleados) {

            if (empleado.getAreaDeTrabajo().equalsIgnoreCase(area)) {

                System.out.println(empleado);
                System.out.println();

            }

        }

    }

    /**
     * Muestra los empleados pertenecientes a una empresa asociada.
     *
     * @param empresa empresa que se desea buscar.
     */
    public void filtrarPorEmpresa(String empresa) {

        for (Empleado empleado : empleados) {

            if (empleado.getEmpresaAsociada().equalsIgnoreCase(empresa)) {

                System.out.println(empleado);
                System.out.println();

            }

        }

    }

}