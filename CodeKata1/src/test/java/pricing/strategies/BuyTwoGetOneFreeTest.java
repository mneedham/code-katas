package pricing.strategies;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.List;
import java.util.Arrays;

import pricing.Price;


public class BuyTwoGetOneFreeTest {
    @Test
    public void shouldNotApplyDiscountToLessThanThreeItems() {
        BuyTwoGetOneFree buyTwoGetOneFree = new BuyTwoGetOneFree();

        Price price = buyTwoGetOneFree.calculatePrice(with(new Price(1), new Price(1)));

        assertThat(price, equalTo(new Price(2)));
    }

    @Test
    public void shouldApplyDiscountToExactlyThreeItems() {
        BuyTwoGetOneFree buyTwoGetOneFree = new BuyTwoGetOneFree();

        Price price = buyTwoGetOneFree.calculatePrice(with(new Price(1), new Price(1), new Price(1)));

        assertThat(price, equalTo(new Price(2)));
    }

    @Test
    public void shouldGiveCheapestItemFree() {
        BuyTwoGetOneFree buyTwoGetOneFree = new BuyTwoGetOneFree();

        Price price = buyTwoGetOneFree.calculatePrice(with(new Price(1), new Price(2), new Price(3), new Price(4)));

        assertThat(price, equalTo(new Price(9)));
    }

    @Test
    public void shouldGiveCheapestItemsFree() {
        BuyTwoGetOneFree buyTwoGetOneFree = new BuyTwoGetOneFree();

        Price price = buyTwoGetOneFree.calculatePrice(with(new Price(1), new Price(2), new Price(3),
                                                           new Price(4), new Price(5), new Price(6)));

        assertThat(price, equalTo(new Price(18)));
    }
    
    
    private List<Price> with(Price... prices) {
        return Arrays.asList(prices);
    }
}