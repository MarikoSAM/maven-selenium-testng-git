package Homeworks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MagentoPracticeTest {

    @Test
    public void verifyPromotionalButtons(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

        String expectedPageTitle = "Home Page";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle,expectedPageTitle, "Page title verification failed.");

        WebElement shopNewYogaButton = driver.findElement(By.xpath("//*[text() = 'Shop New Yoga']"));
        Assert.assertTrue(shopNewYogaButton.isDisplayed(), "The shop new yoga button is not displayed.");

        WebElement saleTab = driver.findElement(By.xpath("//*[text() = 'Sale']"));
        saleTab.click();

        WebElement shopWomenDeals = driver.findElement(By.xpath("//*[text() = 'Shop Women’s Deals']"));
        Assert.assertTrue(shopWomenDeals.isDisplayed(), "The shop women's deals button is not displayed.");

        driver.quit();
    }
}