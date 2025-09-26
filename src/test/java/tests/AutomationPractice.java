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
        String email_create = "vimevosty10282@bitmens.com";
        email_createElement.sendKeys(email_create);

        WebElement SubmitCreateElement = driver.findElement(By.id("SubmitCreate"));
        SubmitCreateElement.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement id_gender1Element = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
        id_gender1Element.click();

        WebElement customer_firstnameElement = driver.findElement(By.id("customer_firstname"));
        String customer_firstname = "Alexandru Ionut";
        customer_firstnameElement.sendKeys(customer_firstname);

        WebElement customer_lastnameElement = driver.findElement(By.id("customer_lastname"));
        String customer_lastname = "Virlan";
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

    }
}
