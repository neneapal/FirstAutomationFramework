package Pages.AlertFrameWindows;

import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    private WebElement alertOkButton;
    @FindBy(id = "timerAlertButton")
    private WebElement alertDelayButton;
    @FindBy(id = "confirmButton")
    private WebElement alertOkCancelButton;
    @FindBy(id = "promtButton")
    private WebElement alertValueButton;


    public void interractAlertOk(){
        alertOkButton.click();
        alertMethods.acceptAlert();
    }

    public void interractAlertDelay(){
        alertDelayButton.click();
        alertMethods.acceptAlert();
    }

    public void interractOkCancel(){
        alertOkCancelButton.click();
        alertMethods.cancelAlert();
    }

    public void interractAlertValue(String value){
        alertValueButton.click();
        alertMethods.fillAlert(value);
    }

}

