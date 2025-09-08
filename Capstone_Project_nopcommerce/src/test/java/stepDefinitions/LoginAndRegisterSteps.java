package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginAndRegisterSteps {

    RegisterPage registerPage;
    LoginPage loginPage;

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        Hooks.driver.get("https://demo.nopcommerce.com/register");
        registerPage = new RegisterPage(Hooks.driver);
    }

    @When("I register with {string}, {string}, {string}, {string}, {string}")
    public void i_register_with(String firstname, String lastname, String email, String password, String confirmPassword) {
        Map<String, String> regData = new HashMap<>();
        regData.put("firstname", firstname);
        regData.put("lastname", lastname);
        regData.put("email", email);
        regData.put("password", password);
        regData.put("confirm password", confirmPassword);
        registerPage.validatingRegisterPage(regData);
    }

    @Then("I should see a registration success message")
    public void i_should_see_a_registration_success_message() {
        System.out.println("✅ Registration successful validation");
    }

    @Then("I should see an email already exists error")
    public void i_should_see_email_already_exists_error() {
        System.out.println("⚠️ Email already exists validation");
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Hooks.driver.get("https://demo.nopcommerce.com/login");
        loginPage = new LoginPage(Hooks.driver);
    }

    @When("I try to login without entering credentials")
    public void i_try_to_login_without_entering_credentials() {
        loginPage.loginWithEpmtyFields();
    }

    @Then("I should see an email required error")
    public void i_should_see_an_email_required_error() {
        System.out.println("⚠️ Email required validation");
    }

    @When("I login with {string} and {string}")
    public void i_login_with(String email, String password) throws InterruptedException {
        Map<String, String> loginData = new HashMap<>();
        loginData.put("loginmail", email);
        loginData.put("password", password);
        loginPage.validatingLoginPage(loginData);
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        System.out.println("✅ Login successful validation");
    }

    @Then("I should see a login error message")
    public void i_should_see_a_login_error_message() {
        System.out.println("❌ Login error validation");
    }
}
