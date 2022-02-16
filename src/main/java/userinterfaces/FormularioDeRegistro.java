package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioDeRegistro {

    private FormularioDeRegistro() {

    }

    public static final Target NOMBRE = Target.the("Campo para ingresar nombre")
            .located(By.id("firstName"));

    public static final Target APELLIDO = Target.the("Campo para ingresar apellido")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Campo para ingresar email")
            .located(By.id("userEmail"));


    public static final Target GENERO(String valorOpcion) {
        return Target.the("Opcion para selccionar genero")
                .located(By.xpath("//label[.='"+valorOpcion+"']"));
    }

    public static final Target CELULAR = Target.the("ampo para ingresar celular")
            .located(By.id("userNumber"));

    public static final Target FECHA_CUMPLEANO = Target.the("Campo para ingresar cumpleano")
            .located(By.id("dateOfBirthInput"));

    public static final  Target LISTA_AÑO = Target.the("Elemento para elegir el año")
            .located(By.className("react-datepicker__year-select"));

    public static final Target MES_AÑO(String valorOpcion) {
        return Target.the("Elemento para elegir el año")
                .located(By.xpath("//option[.='"+valorOpcion+"']"));
    }

    public static final  Target LISTA_DE_MESES = Target.the("Elemento para desplegar la lista de mesese")
            .located(By.className("react-datepicker__month-select"));

    public static final Target DIA(String valorOpcion) {
        return Target.the("Elemento para elegir el año")
                .located(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0"+valorOpcion+"']"));
    }

    public static final Target ASIGNATURA = Target.the("Campo para ingresar las asignaturas")
            .located(By.id("subjectsInput"));

    public static final Target HOBBIE_SPORT = Target.the("Opcion hobbie sport")
            .located(By.cssSelector("[for='hobbies-checkbox-1']"));

    public static final Target HOBBIE_READING = Target.the("Opcion hobbie reading")
            .located(By.cssSelector("[for='hobbies-checkbox-2']"));

    public static final Target HOBBIE_MUSIC = Target.the("Opcion hobbie music")
            .located(By.cssSelector("[for='hobbies-checkbox-3']"));

    public static final Target IMAGEN = Target.the("Opcion para subir imagen")
            .located(By.xpath("//input[@id='uploadPicture']"));

    public static final Target DIRECCION = Target.the("Campo para ingresar direcccion")
            .located(By.id("currentAddress"));

    public static final Target ESTADO = Target.the("Campo para listar los estados")
            .located(By.xpath("//div[@class=' css-yk16xz-control']/div[@class=' css-1hwfws3']"));

    public static final Target CAMPO_ESTADO = Target.the("Campo para ingresar el estado")
            .located(By.cssSelector("#state [autocapitalize='none']"));

    public static final Target CIUDAD = Target.the("Campo para listar las ciudades")
            .located(By.xpath("//div[@id='city']//div[@class=' css-1hwfws3']"));

    public static final Target CAMPO_CIUDAD = Target.the("Campo para ingresar la ciudad")
            .located(By.xpath("//div[@id='city']//input[1]"));


    public static final Target BOTON_SUBMIT = Target.the("Boton para enviar la informacion del formulario")
            .located(By.id("submit"));

}
