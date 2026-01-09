import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        // String googleSource = driver.getPageSource();
        // System.out.println(googleSource);
        String googleHandle = driver.getWindowHandle();
        System.out.println(googleHandle);
        String googleTitle = driver.getTitle();
        System.out.println("Google title is: " + googleTitle);
        driver.navigate().to("https://www.udemy.com/home/");
        String udemyTitle = driver.getTitle();
        System.out.println("Udemy title is: " + udemyTitle);
        driver.navigate().back();
        driver.getCurrentUrl();
        String googleURL = driver.getCurrentUrl();
        System.out.println("Google URL is: " + googleURL);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();
    }
}
