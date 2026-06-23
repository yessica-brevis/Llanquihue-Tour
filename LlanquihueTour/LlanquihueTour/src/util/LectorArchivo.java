
package util;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase encargada de leer archivos de texto almacenados
 * en la carpeta resources del proyecto.
 */
public class LectorArchivo {

    public ArrayList<String> leerArchivo(String nombreArchivo) {

        ArrayList<String> lineas = new ArrayList<>();

        try {

            InputStream input =
                    getClass().getClassLoader()
                            .getResourceAsStream(nombreArchivo);

            if (input == null) {
                throw new Exception("No se encontró el archivo "
                        + nombreArchivo);
            }

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(input));

            String linea;

            while ((linea = br.readLine()) != null) {

                lineas.add(linea);

            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error al leer archivo: "
                    + e.getMessage());

        }

        return lineas;
    }

}