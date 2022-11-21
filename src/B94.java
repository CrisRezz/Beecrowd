
import java.util.Locale;

import java.util.Scanner;
public class B94 {
    public static void main(String[] args) {
     Scanner write = new Scanner(System.in);
     
     int times = write.nextInt();
     int bunnys = -0;
     int frogs = -0;
     int mouses = -0;
     int total = 0; 

   Locale.setDefault(Locale.US);


     for(int count = 0 ; count < times; count++){
     int quantity = write.nextInt();
     char animal = write.next(). charAt(0);
     
     if (animal == 'S'){
     frogs += quantity;
     total += quantity;

     }else if (animal == 'C'){
      bunnys+=quantity;
      total += quantity;
     }else if (animal == 'R'){
        mouses += quantity;
        total += quantity;
     }else{

     }
     }





System.out.println("Total: " + total + " cobaias"); 
System.out.println("Total de coelhos: "+ bunnys);
System.out.println("Total de ratos: "+mouses); 
System.out.println("Total de sapos: " + frogs); 


System.out.printf("Percentual de coelhos: %.2f %%%n", (((double)bunnys*100) / ((double)total)));
System.out.printf("Percentual de ratos: %.2f %%%n", (((double)mouses*100) / ((double)total)));
System.out.printf("Percentual de sapos: %.2f %%", (((double)frogs*100) / ((double)total)));
System.out.println();

} 

}