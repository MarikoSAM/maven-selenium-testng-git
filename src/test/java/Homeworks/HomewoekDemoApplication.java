package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomewoekDemoApplication {
    @Test
    public void verifyCustomerNameIsDisplayed() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com");
        WebElement userName =driver.findElement(By.id("username"));
        WebElement password =driver.findElement(By.id("password"));
        WebElement signInBuuton  = driver.findElement(By.id("log-in"));
Thread.sleep(2000);

        userName.sendKeys("admin");
        Thread.sleep(2000);
        password.sendKeys("qwerty");
        Thread.sleep(2000);
        signInBuuton.click();
        Thread.sleep(2000);

        WebElement customerName = driver.findElement(By.xpath("//div[@class ='logged-user-name']"));
        Assert.assertTrue(customerName.isDisplayed(),"Customer name is not displayed");
        driver.quit();
    }
}
