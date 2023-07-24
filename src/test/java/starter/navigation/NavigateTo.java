package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigateTo {
    private static WebDriver driver1;
    public static Performable theDemoBlazeHomePage() {
        return Task.where("{0} opens the Demoblaze home page",
                Open.browserOn().the(DemoblazeHomePage.class));
    }

    public static class navigateToCartPage {
        public static Performable theCartPage() {
            return Task.where("{0} opens the Cart page",
                    Open.url("https://www.demoblaze.com/cart.html"));
        }
    }
}
