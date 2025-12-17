package com.uaf.playwright.browser.customoptions;

import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;

public class CustomEdgeOption implements OptionsFactory {
    @Override
    public Options getOptions() {
        return new Options();
    }
}
