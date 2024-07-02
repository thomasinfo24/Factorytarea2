package FactoryTarea;

public class RegularNotificacionFactory implements NotificacionFactory2{


    @Override
    public Notificacion crearEmailNotificacion() {
        EmailNotificacion emailNotificacion = new EmailNotificacion();
        emailNotificacion.setPrioridad("Normal");
        emailNotificacion.setEncabezado("¡Importante!");
        return emailNotificacion;
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        SMSNotificacion smsNotificacion = new SMSNotificacion();
        smsNotificacion.setPrioridad("Normal");

        return smsNotificacion;
    }

    @Override
    public Notificacion crearAppNotificacion() {
        AppNotificacion appNotificacion = new AppNotificacion();
        return appNotificacion;
    }
}
