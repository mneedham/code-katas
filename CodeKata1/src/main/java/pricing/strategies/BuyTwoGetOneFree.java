package pricing.strategies;

import pricing.Price;
import pricing.Item;

import java.util.List;

public class BuyTwoGetOneFree implements PricingStrategy {
    public Price calculatePrice(List<Item> items) {
        return items.get(0).getPrice();
    }
}
