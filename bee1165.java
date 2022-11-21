package bee;

import java.util.Scanner;

public class bee1165 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
int i, cont =0, N = tc.nextInt();
	int X = 0;	
	 int aux = 0;
	
	while(N > cont) {
	 X = tc.nextInt();
      
	for(i = 2; i < X ; i ++) {
		 if (X%i ==0) {
			 aux++;
		 }else {
		 }
		
		}
		cont++;	
		
		if(aux == 0 ) {	
		System.out.println(X + " eh primo");
		
		}else { System.out.println(X+ " nao eh primo");
		aux =0;
	}
		
			
			
		}
		
		

	}

}
