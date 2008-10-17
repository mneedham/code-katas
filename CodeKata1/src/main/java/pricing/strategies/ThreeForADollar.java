package pricing.strategies;

import pricing.Price;

import java.util.List;
import java.util.Collections;

public class ThreeForADollar implements PricingStrategy {
    private Price accumulatedPrice;

    public Price calculateTotalPrice(List<Price> prices) {
        sortIntoDescendingOrder(prices);

        accumulatedPrice = priceForItemsBeingDiscounted(prices);
        addUnDiscountedItems(prices);

        return accumulatedPrice;
    }

    private void addUnDiscountedItems(List<Price> prices) {
        int numberOfItemsToPayFullPriceFor = prices.size() % 3;

        for(int i=0; i < numberOfItemsToPayFullPriceFor; i++) {
            accumulatedPrice = accumulatedPrice.plus(prices.get(i));
        }
    }

    private Price priceForItemsBeingDiscounted(List<Price> prices) {
        int numberOfGroupsForDiscount = prices.size() / 3;
        return new Price(1*numberOfGroupsForDiscount);
    }

    private void sortIntoDescendingOrder(List<Price> prices) {
        Collections.sort(prices);
        Collections.reverse(prices);
    }
}
