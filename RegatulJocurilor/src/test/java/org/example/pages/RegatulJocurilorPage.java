package org.example.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://regatuljocurilor.ro/ro/")
public class RegatulJocurilorPage extends PageObject {

    @FindBy(className="tm_close")
    private WebElementFacade closeButton;
    @FindBy(name="search_query")
    private WebElementFacade searchTerms;

    public void enter_game(String keyword) {
        searchTerms.typeAndEnter(keyword);
    }

    public void close_newsletter_warning(){
        closeButton.click();
    }
}