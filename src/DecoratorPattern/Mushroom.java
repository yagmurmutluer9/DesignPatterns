package DecoratorPattern;

public class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithCheese();
    }

    private String decorateWithCheese() {
        return " with Mushroom.";
    }
}
