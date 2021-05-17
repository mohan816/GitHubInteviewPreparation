package week1.day2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Tamil = new int[5];
		
		Scanner s = new Scanner(System.in);
		int total =0;
		int average;
		for (int i=0;i<Tamil.length;i++)
		{
			if(i==0)
			{
				System.out.println("Enter sub 1");
				int b = s.nextInt();
				total = total+b;
				continue;
			}
			else if(i==1) {
								
				System.out.println("Enter sub 2");
			     int c = s.nextInt();
			    total=total+c;
			    continue;
			}
			else if(i==2)
					{
						System.out.println("Enter sub 3");
						int d = s.nextInt();
						total=total+d;
						continue;
					}
			      else if(i==3)
			      {
						System.out.println("Enter sub 4");
					     int e = s.nextInt();	
					     total=total+e;
					     continue;
			      }
			      else if(i==4)
			      {
			    	  System.out.println("Enter sub 5");
			    	  int f = s.nextInt();
			    	  total=total+f;
			      }
			      else if(i==5) {
			    	  System.out.println("Enter sub 6");
			    	  int g = s.nextInt();
					     
	}
			average =total/5;
			System.out.println("Total Mark scored by mohan in 5 subject is : " +total);
			System.out.println("Average mark is " + average);
		
			
	}
		
		
	}
}


