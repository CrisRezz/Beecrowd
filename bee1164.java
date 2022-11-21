package bee;

import java.util.Scanner;

public class bee1164 {
public static void main(String[] args) {
Scanner tc = new Scanner(System.in);

int aux=0, X =0, N = tc.nextInt();
int cont =0;

while(N > cont) {
	
	X = tc.nextInt();
	aux =0;
	    for (int j = 1 ; j < X ; j ++) {
	    	 
		if (X%j== 0) {
			aux += j;	
		}else {
			
		}
		 
		}
	   
	    	 cont++;


if(aux == X) {
				System.out.println(X + " eh perfeito");
			}else { System.out.println(X + " nao eh perfeito");
		
			
		}
}

tc.close();
}
}



