package DecoratorPattern;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithCheese();
    }

    private String decorateWithCheese() {
        return " with Cheese.";
    }
}
