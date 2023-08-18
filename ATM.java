import java.util.*;
class  ATM
{
	float Balance;
	int  Pin=2580;
	
    // non- satic method for checkpin

	public void CheckPin() 
	{
      System.out.println("Enter your pin: ");
	  Scanner sc=new Scanner(System.in);
	  int enterpin=sc.nextInt();

	  if (enterpin==Pin)
	  {
		  menu();
	  }
	  else
	   {
		System.out.println("Enter valid pin: ");	
	   }
	}

	public void menu() 
	{

		System.out.println("select option");
		System.out.println("1.Check A/C Balance: ");
		System.out.println("2.Withdraw Money: ");
		System.out.println("3.Deposite Money: ");
		System.out.println("4.Exit");

		 Scanner sc=new Scanner(System.in);
	     int opt=sc.nextInt();

		 if (opt==1)
		 {
			 CheckBalance();
		 }

		 else if (opt==2)
		 {
			 WithdrawMoney();
		 }

		  else if (opt==3)
		 {
			 DepositeMoney();
		 }

		  else if (opt==4)
		 {
			 Exit();
		 }
		 else
		{
			System.out.println("enter valid choice");
		}
	}

    public void CheckBalance() 
	{
       System.out.println("Balance:"+Balance);
	   menu();
	}

	 public void WithdrawMoney() 
	{
       System.out.println("enter amount");
	   Scanner sc=new Scanner(System.in);
	   float amount=sc.nextFloat();

	   if (amount>Balance)
	   {
		   System.out.println("insufficient amount");
	   }
	   else
		{
			Balance=Balance-amount;
            System.out.println("amount withdraw sucussfully");
		}
		menu();
	}
	 public void DepositeMoney() 
	{
		
		System.out.println("enter amount");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();

		Balance=Balance+amount;
        System.out.println("money deposited");
		menu();
	}
	public void Exit()
	{
		System.out.println("Thank you for visiting ATM.. visist again");
	}
}

