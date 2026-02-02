package entities.Pizze;

public abstract class Pizzas {
    public String ingrediente1;
    public String ingrediente2;
    public int calories;
    public double price;

    public Pizzas() {
        this.ingrediente1 = "pomodoro";
        this.ingrediente2 = "mozzarella";
    }

    public String getIngrediente1() {
        return ingrediente1;

    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    ;

    @Override
    public String toString() {
        return
                ingrediente1 + " ," +
                        ingrediente2 + " ,";
    }
}
