package bancodiosesgriegos;

public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

  public int getBalance(){
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public void setBalanceSumX3(int A){
    System.out.println("Saldo: "+ this.balance + "; Consigna: " + A);
    this.balance = balance+A;
    System.out.println("Final: "+ this.balance);
  }
  
  public void setBalanceResX3(int A){
    System.out.println("Saldo: "+ this.balance + "; Retira: " + A);
    this.balance = balance-A;
    System.out.println("Final: "+ this.balance);
  }  
  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
}