package com.uaf.playwright.pages;

import com.microsoft.playwright.Page;

public class SignUpPage {

    private final Page page;

    public SignUpPage(Page page) {
        this.page = page;
    }

    public void signUp(String firstName, String lastName, String email, String password) {
        page.fill("#firstName", firstName);
        page.fill("#lastName", lastName);
        page.fill("#email", email);
        page.fill("#password", password);
        page.click("#submit");
    }
}
