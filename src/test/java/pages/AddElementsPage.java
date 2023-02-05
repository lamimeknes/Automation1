package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddElementsPage {
    public AddElementsPage(){

        WebDriver driver=Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//button[normalize-space()='Add Element']")
    public WebElement addBtn;

    @FindBy(xpath="//button[normalize-space()='Delete']")
    public WebElement DeleteBtn;
}
