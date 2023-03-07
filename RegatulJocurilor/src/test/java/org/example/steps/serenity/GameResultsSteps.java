package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.GameResultsPage;
import org.example.pages.RegatulJocurilorPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class GameResultsSteps {

    GameResultsPage gameResultsPage;

    @Step
    public void should_see_list_of_games(String gameTitle) {
        assertThat(gameResultsPage.getGameTitles(), containsString(gameTitle));
    }

    @Step
    public void should_not_see_list_of_games(String gameTitle) {
        assertEquals(gameTitle, gameResultsPage.getNotFoundMessage());
    }



}