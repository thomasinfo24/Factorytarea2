package FactoryTarea;

public class EmailNotificacion implements Notificacion {

    private String prioridad;
    private String encabezado;
    private String mensajeInicial;


    @Override
    public void enviarMensaje(String mensaje) {

    }

    @Override
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    @Override
    public void setMensajeInicial(String mensajeInicial) {
        this.mensajeInicial = mensajeInicial;
    }
}
