package FactoryPattern;

public class NyCheeseStylePizza extends Pizza {
  public NyCheeseStylePizza() {
    name = "Ny sauce and cheese pizza";
    dough = "Thin Crust";
    sauce = "Marinara";
    toppings.add("Grated Cheese");
  }

  void bake() {
    System.out.println("baking for 15 min");
  }
}
