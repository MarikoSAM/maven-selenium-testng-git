package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
/*
 * [X] 1. Navigate to best-buy web application
 * [X] 2. Locate the search bar
 * [X] 3. In the search bar type IPhone 16
 * [X] 4. Then Remove the digit 6 and type 5 Pro Max
 * [X] 5. Click Enter/Return (Enter usually on Wind, Mac will have Return, Macs will also have Enter)
 * */

public class PracticeKeys {

    public static void main(String[] args) throws InterruptedException {

        // Upcasting - the process of assigning a subtype to a supertype
        // If you declare your driver as a specific driver class you limit your framework to one and only driver type (Chrome)
        // driver = new ChromeDriver();
        WebDriver driver = getDriver("Chrome");
        // maximize window
        /* Navigate to best buy app */
        driver.get("https://www.bestbuy.com/");
        /* Locate search bar */
        WebElement searchInputBox = driver.findElement(By.id("gh-search-input"));
        Thread.sleep(2000);

        /* In the search bar type IPhone 16 */
        searchInputBox.sendKeys("IPhone 16");
        Thread.sleep(2000);

        /* Then Remove the digit 6 and type 5 Pro Max */
        searchInputBox.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        searchInputBox.sendKeys("5 Pro Max");
        Thread.sleep(3000);

        //searchInputBox.sendKeys(Keys.COMMAND + "a");
        //searchInputBox.sendKeys(Keys.COMMAND + Keys.SHIFT);

        //searchInputBox.sendKeys(Keys.chord(Keys.COMMAND,Keys.CONTROL, Keys.BACK_SPACE));

        searchInputBox.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        Thread.sleep(2000);

        searchInputBox.sendKeys(Keys.ARROW_LEFT);
        Thread.sleep(2000);

        searchInputBox.sendKeys(Keys.DELETE);
        Thread.sleep(2000);

        searchInputBox.sendKeys("i");
        Thread.sleep(2000);

        for(int i = 1; i<4; i++){
            searchInputBox.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(2000);
        }

        searchInputBox.sendKeys(Keys.ARROW_UP);
        Thread.sleep(1000);



        /* Click Enter */
        searchInputBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.quit();

    }

    public static WebDriver getDriver(String browserType){
        switch (browserType){
            case "Firefox":
                return new FirefoxDriver();
            case "Safari":
                return new SafariDriver();
            default:
                return new ChromeDriver();
        }
    }

}