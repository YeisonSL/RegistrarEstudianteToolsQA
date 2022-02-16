package tasks;

import interactions.DarClic;
import interactions.Escribir;
import interactions.SeleccionarOpcionLista;
import interactions.SeleccionarFecha;
import interactions.SeleccionarFoto;
import interactions.SeleccionarHobbie;
import models.InformacionEstudiante;
import userinterfaces.FormularioDeRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static userinterfaces.FormularioDeRegistro.APELLIDO;
import static userinterfaces.FormularioDeRegistro.ASIGNATURA;
import static userinterfaces.FormularioDeRegistro.BOTON_SUBMIT;
import static userinterfaces.FormularioDeRegistro.CAMPO_CIUDAD;
import static userinterfaces.FormularioDeRegistro.CAMPO_ESTADO;
import static userinterfaces.FormularioDeRegistro.CELULAR;
import static userinterfaces.FormularioDeRegistro.CIUDAD;
import static userinterfaces.FormularioDeRegistro.DIRECCION;
import static userinterfaces.FormularioDeRegistro.EMAIL;
import static userinterfaces.FormularioDeRegistro.ESTADO;
import static userinterfaces.FormularioDeRegistro.NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarInformacionEstudiante implements Task {

    private List<InformacionEstudiante> infoEstudiante;

    public IngresarInformacionEstudiante(List<InformacionEstudiante> infoEstudiante) {
        this.infoEstudiante = infoEstudiante;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Escribir.enElemento(infoEstudiante.get(0).getNombre(), NOMBRE));
        actor.attemptsTo(Escribir.enElemento(infoEstudiante.get(0).getApellido(), APELLIDO));
        actor.attemptsTo(Escribir.enElemento(infoEstudiante.get(0).getEmail(), EMAIL));
        actor.attemptsTo(Click.on(FormularioDeRegistro.GENERO(infoEstudiante.get(0).getGenero())));
        actor.attemptsTo(Escribir.enElemento(infoEstudiante.get(0).getCelular(), CELULAR));
        actor.attemptsTo(SeleccionarFecha.cumple(infoEstudiante.get(0).getCumpleano()));
        actor.attemptsTo(SeleccionarOpcionLista.deEstudiante(infoEstudiante.get(0).getAsignatura(), ASIGNATURA));
        actor.attemptsTo(SeleccionarHobbie.deEstudiante(infoEstudiante.get(0).getHobbies()));
        actor.attemptsTo(SeleccionarFoto.deEstudiante(infoEstudiante.get(0).getImagen()));
        actor.attemptsTo(Escribir.enElemento(infoEstudiante.get(0).getDireccion(),DIRECCION));
        actor.attemptsTo(DarClic.enElemento(ESTADO),
                          SeleccionarOpcionLista.deEstudiante(infoEstudiante.get(0).getEstado(), CAMPO_ESTADO) );
        actor.attemptsTo(DarClic.enElemento(CIUDAD),
                SeleccionarOpcionLista.deEstudiante(infoEstudiante.get(0).getEstado(), CAMPO_CIUDAD) );
        actor.attemptsTo(DarClic.enElemento(BOTON_SUBMIT));
    }

    public static IngresarInformacionEstudiante enFormulario(List<InformacionEstudiante> infoEstudiante) {
        return instrumented(IngresarInformacionEstudiante.class, infoEstudiante);
    }

}