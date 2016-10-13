import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;


/**
 * Created by kellidennis on 10/3/16.
 */
public class ToolBoxUtil {
    private static WebDriver driver;


    //Class Constructor
    public ToolBoxUtil(String browserType) {
        if (browserType.equals("CHROME")) {
            //Set up Chrome Driver
            try {
                System.setProperty("webdriver.chrome.driver", "/Users/kellidennis/Documents/chromedriver");
                driver = new ChromeDriver();
            } catch (Exception e) {
                System.out.println("Error during Chrome Test Setup" + e.toString());
            }
        } else if (browserType.equals("FIREFOX")) {
            //Setup a firefox driver
            try {
                driver = new FirefoxDriver();
            } catch (Exception e) {
                System.out.println("Error during Firefox Test Setup" + e.toString());
            }
        }


    }

//Search for cheese

    //Method to close web driver
    public void closeWebDriver() {  driver.quit();}


    //Method to access web driver
    public WebDriver getDriver(){ return driver;}


    //Method to set an implicit wait
    public void impWait() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    //Search for cheese
    public void searchForCheese(){
        driver.findElement(By.id("lst-ib")).click();
        driver.findElement(By.id("lst-ib")).sendKeys("cheese");
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
    }

    //Select google images
    public void clickGoogleImages(){
        driver.findElement(By.linkText("Images")).click();
    }





    //Find a dinner recipe

    //Click Browse Recipe
    public void clickBrowseRecipes(){
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[1]/div/p[3]/a")).click();
    }

    //Click on poultry
    public void clickPoultry(){
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div[4]/a/img")).click();
    }

    //Click recipe
    public void clickRecipe(){
        driver.findElement(By.xpath("/html/body/div[7]/div/div/table[2]/tbody/tr[1]/td[4]/a/img")).click();
    }

}