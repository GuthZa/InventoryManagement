package guthza.inventoryManagement.controller;

import guthza.inventoryManagement.data.Inventory;
import guthza.inventoryManagement.database.DBConnect;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<Inventory> inventories;

    public Controller(DBConnect dbConnect) {
        createInventories(dbConnect.getListValues());
    }

    public void createInventories(List<String> inventoryNames) {
        inventories = new ArrayList<>();
        inventoryNames.forEach(inventory -> inventories.add(new Inventory(inventory)));
    }

    public void printInventories() {
        inventories.forEach(inventory -> System.out.println(inventory.toString()));
    }
}
