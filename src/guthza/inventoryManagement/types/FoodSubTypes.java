package guthza.inventoryManagement.types;

public enum FoodSubTypes {

    Fish("fish"),
    Mollusks("mollusks"), Crustaceans("crustaceans"),
    Cheese("cheese"), Milk("milk"),
    Beef("beef"), Pork("pork"), Chicken("chicken"), Goat("goat"), Sheep("sheep"), Rabbit("rabbit"), Hare("hare"), Turkey("turkey"),
    Eggs("eggs"),
    Tropical("tropical"), SubTropical("sub tropical"), Small("small"), Pome("pome"), Stone("stone"), Melons("melons"),
    Fungi("fungi"), Sprouts("sprouts"), Roots("roots"), SeededVegetables("seeded vegetables"), Herbs("herbs"), CropVegetables("crop vegetables"),
    Grains("grains"), Beans("beans"),
    Nuts("nuts"), Seeds("seeds");

    public final String name;

    FoodSubTypes(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
