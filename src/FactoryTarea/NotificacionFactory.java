package FactoryTarea;

public class NotificacionFactory {
   public Notificacion crearNotificacion(String tipo) {
            switch (tipo.toUpperCase()) {
                case "EMAIL":
                    EmailNotificacion emailNotificacion = new EmailNotificacion();
                    emailNotificacion.setPrioridad("Alta");
                    emailNotificacion.setEncabezado("¡Importante!");
                    return emailNotificacion;
                case "SMS":
                    SMSNotificacion smsNotificacion = new SMSNotificacion();
                    smsNotificacion.setPrioridad("Alta");
                    smsNotificacion.setMensajeInicial("Este es un mensaje urgente: ");
                    return smsNotificacion;
                case "APP":
                    return new AppNotificacion();
                default:
                    return null;
            }
   }
}
