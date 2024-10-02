public class BankAccount {

    private int balance;
    private int deposit;
    private int withdraw;
    private int newBalance =0;

    public BankAccount( int deposit, int withdraw){
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    //getter 
    public int getBalance(){
        return balance; 
    }

    public int getDeposit (){
        return  deposit;
    }

    public int getWithdraw(){
        return  withdraw;
    }

    //setter 
    public void setBalance(int balance){
        this.balance = balance;
    }
        
    public void setDeposit(int amount){
        if (amount > 0) {
            deposit = amount;
            calculateDeposit();
        }else{
            System.err.println("Deposit must be greater than zero. ");
        }
      
    }

    public void setWithdraw(int amount){
        if (amount > 0 && amount <= balance)  {
            withdraw = amount;
            calculateWithdrawal();
        }else if(amount > balance){
            System.err.println("Insufficient balance. ");
        }else{
            System.out.println("Invalid amount. ");
        }
    }

    public void calculateDeposit(){
          balance += deposit;    
    }    

    public void calculateWithdrawal(){
      balance -= withdraw;
    }

    public void displayBalanceDetails(){
        System.err.println("Balance : " + balance);
    }

    public void displayDepositDetails(){
        System.out.println("Deposit " + deposit);
        displayBalanceDetails();
    }

    public void displayWithdrawDetails(){
        System.out.println("Withdraw " + withdraw);
        displayBalanceDetails();
    }

   
}
