
public class Assignment {

	public static void main(String[] args)
	{
		
		System.out.println("print values");
		Assignment a=new Assignment();
		a.getPrice();
		a.getModel();
		
		
	}

		public int getPrice() {
			
			
			
		int mobileprize =49000 ;
		if(mobileprize <50000) {
			System.out.println("My Mobile Prize is" +" "+mobileprize);
		}
		else
		{
			System.out.println("Exceeds the amount");
		}
			
		return 0;
			
			
		}
		private void getModel() {
			System.out.println("Model Name MI");
			
		}

		
		}

