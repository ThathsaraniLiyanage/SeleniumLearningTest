//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class OpenGoogle {

    //Open Google
    //Go to Google home page

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\thats\\Desktop\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
