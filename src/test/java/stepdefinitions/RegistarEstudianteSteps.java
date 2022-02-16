package stepdefinitions;


import enums.Portal;
import models.InformacionEstudiante;
import questions.ValidarRegiostroExitoso;
import tasks.IngresarInformacionEstudiante;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static utilities.Constantes.ESTUDIANTE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RegistarEstudianteSteps {

    @DataTableType
    public InformacionEstudiante infoEstudianteEntry(Map<String, String> entry) {
        return new InformacionEstudiante(
                entry.get("nombre"),
                entry.get("apellido"),
                entry.get("email"),
                entry.get("genero"),
                entry.get("celular"),
                entry.get("cumpleano"),
                entry.get("asignatura"),
                entry.get("hobbies"),
                entry.get("imagen"),
                entry.get("direccion"),
                entry.get("estado"),
                entry.get("ciudad")
        );

    }

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el estudiante ingresa al portal de registro")
    public void queElEstudianteIngresaAlPortal() {
        theActor(ESTUDIANTE).wasAbleTo(Open.url(Portal.PORTAL_REGISTRO.getPortal()));
    }

    @Cuando("el estudiante ingresa su informacion en el formulario")
    public void elEstudianteIngresaLaInformacionDeRegistro(List<InformacionEstudiante> infoEstudiante) {
        theActorInTheSpotlight().attemptsTo(IngresarInformacionEstudiante.enFormulario(infoEstudiante));

    }


    @Entonces("el estudiante podra visualizar mensaje que informe que se envio la informacion")
    public void elEstudianteVisualizaMensajeDeRegistroExitoso() {
        theActorInTheSpotlight().should(seeThat(ValidarRegiostroExitoso.enElPortal(), equalTo(true)));
    }

}
