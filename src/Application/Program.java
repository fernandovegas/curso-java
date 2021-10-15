package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;
		
		 System.out.print("Enter account number ");
		 int ac = sc.nextInt();

	 	 System.out.print("Enter account holder ");
	 	 sc.nextLine();
		 String ah = sc.nextLine();
		 
		 System.out.print("Is there an initial deposit? (y/n)? ");
		 char response = sc.next().charAt(0);
		 
		 if (response == 'y') {
			 
			 System.out.print("Enter an initial deposit value: ");
			 double idv = sc.nextDouble();
			 account = new Account(ac,idv,ah);
			
		 }
		 else {
			 account = new Account(ac,ah);
		 }
		 
		 System.out.println();
		 System.out.println("Account Data: ");
		 System.out.println(account.toString());
		 
		 System.out.print("Enter a Deposit Value: ");
		 double deposit = sc.nextDouble();
		 account.deposit(deposit);
		 System.out.print("Updated account data: ");
		 System.out.println();
		 System.out.println(account.toString());
		 
		 System.out.print("Enter a withdraw value: ");
		 double withdraw = sc.nextDouble();
		 account.withdraw(withdraw);
		 System.out.println();
		 System.out.println(account.toString());
		
		 sc.close();
	}

}
