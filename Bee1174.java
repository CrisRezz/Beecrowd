package bee;

import java.util.Scanner;

public class Bee1174 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		float [] A = new float [100];
 
		 for (int i = 0; i < A.length; i++) {
			 A[i] = tc.nextFloat();
			 
		 }
		 for(int i = 0; i < A.length; i++) {
			   if (A[i]<= 10 )
				   System.out.printf("A[%.0f] = %.1f%n" , (float)i , A[i]);
		 }
		 		 
		 tc.close();
		}

	}


