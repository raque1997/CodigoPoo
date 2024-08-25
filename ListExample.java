import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        // Crear una lista de tipo String
        List<String> nombres = new ArrayList<>();
        
        // Llamar a la función para agregar nombres
        agregarNombres(nombres);
        
        // Mostrar los elementos de la lista
        System.out.println("\nLista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Llamar a la función para eliminar un nombre
        eliminarNombre(nombres);
        
        // Mostrar la lista después de la eliminación
        System.out.println("\nLista de nombres después de la eliminación:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Obtener el tamaño de la lista
        System.out.println("\nTamaño de la lista: " + nombres.size());

        // Limpiar la lista
        nombres.clear();
        System.out.println("\nLista después de ser limpiada: " + nombres);
    }

    // Función para ir agregando nombres a la lista
    public static void agregarNombres(List<String> nombres) {
        Scanner scanner = new Scanner(System.in);
        String nombre;

        System.out.println("Escribe los nombres que deseas agregar a la lista.");
        System.out.println("Escribe 'salir' para finalizar.");

        while (true) {
            System.out.print("Introduce un nombre: ");
            nombre = scanner.nextLine();
            
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            nombres.add(nombre);
        }
    }

    // Función para eliminar un nombre de la lista
    public static void eliminarNombre(List<String> nombres) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce el nombre que deseas eliminar: ");
        String nombreAEliminar = scanner.nextLine();
        
        if (nombres.contains(nombreAEliminar)) {
            nombres.remove(nombreAEliminar);
            System.out.println("\nEl nombre '" + nombreAEliminar + "' ha sido eliminado de la lista.");
        } else {
            System.out.println("\nEl nombre '" + nombreAEliminar + "' no se encuentra en la lista.");
        }
    }
}



