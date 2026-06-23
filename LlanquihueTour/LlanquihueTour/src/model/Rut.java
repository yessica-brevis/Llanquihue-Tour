
package model;
import util.RutInvalidoException;

/**
 * Representa el RUT de una Persona.
 * 
 * Esta clase valida que el RUT tenga un formato correcto
 * antes de almacenarlo.
 */
public class Rut {

    // Atributo que almacena el RUT
    private String numero;

    /**
     * Constructor de la clase Rut.
     *
     * @param numero RUT ingresado por el usuario
     * @throws RutInvalidoException si el formato del RUT no es válido
     */
    public Rut(String numero) throws RutInvalidoException {

        // Se eliminan puntos y espacios para aceptar formatos como 17.604.881-0
       String rutLimpio = numero.replace(".", "").replace(" ", "").trim().toUpperCase();
        
        
        // Se valida el formato del RUT
        if (!validarFormato(rutLimpio)) {
            throw new RutInvalidoException("El RUT ingresado no tiene un formato válido.");
        }

        this.numero = rutLimpio;
    }

    /**
     * Valida que el RUT tenga el formato correcto.
     * Ejemplo válido: 17604881-9 o 17604881-K
     *
     * @param rut RUT que se desea validar
     * @return true si el formato es correcto, false si no lo es
     */
    private boolean validarFormato(String rut) {
        return rut.matches("[0-9]{7,8}-[0-9K]");
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}




