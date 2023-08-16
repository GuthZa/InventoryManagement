package guthza.inventoryManagement.data;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Item {
    /*
    use a guthza.inventoryManagement.database to save a inventory of items
    table for inventory
    tableName = Zone where it is (Kitchen, LivingRoom, StoreRoom)
     - int ID
     - String name
     - Date Expiration date
     - String type (carbohydrates, meat, fish, dairy, greens)
     - String subtype (chicken, beef, pasta, rice, bread, beans, milk)
     */

    private static final AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private String name;
    private String type;
    private String subtype;

    public Item(String name, String type, String subtype) {
        this.id = _ID.incrementAndGet();
        this.name = name;
        this.type = type;
        this.subtype = subtype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    @Override
    public String toString() {
        return "\n\t\t\t" +
                "name: " + name + "\n\t\t\t" +
                "\ttype: " + type + "\n\t\t\t" +
                "\tsubtype: " + subtype + "\n\t\t\t";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(type, item.type) && Objects.equals(subtype, item.subtype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, subtype);
    }
}
