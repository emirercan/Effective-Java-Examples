package ClassesAndInterfaces.ImmutableObject;

public final class Item {
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item other = (Item) obj;
        return name.equals(other.name) && price == other.price;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        long priceBits = Double.doubleToLongBits(price);
        result = 31 * result + (int) (priceBits ^ (priceBits >>> 32));
        return result;
    }
}
