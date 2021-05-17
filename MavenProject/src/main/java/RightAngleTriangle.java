
public class RightAngleTriangle {

	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++)
		{
		for(int j=row-1;j>=i;j--) {
			System.out.println(" ");
		}
		for(int z=1;z<=i;z++)
		{
			System.out.print("  *");
		}
		

	}
		System.out.println();

}
}
