public class SavingsAccount{

  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public SavingsAccount(String owner, int balanceDollar){
  this.owner = owner;
  this.balanceDollar = balanceDollar;
  balanceEuro = balanceDollar * 0.85;
  }

  public void addMoney(int balanceDollar){
 
    System.out.println("Adding " + balanceDollar + " dollars to the account.");
    this.balanceDollar += balanceDollar;
    System.out.println("The new balance is " + this.balanceDollar + " dollars.");

  }

  public static void main(String[] args){
    SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

    // Make a call to addMoney() to test your method
    zeusSavingsAccount.addMoney(2000);

  }

}
