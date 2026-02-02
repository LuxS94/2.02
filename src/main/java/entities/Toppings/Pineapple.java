package entities.Toppings;

public class Pineapple extends Toppings {


    public Pineapple() {
        this.calories = 24;
        this.price = 0.79;
    }

    @Override
    public String toString() {
        return "Pinapple :" +
                "calories=" + calories +
                ", price=" + price + ";"
                ;
    }
}