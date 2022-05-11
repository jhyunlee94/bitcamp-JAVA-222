package _0511;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = new int[10];
		
	      for (int i = 0; i<num1.length; i++) {
	       
	             num1[i] = (i * 3)+3;
	          
	          System.out.print(num1[i] + "\t");
	          
	      }
	      System.out.println();
	      for (int j=num1.length - 1; j>=0; j--){
	    	  System.out.print(num1[j]+"\t");
	      }
	}
}




