package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.GameResultsPage;
import org.example.pages.UserInfoPage;

import static org.junit.Assert.assertEquals;

public class UserInfoSteps {

    UserInfoPage userInfoPage;

    @Step
    public void should_see_account_message(String heading) {
        assertEquals(heading, userInfoPage.getAccountInfo());
    }

}