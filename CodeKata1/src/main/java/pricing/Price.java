package pricing;

public class Price implements Comparable<Price> {
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

    public String toString() {
        return "Price: " + value;
    }

    public Price plus(Price price) {
        return new Price(price.value + value);
    }

    public int compareTo(Price price) {
        if(value < price.value) return -1;
        if(value > price.value) return 1;
        return 0;
    }
}