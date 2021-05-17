package basic_programs;

import java.util.Scanner;

public class FibonacciSeries {
	static int firstNumber=0;
	static int SecondNumber=1;
	static int nextNumber;

	public static void main(String[] args) {
		int firstNumber=0;
		int SecondNumber=1;
		int nextNumber;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int input =s.nextInt();
	
	for(int i=1;i<=input;i++)
	{
		System.out.println(firstNumber+", ");
		nextNumber=firstNumber+SecondNumber;
		firstNumber=SecondNumber;
		SecondNumber=nextNumber;
	}

	}

}
