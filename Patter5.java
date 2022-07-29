package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class Patter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	
		for (int i=0;i<n;i++) { // 0 , 1
			
		for (int j=n;j>=i;j--)// 0 <=0 -> * ;  0<=1-> 1<=1 -> ** ; 
			
		{
			System.out.print("*" +" ");
		}
		
            System.out.println();
            
		}
		
	}

}
