package FactoryPattern.PizzaExample;

public class NyStore extends PizzaStore {

  public Pizza createPizza(String type) {
    if (type == "cheese") {
      return new NyCheeseStylePizza();
    } else {
      return null;
    }
  }
}
