package DSA_JAVA_FROM_6TH_JULY;

import java.util.Arrays;

public class RotateArrayMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
		int a[] = {1,2,3,4,5};
		
		int temp= a[0];

		for(int i=0;i<a.length-1;i++) {
			
		 a[i] = a[i+1];
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}

}
