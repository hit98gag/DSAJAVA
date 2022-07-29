package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class SwapFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,5,5,7,8,8,9};

		int temp=0;
		if(a.length>2) {
			
		temp = a[0];
		a[0]=a[a.length-1];
		a[a.length-1] = temp;
		
		}
		System.out.println(Arrays.toString(a));
	}

}
