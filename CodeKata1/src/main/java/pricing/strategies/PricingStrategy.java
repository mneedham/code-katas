package pricing.strategies;

import pricing.Item;
import pricing.Price;

import java.util.List;

public interface PricingStrategy {
    Price calculatePrice(List<Item> items);
}