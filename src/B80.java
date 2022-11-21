import java.util.Scanner;
public class B80 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
       int position = 0;
        int maior = -999999;

        for (int count = 1; count <=100; count ++){
        int N = escreva.nextInt();
         if (N > maior){
            maior = N;
           position = count;

         } 
          

        }


        System.out.println(maior);
        System.out.println(position);
    }

}
