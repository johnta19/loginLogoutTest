import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageSelenide {
    private By login = By.id("email");
    private By pass = By.id("passwd");
    private By summitLogin = By.id("SubmitLogin");

    public HomePageSelenide logIn(String name, String password) {
        $(login).should(Condition.appear).click();
        $(login).should(Condition.appear).sendKeys(name);
        $(pass).should(Condition.appear).click();
        $(pass).should(Condition.appear).sendKeys(password);
        $(summitLogin).should(Condition.appear).click();
        return new HomePageSelenide();
    }
}
