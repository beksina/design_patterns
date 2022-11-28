package headFirst;

public class Main {
  public static void main(String[] args) {
    Duck duckie = new Duck();

    duckie.setFlyBehavior(new FlyWithWIngs());

    duckie.fly();
  }
}
