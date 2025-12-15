package com.uaf.playwright;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;
import com.uaf.playwright.browser.CustomChromeOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@UsePlaywright(CustomChromeOptions.class)
public class FirstPlaywrightTest {

    @Test
    void verifyTitle(Page page) {
        page.navigate("https://thinking-tester-contact-list.herokuapp.com/");
        Assertions.assertEquals("Contact List App", page.title());
    }
}
