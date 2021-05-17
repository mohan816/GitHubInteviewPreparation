package week3.day2;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicates {

	public static void main(String[] args) {
		//Declare a String
		String s1 ="PayPal India";
		char[] charArray=s1.toCharArray();
		int length =charArray.length;
		//List<Character> charSet=new ArrayList<Character>();
		
		Set<Character> charSet=new LinkedHashSet<Character>();
		//Set<Character> dupCharSet=new HashSet<Character>();
		for(int i=0;i<=length-1;i++)
		{
		 charSet.add(charArray[i]);
		 //dupCharSet.add(charArray[i]);

	}
for (Character eachvalue : charSet) {
	if(eachvalue!=' ')
		System.out.print(eachvalue);
}
	
}
}
