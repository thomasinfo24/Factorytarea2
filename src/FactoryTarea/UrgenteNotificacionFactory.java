package FactoryTarea;

public class UrgenteNotificacionFactory implements NotificacionFactory2 {


    @Override
    public Notificacion crearEmailNotificacion() {
        EmailNotificacion emailNotificacion = new EmailNotificacion();
        emailNotificacion.setPrioridad("Alta");
        emailNotificacion.setEncabezado("¡URGENTE!");
        emailNotificacion.setMensajeInicial("Este es un mensaje urgente: ");
        return emailNotificacion;
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        SMSNotificacion smsNotificacion = new SMSNotificacion();
        smsNotificacion.setPrioridad("Alta");
        smsNotificacion.setMensajeInicial("Este es un mensaje urgente: ");
        return smsNotificacion;
    }

    @Override
    public Notificacion crearAppNotificacion() {
        AppNotificacion appNotificacion = new AppNotificacion();
        return appNotificacion;
    }
}
