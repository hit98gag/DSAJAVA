package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class FindMissingNumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,3,2,5,1}; //4 is missing
		int n = 6;
		
		
		//1+2+3+4+5+6 => 21
		//6+3+2+5+1 => 17
		//21-17 -> 4
		
		
		//sum of 1 to N
		/*
		 * int sumOfAll = 0; for(int i =1;i<=n;i++) { sumOfAll = sumOfAll + i; }
		 */
		int sumOfAll = (n*(n+1))/2;
		
		
		//sum of all numbers in array
		int sumOfArray = 0;
		for(int i=0;i<a.length;i++) {
			sumOfArray = sumOfArray+a[i];
		}
		
		int diff = sumOfAll - sumOfArray;
		System.out.println(diff);
	}



	}


