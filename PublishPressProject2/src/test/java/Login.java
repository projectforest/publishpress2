import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.Scanner;

public class Login {

    @Test
    public void PPLogin(WebDriver driver){

    //}
    //public static void main(String[] args){
        //System.setProperty("webdriver.firefox.marionette","D://software testing class/geckodriver.exe");

        //WebDriver driver = new FirefoxDriver();
        driver.get("http://crowded-albatross.w5.poopy.life/wp-admin/");

        //username
        WebElement element = driver.findElement(By.name("log"));
        element.sendKeys("demo");
        //pw
        element = driver.findElement(By.name("pwd"));
        element.sendKeys("Tp9HxLcG804b");
        //click login
        element = driver.findElement(By.name("wp-submit"));
        element.click();


    }

}
