package com.company.course02.utilities;

import java.util.Random;

public class NumberGenerator {
    private final Random random;

    public NumberGenerator() {
        random = new Random();
    }

    public int getRandom() {
        return random.nextInt(100);
    }
}
