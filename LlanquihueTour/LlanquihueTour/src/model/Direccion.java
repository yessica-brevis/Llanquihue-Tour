
package model;

/**
 * Representa la direccion fisica de una persona que trabaja directamente 
 * o presta servicios para la agencia de turismo Llanquihue Tour
 * 
 * Esta clase se utiliza como parte de la composicion dentro de la clase persona.
 */


public class Direccion {
    
  // Atributos de la Dirección.
private String calle;
private int numero;
private String ciudad;
private String region;

/**
 * Constructor de la clase Dirección.
 * 
 * @param calle nombre de la calle de la persona
 * @param numero número de la dirección de la persona
 * @param ciudad ciudad donde vive la persona
 * @param region región donde vive la persona
 */

    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    
    
    
    // Métodos get y set
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
    @Override
public String toString() {
    return calle + " " + numero + ", " + ciudad + ", " + region;
}
    
    
}
