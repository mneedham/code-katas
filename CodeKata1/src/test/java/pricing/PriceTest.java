package pricing;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PriceTest {
    @Test
    public void shouldImplementComparableCorrectly() {
        Price priceOfOne = new Price(1);
        Price priceOfTwo = new Price(2);

        assertThat(priceOfOne.compareTo(priceOfOne), equalTo(0));
        assertThat(priceOfTwo.compareTo(priceOfOne), equalTo(1));
        assertThat(priceOfOne.compareTo(priceOfTwo), equalTo(-1));
    }
}
