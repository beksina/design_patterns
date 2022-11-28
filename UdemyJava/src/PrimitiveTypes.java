public class PrimitiveTypes {
  public static void main(String[] args) throws Exception {

    byte myByte = 32;
    short myShort = 105;

    int myInt = 5000;
    // don't need casting here bc it fits fine for the long var
    long myLong = 50_000 + 10 * (long) (myByte + myShort + myInt);

    System.out.println(myLong);

    // float is 32 bits and double is 64 bits
    float myFloat = 5.25f;
    double myDouble = 5.25d;

    float result = (float) (myInt + myFloat + myDouble);

    double POUND_TO_KILO = 0.45359237d;
    double pounds = 190d;

    double myKilos = pounds * POUND_TO_KILO;

    System.out.println("My weight in kilos: " + myKilos);

    // chars
    char uniChar = '\u0040';
    char myChar = 'D';
    System.out.println("This char is: " + myChar);

    boolean myBool = true;

    String myString = "this is an actual string gang";

  }
}
