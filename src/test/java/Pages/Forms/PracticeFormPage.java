package Pages.Forms;

import Pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "firstName")
    private WebElement firstName;

    @FindBy (id = "lastName")
    private WebElement lastName;

    @FindBy (id = "userEmail")
    private WebElement emailAddress;

    @FindBy (xpath = "//label[@for='gender-radio-1']")
    private WebElement gender;

    @FindBy (id = "userNumber")
    private WebElement mobile;

    @FindBy (id = "subjectsInput")
    private WebElement subjects;

    @FindBy (xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement hobbies;

    @FindBy (id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy (id = "currentAddress")
    private WebElement address;

    @FindBy (id = "state")
    private WebElement state;

    @FindBy (id = "react-select-3-input")
    private WebElement selectState;

    @FindBy (id = "city")
    private WebElement city;

    @FindBy (id = "react-select-4-input")
    private WebElement selectCity;

    @FindBy (id = "submit")
    private WebElement submitButton;

    @FindBy (id = "example-modal-sizes-title-lg")
    private WebElement thanksMessage;

    @FindBy (css = ".table-dark>tbody>tr")
    private List<WebElement> validationTable;

    @FindBy (id = "closeLargeModal")
    private WebElement closeButton;

    public void fillPracticeForm(String firstName,String lastName, String emailAddress,String mobile,
                                 String subjects, String address, String state, String city){
        fillFirstName(firstName);
//        fillLastName(lastName);
//        fillEmailAddress(emailAddress);
        selectGender();
//        fillPhoneNumber(mobile);
        fillSubjectsInput(subjects);
//        fillHobbies();
//        fillAddress(address);
        fillState(state);
        fillCity(city);
    }

    public List<String> getFormValues(){
        List<String> formValues = new ArrayList<>();
        formValues.add(gender.getText());
        formValues.add(hobbies.getText());
        return formValues;
    }

    public void fillFirstName(String firstNameValue){
        elementMethods.fillElement(firstName, firstNameValue);
    }

//    public void fillLastName(String lastNameValue){
//        lastName.sendKeys(lastNameValue);
//    }
//
//    public void fillEmailAddress(String emailAddressValue){
//        emailAddress.sendKeys(emailAddressValue);
//    }

    public void selectGender(){
        elementMethods.clickElement(gender);
    }

//    public void fillPhoneNumber(String mobileValue){
//        mobile.sendKeys(mobileValue);
//    }

    public void fillSubjectsInput(String subjectsValue){
        elementMethods.fillElement(subjects, subjectsValue, Keys.ENTER);
    }

//    public void fillHobbies(){
//        hobbies.click();
//    }
//
//    public void uplooadPicture(){
//        File file = new File("src/test/resources/DECLARATIE.DOCX");
//        uploadPicture.sendKeys(file.getAbsolutePath());
//    }
//
//    public void fillAddress(String addressValue){
//        address.sendKeys(addressValue);
//    }

    public void fillState(String stateValue){
        elementMethods.scrollByPixels(0,450);
        elementMethods.clickElement(state);
        elementMethods.fillElement(selectState, stateValue, Keys.ENTER);
    }

    public void fillCity(String cityValue){
        elementMethods.clickElement(city);
        elementMethods.fillElement(selectCity, cityValue, Keys.ENTER);
//        city.click();
//        selectCity.sendKeys(cityValue);
//        selectCity.sendKeys(Keys.ENTER);
    }

    public void fillSubmit(){
       elementMethods.clickJsElement(submitButton);
    }

    public void clickClose(){
        closeButton.sendKeys(Keys.ENTER);
    }

    public void validatePracticeForm(String expectedMessage, String firstNameValue, String lastNameValue,
                                     String emailAddressValue, String genderValue, String mobileValue, String subjectsValue,
                                    String hobbiesValue, String addressValue, File file, String stateValue, String cityValue){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        String dateOfBirthValue = dtf.format(now);

        elementMethods.validateElementMessage(thanksMessage, expectedMessage); //astea 2 de jos
//        String actualMessage=thanksMessage.getText();
//        Assert.assertEquals(actualMessage, expectedMessage);

        Assert.assertTrue(validationTable.get(0).getText().contains("Student Name"));
        Assert.assertTrue(validationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue));

        Assert.assertTrue(validationTable.get(1).getText().contains("Student Email"));
        Assert.assertTrue(validationTable.get(1).getText().contains(emailAddressValue));

        Assert.assertTrue(validationTable.get(2).getText().contains("Gender"));
        Assert.assertTrue(validationTable.get(2).getText().contains(genderValue));

        Assert.assertTrue(validationTable.get(3).getText().contains("Mobile"));
        Assert.assertTrue(validationTable.get(3).getText().contains(mobileValue));

        Assert.assertTrue(validationTable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue(validationTable.get(4).getText().contains(dateOfBirthValue));

        Assert.assertTrue(validationTable.get(5).getText().contains("Subjects"));
        Assert.assertTrue(validationTable.get(5).getText().contains(subjectsValue));

        Assert.assertTrue(validationTable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(validationTable.get(6).getText().contains(hobbiesValue));

        Assert.assertTrue(validationTable.get(7).getText().contains("Picture"));
        Assert.assertTrue(validationTable.get(7).getText().contains(file.getName()));

        Assert.assertTrue(validationTable.get(8).getText().contains("Address"));
        Assert.assertTrue(validationTable.get(8).getText().contains(addressValue));

        Assert.assertTrue(validationTable.get(9).getText().contains("State and City"));
        Assert.assertTrue(validationTable.get(9).getText().contains(stateValue + " " + cityValue));
    }

}
