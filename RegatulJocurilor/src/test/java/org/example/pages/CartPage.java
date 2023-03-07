package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends PageObject {

    public void push_delete_button() {
        WebElementFacade deleteButton = find(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div[1]/div[2]/ul/li/div/div[3]/div/div[3]/div/a/i"));
        deleteButton.click();

    }

    public String getEmptyCardMessage() {
        WebElementFacade emptyCard = find(By.className("no-items"));
        return emptyCard.getText();
    }
}