package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplitoolsPracticeTest {

    @Test
    public void validateSuccessfulSignIn(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com/");

        WebElement usernameInputField = driver.findElement(By.id("username"));
        WebElement passwordInputField = driver.findElement(By.id("password"));
        WebElement signInButton = driver.findElement(By.id("log-in"));

        usernameInputField.sendKeys("admin");
        passwordInputField.sendKeys("qwerty");
        signInButton.click();

        String expectedCustomerName = "Jack Gomez";

        WebElement customerNamePlaceholder = driver.findElement(By.cssSelector(".logged-user-name"));
        String actualCustomerName = customerNamePlaceholder.getText();

        Assert.assertEquals(actualCustomerName, expectedCustomerName, "Customer name verification failed.");

        driver.quit();
    }

}