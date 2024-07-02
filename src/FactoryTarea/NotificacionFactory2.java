package FactoryTarea;

public interface NotificacionFactory2 {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}

