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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NeoTechTest1 {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rdveikals.lv/");

      //  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        WebElement VisiPiedavajumi = driver.findElement(By.xpath("//li[5]/a/span"));
        VisiPiedavajumi.click();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        WebElement HuaweiMobiles = driver.findElement(By.xpath("//a[contains(@href, 'https://www.rdveikals.lv/promoaction/lv/444/')]"));
        HuaweiMobiles.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        WebElement HuaweiMobile1 = driver.findElement(By.xpath("//div[4]/div/div/ul/li/a"));
        HuaweiMobile1.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        WebElement AddToCart1 = driver.findElement(By.xpath("//div[2]/div[4]/a"));
        AddToCart1.click();

      //  driver.get("https://www.rdveikals.lv/promoaction/lv/444/page/1/");
  //      WebElement HuaweiMobile2 = driver.findElement(By.xpath("//div[4]/div/div/ul/li[3]/a"));
     //   HuaweiMobile2.click();

     /*   WebElement careers = driver.findElement(By.id("menu-item-127"));
        careers.click();
        WebElement vakancies = driver.findElement(By.id("menu-item-131"));
        vakancies.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
        WebElement testAutomationEngineer = driver.findElement(By.id("menu-item-3249"));
        testAutomationEngineer.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        // driver.get("https://ctco.lv/careers/vacancies/test-automation-engineer-2/");
        WebElement ProfessionalSkills = driver.findElement(By.xpath("//div[14]/div/div/p[3]/br[4]")); */

     //   driver.close();



    }

    @Test
    public void userLogin() {

    }

    @AfterClass
    public static void tearDown() {

    }
}