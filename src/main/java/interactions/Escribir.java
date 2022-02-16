package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Escribir implements Interaction {
    private String texto;
    private Target elemento;

    public Escribir(String texto,Target elemento) {
        this.texto = texto;
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(texto).into(elemento));
    }

    public static Escribir enElemento(String texto,Target elemento) {
        return Tasks.instrumented(Escribir.class, texto,elemento);
    }

}
