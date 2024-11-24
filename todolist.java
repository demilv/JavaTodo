import java.util.ArrayList;
import java.util.Scanner;

public class todoList {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    
    private static int option() {
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
                allTasks();
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

    private static void menu() {
        System.out.println("\n Tu Lista de tareas actual! ");
        System.out.println("1 - Nueva tarea");
        System.out.println("2 - Listado de tareas");
        System.out.println("3 - Eliminar tarea");
        System.out.println("4 - Salir");
        System.out.print("Elige una opción: ");
    }

    private static void addTask() {
        System.out.print("Cual es tu nueva tarea?: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Una más para la saca: " + task);
    }

    private static void allTasks() {
        System.out.println("\n--- Lista de Tareas ---");
        if (tasks.isEmpty()) {
            System.out.println(" Aquí No hay tareas.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void deleteTask() {
        allTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Introduce el número de la tarea a eliminar: ");
            try {
                int select = Integer.parseInt(scanner.nextLine()) - 1;
                if (select >= 0 && select < tasks.size()) {
                    String taskOver = tasks.remove(select);
                    System.out.println("Tarea eliminada: " + taskOver);
                } else {
                    System.out.println("Número de tarea no válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            }
        }
    }


    public static void main(String[] args) {
        int option;
        do {
            menu();
            option = option();
            handleOption(option);
        } while (option != 4);
    }
    
}
