
package model;

/**
 * Representa a una persona vinculada a la agencia de turismo Llanquihue Tour
 * Una persona tiene datos de de identificación como nombre rut y correo y una dirección.
 */

public class Persona {
    
//Atributos de la Persona
private String nombre;
private Rut rut;
private String correo;

// Composición: Una persona tiene una dirección
private Direccion direccion;


/**
 * Constructor de la clase Persona.
 * 
 * @param nombre nombre de la persona
 * @param rut rut de la persona
 * @param correo correo eletrónico de la persona
 * @param direccion dirección asociada a la persona
 */
        public Persona(String nombre, Rut rut, String correo, Direccion direccion) {
            this.nombre = nombre;
            this.rut = rut;
            this.correo = correo;
            this.direccion = direccion;
        }

        
    // Métodos get y set
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


   @Override
public String toString() {
    return "Nombre: " + nombre +
           "\nRUT: " + rut +
           "\nCorreo: " + correo +
           "\nDireccion: " + direccion;
}
           
    }

    

