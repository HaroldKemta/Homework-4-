public class PeanutButter {
    private String name = "none";
    private int calories = 100;
    private boolean isCrunchy = false;

    // Constructors
    public PeanutButter() {}

    public PeanutButter(String name, int calories, boolean isCrunchy) {
        setName(name);
        setCalories(calories);
        setIsCrunchy(isCrunchy);
    }

    // Accessors (Getters)
    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public boolean getIsCrunchy() {
        return isCrunchy;
    }

    // Mutators (Setters) with validation
    public void setName(String name) {
        this.name = (name != null) ? name : "none";
    }

    public void setCalories(int calories) {
        this.calories = (calories >= 100 && calories <= 300) ? calories : 100;
    }

    public void setIsCrunchy(boolean isCrunchy) {
        this.isCrunchy = isCrunchy;
    }

    // Equals method (ignoring case for name)
    public boolean equals(PeanutButter other) {
        if (other == null) return false;
        return this.name.equalsIgnoreCase(other.name) &&
               this.calories == other.calories &&
               this.isCrunchy == other.isCrunchy;
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Calories: " + calories + ", Crunchy: " + isCrunchy;
    }
}
