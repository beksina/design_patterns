package FactoryPattern;

public class Main {
  public static void main(String[] args) {
      PizzaStore ny = new NyStore();
      Pizza cheeseSlice = ny.orderPizza("cheese");
      cheeseSlice.prepare();
  }
}
