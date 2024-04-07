package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.bestbuy.com/");
      Thread.sleep(3000);

      driver.get(" http://dev-hrm.yoll.io/");
      Thread.sleep(3000);

      driver.get("http://demo.guru99.com/test/newtours/");
      Thread.sleep(3000);
      driver.navigate().to("https://askomdch.com/");
      String title = driver.getTitle();
      System.out.println("Page Title: " + title);
      Thread.sleep(3000);

      driver.navigate().back();
      System.out.println("Title of the 3rd website: " + driver.getTitle());
      Thread.sleep(2000);
driver.navigate().back();
System.out.println(" URL of 2nd website: " + driver.getCurrentUrl());
Thread.sleep(2000);
System.out.println("Title of the 3rd website: " + driver.getTitle());

      driver.quit();




    }
}
