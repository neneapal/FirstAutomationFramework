package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//p[.='Consent']")
    private WebElement alertConsent;

    @FindBy (xpath = "//*[.='Alerts, Frame & Windows']")
    private WebElement alertFrameWindows;
    @FindBy (xpath = "//h5[text()='Forms']")
    private WebElement forms;
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elements;

    public void clickAlert(){
        alertConsent.click();

    }

    public void clickAlertFrameWindows(){
        alertFrameWindows.click();
    }

    public void clickForms(){
        forms.click();
    }

    public void clickElement(){
        elements.click();
    }

}
