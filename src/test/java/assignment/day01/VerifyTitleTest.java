package assignment.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitleTest {

        public static void main(String[] args) {

            // Invoke Firefox Driver
            WebDriver driver = new FirefoxDriver();

            // Go to YouTube
            driver.get("https://www.youtube.com/");

            // Get the page title
            String title = driver.getTitle();
            System.out.println("Page Title: " + title);

            // Verify the page title contains the word "video"
            assert title != null;
            if (title.toLowerCase().contains("youtube")) {
                System.out.println("Test Passed: Title contains 'YouTube'");
            } else {
                System.err.println("Test Failed: Title does not contain 'YouTube'");
            }

            // Close the driver
            driver.quit();
        }
    }


