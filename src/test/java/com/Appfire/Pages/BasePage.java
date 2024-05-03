package com.Appfire.Pages;


import com.Appfire.Utilities.BrowserUtils;
import com.Appfire.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public abstract class BasePage {
        public BasePage(){
            PageFactory.initElements(Driver.get(),this);
        }

        public void navigateToModule(String module) {

            String moduleLocator = "//a[normalize-space()='" + module + "']";
            WebElement Module = Driver.get().findElement(By.xpath(moduleLocator));
            BrowserUtils.waitForClickablility(Module,5);
            Module.click();

            BrowserUtils.waitFor(3);

        }

        @FindBy(xpath = "//*[@id=\"onetrust-close-btn-container\"]/button")
        public WebElement CookiesClose;

        @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
        public WebElement CookiesAcceptButton;

        @FindBy(css = ".btn.btn--primary.btn--large")
        public WebElement FindYourSolutionModule;

        @FindBy(css = "a[class='btn btn--secondary']")
        public WebElement MigrateWithAppfireModule;

        @FindBy(xpath = "//div[@class='logo']//a//*[name()='svg']")
        public WebElement TheHubWindowTitle;



    }



