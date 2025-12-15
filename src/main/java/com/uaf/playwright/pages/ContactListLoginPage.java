package com.uaf.playwright.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class ContactListLoginPage {
    private static final String TXT_EMAIL = "#email";
    private static final String TXT_PASSWORD = "#password";
    private static final String BTN_SUBMIT = "#submit";
    private static final String BTN_SIGNUP = "#signup";

    Page page;

    public ContactListLoginPage(Page page) {
        this.page = page;
    }

    public void login(String email, String password) {
        this.page.fill(TXT_EMAIL, email);
        this.page.fill(TXT_PASSWORD, password);
        this.page.click(BTN_SUBMIT);
        this.page.waitForLoadState(LoadState.NETWORKIDLE);
    }

    public void clickSignUp() {
        this.page.click(BTN_SIGNUP);
    }
}
