package Tests;

import Pages.AlertFrameWindows.AlertFrameWindowPage;
import Pages.AlertFrameWindows.AlertPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class AlertTest extends SharedData {

   @Test

    public void testMethod() {

       HomePage homePage = new HomePage(getDriver());
       homePage.clickAlert();
       homePage.clickAlertFrameWindows();

       AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
       alertFrameWindowPage.clickAlerts();


       AlertPage alertPage = new AlertPage(getDriver());
       alertPage.interractAlertOk();
       alertPage.interractAlertDelay();
       alertPage.interractOkCancel();
       alertPage.interractAlertValue("Text");







   }

}
