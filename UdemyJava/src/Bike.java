interface Bicycle {
  void ride();
}


public class Bike implements Bicycle {
  private String type;
  private int wheels;

  public void ride() {
    System.out.println("Riding bike!");
  }

}
