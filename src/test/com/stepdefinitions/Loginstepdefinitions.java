package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.Assert;

public class Loginstepdefinitions {
    protected String url = "https://www.demoblaze.com/";
    public WebDriver driver = null;

    @Given("User is on Login Homepage")
    public void user_is_on_login_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("User click on login button")
    public void user_click_on_login_button() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // 10 seconds wait time
        WebElement loginbtnhome = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Log in']")));
        loginbtnhome.click();
    }

    @Then("User enters valid username and password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        username.sendKeys("admin0911");
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
        password.sendKeys("admin123");
        WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Log in']")));
        loginbtn.click();
        Thread.sleep(1000); // Optional: Consider using WebDriverWait instead
    }

    @Then("User login is successful")
    public void user_login_is_successful() {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement afterlogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Welcome admin0911']")));
        String aftertext = afterlogin.getText();
        Assert.assertEquals("Welcome admin0911", aftertext);
        System.out.println("User login to demoblaze is successful");
        driver.quit();
    }
}
