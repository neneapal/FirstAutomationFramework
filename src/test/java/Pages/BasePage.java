package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import HelperMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public WindowMethods windowMethods;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;
    public ElementMethods elementMethods;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        windowMethods = new WindowMethods(driver);
        alertMethods = new AlertMethods(driver);
        frameMethods = new FrameMethods(driver);
        elementMethods = new ElementMethods(driver);
    }
}
