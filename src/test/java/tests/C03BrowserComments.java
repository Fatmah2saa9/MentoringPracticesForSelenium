package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03BrowserComments {
        /* TC - 03
         * Expected Title
         * Set Path of the Chrome driver
         * Launch Chrome browser
         * Open URL of Website
         * Maximize Window
         * Get Title of current Page
         * Validate/Compare Page Title
         * Close Browser
         */

        public static void main(String[] args) {
            // TC - 03

            // Expected Title
            String expectedTitle = "Google";

            // Launch Chrome browser
            WebDriver driver = new ChromeDriver();

                // Open URL of Website
                driver.get("https://www.google.com");

                // Maximize Window
                driver.manage().window().maximize();

                // Get Title of current Page
                String actualTitle = driver.getTitle();
                //System.out.println("actualTitle = " + actualTitle);


                // Validate/Compare Page Title
                if (actualTitle.equals(expectedTitle)) {
                    System.out.println(" TEST PASSED: Title matches expected");
                } else {
                    System.out.println(" TEST FAILED: Title does not match expected");
                }

                // Close Browser
              driver.quit();
            }
        }


