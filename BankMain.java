import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount bank = new BankAccount( 0, 0);
        
        int deposit;
        int withdraw;
        int input;

        System.out.println("----------------------------------------------- ");
        System.out.println("Welcome to the maze Bank. ");
    
     do {
  
        System.out.println("Select what do you want to do. ");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw ");
        System.out.println("9. Exit ");
        System.out.println("---------------------------- ");
        System.out.print(" Input: ");
         input = sc.nextInt();

         switch (input) {
            case 1:
                bank.displayBalanceDetails();
                System.out.println("---------------------------- ");
                break;
            
            case 2:
                System.out.println("Please enter amount to deposit : ");
                bank.setDeposit(sc.nextInt());    
                sc.nextLine();          
                bank.displayDepositDetails();

                //bank.calculateDeposit(bank.getDeposit());
               
                System.out.println("---------------------------- ");
                break;

            case 3:
                System.out.println("Please enter amount to withdraw  : ");
                bank.setWithdraw(sc.nextInt());
                sc.nextLine();   
                bank.displayWithdrawDetails();

                // bank.calculateWithdrawal(bank.getWithdraw());
                
                System.out.println("---------------------------- ");
                break;

            default:
                System.out.println("Invalid command.");
                break;
        
             }
           
   
     } while (input != 9) ;
           
        System.out.println("Thank you for using maze Bank.");
        System.out.println("---------------------------- ");
        sc.close();
        
    }
}
