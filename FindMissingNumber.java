package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,5,6,7,8};
		int n = a.length+1;

		
		int totalsum = n*(n+1)/2;
		int sum =0;
		
		System.out.println(totalsum);
		
      for(int i=0;i<a.length-1;i++) {
    	  
    	  sum = sum +a[i]; 
    	  
    	 }
        
      
        
        System.out.println(totalsum - sum);
      
      
	}

}
