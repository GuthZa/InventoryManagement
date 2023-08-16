package guthza.inventoryManagement.data;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private String name;
    private final List<Item> itemList;

    public Inventory(String name) {
        this.name = name;
        itemList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addItem(Item item) {
        return itemList.add(item);
    }

    public boolean removeItem(int id) {
        return itemList.remove(getItemById(id));
    }

    public Item getItemById(int id) {
        return itemList.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
    }

    public Item getItemById(String name) {
        return itemList.stream().filter(item -> item.getName().equals(name)).findFirst().orElse(null);
    }


    public List<Item> getItemList() {
        return itemList;
    }

    @Override
    public String toString() {
        return " Inventory\n" +
                "\t\tItem List -> " + itemList +
                "\n";
    }
}
