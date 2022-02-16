package interactions;

import userinterfaces.FormularioDeRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.FormularioDeRegistro.FECHA_CUMPLEANO;
import static userinterfaces.FormularioDeRegistro.LISTA_AÑO;
import static userinterfaces.FormularioDeRegistro.LISTA_DE_MESES;

public class SeleccionarFecha implements Interaction {

    private String fechaCumpleano;

    public SeleccionarFecha(String fechaCumpleano) {
        this.fechaCumpleano = fechaCumpleano;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] fechaSeparada  = fechaCumpleano.split("-");
        actor.attemptsTo(Click.on(FECHA_CUMPLEANO));
        actor.attemptsTo(Click.on(LISTA_DE_MESES));
        actor.attemptsTo(Click.on(FormularioDeRegistro.MES_AÑO(fechaSeparada[1])));
        actor.attemptsTo(Click.on(LISTA_AÑO));
        actor.attemptsTo(Click.on(FormularioDeRegistro.MES_AÑO(fechaSeparada[2])));
        actor.attemptsTo(Click.on(FormularioDeRegistro.DIA(fechaSeparada[0])));
    }

    public static SeleccionarFecha cumple(String asignatura) {
        return Tasks.instrumented(SeleccionarFecha.class, asignatura);
    }

}
