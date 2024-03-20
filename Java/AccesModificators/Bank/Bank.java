package bancodiosesgriegos;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    bankOfGods.accountTwo.setBalanceSumX3(200);
    bankOfGods.accountTwo.setBalanceSumX3(500);
    bankOfGods.accountTwo.setBalanceSumX3(900);
    bankOfGods.accountTwo.setBalanceResX3(500);
    bankOfGods.accountTwo.setBalanceResX3(600);
    bankOfGods.accountTwo.setBalanceResX3(100);
  }
}