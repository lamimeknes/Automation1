package steps;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigReader;

import utilities.Driver;

import java.util.concurrent.TimeUnit;

 public class Hooks {

     WebDriver driver =Driver.getDriver();

     @Given("user navigates to {string} Application")
     public void i_navigate_to(String webApp) {
         if (webApp.equals("Internet")) {
             driver.get(ConfigReader.getProperty("InternetURL"));
         }
     }

     @Before
     public void setUp() {
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().deleteAllCookies();
         System.out.println("Method runs before scenario");
     }

         @After
         public void tearDwn (Scenario scenario){
             if (scenario.isFailed()) {
                 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                 scenario.attach(screenshot, "image/png", "myFailure");
                 System.out.println("Method runs after scenario");
                 driver.quit();

             }

         }
     }

