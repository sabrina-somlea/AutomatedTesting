package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.GameResultsSteps;
import org.example.steps.serenity.SearchGameSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/gamesData.csv")
public class SearchGameStoryParameterized {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public SearchGameSteps searchGameSteps;
    @Steps
    public GameResultsSteps gameResultsSteps;

    String word, title;
    @Issue("#regat-5")
    @Test
    public void searching_by_given_keyword_should_display_the_list_of_games() {
        searchGameSteps.is_the_home_page();
        searchGameSteps.close_newsletter();
        searchGameSteps.enters_a_game(word);
        gameResultsSteps.should_see_list_of_games(title);
    }


} 