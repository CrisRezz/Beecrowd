import java.util.Scanner;

public class B153 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

        int N = escreva.nextInt() , fatorial = 1;

        for(int i = 1 ; i <=N ; i --){
       fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
