package com.Appfire.Pages;

import com.Appfire.Utilities.BrowserUtils;
import com.Appfire.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void ClickToContact(String contact) {

        String moduleLocator = "//div[@class='frame']/h5[normalize-space()='"+contact+"']/..//a[1]";
        WebElement ContactName = Driver.get().findElement(By.xpath(moduleLocator));
        BrowserUtils.waitForClickablility(ContactName,5);
        ContactName.click();

        BrowserUtils.waitFor(3);

    }


}
