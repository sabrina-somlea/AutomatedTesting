package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.CartPage;
import org.example.pages.GameResultsPage;

import static org.junit.Assert.assertEquals;

public class RemoveGameFromCartSteps {

    GameResultsPage gameResultsPage;
    CartPage cartPage;

    @Step
    public void hit_remove_from_cart_button(){
        cartPage.push_delete_button();
    }
    @Step
    public void check_empty_cart_message(String cartText){
        assertEquals(cartText, cartPage.getEmptyCardMessage());
    }


}