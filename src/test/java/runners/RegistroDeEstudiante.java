package runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resources/features/registrar_estudiante.feature",
        tags = "@RegistarInformacionDeEstudiante" ,
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class RegistroDeEstudiante {

}
