import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    
    private static int getOption() {
        int option = -1;
        try {
            option = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un número válido.");
        }
        return option;
    }

    private static void handleOption(int option) {
        switch (option) {
            case 1:
                addTask();
                break;
            case 2:
                listTasks();
                break;
            case 3:
                deleteTask();
                break;
            case 4:
                System.out.println("Saliendo del gestor de tareas. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

    private static void showMenu() {
        System.out.println("\n Tu Lista de tareas actual! ");
        System.out.println("1 - Nueva tarea");
        System.out.println("2 - Listado de tareas");
        System.out.println("3 - Eliminar tarea");
        System.out.println("4 - Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = getOption();
            handleOption(option);
        } while (option != 4);
    }
    
}
