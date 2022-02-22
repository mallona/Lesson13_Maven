package UITests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactUsTest extends UITests {
    @Test
    public void useDriverManager() throws InterruptedException {
        driver.get("http://automationpractice.com/");
        WebElement contactUsButton = driver.findElement(By.xpath("//*[@id='contact-link']"));
        if (contactUsButton.isDisplayed())
            contactUsButton.click();
        WebElement contactUs = driver.findElement(By.xpath("//span[@class='navigation_page']"));
        assertEquals(contactUs.getText(), "Contact");
        Thread.sleep(2000);

        System.out.println("You are on the 'Contact us' page");
    }
}
