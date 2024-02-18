package Tests;

import Pages.AlertFrameWindows.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.AlertFrameWindows.WindowsPage;
import SharedData.SharedData;

import org.testng.annotations.Test;

public class WindowTest extends SharedData {



    @Test
    public void testMethod() {


        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlert();
        homePage.clickAlertFrameWindows();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickWindows();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interractTab();
        windowsPage.interractWindow();



    }
}
