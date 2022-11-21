package bee;



import java.util.Scanner;

public class Bee1173 {
	
public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);

	int [] N = new int [10];

	    N[0] = tc.nextInt();
	    
	    
	 for (int i = 1; i < N.length; i++) {
		  N[i] = N[i -1]* 2;
		  
		 
	 }
	 
	 for (int i = 0; i < N.length ; i ++) {
		 System.out.println("X[" + i +"] = " + N[i]);
	 }
	 tc.close();
	}

}
