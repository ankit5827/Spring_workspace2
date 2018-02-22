package beans;

public class Account {
	public int accountno;
	Double intrestamt;
	
	public Account() {
		System.out.println("default constructor");
		
	}

	public Account(int accountno) {
		this.accountno = accountno;
	}

	public double intrest (int amount)
	{
		int amt=amount;
		if(amt<1001 && amt<=5000)
		{
			 intrestamt=(amt*2.5*1)/100;
			
		}
		
		if(amt<5001 && amt<=10000)
		{
			intrestamt=(double) ((amt*5*1)/100);
			
		}

         if(amt<10000)
		{
		 intrestamt=(double) ((amt*8*1)/100);
			
		}
         return intrestamt;
		
	}

	/*public int intrestType(double intrest)
	{
		
	}*/
}
