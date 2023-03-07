package org.example.steps.serenity;

import org.example.pages.RegatulJocurilorPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class SearchGameSteps {

    RegatulJocurilorPage regatulJocurilorPage;
    @Step
    public void is_the_home_page() {
        regatulJocurilorPage.open();
    }
    @Step
    public void close_newsletter(){
        regatulJocurilorPage.close_newsletter_warning();
    }
    @Step
    public void enters_a_game(String keyword) {
        regatulJocurilorPage.enter_game(keyword);
    }
}