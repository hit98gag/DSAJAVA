package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;

public class START {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] a=new int[n];
	        int[] b=new int[n];

	        for(int i=0;i<a.length;i++){
	            a[i]=sc.nextInt();
	        }
		for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
            	
            	if(a[i]%2!=0 && a[j]%2==0){
                
            		int temp=a[i];
                    
            		a[i]=a[j];
                    
            		a[j]=temp;
            	}
            	System.out.println(i+ " " +j);

	}

}
		 for(int k=0;k<a.length;k++){
		        System.out.println(a[k]+" ");
		        }
	        }
	}
	
	       
