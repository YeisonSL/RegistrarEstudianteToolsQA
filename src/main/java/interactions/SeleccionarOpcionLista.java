package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class SeleccionarOpcionLista implements Interaction {

    private String asignaturas;
    public Target elemento;

    public SeleccionarOpcionLista(String asignaturas, Target elemento) {
        this.asignaturas = asignaturas;
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] asignatura = asignaturas.split(",");
        for (String asignatur : asignatura)
        {
            actor.attemptsTo(Enter.theValue(asignatur).into(elemento).thenHit(Keys.TAB));
        }
    }

    public static SeleccionarOpcionLista deEstudiante(String asignatura, Target elemento) {
        return Tasks.instrumented(SeleccionarOpcionLista.class, asignatura, elemento);
    }

}
