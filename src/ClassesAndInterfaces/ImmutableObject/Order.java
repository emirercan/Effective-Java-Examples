package ClassesAndInterfaces.ImmutableObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Order {
    private final int orderId;
    private final List<Item> items;

    public Order(int orderId, List<Item> items) {
        this.orderId = orderId;
        // Create a new ArrayList and copy the items into it to prevent external modification
        this.items = new ArrayList<>(items);
    }

    public int getOrderId() {
        return orderId;
    }

    // Return an unmodifiable list to prevent external modification
    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public Order addItem(Item item) {
        // Create a new list and copy the existing items and the new item into it
        List<Item> newItems = new ArrayList<>(items);
        newItems.add(item);
        // Return a new Order object with the updated items list
        return new Order(orderId, newItems);
    }

    public Order removeItem(Item item) {
        // Create a new list and copy the existing items into it, except for the item to be removed
        List<Item> newItems = new ArrayList<>();
        for (Item currentItem : items) {
            if (!currentItem.equals(item)) {
                newItems.add(currentItem);
            }
        }
        // Return a new Order object with the updated items list
        return new Order(orderId, newItems);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order other = (Order) obj;
        return orderId == other.orderId && items.equals(other.items);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + orderId;
        result = 31 * result + items.hashCode();
        return result;
    }
}

