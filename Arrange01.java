package DSA_JAVA_FROM_6TH_JULY;

import java.util.Arrays;

public class Arrange01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 0,1,0,0,1,1,1,0,1,0,0};
		
		int count=0;
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==0){
				count++;
				System.out.print("count:" + count +"--");

			}
			
		}
		for (int i=1;i<a.length;i++)
		{
			if(i<count) {
				a[i] =0;}
			else 
			{
				a[i]=1;
			}
			
			
			
		}
		System.out.println(Arrays.toString(a));
		
			

	}

}
