import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        System.out.println("The title of the page is: " + driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        Thread.sleep(2000);
        searchBox.sendKeys("Java (programming language)");
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        Thread.sleep(2000);
        searchButton.click();
        System.out.println("The title of the page after searching is: " + driver.getTitle());

        Thread.sleep(2000);
        String tableOfContents = driver.findElement(By.id("toc")).getText();
        System.out.println("The table of contents is: " + tableOfContents);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,750)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,750)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,750)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,750)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,750)", "");

        Thread.sleep(5000);
        driver.quit();
        }
    }
