package org.example.features.AddToCart;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.AddToCartSteps;
import org.example.steps.serenity.GameResultsSteps;
import org.example.steps.serenity.LoginSteps;
import org.example.steps.serenity.SearchGameSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddToCartStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public SearchGameSteps searchGameSteps;
    @Steps
    public AddToCartSteps addToCartSteps;

    @Steps
    public GameResultsSteps gameResultsSteps;

    @Issue("#regat-3")
    @Test
    public void add_game_to_cart() {
        searchGameSteps.is_the_home_page();
        searchGameSteps.enters_a_game("wingspan");
        gameResultsSteps.should_see_list_of_games("Wingspan");
        addToCartSteps.add_game_to_cart();
        addToCartSteps.close_cart_pop_up_message();
        addToCartSteps.check_cart_message("1");

    }
} 