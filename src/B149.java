import java.util.Scanner;

public class B149 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
     
     int A = escreva.nextInt() , N = escreva.nextInt() , soma = 0;
           
     while (N <=0){ N = escreva.nextInt();}
     for(int i = 0 ; i <= N-1 ; i ++){
             soma += A + i;    
     }

System.out.println(soma);
     
}
}
