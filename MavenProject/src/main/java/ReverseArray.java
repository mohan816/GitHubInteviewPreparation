import java.util.Arrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ReverseArray {

	public static void main(String[] args) {
		double[] x= {10l,20l,50l};
		//int[] x= {12,13,15,17,19,20,21,00,05};
		Arrays.sort(x);
		//System.out.println(x.length-1);
		
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
		
		

	}

}
