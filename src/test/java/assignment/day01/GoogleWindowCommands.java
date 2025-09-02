package assignment.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class GoogleWindowCommands {

        public static void main(String[] args) throws InterruptedException {

            // Open Chrome
            WebDriver driver = new ChromeDriver();

            // Open URL
            driver.get("https://www.google.com/");

            // Maximize the window
            driver.manage().window().maximize();
            System.out.println("Window maximized!");

            // Print the position and size of the page
            Point position = driver.manage().window().getPosition();
            Dimension size = driver.manage().window().getSize();
            System.out.println("Position (Maximized): " + position);
            System.out.println("Size (Maximized): " + size);

            // Minimize the page
            driver.manage().window().minimize();
            System.out.println("Window minimized!");

            // Wait 5 seconds in minimized state
            Thread.sleep(5000);

            // Maximize the page again
            driver.manage().window().maximize();
            System.out.println("Window maximized again!");

            // Print the position and size in maximized state
            Point newPosition = driver.manage().window().getPosition();
            Dimension newSize = driver.manage().window().getSize();
            System.out.println("Position (After maximize): " + newPosition);
            System.out.println("Size (After maximize): " + newSize);

            // Make the page fullscreen
            driver.manage().window().fullscreen();
            System.out.println("Window in fullscreen!");

            Thread.sleep(3000);

            // Close the browser
            driver.quit();
        }
    }