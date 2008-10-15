package pricing.strategies;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;import static org.hamcrest.core.IsEqual.equalTo;

import java.util.Collections;

import pricing.Item;
import pricing.Price;


public class BuyTwoGetOneFreeTest {
    @Test
    public void shouldNotApplyBuyTwoGetOneFreeToOneItem() {
        BuyTwoGetOneFree buyTwoGetOneFree = new BuyTwoGetOneFree();

        Price price = buyTwoGetOneFree.calculatePrice(Collections.singletonList(new Item(new Price(1))));

        assertThat(price, equalTo(new Price(1)));
    }


}
