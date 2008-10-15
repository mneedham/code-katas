package pricing.strategies;

import pricing.Price;
import pricing.Item;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class BuyTwoGetOneFree implements PricingStrategy {
    public Price calculatePrice(List<Price> prices) {
        putInDescendingOrder(prices);
        return calculateAccumulatedPrice(prices);
    }

    private Price calculateAccumulatedPrice(List<Price> prices) {
        Price accumulatedPrice = new Price(0);
        int numberOfSetsOfThree = prices.size() / 3;
        for (int i = 0; i < prices.size() - numberOfSetsOfThree; i++) {
            accumulatedPrice = accumulatedPrice.plus(prices.get(i));
        }
        return accumulatedPrice;
    }

    private void putInDescendingOrder(List<Price> prices) {
        Collections.sort(prices);
        Collections.reverse(prices);
    }
}