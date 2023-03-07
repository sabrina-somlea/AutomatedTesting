package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameResultsPage extends PageObject {
    @FindBy(className="close")
    private WebElementFacade closeCartMessage;

    public String getGameTitles() {
        WebElementFacade gameTitle = find(By.xpath("//*[@id=\"spe_res\"]/div/ul/li[1]/div/div/div[3]/h3"));
        return gameTitle.getText();

    }

    public String getNotFoundMessage() {
        WebElementFacade gameTitleU = find(By.xpath("//*[@id=\"content\"]/h4"));
        return gameTitleU.getText();
    }

public void add_game_to_cart_button(){
    WebElementFacade cartButton = find(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/button"));
    cartButton.click();
}
public void close_cart_message(){
        closeCartMessage.click();
}
    @FindBy(className = "cart-products-counthome")
    WebElementFacade cartBox;

    public String message_game_added_to_cart(){
        return cartBox.getText();
    }

    public void go_to_cart_page() {
        WebElementFacade cartMenu = find(By.id("_desktop_cart"));
        cartMenu.click();
        WebElement cartView = find(By.xpath("//*[@id=\"_desktop_cart\"]/div/div/div/div/div[3]/a/button"));
        cartView.click();
    }
}
