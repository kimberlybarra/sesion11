package sesion11;

import java.util.Scanner;

public class SistemaDeNotificaciones {
	public static void main(String[] args) {
        Notificador notificador = new Notificador();

        Usuario usuario1 = new Usuario("KIM");
        Usuario usuario2 = new Usuario("BELEN");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** MENÚ DE NOTIFICACIONES ***");
            System.out.println("1. Suscribirse (KIM)");
            System.out.println("2. Desuscribirse (KIM)");
            System.out.println("3. Suscribirse (BELEN)");
            System.out.println("4. Desuscribirse (BELEN)");
            System.out.println("5. Enviar notificación");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    usuario1.suscribirse(notificador);
                    break;
                case 2:
                    usuario1.desuscribirse();
                    break;
                case 3:
                    usuario2.suscribirse(notificador);
                    break;
                case 4:
                    usuario2.desuscribirse();
                    break;
                case 5:
                    System.out.print("Ingrese el mensaje de la notificación: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String mensaje = scanner.nextLine();
                    notificador.notificar(mensaje);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

