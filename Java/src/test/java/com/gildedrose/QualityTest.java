package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityTest {

    @Test
    void incrementOneTest() {
        final int QUALITY_AMOUNT_ALLOWED_TO_BE_INCREASED = 30;
        Quality quality = new Quality(QUALITY_AMOUNT_ALLOWED_TO_BE_INCREASED);

        quality.incrementOne();

        final int EXPECTED_INCREASED_QUALITY = 31;
        assertEquals(EXPECTED_INCREASED_QUALITY,quality.getValue());
    }

    @Test
    void decreaseTest() {
        final int QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED = 31;
        Quality quality = new Quality(QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED);

        quality.decreaseOne();

        final int EXPECTED_DECREASED_QUALITY = 30;
        assertEquals(EXPECTED_DECREASED_QUALITY,quality.getValue());
    }
}
