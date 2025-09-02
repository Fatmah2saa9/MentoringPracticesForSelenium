package tests;

import com.github.Fatmah2saa9.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02WindowsComments {
/* TC - 02

 Go to www.yahoo.com 
 Maximize Window 
 Go to www.amazon.com 
 Maximize Window 
Navigate Back
 Navigate Forward
 Refresh The Page

 */

    public static void main(String[] args) throws InterruptedException {

        // TC - 02
        WebDriver driver = new ChromeDriver();

// Go to www.yahoo.com
        driver.navigate(). to( "https://www.linkedin.com");
// Maximize Window
        driver.manage().window().maximize();
        //Thread.sleep(1000);
// Go to www.amazon.com
        driver.navigate().to("https://www.amazon.com");
// Maximize Window
        driver.manage().window().maximize();
        //Thread.sleep(1000);

        driver.manage().window().fullscreen();
        //Thread.sleep(1000);

// Navigate Back
        driver.navigate().back();
        //Thread.sleep(1000);

// Navigate Forward
        driver.navigate().forward();
        //Thread.sleep(1000);

// Refresh The Page
        driver.navigate().refresh();
        //Thread.sleep(1000);

        driver.quit();
    }

}

