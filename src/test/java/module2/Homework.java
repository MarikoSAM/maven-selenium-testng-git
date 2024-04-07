package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
    public class Homework {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://practice.expandtesting.com/tables");
            System.out.println("Page Title: " + driver.getTitle());
            printEmailByFullName(driver, "Jason", "Doe");
            double expectedAmount = 251.0;
            double actualAmount = getTotalAmountOfDueColumn(driver);
            if (actualAmount == expectedAmount){
                System.out.println("TEST: PASSED");
            } else {
                System.out.println("TEST: FAILED");
            }
            driver.quit();
        }
        public static void printEmailByFullName(WebDriver driver, String fName, String lName){
            String getEmailXpath = "//table[@id='table1']//td[text()='"+fName+"']/../td[text() = '"+lName+"']/../td[3]";
            boolean itemPresent = !driver.findElements(By.xpath(getEmailXpath)).isEmpty();
            if(itemPresent){
                String value = driver.findElement(By.xpath(getEmailXpath)).getText();
                System.out.println(fName + " " + lName + " email: " + value);
            } else {
                System.out.println("Nu such record found in table.");
            }
        }
        public static double getTotalAmountOfDueColumn(WebDriver driver){
            List<WebElement> pricesWebElements = driver.findElements(By.xpath("//table[@id='table1']//td[4]"));
            double totalAmount = 0.0;
            for (WebElement priceElement :pricesWebElements) {
                String priceText = priceElement.getText();
                double price = Double.parseDouble(priceText.substring(1));
                totalAmount += price;
            }
            return totalAmount;
        }}



