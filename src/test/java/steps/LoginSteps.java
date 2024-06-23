package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends CommonMethods {

    @Given("user is able to launch swag labs application")
    public void user_is_able_to_launch_swag_labs_application() throws MalformedURLException {
        launchApplication();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.usernameField.sendKeys(ConfigReader.getPropertyValue("username"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("user is navigated to products page")
    public void user_is_navigated_to_products_page() {
        System.out.println("test");
    }
}
