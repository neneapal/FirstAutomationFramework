package HelperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {

    private WebDriver driver;

    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void acceptAlert(){
        waitForAlert();
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }

    public void cancelAlert(){
        waitForAlert();
        Alert okCancel = driver.switchTo().alert();
        okCancel.dismiss();
    }

    public void fillAlert(String value){
        waitForAlert();
        Alert alertValue = driver.switchTo().alert();
        alertValue.sendKeys(value);
        alertValue.accept();
    }

}
