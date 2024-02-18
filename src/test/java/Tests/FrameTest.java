package Tests;

import Pages.AlertFrameWindows.AlertFrameWindowPage;
import Pages.AlertFrameWindows.FramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class FrameTest extends SharedData {

    @Test

            public void testMethod(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlert();
        homePage.clickAlertFrameWindows();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();

        FramePage framePage = new FramePage(getDriver());
        framePage.interractFirstIframe();
        framePage.interractSecondIframe();



    }



}
