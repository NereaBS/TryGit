package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstageTest {
    public final String NAME_BACKSTAGE = "Backstage";
    public final int SELLIN = 0;
    static final int QUALITY_BACKSTAGE = 20;


    @Test
    void checkBackstageQualityDatePassedTest(){
        Item[] item = new Item[] {new Item(NAME_BACKSTAGE, SELLIN, QUALITY_BACKSTAGE)};
        GildedRose gildedRoseApp = new GildedRose(item);

        gildedRoseApp.updateQuality();
        assertEquals(0, gildedRoseApp.items[0].quality);
    }

    @Test
    void checkBackstageQualityNotPassedDateTest(){
        Item[] item = new Item[] {new Item(NAME_BACKSTAGE, 11, QUALITY_BACKSTAGE)};
        GildedRose gildedRoseApp = new GildedRose(item);

        gildedRoseApp.updateQuality();
        assertEquals(21, gildedRoseApp.items[0].quality);
    }


}
