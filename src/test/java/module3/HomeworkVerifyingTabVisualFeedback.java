package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkVerifyingTabVisualFeedback {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/");
        WebElement firstName = driver.findElement(By.id("txtUsername"));
        WebElement lastName = driver.findElement(By.id("txtPassword"));

        firstName.sendKeys("yoll-student");
        Thread.sleep(2000);
        lastName.sendKeys("Bootcamp5#");
        Thread.sleep(2000);
WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button']"));
        loginBtn.click();
        Thread.sleep(2000);
        String title= driver.getTitle();
        System.out.println("Page title: " + title);
        WebElement pimTabManuBar =driver.findElement(By.id("menu_pim_viewPimModule"));
        String pimTabManuBarexpectedColor = "rgba(0, 0, 0 0)";
        System.out.println("PIM tab background color before click: " + pimTabManuBarexpectedColor);
        pimTabManuBar.click();
        String pIMtabcolorafterclick =  "rgba(242,140,56,1)";
        System.out.println("PIM tab background color after click: " + pIMtabcolorafterclick);


        driver.quit();
    }
}
