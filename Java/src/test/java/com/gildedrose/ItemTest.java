package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    static final int EXPECTED_SELLIN = 4;
    static final int NEGATIVE_VALUE_QUALITY = -4;
    static final int HIGHER_QUALITY_THAN_50 = 51;
    static final int QUALITY_DEFAULT = 20;
    static final int SELLIN_PASSED = 0;
    static final int SELLIN_DEFAULT = 5;
    static final String ITEM_DEFAULT = "Item default";
    static final int DEFAULT_ITEM_EXPECTED_DATE_PASSED = 18;
    static final int ITEM_DEFAULT_NOT_PASSED_QUALITY_EXPECTED = 19;

    @Test
    void checkQualityDateHasPassedTest() {
        Item[] items = new Item[] { new Item(ITEM_DEFAULT, SELLIN_PASSED, QUALITY_DEFAULT) };
        GildedRose gildedRoseApp = new GildedRose(items);

        gildedRoseApp.updateQuality();

        assertEquals(QUALITY_DEFAULT,gildedRoseApp.items[0].quality);
    }
    @Test
    void checkQualityDateHasNotPassedTest() {

        Item[] items = new Item[] { new Item(ITEM_DEFAULT, SELLIN_DEFAULT, QUALITY_DEFAULT) };
        GildedRose gildedRoseApp = new GildedRose(items);

        gildedRoseApp.updateQuality();

        assertEquals(ITEM_DEFAULT_NOT_PASSED_QUALITY_EXPECTED,gildedRoseApp.items[0].quality);
    }
    @Test
    void checkSellInTest() {

        Item[] items = new Item[] { new Item(ITEM_DEFAULT, SELLIN_DEFAULT, QUALITY_DEFAULT) };
        GildedRose gildedRoseApp = new GildedRose(items);

        gildedRoseApp.updateQuality();

        assertEquals(EXPECTED_SELLIN,gildedRoseApp.items[0].sellIn);
    }
    @Test
    void checkNonNegativeQualityTest() {
        Item[] items = new Item[] { new Item(ITEM_DEFAULT, SELLIN_DEFAULT, NEGATIVE_VALUE_QUALITY) };
    }
    @Test
    void checkItemQualityInRange50Test(){
        Item[] items = new Item[] { new Item(ITEM_DEFAULT, SELLIN_DEFAULT, HIGHER_QUALITY_THAN_50) };
        GildedRose gildedRoseApp = new GildedRose(items);
        //assertEquals(gildedRoseApp.items[0].quality);

    }

}
