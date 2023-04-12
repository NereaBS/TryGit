package com.gildedrose;


import static com.gildedrose.GildedRose.UTILITIES;

public class AgedBrie {
    public void updateAgedBrie(Item item) {
        Quality quality = new Quality(item.quality);
        quality.incrementOne();
        if(!UTILITIES.checkSellInGreaterThanCero(item)) {
            quality.incrementOne();
        }
        item.quality = quality.getValue();
    }
}
