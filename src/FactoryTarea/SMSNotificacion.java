package FactoryTarea;

public class SMSNotificacion implements Notificacion{

    private String prioridad;
    private String prefijo;
    private String mensajeInicial;

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS con el mensaje: " + mensaje);
    }

    @Override
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public void setEncabezado(String encabezado) {
        // SMS no tiene encabezado, puedes omitir esta implementación o manejarla según necesites
    }

    @Override
    public void setMensajeInicial(String mensajeInicial) {
        this.mensajeInicial = mensajeInicial;
    }
}
