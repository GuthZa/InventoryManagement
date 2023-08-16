package guthza.inventoryManagement;

import guthza.inventoryManagement.controller.Controller;
import guthza.inventoryManagement.database.DBConnect;

import java.util.List;

public class InventoryManagement {

/*
     Can we create new storage units?
     by using CREATE TABLE with Java
     */
     /*
    You can add, remove and move items between tables
    to move, add on one side and remove the other
    to make it secure and not double items on a failed
    add to an auxiliary product, then add the item to a removed auxiliary product
    try to remove, if it removes, try to add the item
    if it fails to remove, nothing done
    if it fails to add, add the removed item back

    We then have an alarm for items that have pass the expiration date
    a yellow warning zone for items that are at end of life
 */

    public static void main(String[] args) {

        DBConnect dbConnect = new DBConnect();
        Controller controller = new Controller(dbConnect);

        controller.printInventories();
    }
}