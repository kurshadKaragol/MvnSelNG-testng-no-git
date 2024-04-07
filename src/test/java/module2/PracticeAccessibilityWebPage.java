package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAccessibilityWebPage {
    /*
[X] Navigate to https://haltersweb.github.io/Accessibility/submit-disabling.html
Locate 'Submit' button and print on console that button is disabled (use getAttribute() method)
Print the text color of the Submit Button
Enter some text on first name free text field
Enter some text on last name free text field
Click anywhere on the page through automation to make submit button enabled
Locate 'Submit' button and print on console that button is enabled (use getAttribute() method)
Print the text color of the Submit Button again and compare the color values
*/



        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            // driver.manage().window().maximize();
            driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
            Thread.sleep(1000);

            WebElement submitButton = driver.findElement(By.xpath("//*[text()= 'Submit']"));
            //System.out.println("Submit Button Disabled: " + submitButton.isDisplayed());
            // After inspecting the html we noticed that the button that is not intractable doesnt have a disabled attribute
            // That's why the isEnabled() method will not give you a proper result
            // System.out.println(submitButton.isEnabled());
            // isEnabled() -

            System.out.println("Submit Button Disabled: " + submitButton.getAttribute("aria-disabled"));

            // TODO - Complete the practice


            driver.quit();

        }
}
