import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.BYTE_ARRAY;

// public keyword is an access modifier (allows you to define the scope or how others can access your code)

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");

        int firstNumber = 5 * 5 + 10;
        int secondNumber = 20;

        System.out.println(firstNumber + secondNumber);

        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;

        System.out.println("Max value in Java: " + maxVal);

        int otherNumber = 1_032_423;

        System.out.println(otherNumber);

        byte firstByte = Byte.MAX_VALUE;
        byte secondByte = Byte.MIN_VALUE;

        System.out.println("Min byte is " + firstByte);

        // challenge

        // now i set up the constructor so i don't have to initialize an empty instance
        BankAccount myAccount = new BankAccount("123", 300.0, "bek", "bek@gmail.com", "913-432-3213");

        System.out.println(myAccount.getBalance());

        BankAccount erikAccount = new BankAccount();
        System.out.println(erikAccount.getNumber());
        // myAccount.setName("bek");
        // myAccount.setCustomerEmail("bek@gmail.com");
        // myAccount.setNumber("1110");
        // myAccount.setCustomerPhoneNumber("917-883-0323");
        // myAccount.deposit(50.00);

        // System.out.println(myAccount.getBalance());

        // myAccount.withdrawl(100);

        VipCustomer me = new VipCustomer("beki", 5000.00);
        System.out.println(me.getCreditLimit());

        Dog lola = new Dog("Lola", 2, 18, 2, 4, 1, 32, "white furr");

        lola.eat();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        System.out.println(nums.size());
        nums.remove(0);
        System.out.println(nums);

        // Arrays.asList -> initializing values in an ArrList
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Bob", "Jake", "Rik"));

        String[] friendArray = {"John", "Ass", "Mommy"};

        System.out.println("Enter Username: ");
        // String username = scanner.nextLine();

        // System.out.println("Username is: " + username);
        System.out.println(friendsArrayList.get(2));

        System.out.println(friendsArrayList);

    }
}

// 8 primitive data types:
// boolean, byte, char, long (largest range and 64 bits), short (shorter range of nums and 16 bits), int (bigger range and 32 bits), float, double
