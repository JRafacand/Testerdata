package starter.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  starter.stepdefinitions.DataValidationSteps;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebElement;

public class FieldValidator {
    public WebDriver driver1;
    public void validateName(String enteredValue) {
        System.out.println("Valor recibido Funcion: " + enteredValue);
        WebElement campo = driver1.findElement(By.xpath("//input[@id='name']"));
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
