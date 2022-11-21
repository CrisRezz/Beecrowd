import java.util.Scanner;

public class B99 {
    public static void main(String[] args) {
Scanner escreva = new Scanner(System.in);

int N = escreva.nextInt();

for(int i = 0; i <N; i++){

    int x = escreva.nextInt();
    int y = escreva.nextInt();
   
    int soma = 0;

    if (x > y) {
        for (int j = x-1; j > y; j--) {
            if (j % 2 != 0) soma += j;
        }

    } else if (x < y) {
        for (int j = x+1; j < y; j++) {
            if (j % 2 != 0) soma += j;
        }
    }
    System.out.println(soma);






}


    }
}
