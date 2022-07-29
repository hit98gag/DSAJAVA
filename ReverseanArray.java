package DSA_JAVA_FROM_6TH_JULY;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[] = {1,4,2,3,6};
		 int b[] = new int[a.length];
		 int j =0;
		 
		 for(int i=a.length-1;i>=0;i--) {
			 
        b[j] = a[i];
        j++;
        
        		
		 }
		 a=b;
		 
     System.out.println(Arrays.toString(a));
	}

}
