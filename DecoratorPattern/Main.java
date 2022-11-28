package DecoratorPattern;

public class Main {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription());

    Beverage beverageTwo = new HouseBlend();
    beverageTwo = new Mocha(beverageTwo);
    beverageTwo = new Mocha(beverageTwo);

    System.out.println(beverageTwo.getDescription() + " $" + beverageTwo.cost());
  }
}
