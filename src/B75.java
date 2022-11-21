import java.util.Scanner;
public class B75 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

int N = escreva.nextInt();

for (int soma = 1 ; soma < 10000 ; soma ++){
    if (soma % N == 2)
    System.out.println(soma);


}


    }
}
