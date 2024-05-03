package com.Appfire.StepDefinitions;

import com.Appfire.Pages.SolutionsPage;
import com.Appfire.Utilities.BrowserUtils;
import com.Appfire.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class SolutionsStepDefinitions {

    SolutionsPage solutionsPage = new SolutionsPage();

    @When("user clicks {string} solution and clicks try for free button")
    public void user_clicks_solution_and_clicks_try_for_free_button(String solution) {


        solutionsPage.navigateToSolution(solution);
        BrowserUtils.waitForClickablility(solutionsPage.TryForFreeButton,5);
        solutionsPage.TryForFreeButton.click();

    }

    @Then("user should see {string} details at Atlassian Marketplace page")
    public void user_should_see_details_at_Atlassian_Marketplace_page(String solution) {

        BrowserUtils.waitForPageToLoad(5);
        Actions action = new Actions(Driver.get());

        String parentWindow = Driver.get().getWindowHandle();
        for (String childTab : Driver.get().getWindowHandles()) {

            Driver.get().switchTo().window(childTab);

        }

        BrowserUtils.waitFor(3);

        System.out.println(Driver.get().getTitle());

        String expectedResult = solution + " | Atlassian Marketplace";
        Assert.assertEquals(expectedResult, Driver.get().getTitle());



    }


}
