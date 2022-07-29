package DSA_JAVA_FROM_6TH_JULY;
import java.util.*;
public class xyz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        
        int a[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            } 
        }
   sc.close();
        for(int i=0;i<c1;i++)
        {
             if(i%2==0 || i==0){
            for(int j=0;j<r1;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
            }
             else
            {
                for(int j=r1-1;j>=0;j--)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
             }
            
            }
	}
}