package com.Appfire.Pages;


import com.Appfire.Utilities.BrowserUtils;
import com.Appfire.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SolutionsPage extends BasePage{

    @FindBy(css = ".btn.btn--primary.btn--large")
    public WebElement TryForFreeButton;

    public void navigateToSolution(String solution) {

        String moduleLocator = "//h5[normalize-space()='" + solution + "']";
        WebElement Solution = Driver.get().findElement(By.xpath(moduleLocator));
        Solution.click();

        BrowserUtils.waitFor(3);

    }






}
