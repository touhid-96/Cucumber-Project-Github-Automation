package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

    @FindBy(xpath = "//a[@href=\"/facebook/create-react-app\"]")
    WebElement searchResult;

    public SearchPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void verifySearchResult(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(searchResult));
        Assert.assertEquals(searchResult.getText(), "facebook/create-react-app");
    }
}
