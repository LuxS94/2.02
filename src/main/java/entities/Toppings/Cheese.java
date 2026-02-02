package entities.Toppings;

public class Cheese extends Toppings {


    public Cheese() {
        this.calories = 92;
        this.price = 0.69;
    }

    @Override
    public String toString() {
        return "Cheese :" +
                "calories=" + calories +
                ", price=" + price + ";"
                ;
    }
}
