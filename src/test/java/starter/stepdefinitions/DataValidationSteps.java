package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.Validate.FieldValidator;

public class DataValidationSteps {

    private FieldValidator fieldValidator = new FieldValidator();
    private String enteredValue;


    @Given("Ingreso el {string} campo name")
    public void enterValue(String name) {
        System.out.println("Valor recibido: " + name);
        enteredValue = name;
    }

    @When("Valido el campo nombre")
    public void validateName() {
        System.out.println("Valor recibido: " + enteredValue);
        /*WebElement campo = driver1.findElement(By.xpath("//input[@id='name']"));
        System.out.println("Valor recibido: " + campo);*/
        fieldValidator.validateName(enteredValue);
    }
}