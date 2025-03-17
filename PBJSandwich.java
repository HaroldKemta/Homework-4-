public class PBJSandwich {
    private Bread topSlice = new Bread();
    private PeanutButter peanutButter = new PeanutButter();
    private Jelly jelly = new Jelly();
    private Bread bottomSlice = new Bread();

    // Constructors
    public PBJSandwich() {}

    public PBJSandwich(Bread topSlice, PeanutButter peanutButter, Jelly jelly, Bread bottomSlice) {
        setTopSlice(topSlice);
        setPeanutButter(peanutButter);
        setJelly(jelly);
        setBottomSlice(bottomSlice);
    }

    // Accessors (Getters)
    public Bread getTopSlice() {
        return topSlice;
    }

    public PeanutButter getPeanutButter() {
        return peanutButter;
    }

    public Jelly getJelly() {
        return jelly;
    }

    public Bread getBottomSlice() {
        return bottomSlice;
    }

    // Mutators (Setters) with validation
    public void setTopSlice(Bread topSlice) {
        this.topSlice = (topSlice != null) ? topSlice : new Bread();
    }

    public void setPeanutButter(PeanutButter peanutButter) {
        this.peanutButter = (peanutButter != null) ? peanutButter : new PeanutButter();
    }

    public void setJelly(Jelly jelly) {
        this.jelly = (jelly != null) ? jelly : new Jelly();
    }

    public void setBottomSlice(Bread bottomSlice) {
        this.bottomSlice = (bottomSlice != null) ? bottomSlice : new Bread();
    }

    // Equals method: Calls equals on each instance variable
    public boolean equals(PBJSandwich other) {
        if (other == null) return false;
        return this.topSlice.equals(other.topSlice) &&
               this.peanutButter.equals(other.peanutButter) &&
               this.jelly.equals(other.jelly) &&
               this.bottomSlice.equals(other.bottomSlice);
    }

    // toString method: Returns all instance variables as a string
    public String toString() {
        return "PBJSandwich:\nTop Slice: " + topSlice +
               "\nPeanut Butter: " + peanutButter +
               "\nJelly: " + jelly +
               "\nBottom Slice: " + bottomSlice;
    }
}
