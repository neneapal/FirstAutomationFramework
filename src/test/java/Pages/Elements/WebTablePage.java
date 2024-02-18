package Pages.Elements;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class WebTablePage extends BasePage {

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualEntries;
    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "userEmail")
    private WebElement email;
    @FindBy(id = "age")
    private WebElement age;
    @FindBy(id = "salary")
    private WebElement salary;
    @FindBy(id = "department")
    private WebElement departament;
    @FindBy(id = "submit")
    private WebElement submitButton;

    public void addNewEntry(String firstNameValue, String lastNameValue, String emailValue, String ageValue,
                            String salaryValue, String departamentValue){

        Integer actualTableSize= actualEntries.size();
//        addButton.click();
        elementMethods.clickElement(addButton);
        elementMethods.fillElement(firstName, firstNameValue);
        firstName.click();
//        firstName.sendKeys(firstNameValue);
        lastName.click();
        elementMethods.fillElement(lastName, lastNameValue);
//        lastName.sendKeys(lastNameValue);
        email.click();
        email.sendKeys(emailValue);
        age.click();
        age.sendKeys(ageValue);
        salary.click();
        salary.sendKeys(salaryValue);
        departament.click();
        departament.sendKeys(departamentValue);
        submitButton.click();

        validateNewEntry(actualTableSize,firstNameValue,lastNameValue, emailValue, ageValue,
                salaryValue,departamentValue);

    }

    private void validateNewEntry(Integer actualTableSize,String firstNameValue, String lastNameValue,
                                  String emailValue, String ageValue,
                                  String salaryValue, String departamentValue){
        Integer expectedTableSize= actualEntries.size();
        Assert.assertTrue(actualTableSize+1==expectedTableSize);
        String lastTableEntry = actualEntries.get(actualTableSize).getText();
        Assert.assertTrue(lastTableEntry.contains(firstNameValue));
        Assert.assertTrue(lastTableEntry.contains(lastNameValue));
        Assert.assertTrue(lastTableEntry.contains(ageValue));
        Assert.assertTrue(lastTableEntry.contains(emailValue));
        Assert.assertTrue(lastTableEntry.contains(salaryValue));
        Assert.assertTrue(lastTableEntry.contains(departamentValue));
    }

}
