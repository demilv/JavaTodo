import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = getOption();
            handleOption(option);
        } while (option <= 4);
    }

    private static void showMenu() {
        System.out.println("\n--- Gestor de Tareas ---");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Eliminar tarea");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    
}
