package starter.stepdefinitions;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import starter.navigation.NavigateTo;
import net.serenitybdd.screenplay.actions.Switch;
import static net.serenitybdd.core.Serenity.getDriver;

public class DemoBlazeClickSteps {
    @Given("{actor} I navigate to demoblaze")
    public void clickThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }
    private WebDriver driver;
       public DemoBlazeClickSteps() {
        this.driver = getDriver();
    }
    @When("{actor} I click on the object")
    public void clickOnObject(Actor actor) {
        // Realizar clic en el objeto deseado
        driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//a[@id='nava']")).click();

        actor.attemptsTo(
                Switch.toAlert().andAccept()
        );

    }


    }

