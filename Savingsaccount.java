public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance(){

    System.out.println("Hello!");
    System.out.println("Your balance is "+ balance);
  }

  public void deposit(int amountToDeposit){
    int afterDeposit = balance + amountToDeposit;
    balance = afterDeposit;
    System.out.println("You just deposited "+ amountToDeposit);
  }
  
  public int withdraw(int amountToWithdraw){
    int afterWithdraw = balance - amountToWithdraw;
    balance = afterWithdraw;
    System.out.println("You just withdrew "+ amountToWithdraw);
    return amountToWithdraw;
  }
  public String toString(){
    return "The updated balance is " + balance + "!";
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    System.out.println(savings);
    
    // Check Balance function
    savings.checkBalance();
    // Deposit 2000
    savings.deposit(2000);

  }       
}
