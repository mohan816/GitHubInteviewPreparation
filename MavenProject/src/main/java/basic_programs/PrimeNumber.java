package basic_programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=25; 
		int flag=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				System.out.println("It is not a Prime Number");
				flag=1;
				break;
			}
			}
		if(flag==0) {
			System.out.println("It is a Prime Number");
		}
		}
	
		

	}

