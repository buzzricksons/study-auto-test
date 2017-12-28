package com.example.page.google;

import com.example.AbstractTests;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
/**
 * Test for Google Search.
 *
 * @author HyungCheol Kim
 *
 */
public class GooglePageTests2 extends AbstractTests {
    /**
     * Test for keyword "selenium".
     *
     */
    @Test
    public void testGoogleSearch() {
        GoogleSearchPage searchPage = open("http://google.com/", GoogleSearchPage.class);
        GoogleResultsPage resultsPage = searchPage.search("selenium");

        resultsPage.results().get(0).shouldHave(text("Selenium - Web Browser Automation"));

        resultsPage.results().shouldHave(size(10));

    }
}
