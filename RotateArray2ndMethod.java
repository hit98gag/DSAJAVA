package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;

public class RotateArray2ndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n= input.nextInt();
		int a[] = new int[n];
		
		int j =a.length-1;
		int temp;
		for(int i=0;i<a.length;i++) {
			a[i]=input.nextInt();

		}
		for(int i=0;i<a.length;i++) {
			
			temp =a[j]; // 5
			a[j]=a[i]; // 1
			a[i]=temp; // 5 

		}
		for(int i=0;i<=a.length;i++) {
			
			System.out.println(a[i]);
		}


	}

}
