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


        WebElement careers = driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
        careers.click();
        WebElement vakancies = driver.findElement(By.xpath("//a[contains(text(),'Vacancies')]"));
        vakancies.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
        WebElement testAutomationEngineer = driver.findElement(By.linkText("Test Automation Engineer"));
        testAutomationEngineer.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
        WebElement ProfessionalSkills = driver.findElement(By.xpath("//body/div[1]/div[2]/div[2]/div[1]/div[19]/div[1]/div[1]/ul[1]/li[5]"));

        driver.close();



    }

    @Test
    public void userLogin() {

    }

    @AfterClass
    public static void tearDown() {

    }
}