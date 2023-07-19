package starter.Validate;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebElement;
import starter.stepdefinitions.DataValidationSteps;

public class FieldValidator {
    public void validateName(WebElement campo, String enteredValue) {
        campo.sendKeys(enteredValue);
        String valorIngresado = campo.getAttribute("value");
        if (!DataValidationSteps.validateName(valorIngresado)) {
            Serenity.recordReportData().withTitle("Validación de campo").andContents("El campo debe contener solo letras.");
            throw new AssertionError("El campo debe contener solo letras.");
        } else {
            Serenity.recordReportData().withTitle("Validación de campo").andContents("El campo contiene letras.");
        }
    }
}
