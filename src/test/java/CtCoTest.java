import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        // Did not used findElement type, cause test fails - NoSuchElementException.
      //  WebElement testAutomationEngineer = driver.findElement(By.id("menu-item-3249"));
      //  testAutomationEngineer.click();
        driver.get("https://ctco.lv/careers/vacancies/test-automation-engineer-2/");
        WebElement ProfessionalSkills = driver.findElement(By.xpath("//div[14]/div/div/p[3]/br[4]"));



    }

    @Test
    public void userLogin() {

    }

    @AfterClass
    public static void tearDown() {

    }
}