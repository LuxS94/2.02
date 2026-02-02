package entities.Drinks;

public class Wine extends Drinks {
    public Wine() {
        this.calories = 607;
        this.price = 7.49;
    }

    @Override
    public String toString() {
        return "Wine: " +
                "calories=" + calories +
                ", price=" + price + "; "
                ;
    }
}
