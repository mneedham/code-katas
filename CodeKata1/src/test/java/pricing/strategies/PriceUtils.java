package pricing.strategies;

import pricing.Price;

import java.util.List;
import java.util.Arrays;

public class PriceUtils {
    public static List<Price> with(Price... prices) {
        return Arrays.asList(prices);
    }
}
