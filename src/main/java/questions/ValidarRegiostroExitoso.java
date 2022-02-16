package questions;


import exceptions.ExcepcionGeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static enums.MensajeRegistroExitoso.MENSAJE_REGISTRO_EXITOSO;
import static userinterfaces.ResultadoDeRegistro.TEXTO_REGISTRO_EXITOSO;


public class ValidarRegiostroExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            TEXTO_REGISTRO_EXITOSO.resolveAllFor(actor).get(0).getText().
                    equals(MENSAJE_REGISTRO_EXITOSO);
            return true;
        } catch (ExcepcionGeneral NoSeEncontroElemento) {
            return false;
        }
    }


    public static ValidarRegiostroExitoso enElPortal() {
        return new ValidarRegiostroExitoso();
    }
}