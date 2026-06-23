
package model;

/**
 * Representa a un empleado o colaborador vinculado a la agencia
 *  de turismo Llanquihue Tour
 * 
 * Esta clase hereda de Persona y agrega información específica 
 * relacionada con el cargo, área de trabajo y empresa asociada.
 */
public class Empleado extends Persona {
  
  //Atributos del empleado
    private String cargo;
    private String areaDeTrabajo;
    private String empresaAsociada;

/**
 * Constructor de la clase Empleado
 * 
 * @param cargo cargo de la persona
 * @param areaDeTrabajo área de trabajo de la persona
 * @param empresaAsociada empresa asociada a la que pertenece la persona
 * @param nombre nombre de la persona
 * @param rut rut de la persona
 * @param correo correo electrónico de la persona
 * @param direccion dirección asociada a la persona
 */
    public Empleado(String cargo, String areaDeTrabajo, String empresaAsociada, String nombre, Rut rut, String correo, Direccion direccion) {
        super(nombre, rut, correo, direccion);
        this.cargo = cargo;
        this.areaDeTrabajo = areaDeTrabajo;
        this.empresaAsociada = empresaAsociada;
    }

    
    //Métodos get y set
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public void setAreaDeTrabajo(String areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }

    public String getEmpresaAsociada() {
        return empresaAsociada;
    }

    public void setEmpresaAsociada(String empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

    
   @Override
public String toString() {
    return super.toString() +
           "\nCargo: " + cargo +
           "\nArea de trabajo: " + areaDeTrabajo +
           "\nEmpresa asociada: " + empresaAsociada;
}
   
    }

    
    
    
    
    
    

    
    
    
    
    
  

    
    
    
    
   
    
    

    
    

