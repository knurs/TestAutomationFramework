package com.Appfire.StepDefinitions;

import com.Appfire.Pages.ContactPage;
import com.Appfire.Pages.DashboardPage;
import com.Appfire.Utilities.BrowserUtils;
import com.Appfire.Utilities.ConfigurationReader;
import com.Appfire.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class ContactStepDefinition {

    ContactPage contactPage = new ContactPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the contact page")
    public void user_is_on_the_contact_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(dashboardPage.CookiesClose,5);
        dashboardPage.CookiesClose.click();
        BrowserUtils.waitForClickablility(dashboardPage.FindYourSolutionModule,5);

        dashboardPage.navigateToModule("Contact");
        BrowserUtils.waitForPageToLoad(5);


    }

    @When("user clicks documentation button for {string} support")
    public void user_clicks_documentation_button_for_support(String support) {
        contactPage.ClickToContact(support);

    }

    @Then("user should see the {string} page title")
    public void user_should_see_the_page_title(String pageTitle) {
       BrowserUtils.waitForPageToLoad(5);

        Actions action = new Actions(Driver.get());

        String parentWindow = Driver.get().getWindowHandle();
        for (String childTab : Driver.get().getWindowHandles()) {

            Driver.get().switchTo().window(childTab);

        }

        BrowserUtils.waitFor(3);

        System.out.println(Driver.get().getTitle());

        Assert.assertEquals(pageTitle, Driver.get().getTitle());

    }




}
