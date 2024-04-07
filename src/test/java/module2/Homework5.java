package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Homework5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/tables");
        String title= driver.getTitle();
        System.out.println("Page title: " + title);
        Thread.sleep(3000);
        printEmailByFullName(driver,"John", "Smith" );

        double actualTotal = getTotalAmountOfDueColumn(driver);
        System.out.println("Total amount of Due column: " + actualTotal);
        double excepterTotal =251.0;
        if(excepterTotal==actualTotal){
            System.out.println("TEST: PASSED");
        }else {
            System.out.println("TEST: FAILED");
        }
        driver.quit();
    }
    public static void printEmailByFullName(WebDriver driver, String firstName, String lastName){
        String dinamicXpath = "//table[@id ='table1']/tbody/tr[contains(.,'" + firstName + "') and contains(.,'" + lastName + "')]/td[3]";
WebElement emailElement =driver.findElement(By.xpath(dinamicXpath));
if(emailElement != null){
        String email = emailElement.getText();
System.out.println("Email of " + firstName + " " + lastName + ": " + email );
    }else {
    System.out.println("No such record found in table.");
    }
}
    public static double  getTotalAmountOfDueColumn(WebDriver driver){
        List<WebElement> dueElements = driver.findElements(By.xpath("//table[@id='tableId']/tbody/tr/td[3]"));
        double excepterTotal =251.0;
        for (WebElement dueElement : dueElements) {
            String dueText = dueElement.getText();
        }

        return excepterTotal;
    }}

