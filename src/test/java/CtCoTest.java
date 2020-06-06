import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CtCoTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ctco.lv/en");


        WebElement careers = driver.findElement(By.id("menu-item-127"));
        careers.click();
        WebElement vakancies = driver.findElement(By.id("menu-item-131"));
        vakancies.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
        WebElement testAutomationEngineer = driver.findElement(By.linkText("Test Automation Engineer"));
        testAutomationEngineer.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
        WebElement ProfessionalSkills = driver.findElement(By.xpath("//div[13]/div/div/p[3]/br[4]"));

        driver.close();



    }

    @Test
    public void userLogin() {

    }

    @AfterClass
    public static void tearDown() {

    }
}