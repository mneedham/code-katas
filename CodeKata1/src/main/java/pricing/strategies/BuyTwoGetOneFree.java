package pricing.strategies;

import pricing.Price;

import java.util.List;
import java.util.Collections;

public class BuyTwoGetOneFree implements PricingStrategy {
    public Price calculatePrice(List<Price> prices) {
        sortIntoDescendingOrder(prices);
        return calculateAccumulatedPrice(prices);
    }

    private Price calculateAccumulatedPrice(List<Price> prices) {
        Price accumulatedPrice = new Price(0);
        int numberOfPricesNotToAccumulate = prices.size() / 3;
        for (int i = 0; i < prices.size() - numberOfPricesNotToAccumulate; i++) {
            accumulatedPrice = accumulatedPrice.plus(prices.get(i));
        }
        return accumulatedPrice;
    }

    private void sortIntoDescendingOrder(List<Price> prices) {
        Collections.sort(prices);
        Collections.reverse(prices);
    }
}