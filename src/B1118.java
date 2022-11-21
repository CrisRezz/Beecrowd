import java.util.Scanner;

public class B1118 {
    public static void main(String[] args) {


Scanner escreva = new Scanner(System.in);

double nota1, nota2, SorN = 1;
while(SorN == 1) {
    
    nota1 = escreva.nextDouble();
    
    while (nota1 > 10 || nota1 < 0) {
        System.out.println("nota invalida");
        nota1 = escreva.nextDouble();
    }
    
    nota2 = escreva.nextDouble();
    while (nota2 > 10 || nota2 < 0) {
        System.out.println("nota invalida");
        nota2 = escreva.nextDouble();
    }
    
    double media = (nota1 + nota2) / 2;
    System.out.println(String.format("media = %.2f", media));
    
    System.out.println("novo calculo (1-sim 2-nao)");
        SorN = escreva.nextInt();
    while (SorN != 1 &&  SorN != 2) {
        System.out.println("novo calculo (1-sim 2-nao)");
            SorN = escreva.nextInt();
    }
}
}

}
        













