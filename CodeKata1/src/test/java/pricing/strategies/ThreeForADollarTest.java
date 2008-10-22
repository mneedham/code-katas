package pricing.strategies;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.mvel2.MVEL;
import static pricing.strategies.PriceUtils.with;
import pricing.Price;

public class ThreeForADollarTest {
    @Test
    public void shouldApplyDiscountToThreePrices() {
        ThreeForADollar threeForADollar = new ThreeForADollar();

        Price price = threeForADollar.calculateTotalPrice(with(price("0.50"), price("0.40"), price("0.60")));

        assertThat(price, equalTo(price("1")));
    }

    @Test
    public void shouldApplyDiscountOnlyForThreePrices() {
        ThreeForADollar threeForADollar = new ThreeForADollar();

        Price price = threeForADollar.calculateTotalPrice(with(price("0.50"), price("0.50"), price("0.50"), price("0.50")));

        assertThat(price, equalTo(price("1.50")));
    }

    private Price price(String value) {
        return new Price(new Double(value));
    }
}
