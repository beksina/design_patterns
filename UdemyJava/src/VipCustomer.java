public class VipCustomer {

  private String customerName;
  private double creditLimit;
  private String email;

  public VipCustomer() {
    this("Default Name", 10000, "Default Email");
  }

  public VipCustomer(String customerName, double creditLimit) {
    this(customerName, creditLimit, "Default Email");
  }

  public VipCustomer(String customerName, double creditLimit, String email) {
    this.customerName = customerName;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getCustomerName() {
    return customerName;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }

}
