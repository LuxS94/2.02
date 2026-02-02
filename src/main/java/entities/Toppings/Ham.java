package entities.Toppings;

public class Ham extends Toppings {


    public Ham() {
        this.calories = 35;
        this.price = 0.99;
    }

    @Override
    public String toString() {
        return "Ham :" +
                "calories=" + calories +
                ", price=" + price + ";"
                ;
    }
}