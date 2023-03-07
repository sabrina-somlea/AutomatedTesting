package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.CartPage;
import org.example.pages.GameResultsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;

public class AddToCartSteps {

    GameResultsPage gameResultsPage;
    CartPage cartPage;

    @Step
    public void add_game_to_cart(){
        gameResultsPage.add_game_to_cart_button();
    }

    @Step
    public void close_cart_pop_up_message(){
        gameResultsPage.close_cart_message();
    }
    @Step
    public void check_cart_message(String cartText){
        assertEquals(cartText, gameResultsPage.message_game_added_to_cart());
    }

    @Step
    public void view_cart_page(){
        gameResultsPage.go_to_cart_page();
    }

}