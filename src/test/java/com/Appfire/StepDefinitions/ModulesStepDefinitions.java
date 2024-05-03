package com.Appfire.StepDefinitions;

import com.Appfire.Pages.DashboardPage;
import com.Appfire.Utilities.BrowserUtils;
import com.Appfire.Utilities.ConfigurationReader;
import com.Appfire.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class ModulesStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(dashboardPage.CookiesClose,5);
        dashboardPage.CookiesClose.click();
        BrowserUtils.waitForClickablility(dashboardPage.FindYourSolutionModule,5);
    }

    @When("user clicks {string} module")
    public void user_clicks_module(String module) {
        dashboardPage.navigateToModule(module);


    }

    @Then("user should see The Hub page in new window")
    public void user_should_see_The_Hub_page_in_new_window() {
      BrowserUtils.waitForVisibility(dashboardPage.TheHubWindowTitle,5);

        Actions action = new Actions(Driver.get());

        String parentWindow = Driver.get().getWindowHandle();
        for (String childTab : Driver.get().getWindowHandles()) {

            Driver.get().switchTo().window(childTab);

        }

        BrowserUtils.waitFor(3);

        System.out.println(Driver.get().getTitle());
        String expectedResult = "Your hub for all things Atlassian - The Hub, by Appfire";
        Assert.assertEquals(expectedResult, Driver.get().getTitle());
    }


}
