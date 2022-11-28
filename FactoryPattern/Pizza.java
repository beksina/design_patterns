package FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList();

  void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");

    for (int i = 0; i < toppings.size(); i++) {
      System.out.println(toppings.get(i));
    }
  }

  void bake() {
    System.out.println("Baking for 20 min");
  }

  void cut() {
    System.out.println("Cutting the pizza into 8 slices");
  }

  void box() {
    System.out.println("Putting the pizza in the box :)");
  }
}
