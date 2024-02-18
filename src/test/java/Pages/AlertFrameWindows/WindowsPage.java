package Pages.AlertFrameWindows;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {

    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;
    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public void interractTab(){

        newTabButton.click();
        windowMethods.switchToWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToWindow(0);


//        System.out.println("url: " + driver.getCurrentUrl());
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        driver.close();
//        driver.switchTo().window(tabs.get(0));

    }

    public void interractWindow(){

        newWindowButton.click();
        windowMethods.switchToWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToWindow(0);

//        List<String> windows = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windows.get(1));
//        driver.close();
//        driver.switchTo().window(windows.get(0));

    }




}
