package selenium_basics;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] data= {14,12,13,11,15,14,18,16,17,14,19,18,17,20};
		
		
		for(int i=0;i<=data.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=data.length-1;j++)
			{
				if(data[i]==data[j])
				{
					count++;
					data[j]=0;
					
					
				}
			}
			if(count>2&&data[i]!=0)
				System.out.println("Duplicate values :" +data[i]);
		}
		
			
		

	}

}
