package DSA_JAVA_FROM_6TH_JULY;

import java.util.Arrays;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 3,4,2,1};
		
		for(int i = 0; i<a.length;i++) {
			
			for(int j=0;j<a.length-i-1;j++)
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
				}
		}
		System.out.println(Arrays.toString(a));

	}

}
