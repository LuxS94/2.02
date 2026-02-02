package entities.Pizze;

public class Salami extends Pizzas {
    public String ingrediente;


    public Salami() {
        this.ingrediente = "salami";
        this.calories = 1160;
        this.price = 5.99;
    }


    public String getIngrediente() {
        return ingrediente;
    }

    @Override
    public String toString() {
        return "Salami: " +
                "ingredienti= " + ingrediente + " " + ingrediente1 + " " + ingrediente2 + " " +
                ", calorie=" + calories +
                ", prezzo=" + price +
                "; "
                ;
    }
}
