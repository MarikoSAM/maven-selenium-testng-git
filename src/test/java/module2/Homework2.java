package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.guru99.com/test/newtours/");
        Thread.sleep(3000);
        WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
        registerLink.click();

        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.name("firstName"));
        WebElement lastName = driver.findElement(By.name("lastName"));
        WebElement phone = driver.findElement(By.name("phone"));
        WebElement email =driver.findElement(By.id("userName"));
        WebElement address = driver.findElement(By.name("address1"));
        WebElement city = driver.findElement(By.name("city"));
        WebElement StateProvince = driver.findElement(By.name("state"));
        WebElement postalCode = driver.findElement(By.name("postalCode"));
        WebElement userName = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        Thread.sleep(2000);

        firstName.sendKeys("Mariam");
        Thread.sleep(2000);
        lastName.sendKeys("Samkharadze");
        phone.sendKeys("123-123-4455");
        Thread.sleep(2000);
        email.sendKeys("test@email.com");
        Thread.sleep(2000);
        address.sendKeys("123 main street");
        Thread.sleep(2000);
        city.sendKeys("Brooklyn");
        Thread.sleep(2000);
        StateProvince.sendKeys("NY");
        Thread.sleep(2000);
        postalCode.sendKeys("112233");
        Thread.sleep(2000);
        userName.sendKeys("test@email.com");
        Thread.sleep(2000);
        password.sendKeys("test");
        Thread.sleep(2000);
        confirmPassword.sendKeys("test");
        Thread.sleep(2000);
        WebElement submitButton =driver.findElement(By.name("submit"));
        Thread.sleep(2000);
        submitButton.click();
        Thread.sleep(3000);
        String expectedUrl = "/register_sucess.php";
        String actualUrl =driver.getCurrentUrl();

if(actualUrl.endsWith(expectedUrl)){
    System.out.println("Registration Page Test: PASSED");
}else {
    System.out.println("Registration Page Test: FAILD");
}
        driver.quit();
    }
}
