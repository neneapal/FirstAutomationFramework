package Pages.Forms;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//span[text()='Practice Form']")
    private WebElement practiceForms;

    public void clickPracticeForm(){
        practiceForms.click();
    }

}


