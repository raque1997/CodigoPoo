
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raque
 */
public class MainCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar una Collection que almacene objetos de tipo String
        //Collection <clase_elementos> nombre_objeto = new Collection<clase_elementos> ();
        Collection<String> listaNombres = new ArrayList<>();
        
        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Permitir al usuario agregar nombres manualmente guardandolos en un string
        String nombre;
        String respuesta;
        do {
            System.out.print("Ingrese un nombre para agregar a la lista: ");
            nombre = scanner.nextLine();
            listaNombres.add(nombre);
            
            System.out.print("¿Desea agregar otro nombre? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        
        // Imprimir los valores que se agregaron a la lista
        System.out.println("Nombres en la lista: " + listaNombres);
        
        // Solicitar al usuario que ingrese el nombre que desea eliminar
        System.out.print("Ingrese el nombre que desea eliminar: ");
        String nombreAEliminar = scanner.nextLine();
        
        // Eliminar el nombre si existe en la lista
        if (listaNombres.remove(nombreAEliminar)) {
            System.out.println(nombreAEliminar + " fue eliminado de la lista.");
        } else {
            System.out.println(nombreAEliminar + " no se encuentra en la lista.");
        }
        
        // Imprimir los valores restantes
        System.out.println("Nombres en la lista después de eliminar: " + listaNombres);
        
        // Cerrar el Scanner
        scanner.close();
    }
    
}
