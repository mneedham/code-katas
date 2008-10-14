package pricing;

public class Money {
    private int value;

    public Money(int value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return value == money.value;
    }

    public int hashCode() {
        return value;
    }
}
