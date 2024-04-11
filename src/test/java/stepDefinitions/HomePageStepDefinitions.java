package stepDefinitions;

import config.Setup;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AboutPage;
import pages.HomePage;
import pages.SearchPage;

public class HomePageStepDefinitions extends Setup {

    HomePage homePage = new HomePage(webDriver);
    SearchPage searchPage = new SearchPage(webDriver);
    AboutPage aboutPage = new AboutPage(webDriver);

    @Given("user visits the website")
    public void user_visits_the_website() {
        webDriver.get("https://github.com/");
    }
    @When("user click on search")
    public void userClickOnSearch() {
        homePage.clickOnSearchBox();
    }
    @And("user writes {string} on search box")
    public void userWritesOnSearchBox(String term) {
        homePage.writeTermOnSearchField(term);
    }
    @And("user click on search all of GitHub")
    public void userClickOnSearchAllOfGitHub() {
        homePage.clickSearch();
    }
    @Then("user can find the project in the result")
    public void user_can_find_the_project_in_the_result() {
        searchPage.verifySearchResult(webDriver);
    }

    @When("user scroll down")
    public void userScrollDown() {
        homePage.scrollDown(webDriver);
    }

    @And("user click on About")
    public void userClickOnAbout() {
        homePage.clickAbout();
    }

    @Then("user will be redirected to about page")
    public void userWillBeRedirectedToAboutPage() {
        aboutPage.verifyAboutPage();
    }

    @After
    public void closeBrowser() {
        webDriver.quit();
    }
}
