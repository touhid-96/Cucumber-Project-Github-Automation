package pages;

import Utility.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(css = "[data-target=\"qbsearch-input.inputButtonText\"]")
    WebElement searchField;

    @FindBy(id = "query-builder-test")
    WebElement searchTxtBox;

    @FindBy(xpath = "//span[text()=\"Search all of GitHub\"]")
    WebElement searchBtn;

    @FindBy(xpath = "//a[text()=\"About\"]")
    WebElement about;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnSearchBox() {
        searchField.click();
    }

    public void writeTermOnSearchField(String term) {
        searchTxtBox.sendKeys(term);
    }

    public void clickSearch() {
        searchBtn.click();
    }

    public void scrollDown(WebDriver webDriver) {
        Utils.scroll(webDriver);
    }

    public void clickAbout() {
        about.click();
    }
}
