package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class multipleElements {
    public static void main(String[] args) throws InterruptedException {
        //creating webdriver object

        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
    // lend to the page useing URLwe need address(url)
        driver.get("https://www.bestbuy.com/");

        //locate the web elements we want to interact to
        WebElement searchInput = driver.findElement(By.id("gh-search-input"));
        WebElement searchButton = driver.findElement(By.className ("header-search-button"));


        // Interact with located elements
        searchInput.sendKeys("iPhone 15");
        Thread.sleep(2000);

        searchButton.click();
        Thread. sleep (2000);



//collect all the items from result
        // findElements() return a list of <WebElement>
        List<WebElement> products = driver.findElements(By.className("sku-title")); //18 results

Thread.sleep(3000);
//if i want to know how many elements are in the list we use .size(find out how many items are in the list itself)
       System.out.println("Items found: " + products.size());
       //iterate over the list
        //we use loop-for,while,for each, do while
        //we us for each loop and it will go from the begining to the end one by one, we call it iterate over the list
        //in for each loop we use 3 components:
        //1.what is the data type of your elements <Webelement> is a data type
        //2.how do you want to call current element-- product(but not products)
        //3.what is the sours? the list we want to use--products
for (WebElement product: products){
    //lest print the titles in our console
String text = product.getText(); // it gives us the title of each element)
System.out.println("Title: " + text);
Thread.sleep(1000);// because we have loop ist good to use thread.sleep because loop
// is too fast and we have messy in console
    if (text.toLowerCase().contains("iphone 15 pro")) {// to make sure all the title are relevent we use IF statement
        System.out.println("Items relevant");
    }else {
        System.err.println("Item Irrelevant"); //err will print text in red color which are not relevent
    }
}



        driver.quit();







    }
}
