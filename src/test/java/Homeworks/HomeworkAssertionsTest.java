package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeworkAssertionsTest {
    @Test
    public void verifiTheTitle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        String title = "Home Page";
        Assert.assertTrue(title.equals("Home Page"), "The title verification passed");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void verifiIfShopNewYogaIsDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        boolean ShopNewYogabuttonIsdisplayed = true;
        if (!ShopNewYogabuttonIsdisplayed) {
            Assert.fail("Shop New Yoga button Is not displayed");
        }
    }
@Test
        public void verityIfShopWomenDealsButtonisDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    WebElement SaleTab = driver.findElement(By.id("ui-id-8"));
    SaleTab.click();
    boolean ShopWomenDealsButtonisDisplayed =true;
    if(!ShopWomenDealsButtonisDisplayed){
        Assert.fail("Shop Women Deals Button is not Displayed");
        driver.quit();
    }
    }
    }


