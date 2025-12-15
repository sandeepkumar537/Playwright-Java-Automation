package com.uaf.playwright.pages;

import com.microsoft.playwright.Page;

public class AddContactPage {
    private static final String TXT_FIRST_NAME = "#firstName";
    private static final String TXT_LAST_NAME = "#lastName";
    private static final String TXT_BIRTH_DATE = "#birthdate";
    private static final String TXT_EMAIL = "#email";
    private static final String TXT_PHONE = "#phone";
    private static final String TXT_STREET_ADDRESS_1 = "#street1";
    private static final String TXT_STREET_ADDRESS_2 = "#street2";
    private static final String TXT_CITY = "#city";
    private static final String TXT_STATE_PROVINCE = "#stateProvince";
    private static final String TXT_POSTAL_CODE = "#postalCode";
    private static final String TXT_COUNTRY = "#country";
    private static final String BTN_SUBMIT = "#submit";

    private final Page page;

    public AddContactPage(Page page) {
        this.page = page;
    }

    public AddContactPage enterFirstName(String firstName) {
        page.fill(TXT_FIRST_NAME, firstName);
        return this;
    }

    public AddContactPage enterLastName(String firstName) {
        page.fill(TXT_LAST_NAME, firstName);
        return this;
    }

    public AddContactPage enterBirthDate(String birthDate) {
        page.fill(TXT_BIRTH_DATE, birthDate);
        return this;
    }

    public AddContactPage enterEmail(String email) {
        page.fill(TXT_EMAIL, email);
        return this;
    }

    public AddContactPage enterPhone(String phone) {
        page.fill(TXT_PHONE, phone);
        return this;
    }

    public AddContactPage enterStreetAddress1(String streetAddress1) {
        page.fill(TXT_STREET_ADDRESS_1, streetAddress1);
        return this;
    }

    public AddContactPage enterStreetAddress2(String streetAddress2) {
        page.fill(TXT_STREET_ADDRESS_2, streetAddress2);
        return this;
    }

    public AddContactPage enterCity(String city) {
        page.fill(TXT_CITY, city);
        return this;
    }

    public AddContactPage enterStateProvince(String stateProvince) {
        page.fill(TXT_STATE_PROVINCE, stateProvince);
        return this;
    }

    public AddContactPage enterPostalCode(String postalCode) {
        page.fill(TXT_POSTAL_CODE, postalCode);
        return this;
    }

    public AddContactPage enterCountry(String country) {
        page.fill(TXT_COUNTRY, country);
        return this;
    }

    public void clickSubmit() {
        page.click(BTN_SUBMIT);
    }
}