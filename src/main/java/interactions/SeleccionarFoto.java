package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.io.File;

import static userinterfaces.FormularioDeRegistro.IMAGEN;

public class SeleccionarFoto implements Interaction {

    private String ruta;

    public SeleccionarFoto(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File imagen = new File(ruta);
        String path = imagen.getAbsolutePath();
        IMAGEN.resolveFor(actor).sendKeys(path);
    }

    public static SeleccionarFoto deEstudiante(String ruta) {
        return Tasks.instrumented(SeleccionarFoto.class, ruta);
    }

}
