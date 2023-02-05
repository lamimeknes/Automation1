package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AddElementsPage;
import utilities.Driver;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AddElementsSteps {

    WebDriver driver = Driver.getDriver();
    AddElementsPage addElementPage=new AddElementsPage();
    int count=0;

    @When("user click the add element button {int} times")
    public void user_click_the_add_element_button_times(Integer NumOfTimes) {

        for(int i=0;i<NumOfTimes;i++){
            count++;
            addElementPage.addBtn.click();
        }
    }

    @Then("{int} elements should exist on the InternetApp page")
    public void elements_should_exist_on_the_internet_app_page(int NumOfTimes) {

        List<WebElement> element=driver.findElements(By.xpath("//button[@class='added-manually']"));
        Assert.assertEquals(element.size(),NumOfTimes);
        System.out.println(element.size());
        System.out.println(NumOfTimes);
     //   driver.quit();

    }

    }


