package beans;
import beans.Account;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		int n;
		Double totalintrest=0.0;
		Double avgintrest=0.0;
		Double intrestamount [] =new Double[10];
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for N");
	    n=sc.nextInt();
	    Account ac=new Account();
		
	    for(int i=0;i<=n;i++)
		{
			System.out.println("enter amount for account number"+i+":");
			int amount=sc.nextInt();
			intrestamount [i]=ac.intrest(amount);
			System.out.println("the intrest for account number"+i+"is"+intrestamount[i]);
			
			
		}
	    System.out.println("intrest details");
	    for(int i=0; i<n; i++)
	    {
	    	totalintrest=totalintrest + intrestamount[i];	
	    }
		System.out.println("total Intrest="+totalintrest);
		
		Arrays.sort(intrestamount);
		System.out.println("Minimum = " + intrestamount[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);
		/*Double min = Collections.min(Arrays.asList(intrestamount));
		System.out.println("Lowest Intrest="+min);
		
		
		Double max = Collections.max(Arrays.asList(intrestamount));
		*/
		    	avgintrest=totalintrest/n;	
		    	System.out.println("Average intrest="+avgintrest);
		   
		
		
	}

}
