package com.gildedrose;

import static com.gildedrose.GildedRose.UTILITIES;

public class Backstage {
    public void updateBackStage(Item item) {
        if(UTILITIES.checkQualityInRange50(item)){
            UTILITIES.increaseQuality(item);
            if (!checkBackStageSellInThanTen(item)){
                UTILITIES.increaseQuality(item);
            }
            if(checkBackStageSellInThanFive(item)){
                UTILITIES.increaseQuality(item);
            }
        }
    }

    public boolean checkBackStageSellInThanTen(Item item) {
        return item.sellIn > 10;
    }
    public boolean checkBackStageSellInThanFive(Item item) {
        return item.sellIn <= 5;
    }
}
