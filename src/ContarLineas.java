import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void main(String[] args) {
        String nombreArchivo = "datos.txt";
        String palabra = "java";
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabra)) {
                    contador++;
                }
            }
            System.out.println("Número de líneas que contienen la palabra '"
                    + palabra + "': " + contador);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}