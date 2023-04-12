package com.gildedrose;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgedBrieTest {

    static final String ITEM_NAME = "Aged Brie";
    static final int ITEM_QUALITY_DEFAULT = 20;
    static final int ITEM_QUALITY_EXPECTED = 22;
    private static final int ITEM_SELLIN_PASSED = 0;
    private static final int ITEM_SELLIN_DEFAULT = 5;

    static final int ITEM_QUALITY_DATE_NOT_PASSED_EXPECTED = 21;

    @Test
    void checkTheQualityOfAgedBriePastTheDateTest(){
        Item[] items = new Item[] {new Item(ITEM_NAME, ITEM_SELLIN_PASSED, ITEM_QUALITY_DEFAULT)};
        GildedRose gildedRoseApp = new GildedRose(items);

        gildedRoseApp.updateQuality();

        assertEquals(ITEM_QUALITY_EXPECTED ,items[0].quality);

    }

    @Test
    void checkTheQualityOfAgedBrieNotPastTheDateTest(){
        Item[] items = new Item[] {new Item(ITEM_NAME, ITEM_SELLIN_DEFAULT, ITEM_QUALITY_DEFAULT)};
        GildedRose gildedRoseApp = new GildedRose(items);

        gildedRoseApp.updateQuality();

        assertEquals(ITEM_QUALITY_DATE_NOT_PASSED_EXPECTED, items[0].quality);
    }





}
