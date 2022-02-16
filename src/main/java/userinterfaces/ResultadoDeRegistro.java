package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadoDeRegistro {

	private ResultadoDeRegistro() {

	}

	public static final Target TEXTO_REGISTRO_EXITOSO = Target.the("Mensaje de registro exitoso")
			.located(By.id("example-modal-sizes-title-lg"));


}
