package Com.BankDemo;
import java.util.Scanner;




public class Demo {
	
	public static void main(String[] args) {
		Acount c=new Acount("umesh patil ",744746);
		c.menu();
	}
	}

	class Acount 
	{
		char option='\0';
		String name;
		int Acnumber;
		int Balence;
		public Acount(String name,int  Acnumber)
		{
			this.name=name;
			this.Acnumber=Acnumber;
		}
		public void  Deposite(int Amount)
		{
			if(Amount!=0)
			Balence=Balence+Amount;
		}
		public void Withdraw(int Amount)
		{     if(Amount!=0)
			Balence=Balence-Amount;
		}
		public void menu()
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome     "+name);
			System.out.println("Your Acount number is   "+Acnumber);
			System.out.println('\n');
			System.out.println("A ,check balence");
			System.out.println("B ,Deposite");
			System.out.println("C, withdraw");
			System.out.println("D,Exit");
			  
			do
			{
				System.out.println("********************************************");
				System.out.println("enter an option");
				System.out.println("*********************************************");
				 option =sc.next().charAt(0);
				 
				switch(option)
				{
				case 'A':
					System.out.println("---------------------------------");
					System.out.println("Balence=  "+Balence);
					System.out.println("----------------------------------");
					break;
				case 'B':
					System.out.println("---------------------------------");
					System.out.println("enter an amount to deposite");
					int amount=sc.nextInt();
					Deposite(amount);
					System.out.println("-------------------------------------");
					System.out.println('\n');
					break;
				case 'C':
					System.out.println("Enter amount to withdraw");
					int amount2=sc.nextInt();
					Withdraw(amount2);
					break;
					
				case 'D':
					System.out.println("-------------------------------------");
					break;
				
				default :
					System.out.println("invalid option plz enter valid option");
					break;
					
			
					
				}
			}
				while(option!='E');
				System.out.println("thank you for using our service");
					
				
			
			
			
		}
	}



