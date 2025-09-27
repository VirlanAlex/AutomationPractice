package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationPractice {

    public WebDriver driver;

    @Test

    public void metodaTest(){

        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();

        WebElement loginElement = driver.findElement(By.className("login"));
        loginElement.click();

        WebElement email_createElement = driver.findElement(By.id("email_create"));
        String email_create = "vimsa11345@bitmens.com";
        email_createElement.sendKeys(email_create);

        WebElement SubmitCreateElement = driver.findElement(By.id("SubmitCreate"));
        SubmitCreateElement.click();

        WebDriverWait shortwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement id_gender1Element = shortwait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
        id_gender1Element.click();

        WebElement customer_firstnameElement = driver.findElement(By.id("customer_firstname"));
        String customer_firstname = "John";
        customer_firstnameElement.sendKeys(customer_firstname);

        WebElement customer_lastnameElement = driver.findElement(By.id("customer_lastname"));
        String customer_lastname = "Smith";
        customer_lastnameElement.sendKeys(customer_lastname);

        WebElement emailElement = driver.findElement(By.id("email"));
        emailElement.click();

        WebElement passwdElement = driver.findElement(By.id("passwd"));
        String passwd = "12345";
        passwdElement.sendKeys(passwd);

        WebElement daysdropdown = driver.findElement(By.id("days"));
        Select selectDay = new Select(daysdropdown);
        selectDay.selectByValue("20");

        WebElement monthsdropdown = driver.findElement(By.id("months"));
        Select selectMonth = new Select(monthsdropdown);
        selectMonth.selectByValue("8");

        WebElement yearsdropdown = driver.findElement(By.id("years"));
        Select selectYear = new Select(yearsdropdown);
        selectYear.selectByValue("1987");

        WebElement newsletterElement = driver.findElement(By.id("newsletter"));
        newsletterElement.click();

        WebElement submitAccountElement = driver.findElement(By.id("submitAccount"));
        submitAccountElement.click();

        WebDriverWait longwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement addMyFirstAddressElement = longwait.until(ExpectedConditions.elementToBeClickable(By.className("icon-building")));
        addMyFirstAddressElement.click();

        WebElement firstnameElement = driver.findElement(By.id("firstname"));
        firstnameElement.click();

        WebElement lastnameElement = driver.findElement(By.id("lastname"));
        lastnameElement.click();

        WebElement companyElement = driver.findElement(By.id("company"));
        String company = "IT SCHOOL";
        companyElement.sendKeys(company);

        WebElement address1Element = driver.findElement(By.id("address1"));
        String address1 = "Bd. General Ion Dragalina, nr 27, Timisoara";
        address1Element.sendKeys(address1);

        WebElement address2Element = driver.findElement(By.id("address2"));
        String address2 = "N/A";
        address2Element.sendKeys(address2);

        WebElement cityElement = driver.findElement(By.id("city"));
        String city = "Timisoara";
        cityElement.sendKeys(city);

        WebElement statedropdown = driver.findElement(By.id("id_state"));
        Select selectState = new Select(statedropdown);
        selectState.selectByValue("2");

        WebElement postcodeElement = driver.findElement(By.id("postcode"));
        String postcode = "12345";
        postcodeElement.sendKeys(postcode);

        WebElement phoneElement = driver.findElement(By.id("phone"));
        String phone = "0292332";
        phoneElement.sendKeys(phone);

        WebElement phoneMobileElement = driver.findElement(By.id("phone_mobile"));
        String phoneMobile = "1234522";
        phoneMobileElement.sendKeys(phoneMobile);

        WebElement otherElement = driver.findElement(By.id("other"));
        String other = "Acesta este doar un test";
        otherElement.sendKeys(other);

        WebElement aliasElement = driver.findElement(By.id("alias"));
        aliasElement.click();

        WebElement submitAddressElement = driver.findElement(By.id("submitAddress"));
        submitAddressElement.click();
    }
}
