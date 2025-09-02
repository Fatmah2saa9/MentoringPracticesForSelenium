package assignment.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

        public static void main(String[] args) {

            // Create Chrome driver
            WebDriver driver = new ChromeDriver();

            // Open Google home page
            driver.get("https://www.google.com");

            // Get Title on page
            String title = driver.getTitle();
            System.out.println("Page Title: " + title);

            // Get Current URL on page
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL: " + currentUrl);

            // Close/Quit the browser
            driver.quit();
        }
    }


