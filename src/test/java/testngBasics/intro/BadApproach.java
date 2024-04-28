package testngBasics.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//The problem with this approach is that when the case is supposed to be failed it actually doesn't end the session.

public class BadApproach {
    public static void main(String[] args) throws InterruptedException {
        /*
         * Navigate to google search page
         * Verify that logo is displayed
         * Verify the PageTitle is - Google
         * */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(1000);


        // Verify that logo is displayed

        WebElement logo = driver.findElement(By.cssSelector("img[alt=Google]"));
        boolean isLogoDisplayed = logo.isDisplayed();

        if(isLogoDisplayed){
            System.out.println("LOGO Verification: PASSED");
        } else {
            System.out.println("LOGO Verification: FAILED");
        }


        // Verify the PageTitle is - Google

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Google"; // The expected value is usually in your - ticket/user story/requirements

        if(actualPageTitle.equals(expectedPageTitle)){
            System.out.println("TITLE verification: PASSED");
        } else {
            System.out.println("TITLE verification: FAILED");
        }

        driver.quit();

    }

}
