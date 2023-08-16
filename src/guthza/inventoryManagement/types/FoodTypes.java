package guthza.inventoryManagement.types;

public enum FoodTypes {
    Meat("meat"), Poultry("Poultry"), Game("game"),
    Fish("fish"), Shellfish("shellfish"),
    Dairy("dairy"),
    Eggs("eggs"),
    Oils("oils"),
    Sugar("sugar"),
    Fruits("fruits"), Vegetables("vegetables"),
    Grains("grains"), Beans("beans"),
    Nuts("nuts"), Seeds("seeds");

    public final String name;

    FoodTypes(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
