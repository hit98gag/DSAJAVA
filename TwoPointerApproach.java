package DSA_JAVA_FROM_6TH_JULY;
public class TwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,7,8,9};
		
		int i=0;
        int j = a.length-1;
        
        for(i=0;i<a.length;i++) {
        while(i<j)
        {
         int temp = a[i];
         a[i]=a[a.length];
         a[a.length]= temp;
             i++;
        	j--;
        }	
        }
        
        for(int k=0;k<a.length;k++) {
        	System.out.println(k);}
	}

}
