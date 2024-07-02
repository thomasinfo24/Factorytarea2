package FactoryTarea;

public class AppNotificacion implements Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación de la aplicación con el mensaje: " + mensaje);
    }

    @Override
    public void setPrioridad(String prioridad) {

    }

    @Override
    public void setEncabezado(String encabezado) {

    }

    @Override
    public void setMensajeInicial(String mensajeInicial) {
    }
}
