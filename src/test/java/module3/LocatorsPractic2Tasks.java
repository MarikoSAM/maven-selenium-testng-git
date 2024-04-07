package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractic2Tasks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
       Thread.sleep(3000);

        WebElement userNameInput = driver.findElement(By.name("userName"));
        WebElement passwordInput = driver.findElement(By.name("password"));

        userNameInput.sendKeys("test@email.com");
        Thread.sleep(3000);
        passwordInput.sendKeys("test");
        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.name ("submit"));
        submitButton.click();

        Thread.sleep(5000);

        WebElement vacationLink = driver.findElement(By.partialLinkText("Vacations"));
        vacationLink.click();
                Thread.sleep(10000);
        WebElement registerLink= driver.findElement(By.linkText("REGISTER"));
        registerLink.click();
        Thread.sleep(10000);

        String expectedUrlPostFix = "/register.php";
        String actualUrl =driver.getCurrentUrl();

        //https://demo.guru99.com/test/newtours/register.php
        //contains -> true
        //register.php"
        if(actualUrl.endsWith(expectedUrlPostFix)){
            System.out.println("Registration Page Test: PASSED");
        }else{
            System.out.println("Registration Page Test: Fail");
        }


        driver.quit();
    }
}
