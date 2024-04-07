package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuypractice {
    public static void main(String[] args) throws InterruptedException {
        //create a driver object
        WebDriver driver = new ChromeDriver();

        //navigate to the page
        driver.get("https://www.bestbuy.com/");

        // ---------locate the elements we want to interact with-------//
        WebElement searchInputBox =driver.findElement(By.className("search-input"));
        WebElement searchButton = driver.findElement(By.className("header-search-button"));

        searchInputBox.sendKeys("iphone15");
        searchInputBox.clear();
        Thread.sleep(5000);
        searchButton.click();
        Thread.sleep(4000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current URL: " +currentUrl);
        driver.quit();

    }
}
