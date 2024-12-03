package sesion11;

public class Usuario implements Observador {
    private String nombre;
    private Notificador notificador;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Usuario " + nombre + " recibió: " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void suscribirse(Notificador notificador) {
        this.notificador = notificador;
        notificador.suscribir(this);
        System.out.println("Usuario " + nombre + " se suscribió al sistema.");
    }

    public void desuscribirse() {
        if (notificador != null) {
            notificador.desuscribir(this);
            System.out.println("Usuario " + nombre + " se desuscribió del sistema.");
            this.notificador = null;
        } else {
            System.out.println("Usuario " + nombre + " no está suscrito a ningún sistema.");
        }
    }
}
