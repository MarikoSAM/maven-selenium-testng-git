package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoPractice {
    public static void main(String[] args) throws InterruptedException {

//        Given the user is on the login page of "https://www.saucedemo.com/"
//        When the user logs in with valid credentials (username: "standard_user", password: "secret_sauce")
//        And navigates to the product listing page
//        And selects "Sauce Labs Backpack" from the product list
//        And adds the selected product to the shopping cart
//        And navigates back to the product listing page
//        And then navigates to the shopping cart page
//        Then the user should see "Sauce Labs Backpack" listed in the cart with exactly 1 item present
//        And the console output should validate the success by outputting "TEST: PASSED"
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        //locate web elements for log in
        WebElement userNameInput = driver.findElement(By.xpath("//input[@data-test ='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));

//interact with element
        String userName = "standard_user", password = "secret_sauce";
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        Thread.sleep(3000);

        //print in the console current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("URL after log in: " + currentUrl);

        WebElement sauceLabsBackpackAddToCardButton =driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack ']"));
        sauceLabsBackpackAddToCardButton.click();
        Thread.sleep(3000);
        WebElement sauceLabsTShirtAddToCartButton = driver.findElement(By.xpath("//button[@name = 'add-to-cart-sauce-labs-bolt-t-shirt']"));
        sauceLabsTShirtAddToCartButton.click();
        Thread.sleep(3000);

        //locate the cart button
        driver.quit();
    }
}
