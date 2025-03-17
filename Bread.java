public class Bread {
    private String name = "none";
    private int calories = 50;
    private String type = "Whole Grain";

    // Valid bread types
    private static final String[] VALID_TYPES = {"Honey Wheat", "White", "Whole Grain", "Whole Wheat"};

    // Constructors
    public Bread() {}

    public Bread(String name, int calories, String type) {
        setName(name);
        setCalories(calories);
        setType(type);
    }

    // Accessors (Getters)
    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }

    // Mutators (Setters) with validation
    public void setName(String name) {
        this.name = (name != null) ? name : "none";
    }

    public void setCalories(int calories) {
        this.calories = (calories >= 50 && calories <= 250) ? calories : 50;
    }

    public void setType(String type) {
        for (String validType : VALID_TYPES) {
            if (validType.equalsIgnoreCase(type)) {
                this.type = validType;
                return;
            }
        }
        this.type = "Whole Grain"; // Default value if invalid
    }

    // Equals method (ignoring case for name and type)
    public boolean equals(Bread other) {
        if (other == null) return false;
        return this.name.equalsIgnoreCase(other.name) &&
               this.calories == other.calories &&
               this.type.equalsIgnoreCase(other.type);
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Calories: " + calories + ", Type: " + type;
    }
}
