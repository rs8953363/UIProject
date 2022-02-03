package pages;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.*;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class TC17_SerpilMPage {

            HomePage homePage;
            CartPage cartPage;
            @Test
            public  void test1() throws InterruptedException {

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
                Driver.getDriver().get(ConfigurationReader.getProperty("url"));

//        3. Verify that home page is visible successfully
                homePage = new HomePage();
                Assert.assertTrue(homePage.signUpLogin.isDisplayed());

//        Action actions = new Actions(Driver.getDriver());
//        actions.moveToElement(homePage.productBlueTop).perform();
                //     Driver.getDriver().wait(2);
                homePage.productBlueTop.click();
                homePage.addToCartProductBlueTop.click();
                homePage.viewButton.click();

                cartPage =new CartPage();
                Assert.assertTrue(cartPage.cartPage.isDisplayed());

                cartPage.deleteButton.click();

                Assert.assertTrue(cartPage.cartEmptyText.isDisplayed());

            }}





        System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

        @Given("User launches browser")
        public void user_opens_automationpractice_web_page() {

        }

        @When("User navigates to url http://automationexercise.com")
        public void user_naviagates_to_url() {

        }

        @When("User verifies home page is visible successfully")
        public void user_verifies_home_page_visible() {

        }

        @Then("User adds products to cart")
        public void test_user_adds_products_to_cart() {

        }
        @Then("User clicks cart button")
        public void test_user_clicks_cart_button() {

        }
        @Then("User verifies the cart page is displayed")
        public void test_user_verifies_cart_page_displayed() {

        }
        @When("User clicks 'X' button corresponding to particular product")
        public void test_user_clicks_X_button() {

        }
        @Then("User verifies that product is removed from the cart")
        public void test_user_verifies_product_removed() {

        }
    }


