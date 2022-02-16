package enums;

public enum MensajeRegistroExitoso {

    MENSAJE_REGISTRO_EXITOSO("Thanks for submitting the form");

    String mensajeRegistroExitoso;

    private MensajeRegistroExitoso(String mensajeRegistroExitoso) {
        this.mensajeRegistroExitoso = mensajeRegistroExitoso;
    }

    public String getMensajeRegistroExitoso() {
        return mensajeRegistroExitoso;
    }
}
