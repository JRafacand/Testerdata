package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.Validate.FieldValidator;

public class DataValidationSteps {

    private FieldValidator fieldValidator= new FieldValidator();
    private String enteredValue;
    private WebDriver driver;
    @Given("Ingreso el {string} campo name ")
    public void enterValue(String value){
        enteredValue=value;
    }

    public void validateName(){
        WebElement campo=driver.findElement(By.xpath("//input[@id='name']"));
        fieldValidator.validateName(campo, enteredValue);
    }
}