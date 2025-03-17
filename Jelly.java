// made by Harold kemta 

public class Jelly {
    private String name = "none";
    private int calories = 50;
    private String fruitType = "Grape";

    // Valid fruit types
    private static final String[] VALID_FRUIT_TYPES = {"Apple", "Blackberry", "Grape", "Blueberry", "Tomato"};

    // Constructors
    public Jelly() {}

    public Jelly(String name, int calories, String fruitType) {
        setName(name);
        setCalories(calories);
        setFruitType(fruitType);
    }

    // Accessors (Getters)
    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getFruitType() {
        return fruitType;
    }

    // Mutators (Setters) with validation
    public void setName(String name) {
        this.name = (name != null) ? name : "none";
    }

    public void setCalories(int calories) {
        this.calories = (calories >= 50 && calories <= 200) ? calories : 50;
    }

    public void setFruitType(String fruitType) {
        for (String validType : VALID_FRUIT_TYPES) {
            if (validType.equalsIgnoreCase(fruitType)) {
                this.fruitType = validType;
                return;
            }
        }
        this.fruitType = "Grape"; // Default value if invalid
    }

    // Equals method (ignoring case for name and fruitType)
    public boolean equals(Jelly other) {
        if (other == null) return false;
        return this.name.equalsIgnoreCase(other.name) &&
               this.calories == other.calories &&
               this.fruitType.equalsIgnoreCase(other.fruitType);
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Calories: " + calories + ", Fruit Type: " + fruitType;
    }
}
