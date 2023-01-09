package CommandPattern;

public class Light {
  Boolean isOn;

  public Light() {};

  public void on() {
    isOn = true;
    System.out.println("The light is turned on.");
  }
}
