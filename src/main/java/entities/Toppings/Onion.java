package entities.Toppings;

public class Onion extends Toppings {


    public Onion() {
        this.calories = 22;
        this.price = 0.69;
    }

    @Override
    public String toString() {
        return "Onion :" +
                "calories=" + calories +
                ", price=" + price + ";"
                ;
    }
}
