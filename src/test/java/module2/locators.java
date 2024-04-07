package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/");
        //find element is a method that will look for a specific
        // web element in the HTML , by itself it cannot do it
        // we will need to provide a locator inside
        //by.id, By.name
Thread.sleep(5000);

WebElement userNameInput = driver.findElement(By.name("txtUsername"));
WebElement passwordInput = driver.findElement(By.name("txtPassword"));

//type something in the input box
        //WebElement.sentKeys();
        userNameInput.sendKeys("username123");
        Thread.sleep(3000);


        //i need to clear the input box to enter new
        userNameInput.clear();
        userNameInput.sendKeys("yoll-student");
        Thread.sleep(3000);
        passwordInput.sendKeys("Bootcamp5#");
        Thread.sleep(3000);



        // this expresion returs the web element type
        //option1 locate the element and store int a object we will use it in real job option 1
        WebElement loginButton = driver.findElement(By.id ("btnLogin"));
        loginButton.click();



//option 2 use expression directly
// driver.findElement(By.id ("btnLogin")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
