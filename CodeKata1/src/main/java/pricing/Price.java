package pricing;

public class Price {
    private int value;

    public Price(int value) {

        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price = (Price) o;

        return value == price.value;
    }

    public int hashCode() {
        return value;
    }
}