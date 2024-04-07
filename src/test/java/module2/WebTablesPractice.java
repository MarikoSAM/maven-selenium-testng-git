package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesPractice {
    public static void main(String[] args) throws InterruptedException {
        //create webdriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //navigate to the target we page
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        System.out.println("Cell data");
        //get the data from product table
        //2nd row 2nd cell
        getDataByRowAndColumn(driver,2,2);


        //get the data from product table
        //2 row 4 cell

       getDataByRowAndColumn(driver, 2,3);
        //get the data from product table
        //3 row 1nd cell
       getDataByRowAndColumn(driver, 3,1);


        System.out.println("Whole colomn data");
        getDataBtColumnNumber(driver,"1");
    //get the all data from the second column
       getDataBtColumnNumber(driver,"2");


     //get the all data from the third column

        getDataBtColumnNumber(driver,"3");

        //identify the Author name by bookname dynamically
        // //*[@name = 'BookTable']/tbody//td[text() = 'Master In Java']/../td[2]--. this is the syntax
WebElement authorNameElement =driver.findElement(By.xpath("//*[@name = 'BookTable']/tbody//td[text() = 'Master In Java']/../td[2]"));
String authorName = authorNameElement.getText();
        System.out.println("The autor for Master in Java is: " + authorName);
        driver.quit();
    }
//we will create reusable method that will return the data from specific column (whole column)
// and make it static to call in main
public static void getDataBtColumnNumber(WebDriver driver, String columnNumber){
        String dynamicXpath = "//*[@id= 'productTable']/tbody/tr/td["+columnNumber+"]";
    List<WebElement> columnData = driver.findElements(By.xpath(dynamicXpath));

    for(WebElement eachElement : columnData){
        String eachCellData = eachElement.getText();
        System.out.println(eachCellData);
//when we create for each loop what is the data structure i'm looping through ? --> it is a List
        //what is the each elements in the list data type? --> DATA TYPE IS WebElement, so each element in the
        // List is gonna be WebElement,
        // i named eachelement as temporary variable and iterate over the column data
        //we use for each loop that goes through the list exrtract the text from
// web each element and prints it out in a new line
}

}
public static void getDataByRowAndColumn(WebDriver driver, int row, int column){
//we will create  Reusable method that will take two parameters row and column
// (fot not to repite the same code
//Those params data will be used to build a dynamic xpath
    //the role of static method: we cannot call directly any
    // non-static members in main 1 we can make method static or create object
        String dynamicXpath = "//*[@id= 'productTable']/tbody/tr[" + row + "]/td[" + column + "]";
            WebElement CellData =driver.findElement(By.xpath(dynamicXpath));
            //extract the content text(data) from the element - we can use getText()- returns a string
            String CellText = CellData.getText();
            //secend cell text = second cell data(what is inside the content it is called data)
            System.out.println("The data in the second row "+row+" and "+ column +" cell is: " + CellText);

        }

    }

