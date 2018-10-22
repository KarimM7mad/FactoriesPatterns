package dbassignment;

abstract class PizzaStore {

    public String storeName;

    public PizzaStore() {
    }

    public void orderPizza(String PizzaName) {
        System.out.println("PIZZA IS COOKING");
        Pizza pizza = this.createPizza(PizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("PIZZA FINISHED COOKING");
    }

    abstract public Pizza createPizza(String pizzaType);
}

class MadinetNasrStore extends PizzaStore {

    public MadinetNasrStore() {
        this.storeName = "pizzaStoreMadinetNasr";
    }

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        pizzaIngredientFactory pz = new MadinetNasrPizzaIngredientFactory();
        if (pizzaType.equalsIgnoreCase("Chesse")) {
            pizza = new CheesePizza(pz);
            pizza.name = "Chesse Pizza MadinetNasr";
        } else if (pizzaType.equalsIgnoreCase("Chicken")) {
            pizza = new ChickenPizza(pz);
            pizza.name = "Chicken Pizza MadinetNasr";
        }
        return pizza;

    }

}

class AbaseyaStore extends PizzaStore {

    public AbaseyaStore() {
        this.storeName = "AbaseyaStoreOfPizza";
    }

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        pizzaIngredientFactory pz = new AbaseyaPizzaIngredientFactory();
        if (pizzaType.equalsIgnoreCase("Chesse")) {
            pizza = new CheesePizza(pz);
            pizza.name = "Cheese Pizza Abaseya";
        } else if (pizzaType.equalsIgnoreCase("Chicken")) {
            pizza = new ChickenPizza(pz);
            pizza.name = "Chicken Pizza Abaseya";
        }
        return pizza;

    }

}

abstract class Pizza {

    String name;
    Cheese chesse;
    Chicken chicken;

    public void bake() {
        System.out.println("baking the pizza now");
    }

    public void cut() {
        System.out.println("Cutting Pizza now");
    }

    public void box() {
        System.out.println("Boxing Now");
    }

    abstract public void prepare();
}

class CheesePizza extends Pizza {

    public pizzaIngredientFactory pz;

    public CheesePizza(pizzaIngredientFactory pz) {
        this.pz = pz;
    }

    public void prepare() {
        this.chesse = pz.createCheese();
    }

}

class ChickenPizza extends Pizza {

    public pizzaIngredientFactory pz;

    public ChickenPizza(pizzaIngredientFactory pz) {
        this.pz = pz;
    }

    public void prepare() {
        this.chicken = pz.createChicken();
        this.chesse = pz.createCheese();
    }

}

public class DBAssignment {

    public static void main(String[] args) {

        PizzaStore ps1 = new MadinetNasrStore();
        ps1.orderPizza("Chesse");
        
        PizzaStore ps2 = new AbaseyaStore();
        ps2.orderPizza("chesse");
        
        
    }

}
