package Tests;

import Pages.HomePage;
import Pages.Forms.FormPage;
import Pages.Forms.PracticeFormPage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;


public class FormTest extends SharedData {

    public WebDriver driver;

    @Test

    public void testMethod(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlert();
        homePage.clickForms();
//        WebElement forms = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        forms.click();

        FormPage formPage = new FormPage(getDriver());
        formPage.clickPracticeForm();
//        WebElement practiceForms = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        practiceForms.click();

        String firstNameValue = "Alexandru";
        String lastNameValue = "Palsoi";
        String emailAddressValue = "bla@blabla.com";
        String mobileValue = "0723654777";
        String subjectsValue = "English";
        String addressValue = "adress, number";
        String stateValue = "NCR";
        String cityValue = "Delhi";
        String expectedMessage = "Thanks for submitting the form";


        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillPracticeForm(firstNameValue, lastNameValue, emailAddressValue, mobileValue, subjectsValue,
                addressValue, stateValue, cityValue);

        List<String> formValues = practiceFormPage.getFormValues();
        practiceFormPage.fillSubmit();

        practiceFormPage.validatePracticeForm(expectedMessage, firstNameValue, lastNameValue, emailAddressValue,
                formValues.get(0), mobileValue, subjectsValue, formValues.get(1), addressValue, new File("src/test/resources/DECLARATIE.DOCX "), stateValue, cityValue);

//        WebElement firstName = driver.findElement(By.id("firstName"));
//        String firstNameValue = "Alexandru";
//        firstName.sendKeys(firstNameValue);
//
//        WebElement lastName = driver.findElement(By.id("lastName"));
//        String lastNameValue = "Palsoi";
//        lastName.sendKeys(lastNameValue);

//        WebElement emailAddress = driver.findElement(By.id("userEmail"));
//        String emailAddressValue = "bla@blabla.com";
//        emailAddress.sendKeys(emailAddressValue);
//
//        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        gender.click();
//        String genderValue = gender.getText();

//        WebElement mobile = driver.findElement(By.id("userNumber"));
//        String mobileValue = "0723654777";
//        mobile.sendKeys(mobileValue);

//        WebElement subjects = driver.findElement(By.id("subjectsInput"));
//        String subjectsValue = "English";
//        subjects.sendKeys(subjectsValue);
//        subjects.sendKeys(Keys.ENTER);

//        WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//        hobbies.click();
//        String hobbiesValue = hobbies.getText();

//        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
//        File file = new File("src/test/resources/DECLARATIE.DOCX");
//        uploadPicture.sendKeys(file.getAbsolutePath());

//        WebElement address = driver.findElement(By.id("currentAddress"));
//        String addressValue = "adress, number";
//        address.sendKeys(addressValue);

//        js.executeScript("window.scrollBy(0,450)", "");

//        WebElement state = driver.findElement(By.id("state"));
//        state.click();

//        WebElement selectState = driver.findElement(By.id("react-select-3-input"));
//        String stateValue = "NCR";
//        selectState.sendKeys(stateValue);
//        selectState.sendKeys(Keys.ENTER);

//        WebElement city = driver.findElement(By.id("city"));
//        city.click();

//        WebElement selectCity = driver.findElement(By.id("react-select-4-input"));
//        String cityValue = "Delhi";
//        selectCity.sendKeys(cityValue);
//        selectCity.sendKeys(Keys.ENTER);

//        WebElement submitButton = driver.findElement(By.id("submit"));
//        js.executeScript("arguments[0].click();", submitButton);

//        WebElement thanksMessage = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        String actualMessage = thanksMessage.getText();
//        String expectedMessage = "Thanks for submitting the form";
//        Assert.assertEquals(actualMessage, expectedMessage);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
//        LocalDateTime now = LocalDateTime.now();
//        String dateOfBirthValue = dtf.format(now);
//
//        List<WebElement> validationTable = driver.findElements(By.cssSelector(".table-dark>tbody>tr"));
//        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
//        Assert.assertTrue(validationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue));
//
//        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
//        Assert.assertTrue(validationTable.get(1).getText().contains(emailAddressValue));
//
//        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
//        Assert.assertTrue(validationTable.get(2).getText().contains(genderValue));
//
//        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
//        Assert.assertTrue(validationTable.get(3).getText().contains(mobileValue));
//
////        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
////        Assert.assertTrue(validationTable.get(4).getText().contains(dateOfBirthValue));
//
//        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
//        Assert.assertTrue(validationTable.get(5).getText().contains(subjectsValue));
//
//        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
//        Assert.assertTrue(validationTable.get(6).getText().contains(hobbiesValue));
//
//        Assert.assertTrue(validationTable.get(7).getText().contains("Picture"));
//        Assert.assertTrue(validationTable.get(7).getText().contains(file.getName()));
//
//        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
//        Assert.assertTrue(validationTable.get(8).getText().contains(addressValue));
//
//        Assert.assertTrue(validationTable.get(9).getText().contains("State and City"));
//        Assert.assertTrue(validationTable.get(9).getText().contains(stateValue + " " + cityValue));

//        WebElement closeButton = driver.findElement(By.id("closeLargeModal"));
//        closeButton.sendKeys(Keys.ENTER);
//        closeButton.sendKeys(Keys.ENTER); IN CAZUL IN CARE COMANDA DE MAI SUS NU MERGE

        practiceFormPage.clickClose();

    }

}

