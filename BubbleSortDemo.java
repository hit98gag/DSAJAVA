package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a [] = {4,3,2,1};  
		
		for(int i=0;i<a.length-1;i++) {
			System.out.println("------------------");
			
			
		    System.out.println("Pass -> "+(i+1));
			 
		    for(int j=0;j<a.length-1-i;j++) {
			
		    	if(a[j]>a[j+1]) {
				
		    		//swap
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
				
				System.out.println(Arrays.toString(a));

	}
	
 }
 }
}
