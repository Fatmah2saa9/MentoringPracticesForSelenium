package assignment.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class AmazonWindowTest {

        public static void main(String[] args) throws InterruptedException {

            // Create Chrome Driver
            WebDriver driver = new ChromeDriver();

            // Go to the Amazon URL
            driver.get("https://www.amazon.com/");

            // Print the position and size of the page
            System.out.println("Initial Position: " + driver.manage().window().getPosition());
            System.out.println("Initial Size: " + driver.manage().window().getSize());

            Thread.sleep(2000);

            // Adjust the position and size of the page as desired
            Point expectedPosition = new Point(150, 80);
            Dimension expectedSize = new Dimension(1200, 700);

            driver.manage().window().setPosition(expectedPosition);
            driver.manage().window().setSize(expectedSize);

            Thread.sleep(2000);

            // Get the new position and size
            Point actualPosition = driver.manage().window().getPosition();
            Dimension actualSize = driver.manage().window().getSize();

            System.out.println("New Position: " + actualPosition);
            System.out.println("New Size: " + actualSize);

            // Test that the page is in the position and size you want
            if (actualPosition.equals(expectedPosition) && actualSize.equals(expectedSize)) {
                System.out.println("Test Passed!");
            } else {
                System.err.println("Test Failed!");
            }

            // Close the page
            driver.quit();
        }
    }

