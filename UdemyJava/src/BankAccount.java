import java.util.function.DoubleUnaryOperator;
public class BankAccount {

  private String number;
  private double balance;
  private String customerName;
  private String customerEmail;
  private String customerPhoneNumber;

  public BankAccount() {
    // can set up default if object is initialized w/o any params, it basically uses the other initializer w these defaults
    this("0000", 0.00, "Default Name", "Default Email", "Default Phone Number");
    System.out.println("Empty constructor called!");
  }

  public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
    System.out.println("Nonempty constructor was called!");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public void deposit(double depositAmount) {
    this.balance += depositAmount;
  }

  public void withdrawl(double withdrawlAmount) {
    if (withdrawlAmount > balance) {
      System.out.println("Insufficient funds to withdraw");
    } else {
      this.balance -= withdrawlAmount;
    }
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getNumber() {
    return number;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String customerName) {
    this.customerName = customerName;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }


  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }

}
