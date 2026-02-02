package entities.Pizze;

public class Margherita extends Pizzas {


    public Margherita() {
        this.calories = 1110;
        this.price = 4.99;

    }

    @Override
    public String toString() {
        return "Margherita: " +
                "ingredienti= " + ingrediente1 + " " + ingrediente2 + " " +
                ", calorie=" + calories +
                ", prezzo=" + price +
                "; ";
    }
}
