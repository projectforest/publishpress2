import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//import java.lang.String;

public class Users {

    @Test
    public void AddUser(){
        System.setProperty("webdriver.firefox.marionette","D://software testing class/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        Login login = new Login();
        login.PPLogin(driver);


        String username;
        String role;
        WebElement element = driver.findElement(By.linkText("Users"));
        element.click();
        element = driver.findElement(By.linkText("Add New"));
        element.click();

        element = driver.findElement(By.name("user_login"));
        element.sendKeys(username = "hai");

        element = driver.findElement(By.name("email"));
        element.sendKeys("hai@cloud9.gg");

        element = driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div[1]/div[5]/form/table/tbody/tr[6]/td/button"));
        element.click();

        element = driver.findElement(By.id("pass1-text"));
        element.sendKeys("{BACK}");
        element.clear();
        element.sendKeys("1234567890");

        element = driver.findElement(By.name("pw_weak"));
        element.click();

        //select role
        element = driver.findElement(By.xpath("//form[@id='createuser']/table/tbody/tr[10]/td/select"));
        element.sendKeys(role = "Author");

        element = driver.findElement(By.id("createusersub"));
        element.click();

        //verify user is create and role is properly assigned


        element = driver.findElement(By.linkText(username));
        element.click();
        WebElement checkValue = driver.findElement(By.xpath("//form[@id='your-profile']/table[2]/tbody/tr[2]/td/select"));
        boolean ret =checkValue.getText().contains(role);
        System.out.println("role: " + role);
        System.out.println(ret);




    }
}
