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
        return pricingStrategy.calculatePrice(items);
    }

    public void add(Item item) {
        items.add(item);
    }
}