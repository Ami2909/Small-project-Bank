package banking_Application;


import java.util.Scanner;

public class BankAccountApplication {
		
	public static void main(String[] args) {
				BankAccount acc = new BankAccount("xyz", "BA0001");
					acc.showmenu();
	}
							
}

class BankAccount{
	int balance;
	int previousTransiction;
	String customerName;
	String customerID;
	
	BankAccount(String cname, String cid){
		customerName = cname;
		customerID = cid;
		
	}
	
	
	void deposit(int amount)
	{
		if(amount !=0)
		{
			balance = balance + amount;
			previousTransiction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransiction = -amount;
		}
	}
	
	void gettransiction()
	{
		if(previousTransiction > 0)
		{
			System.out.println("money has been Creadet/Deposited in account'9146131677' :  " +previousTransiction);			
		}
		else if(previousTransiction < 0)
		{
			System.out.println("money has been debited in account'9146131677' :  " +Math.abs(previousTransiction));
		}
		else 
		{
			System.out.println("No transiction occured");
		}
	}
	
	void showmenu()
	{
		char option='\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("your ID is "+customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance ");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. PreviousTransiction");
		System.out.println("E. Exit");

		do
		{
			System.out.println("========================================================================");
			System.out.println("Enter an Option");
			System.out.println("------------------------------------------------------------------------");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("---------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("---------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("---------------------------------------------------");
				System.out.println("Enter an ammount to Deposit: ");
				System.out.println("---------------------------------------------------");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("---------------------------------------------------");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("---------------------------------------------------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("---------------------------------------------------");
				gettransiction();
				System.out.println("---------------------------------------------------");
				System.out.println("\n");
				break;
		
			case 'E':
				System.out.println("*********************************************************************");
				break;
				
				default:
					System.out.println("Invalid option!! Please enter again");
					break;
			}
			
		}while(option != 'E');
			System.out.println("Thankyou for using our services");
				
	}
}