package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class MilkAndWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();

		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int arr2[] = new int[n];
		for (int j = 0; j < n; j++) {
			arr2[j] = sc.nextInt();
		}
		intersection(arr1,arr2,m,n);

	}

	private static void intersection(int[] arr1, int[] arr2, int m, int n) {
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j]+" ");
				}
			}
		}
	}

	}


