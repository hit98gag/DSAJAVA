package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class MaximumPRoductsofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	     int n = input.nextInt();
	     int a[] = new int[n];
	        
	        for(int i=0;i<a.length;i++){
	            a[i]=input.nextInt();
	        }
	        
	        int i = 0;
	        int j =a.length-1;
	        int num1=0, num2=0;
	        
	        while(i<j){
	            for(i=0;i<a.length-1;i++){
	            if(a[i]>a[i+1]){
	              a[i]=a[i+1];
	              num1= a[i]-1;
	                i++;

	            }                                                                                

	            }
	          for(j=a.length-1;j>=0;j--){

	            if(a[j]<a[j-1])
	            {
	                a[j]=a[j-1];
	               num2= a[j]-1;
	              j--;
	}

}
	          }
	        }
	}
	        
