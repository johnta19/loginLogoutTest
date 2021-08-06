import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;

public class HomePageSelenide {
    private By signInButton = By.className("login");
    private By product1 = By.xpath("(//a[@class=\"product-name\"])[1]");
    private By signOutButton = By.className("logout");
    private By mainLogo = By.id("header_logo");

    public void clickSignInButton() {
        $(signInButton).should(Condition.appear).click();
    }

    public void clickOnProduct1() {
        $(product1).should(Condition.appear).click();
    }

    public void clickSignOutButton() {
        $(signOutButton).should(Condition.appear).click();
    }

    public void goToMainPage() {
        $(mainLogo).click();
    }

}
