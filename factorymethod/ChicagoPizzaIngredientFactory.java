public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new BuffaloSauce();
    }

    @Override
    public Toppings[] createToppings() {
        Toppings[] toppings = {new Mushroom(), new Proscuitto(), new PecorinoCheese()};
        return toppings;
    }
}
