package com.uaf.playwright.browser;


import com.microsoft.playwright.*;
import com.microsoft.playwright.junit.OptionsFactory;
import com.uaf.playwright.browser.customoptions.CustomChromeOptions;
import com.uaf.playwright.browser.customoptions.CustomFirefoxOptions;
import com.uaf.playwright.browser.customoptions.CustomWebkitOption;

public class BrowserFactory {
    private static final ThreadLocal<Playwright> playwright = new ThreadLocal<>();
    private static final ThreadLocal<Browser> browser = new ThreadLocal<>();
    private static final ThreadLocal<BrowserContext> browserContext = new ThreadLocal<>();
    private static final ThreadLocal<Page> page = new ThreadLocal<>();

    public static void initBrowser(BrowserName browserName) {
        BrowserType browserType = switch (browserName) {
            case CHROME -> playwright.get().chromium();
            case FIREFOX -> playwright.get().firefox();
            case WEBKIT -> playwright.get().webkit();
        };
        // Set Browser Type
        browser.set(browserType.launch(getCustomLaunchOptions(browserName).getOptions().launchOptions));

        // Set Browser Context
        browserContext.set(browser.get().newContext());

        // Set Page
        page.set(browserContext.get().newPage());
    }

    /**
     * Get a page object
     */
    public static Page getPage() {
        return page.get();
    }

    /**
     * Close all objects and remove thread local objects
     */
    public void tearDown() {
        playwright.get().close();
        browser.get().close();
        browserContext.get().close();
        page.get().close();

        playwright.remove();
        browser.remove();
        browserContext.remove();
        page.remove();
    }

    private static OptionsFactory getCustomLaunchOptions(BrowserName browserName) {
        return switch (browserName) {
            case CHROME -> new CustomChromeOptions();
            case FIREFOX -> new CustomFirefoxOptions();
            case WEBKIT -> new CustomWebkitOption();
        };
    }
}
