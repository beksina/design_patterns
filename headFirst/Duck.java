package headFirst;

public class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck(){};

  public void swim() {
    System.out.println("weeeeeee im swimming");
  }

  public void fly() {
    flyBehavior.fly();
  }

  public void quack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
