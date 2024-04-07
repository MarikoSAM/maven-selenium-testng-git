package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://magento.softwaretestingboard.com/");
        String UN = " testautoman@email.com";
        String PW = "qwerty123!";
       WebElement signInButn = driver.findElement(By.xpath("//*[contains(@href, 'login')]"));
        signInButn.click();
        WebElement useEmail =driver.findElement(By.xpath("//input[@id='email']"));
        WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement signIn =driver.findElement(By.xpath("//button[@id='send2']"));
        signIn.click();
        String title = driver.getTitle();
                System.out.println(title);

                String welcome = "//*[contains (text(),  'Welcome, ')]";
                if(welcome.contains("Welcome,")){
                    System.out.println("TEST PASSED");
                }else {
                    System.out.println("TEST Faild");
                }
driver.quit();





    }
}
