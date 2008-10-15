package pricing;

public class Item {
    private Price price;

    public Item(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return !(price != null ? !price.equals(item.price) : item.price != null);

    }

    public int hashCode() {
        return (price != null ? price.hashCode() : 0);
    }
}
