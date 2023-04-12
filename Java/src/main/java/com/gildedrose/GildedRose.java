package com.gildedrose;

class GildedRose {
    Item[] items;
    static final Backstage BACKSTAGE_ITEM = new Backstage();
    static final AgedBrie AGED_BRIE_ITEM = new AgedBrie();
    static final Utility UTILITIES = new Utility();

    static final String AGED_BRIE = "Aged Brie";
    static final String SULFURAS = "Sulfuras";
    static final String BACKSTAGE_PASSED = "Backstage";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if(!containsItemSulfuras(item.name)) {
                if (UTILITIES.checkNonNegativeQuality(item)) {
                    if (containsItemAgedBrie(item.name)) {
                        AGED_BRIE_ITEM.updateAgedBrie(item);
                    } else if (containsItemBackstagePassed(item.name)) {
                        if (!UTILITIES.checkSellInGreaterThanCero(item)){
                            item.quality = 0;
                        } else BACKSTAGE_ITEM.updateBackStage(item);
                    } else {
                        updateItemDefault(item);
                    }
                }
                UTILITIES.decreaseSellIn(item);
            }
        }
    }

    private void updateItemDefault(Item item) {
        Quality quality = new Quality(item.quality);
        quality.decreaseOne();
        if(!UTILITIES.checkSellInGreaterThanCero(item)){
            quality.decreaseOne();
        }

    }

    public boolean containsItemAgedBrie(String name){
        return name.contains(AGED_BRIE);
    }
    public boolean containsItemSulfuras(String name){
        return name.contains(SULFURAS);
    }
    public boolean containsItemBackstagePassed(String name){
        return name.contains(BACKSTAGE_PASSED);
    }
}


