//package Tests;
//
//import SharedData.SharedData;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AlertsFramesWindows extends SharedData {
//
//    @Test
//
//    public void testMethod(){
//
//
//        WebElement alertsFramesWindows = getDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFramesWindows.click();
//
//        WebElement browserWindows = getDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
//        browserWindows.click();
//
//        WebElement newTabButton = getDriver().findElement(By.id("tabButton"));
//        newTabButton.click();
//
//        System.out.println("url:" + getDriver().getCurrentUrl());
//
//        List <String> tabs = new ArrayList<>(getDriver().getWindowHandles()); //lista de taburi deschise
//        getDriver().switchTo().window(tabs.get(1)); // faci switch intre taburi
//
//        System.out.println("url:" + getDriver().getCurrentUrl());
//
//        getDriver().close(); // inchizi tab curent
//        getDriver().switchTo().window(tabs.get(0));
//
//        WebElement newWindowButton = getDriver().findElement(By.id("windowButton"));
//        newWindowButton.click();
//
//        System.out.println("url:" + getDriver().getCurrentUrl());
//
//        List <String> windows = new ArrayList<>(getDriver().getWindowHandles()); //lista de taburi deschise
//        getDriver().switchTo().window(windows.get(1)); // faci switch intre taburi
//
//        System.out.println("url:" + getDriver().getCurrentUrl());
//
//        getDriver().close(); // inchizi tab curent
//        getDriver().switchTo().window(windows.get(0));
//
//        WebElement alertsButton = getDriver().findElement(By.id("item-1"));
//        alertsButton.click();
//
//
//
//
//
//    }
//
//}
