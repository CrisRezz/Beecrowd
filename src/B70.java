import java.util.Scanner;
public class B70 {
    
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
      int X = escreva.nextInt();

      for( int Y = 1 ; Y <12 ; Y = Y+2 ){
         if (X%2 == 0 ){
         System.out.println(X+Y);
         }else if (X%2 != 0){
         System.out.println((X+Y) - 1);

         }else{
            
         }
    }
      }

       

    }