package FactoryPattern.PizzaExample;

public class Main {
  public static void main(String[] args) {
      PizzaStore nyStore = new NyStore();
      Pizza cheeseSlice = nyStore.orderPizza("cheese");
      cheeseSlice.prepare();
  }
}
