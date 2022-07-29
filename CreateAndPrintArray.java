package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class CreateAndPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter row : ");
		int rowsize = input.nextInt();
		
		System.out.println("enter coloum : " );
		int colsize = input.nextInt();
		
		int a[][] = new int[rowsize][colsize];
 
		 int count = 1;
		
		for(int i=0 ; i<rowsize;i++) {
			for(int j = 0;j<colsize;j++) {
			
				
				a[i][j] = count++;
				
		}
			
			
		}
		for(int i=0 ; i<rowsize;i++) {
			for(int j = 0;j<colsize;j++) {
				
				
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
			}
		
		

	}

}
