package FactoryTarea;

public class MainFactory {
    public static void main(String[] args) {
        NotificacionFactory notificacionFactory = new NotificacionFactory();

        // Crear y enviar un email
        Notificacion not1 = notificacionFactory.crearNotificacion("EMAIL");
        if (not1 != null) {
            not1.enviarMensaje("Revisa tu correo lo antes posible.");
        } else {
            System.out.println("Tipo de notificación no reconocido.");
        }

        // Crear y enviar un SMS
        Notificacion not2 = notificacionFactory.crearNotificacion("SMS");
        if (not2 != null) {
            not2.enviarMensaje("¡Este es un mensaje SMS!");
        } else {
            System.out.println("Tipo de notificación no reconocido.");
        }

        // Crear y enviar una notificación de la aplicación
        Notificacion not3 = notificacionFactory.crearNotificacion("APP");
        if (not3 != null) {
            not3.enviarMensaje("¡Notificación de la aplicación!");
        } else {
            System.out.println("Tipo de notificación no reconocido.");
        }
    }

}
