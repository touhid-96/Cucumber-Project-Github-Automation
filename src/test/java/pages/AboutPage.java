package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {

    @FindBy(id = "social-nav-label")
    WebElement socialNavigation;

    public AboutPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void verifyAboutPage() {
        Assert.assertTrue(socialNavigation.getText().contains("Follow us on"));
    }
}
