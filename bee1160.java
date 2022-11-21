package bee;

import java.util.Locale;
import java.util.Scanner;

public class bee1160 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		int T = tc.nextInt();
		  int PA, PB, anos;
	      double G1, G2;
	      
		for(int i = 0; i < T; i++) {
			anos = 0;
			PA= tc.nextInt();
			PB = tc.nextInt();
			G1 = tc.nextDouble();
			G2 = tc.nextDouble();
			while (PB >= PA) {
				PA += (PA * G1) / 100;
        		PB += (PB * G2) / 100;
        		anos++;
        		if (anos > 100) {
        			break;
        		}	
			}
			 if (anos > 100) { System.out.println("Mais de 1 seculo.");
				 
			 }else{ System.out.println(anos + " anos.");
			 
	    }	
		}
		tc.close();	
		}
        }

/*6
100 150 1.0 0
90000 120000 5.5 3.5
56700 72000 5.2 3.0
123 2000 3.0 2.0
100000 110000 1.5 0.5
62422 484317 3.1 1.0*/


