package starter.Validate;
import  starter.stepdefinitions.DataValidationSteps;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebElement;

public class FieldValidator {
    public void validateName(WebElement campo, String enteredValue) {
        campo.sendKeys(enteredValue);
        String valorIngresado = campo.getAttribute("value");
        if (!ValidationUtils.validateName(valorIngresado)) {
            Serenity.recordReportData().withTitle("Validación de campo").andContents("El campo debe contener solo letras.");
            throw new AssertionError("El campo debe contener solo letras.");
        } else {
            Serenity.recordReportData().withTitle("Validación de campo").andContents("El campo contiene letras.");
        }
    }

    public static class ValidationUtils{
        public static boolean validateName(String name){
            return name.matches("^[A-Za-z]+$");
        }
    }
}
