import java.lang.Math;
import java.util.Scanner;
public class B73 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
   int N = escreva.nextInt();

for (Double contagem = 2.0 ; contagem <=N ; contagem = contagem +=2){

System.out.printf("%.0f^2 = %.0f%n", contagem , Math.pow(contagem,2));


}

    }
}
