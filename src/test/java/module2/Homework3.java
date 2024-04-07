package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        WebElement logo =driver.findElement(By.xpath("//img[contains(@src, 'logo.png')]"));
        Thread.sleep(1000);
        WebElement GvirtualiftCard = driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']"));
        Thread.sleep(1000);
        WebElement wishlist =driver.findElement(By.xpath("//a[@class='ico-wishlist']/span[2]"));
        Thread.sleep(1000);
        WebElement registerButton = driver.findElement(By.xpath("//a[text() ='Register']"));
        registerButton.click();
        Thread.sleep(1000);
       WebElement searchButton =driver.findElement(By.xpath("//input[@id = 'small-searchterms']"));
        searchButton.click();
        Thread.sleep(1000);
        WebElement searchTextBox =driver.findElement(By.xpath("//div[@class='search-box']"));
        searchTextBox.click();
        Thread.sleep(1000);
   //int numberOfItem= 0;
 boolean isPresent= driver.findElements(By.xpath("//div[@class='item-box']")).size()==1;
        System.out.println("number Of Item " + isPresent);
List<WebElement> numberOfCategoryBox = driver.findElements(By.xpath("//div[@class='block block-category-navigation']"));
List<WebElement> customerServiceBox =driver.findElements(By.xpath("//div[@class='column customer-service']"));
List<WebElement> numberOfAvailableOptionsUnderHeader =driver.findElements(By.xpath("//div[@class='header-menu']"));


        System.out.println("number Of Category Box " +numberOfCategoryBox.size());
        System.out.println("customer Service Box " + customerServiceBox.size());
        System.out.println("number Of Available Options Under Header " + numberOfAvailableOptionsUnderHeader.size());
driver.quit();
    }
}
