package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04GetAndAdjustScreenSize {
    /* TC - 04
     * Go to the w3school URL : https://www.w3schools.com/
     * Print the position and size of the page.
     * Adjust the position and size of the page as desired.
     * Test that the page is in the position and size you want.
     * Close the page
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Go to the w3school URL
        driver.get("https://www.w3schools.com/");

        // Print the position and size of the page
        System.out.println("Position: " + driver.manage().window().getPosition());
        System.out.println("Size: " + driver.manage().window().getSize());

        // Adjust the position and size of the page as desired
        driver.manage().window().setPosition(new Point(100, 50));
        driver.manage().window().setSize(new Dimension(1200, 800));

        // Test that the page is in the position and size you want
        System.out.println("New Position: " + driver.manage().window().getPosition());
        System.out.println("New Size: " + driver.manage().window().getSize());

        // Close the page
        driver.quit();
    }
}