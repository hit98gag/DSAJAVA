package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class Cont {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	    
		 int n = in.nextInt();
	     
		 int []a=new int[n];
	     
		 for(int i=0;i<n;i++)
		 {
			 a[i]=in.nextInt();
		}
	     
		 int product=0;
	     
		 int ans=0;
	     
		 for(int i=0;i<n-2;i++){
	     
			 for(int j=i+1;j<n-1;j++){
	         
				 for(int k=j+1;k<n;k++){
	             
					 product = a[i]*a[j]*a[k];
	                 
					 if(product>=ans){ans = product;}
	                }
				 
	            }
			 
	        }
		 System.out.println(ans);

		 
	}

}
