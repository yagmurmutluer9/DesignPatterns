public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Toppings[] toppings;


    abstract void prepare();

    public void bake() {
        System.out.println("Pizza is being baked");
    }

    public void cut() {
        System.out.println("Pizza is being cut");
    }

    public void box() {
        System.out.println("Pizza is being boxed");
    }

    @Override

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(name);
        if (dough != null) {
            result.append(" with" + dough);
        }
        if (sauce != null) {
            result.append(" with " + sauce);
        }
        if (toppings != null) {
            for (int i = 0; i < toppings.length; i++) {
                result.append(", " + toppings[i]);
                if (i < toppings.length - 1) {
                }
            }
        }
        result.append("\n");
        result.append("Bon apetit!");


        return result.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
