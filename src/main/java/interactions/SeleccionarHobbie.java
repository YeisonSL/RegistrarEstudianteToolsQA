package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterfaces.FormularioDeRegistro.HOBBIE_MUSIC;
import static userinterfaces.FormularioDeRegistro.HOBBIE_READING;
import static userinterfaces.FormularioDeRegistro.HOBBIE_SPORT;

public class SeleccionarHobbie implements Interaction {

    private static final String sport = "Sports";
    private static final String reading = "Reading";
    private static final String music = "Music";
    private String hobbies;


    public SeleccionarHobbie(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] hobbie = hobbies.split(",");
        actor.attemptsTo(Scroll.to(HOBBIE_SPORT));
        for (String hobbi : hobbie) {
            if (hobbi.equals(sport)) {
                actor.attemptsTo(Click.on(HOBBIE_SPORT));
            }
            if (hobbi.equals(reading)) {
                actor.attemptsTo(Click.on(HOBBIE_READING));
            }
            if (hobbi.equals(music)) {
                actor.attemptsTo(Click.on(HOBBIE_MUSIC));
            }

        }

    }

    public static SeleccionarHobbie deEstudiante(String hobbies) {
        return Tasks.instrumented(SeleccionarHobbie.class, hobbies);
    }

}
