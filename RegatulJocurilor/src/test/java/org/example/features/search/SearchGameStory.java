package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.example.steps.serenity.GameResultsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.SearchGameSteps;

@RunWith(SerenityRunner.class)
public class SearchGameStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public SearchGameSteps searchGameSteps;
    @Steps
    public GameResultsSteps gameResultsSteps;

    @Issue("#regat-1")
    @Test
    public void searching_by_keyword_dixit_should_display_the_list_of_games() {
        searchGameSteps.is_the_home_page();
        searchGameSteps.close_newsletter();
        searchGameSteps.enters_a_game("dixit");
        gameResultsSteps.should_see_list_of_games("Dixit");
    }
    @Test
    public void searching_by_keyword_biber_gang_should_not_display_the_list_of_games(){
        searchGameSteps.is_the_home_page();
        searchGameSteps.close_newsletter();
        searchGameSteps.enters_a_game("biber gang");
        gameResultsSteps.should_not_see_list_of_games("Ne cerem scuze pentru neplacerea creata.");
    }
} 