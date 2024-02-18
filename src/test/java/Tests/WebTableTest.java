package Tests;

import Pages.Elements.ElementsPage;
import Pages.HomePage;
import Pages.Elements.WebTablePage;
import SharedData.SharedData;

import org.testng.annotations.Test;

public class WebTableTest extends SharedData {

    @Test

    public void testMethod(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlert();
        homePage.clickElement();

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWebTables();

        String firstNameValue = "Alexandru";
        String lastNameValue = "Palsoi";
        String emailValue = "blabla@hotmail.com";
        String ageValue = "24";
        String salaryValue = "15000";
        String departamentValue = "IT";

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(firstNameValue, lastNameValue, emailValue, ageValue, salaryValue, departamentValue);


//        List<WebElement> actualEntries = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer actualTableSize= actualEntries.size();
//
//        WebElement addButton = getDriver().findElement(By.id("addNewRecordButton"));
//        addButton.click();
//
//        WebElement firstName = getDriver().findElement(By.id("firstName"));
//        firstName.click();
//        String firstNameValue = "Alexandru";
//        firstName.sendKeys(firstNameValue);
//
//        WebElement lastName = getDriver().findElement(By.id("lastName"));
//        lastName.click();
//        String lastNameValue = "Palsoi";
//        lastName.sendKeys(lastNameValue);
//
//        WebElement email = getDriver().findElement(By.id("userEmail"));
//        email.click();
//        String emailValue = "blabla@hotmail.com";
//        email.sendKeys(emailValue);
//
//        WebElement age = getDriver().findElement(By.id("age"));
//        age.click();
//        String ageValue = "24";
//        age.sendKeys(ageValue);
//
//        WebElement salary = getDriver().findElement(By.id("salary"));
//        salary.click();
//        String salaryValue = "15000";
//        salary.sendKeys(salaryValue);
//
//        WebElement departament = getDriver().findElement(By.id("department"));
//        departament.click();
//        String departamentValue = "IT";
//        departament.sendKeys(departamentValue);
//
//        WebElement submitButton = getDriver().findElement(By.id("submit"));
//        submitButton.click();
//
//        List<WebElement> expectedEntries = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer expectedtableSize= expectedEntries.size();
//
//        Assert.assertTrue(actualTableSize+1==expectedtableSize);
//
//        String lastTableEntry = expectedEntries.get(actualTableSize).getText();
//
//        Assert.assertTrue(lastTableEntry.contains(firstNameValue));
//        Assert.assertTrue(lastTableEntry.contains(lastNameValue));
//        Assert.assertTrue(lastTableEntry.contains(ageValue));
//        Assert.assertTrue(lastTableEntry.contains(emailValue));
//        Assert.assertTrue(lastTableEntry.contains(salaryValue));
//        Assert.assertTrue(lastTableEntry.contains(departamentValue));

        //poti face un for care pentru fiecare linie adaugata in tabel sa verifice assertul ca liniile sunt adaugate
        // incluzi assertul intr un for sau while










    }





}
