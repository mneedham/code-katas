package pricing;

import pricing.strategies.PricingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Items {
    private PricingStrategy pricingStrategy;
    private List<Item> items;

    public Items(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.items = new ArrayList<Item>();
    }

    public Price calculatePrice() {
        return pricingStrategy.calculatePrice(derivePrices());
    }

    private List<Price> derivePrices() {
        List<Price> prices = new ArrayList<Price>();
        for (Item item : items) {
            prices.add(item.getPrice());
        }
        return prices;
    }

    public void add(Item item) {
        items.add(item);
    }
}