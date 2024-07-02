package FactoryTarea;

public interface Notificacion {
    void enviarMensaje(String mensaje);
    void setPrioridad(String prioridad);
    void setEncabezado(String encabezado);
    void setMensajeInicial(String mensajeInicial);
}
