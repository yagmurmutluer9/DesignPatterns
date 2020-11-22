package DecoratorPattern;

public class DecoratorDemo {

    public static void main(String [] args) {

        Pizza pizza = new Cheese(new PizzaImp());
        Pizza pizza_mushroom = new Mushroom(new Mushroom(new Cheese(new PizzaImp())));

        System.out.println(pizza.decorate());
        System.out.println(pizza_mushroom.decorate());


    }
}
