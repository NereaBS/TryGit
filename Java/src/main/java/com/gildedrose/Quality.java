package com.gildedrose;

public class Quality {
    private int value;
    static final int MAX_LIMIT = 50;

    public int getValue() {
        return value;
    }

    public Quality(Integer value) {
        this.value = value;
    }

    public void incrementOne(){
        final int INCREMENT_VALUE = 1;
        if (value + INCREMENT_VALUE > MAX_LIMIT) {
            value = MAX_LIMIT;
            return;
        }
        value++;
    }
    public void decreaseOne(){
        final int DECREASE_VALUE = 1;
        if (value - DECREASE_VALUE > MAX_LIMIT) {
            value = MAX_LIMIT;
            return;


        }
        value--;
    }


}
