package TemplatePattern;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    // can still override the methods that r already set up in the abstract class
    // @Override
    // void boilWater() {
    //     System.out.println("yerrrrr");
    // }
}
