package guthza.inventoryManagement.controller;

import guthza.inventoryManagement.data.Inventory;
import guthza.inventoryManagement.data.Item;
import guthza.inventoryManagement.types.FoodSubTypes;
import guthza.inventoryManagement.types.FoodTypes;

public class Controller {

    Inventory inventoryKitchen;
    Inventory inventoryStoreRoom;

    public Controller() {
        inventoryKitchen = new Inventory("Kitchen");
        inventoryKitchen.addItem(new Item("Chicken breasts", FoodTypes.Meat.name, FoodSubTypes.Chicken.name));
        inventoryKitchen.addItem(new Item("Chickpeas", FoodTypes.Beans.name, FoodSubTypes.Beans.name));
        inventoryKitchen.addItem(new Item("Milk", FoodTypes.Dairy.name, FoodSubTypes.Milk.name));
        inventoryKitchen.addItem(new Item("Eggs", FoodTypes.Eggs.name, FoodSubTypes.Eggs.name));

        inventoryStoreRoom = new Inventory("Store Room");
        inventoryStoreRoom.addItem(new Item("Tomato Paste", FoodTypes.Vegetables.name, FoodSubTypes.SeededVegetables.name));
        inventoryStoreRoom.addItem(new Item("Spaghetti", FoodTypes.Grains.name, FoodSubTypes.Grains.name));
        inventoryStoreRoom.addItem(new Item("Corn", FoodTypes.Grains.name, FoodSubTypes.Grains.name));
        inventoryStoreRoom.addItem(new Item("Rice", FoodTypes.Grains.name, FoodSubTypes.Grains.name));
    }

    public boolean addItem(String name, String type, String subType, String place) {
        if(name == null || type == null || subType == null || place == null) return false;
        switch (place) {
            case "kitchen", "Kitchen" -> inventoryKitchen.addItem(new Item(name, type, subType));
            case "storeroom", "Store Room", "StoreRoom" -> inventoryStoreRoom.addItem(new Item(name, type, subType));
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory:\n\t" + inventoryKitchen.getName() + inventoryKitchen.toString() +
                "\t" + inventoryStoreRoom.getName() + inventoryStoreRoom.toString();
    }
}
