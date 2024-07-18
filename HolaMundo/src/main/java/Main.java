import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar opciones del menú
        System.out.println("1. Ejecutar archivo Python 1");
        System.out.println("2. Ejecutar archivo Python 2");
        System.out.println("3. Ejecutar archivo Python 3");
        System.out.println("3. Salir");

        // Leer la opción seleccionada por el usuario
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ejecutarArchivoPython("C:\Users\ricar\Desktop\Hackathon");
                break;
            case 2:
                ejecutarArchivoPython("C:\Users\ricar\Desktop");
                break;
            case 3: 
                ejecutarArchivoPython("C:\Users\ricar\Desktop\Hackathon");
            case 4:
                System.out.println("Saliendo del programa...");
                System.exit(0);
            default:
                System.out.println("Opción inválida");
                break;
        }

        scanner.close();
    }

    public static void ejecutarArchivoPython(String rutaArchivo) {
        try {
            // Ejecutar el archivo Python como un proceso externo
            ProcessBuilder processBuilder = new ProcessBuilder("python", rutaArchivo);
            Process proceso = processBuilder.start();

            // Leer la salida del proceso si es necesario
            /*
             * InputStream inputStream = proceso.getInputStream();
             * InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             * BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             * String linea;
             * while ((linea = bufferedReader.readLine()) != null) {
             * System.out.println(linea);
             * }
             */

            // Esperar a que el proceso termine
            int resultado = proceso.waitFor();

            if (resultado == 0) {
                System.out.println("Archivo Python ejecutado exitosamente");
            } else {
                System.out.println("Error al ejecutar el archivo Python");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}