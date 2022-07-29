package DSA_JAVA_FROM_6TH_JULY;

public class CheckPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {1,4,6,8,6,4,1};
      int b[] = new int[a.length];
      boolean flag = true;
      int i =0;
      int j = a.length-1;
      
      while(i<j) {
      
    	  
    	  if(a[i] != b[j]) {
    		  flag = false;
    		  
    	      break;
    	  }
    	  i++;
	      j--;
      }  
      System.out.println(flag);
      }
	}


