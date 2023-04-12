package com.gildedrose;

public class Utility {
    private static final int CONSTANT_CERO = 0;
    private static final int QUALITY_FIFTY = 50;


    public void increaseQuality(Item item){
        item.quality++;
    }
    public void decreaseQuality(Item item){
        item.quality--;
    }
    public void decreaseSellIn(Item item) {
        item.sellIn--;
    }
    public boolean checkSellInGreaterThanCero(Item item) {
        return item.sellIn > CONSTANT_CERO;
    }
    public boolean checkNonNegativeQuality(Item item) {
        return item.quality > CONSTANT_CERO;
    }
    public boolean checkIQualityItemInRange50(Item item) {
        return item.quality <= QUALITY_FIFTY;
    }
    public boolean checkQualityInRange50(Item item) {
        return item.quality + 2 <= QUALITY_FIFTY || item.quality + 1 <= QUALITY_FIFTY;
    }
}
