package Pages.AlertFrameWindows;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement frameText;

    public void interractFirstIframe(){
        frameMethods.switchToFrame("frame1");
        System.out.println(frameText.getText());
        frameMethods.switchMainFrame();

    }

    public void interractSecondIframe(){
        frameMethods.switchToFrame("frame2");
        System.out.println(frameText.getText());
        frameMethods.switchMainFrame();
    }



}
