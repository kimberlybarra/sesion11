package sesion11;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
	private List<Observador> usuarios;

    public Notificador() {
        this.usuarios = new ArrayList<>();
    }

    public void suscribir(Observador usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario suscrito al sistema.");
    }

    public void desuscribir(Observador usuario) {
        usuarios.remove(usuario);
        System.out.println("Usuario eliminado del sistema.");
    }

    public void notificar(String mensaje) {
        System.out.println("Enviando notificaciones...");
        for (Observador usuario : usuarios) {
            usuario.recibirNotificacion(mensaje);
        }
    }
}
