package ru.intervale.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void ContactDeletionTests() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().gotoHomePage();
    }

}
