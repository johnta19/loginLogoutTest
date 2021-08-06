import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class myTestSelenide {

    LoginPageSelenide loginPage = new LoginPageSelenide();
    HomePageSelenide homePage = new HomePageSelenide();
    @BeforeClass
    public void goToUrl() {
        open("http://automationpractice.com");
    }

    @BeforeMethod
    public void logIn() {
        homePage.clickSignInButton();
        loginPage.logIn("test123333@test.com", "test123333").goToMainPage();
    }

    @AfterMethod
    public void logOut() {
        homePage.clickSignOutButton();
    }

    @AfterClass
    public void closeDriver() {
        closeWebDriver();
    }

    @Test
    public void doSmthng() {
        homePage.clickOnProduct1();
    }
}
