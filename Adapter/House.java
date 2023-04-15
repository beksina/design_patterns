package Adapter;

import org.w3c.dom.DOMError;

public class House<T> {
    T doorNumber;

    public House(T doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void printNumber() {
        // System.out.println("The house door number is: " + this.doorNumber);
        System.out.println("house num is " + 5);
    }
}
