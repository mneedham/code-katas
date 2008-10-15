package pricing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import pricing.strategies.PricingStrategy;
import pricing.strategies.BuyTwoGetOneFree;

public class ItemsTest {

    @Test
    public void shouldNotApplyBuyTwoGetOneFreeStrategyIfOnlyOneItemPurchased() {
        PricingStrategy pricingStrategy = new BuyTwoGetOneFree();
        Items items = createItems(pricingStrategy);
        Price expectedPrice = new Price(1);

        Price price = items.calculatePrice();

        assertThat(price, equalTo(expectedPrice));
    }

    private Items createItems(PricingStrategy pricingStrategy) {
        Items items = new Items(pricingStrategy);
        items.add(new Item(new Price(1)));
        return items;
    }
}