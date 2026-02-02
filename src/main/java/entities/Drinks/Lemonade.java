package entities.Drinks;

public class Lemonade extends Drinks {
    public Lemonade() {
        this.calories = 128;
        this.price = 1.29;
    }

    @Override
    public String toString() {
        return "Lemonade: " +
                "calories=" + calories +
                ", price=" + price + "; "
                ;
    }
}
