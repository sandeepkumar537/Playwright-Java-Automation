package com.uaf.playwright.pages;

import com.microsoft.playwright.Page;

public class ContactListPage {
    private static final String BTN_ADD_NEW_CONTACT = "#add-contact";
    private static final String HEADER_CONTACT_LIST = "//h1[text()='Contact List']";

    private final Page page;

    public ContactListPage(Page page) {
        this.page = page;
    }

    public void clickAddNewContactButton() {
        page.click(BTN_ADD_NEW_CONTACT);
    }

    public boolean isContactListHeaderExists() {
        return page.isEnabled(HEADER_CONTACT_LIST);
    }
}
