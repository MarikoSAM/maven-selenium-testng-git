package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementAttributes {
    public static void main(String[] args) throws InterruptedException {
        // cerate a we driver instance
        WebDriver driver = new ChromeDriver();
        // navigate specific page
        driver.get("https://www.bestbuy.com/");
        Thread.sleep(3000);

        //locate the element we need to interact with
        WebElement searchInputBox = driver.findElement(By.id("gh-search-input"));

        Thread.sleep(3000);

// Expected value of placeholder
        String expectedPlaceholderValue = "What can we help you find today?";
// Retrieve the actual value of the placeholder of the search input box
// To get any attribute's value from an element remember you have to locate the element first
        String actualPlaceholderValue = searchInputBox.getAttribute("placeholder"); // this will return you a string with value st
        System.out.println("Expected Placeholder Value: " + expectedPlaceholderValue);
        System.out.println("Actual Placeholder Value: " + actualPlaceholderValue);

if(expectedPlaceholderValue.equals(actualPlaceholderValue)){
    System.out.println("Test : PASSED");
}else {
    System.out.println("Test : FAILD");
}
// value attributes usually stores the text user enters int the input box
        // we also can utilize the getAttribute() method to get it's value

        System.out.println("value Attribute before typing: " +  searchInputBox.getAttribute("value"));

//type somth into the searchbar
        searchInputBox.sendKeys("iPhone 15 Pro Max");
        //after typing try to get the content of the value attribute
        System.out.println("value Attribute after typing: " +  searchInputBox.getAttribute("value"));
//there are two types of attributes
        //key= value that have a string assigned to it
        //boolean-if present trueif not false
        System.out.println("get the value of a boolean attribute: " +  searchInputBox.getAttribute("disabled"));
//===================================================================================================================//
        //locate search button
       WebElement searchbutton = driver.findElement(By.cssSelector(".header-search-button"));

// Verify the button of first product has this color -> rgb(0, 70, 190)
        String expectedButtonColor = "rgba(0, 70, 190, 1)";

        // Click on search button
        searchbutton.click();

        // Wait until page redirects and renders
        Thread.sleep(1000);

        // In order to get any information from the element
        // remember to locate the element first

        // Locate the button of first product
        WebElement seeDetailsButton = driver.findElement(By.xpath("(//li[@class = 'sku-item'])[1]//a[text() = 'See Details']"));

        // Get the css property's value of - background-color, background
        String actualSeeDetailsButtonColor = seeDetailsButton.getCssValue("background-color"); // this returns a string
        System.out.println("Expected background color: " + expectedButtonColor);
        System.out.println("Actual background color: " + actualSeeDetailsButtonColor);

        // rgb - red green blue
        // also css will hold the data about alpha - the alpha is responsible how transparent is your color
        // 1 - means solid
        // 0.1 - pretty transparent
        // rgba(0, 70, 190, 1)
        if(expectedButtonColor.equals(actualSeeDetailsButtonColor)){
            System.out.println("COLOR TEST: PASSED");
        } else {
            System.out.println("COLOR TEST: FAILED");
        }

        // Get the font type (font-family) of that button
        System.out.println("Font Type: " + seeDetailsButton.getCssValue("font-family"));
        System.out.println("Font Color: " + seeDetailsButton.getCssValue("color"));
        System.out.println("Font Size: " + seeDetailsButton.getCssValue("font-size"));



        driver.quit();

    }
}
