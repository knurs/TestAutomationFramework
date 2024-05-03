package com.Appfire.Utilities;

import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilities {
    static ChromeOptions options = new ChromeOptions();

    public static ChromeOptions setChromeOptions() {
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");

        return options;
    }
}
