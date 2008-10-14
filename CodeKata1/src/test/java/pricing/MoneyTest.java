package pricing;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Matchers.eq;

public class MoneyTest {

    @Test
    public void shouldRepresentSimpleIntegerValue() {
        Money money = new Money(1);

        assertThat(new Money(1), equalTo(money));
    }
}