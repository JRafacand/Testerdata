package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.Validate.FieldValidator;
import starter.Validate.FieldValidator.ValidationCredit;

import static net.serenitybdd.core.Serenity.getDriver;

public class DataValidationSteps {

    private FieldValidator fieldValidator = new FieldValidator();
    private String enteredValue;
    private WebDriver driver1;

    private String meses;
    public DataValidationSteps() {
        this.driver1 = getDriver();
    }

    @Given("Ingreso el {string} campo Name")
    public void enterValue(String name) {
        enteredValue = name;
    }

    @And("Ingreso el {string} campo Country")
    public void enterCountry(String name) {
        enteredValue = name;
    }

    @And("Ingreso el {string} campo City")
    public void enterCity(String name) {
        enteredValue = name;
    }

    @And("Ingreso el campo {string} Credit Card")
    public void Credit(String name) {
        enteredValue = name;
    }

    @Then("Valido el campo Name")
    public void validateName() {
        WebElement campo = driver1.findElement(By.xpath("//input[@id='name']"));
        fieldValidator.validateName(campo, enteredValue);
    }

    @Then("Valido el campo country")
    public void validateCountry() {
        WebElement campo = driver1.findElement(By.xpath("//input[@id='country']"));
        fieldValidator.validateName(campo, enteredValue);
    }

    @Then("Valido ingreso ciudad")
    public void validateCity() {
        WebElement campo = driver1.findElement(By.xpath("//input[@id='city']"));
        fieldValidator.validateName(campo, enteredValue);
    }

    @Then("Valido ingreso tarjeta")
    public void validateCredit() {
        WebElement campo = driver1.findElement(By.xpath("//input[@id='card']"));
        fieldValidator.validateCredit(campo, enteredValue);
    }

    @Then("Ingreso Mes")
    public void validateMounth() {
      driver1.findElement(By.xpath("//input[@id='month']")).sendKeys("Abril");

    }
    @Then("Valido año {int}")
    public void ingresoValorEnCampoAnio(int valor) {
        if (esAnioValido(valor)) {
            Serenity.recordReportData().withTitle("Validación de campo").andContents("El campo contiene un Años Válido.");
        } else {
            Serenity.recordReportData().withTitle("Validación de campo").andContents("El campo no es un Año válido.");
            throw new AssertionError("El campo no es un Año válido.");
        }
    }

    // Método para validar si un año es válido (por ejemplo, entre 1800 y 2100)
    private boolean esAnioValido(int anio) {
        return anio >= 1800 && anio <= 2100; // Puedes ajustar los límites según tus necesidades
    }
    @Then("Finalizar Compra")
    public void endBuy() {
        driver1.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();

    }
}

