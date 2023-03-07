package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class UserInfoPage extends PageObject {
    @FindBy(className = "h1")
    private WebElementFacade accountHeading;

    public String getAccountInfo() {
        return accountHeading.getText();
    }
}
