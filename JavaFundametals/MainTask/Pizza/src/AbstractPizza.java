public abstract class AbstractPizza {
    // ingredients
    private String pizzaName;
    private String pizzaIngredients[];
    private String pizzaType;
    private int numberOfPizza;

    public abstract String getPizzaName();
    public abstract void setPizzaName(String pizzaName);

    public abstract String[] getPizzaIngredients();
    public abstract void setPizzaIngredients();

    public abstract String getPizzaType();
    public abstract void setPizzaType();

    public abstract int getNumberOfPizza();
    public abstract void setNumberOfPizza();
}