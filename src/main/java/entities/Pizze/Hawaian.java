package entities.Pizze;

public class Hawaian extends Pizzas {
    public String ingrediente1;
    public String ingrediente2;


    public Hawaian() {
        this.ingrediente1 = "ham";
        this.ingrediente2 = "pineapple";
        this.calories = 1024;
        this.price = 6.49;
    }

    @Override
    public String getIngrediente1() {
        return ingrediente1;
    }

    @Override
    public String getIngrediente2() {
        return ingrediente2;
    }
}

