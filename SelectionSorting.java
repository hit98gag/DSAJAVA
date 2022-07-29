package DSA_JAVA_FROM_6TH_JULY;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {

		int a[] = {12, 17, 10, 13, 16 }; 
		
		for(int i =0;i<a.length;i++) {
			
			int minidx=i;
			for(int j = i+1;j<a.length;j++) {
				
				if(a[j]<a[minidx]) {
					minidx=j;
				}
				
				int temp=a[i];
				a[i]=a[minidx];
				a[minidx]=temp;
			}
		}
		System.out.println(Arrays.toString(a));

	}
	}


