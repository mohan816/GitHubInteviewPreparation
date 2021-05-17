package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int a =14;
		int count = 0;

		for(int i=1;i<=a;i++) {
			if (a%i==0) {
				count = count+i;

			} 

		}
		if(count==2) {
			System.out.println("Prime Number is" +a);
		}
		else {
			System.out.println("Not a Prime Number");
		}



	}

}
