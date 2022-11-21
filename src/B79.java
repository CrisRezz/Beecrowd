import java.util.Scanner;
public class B79 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner (System.in);
      int N = escreva.nextInt();  
 
      for (int qtd = 1 ; qtd <=N ; qtd ++){
     Double nota1 = escreva.nextDouble();
     Double nota2 = escreva.nextDouble();
     Double nota3 = escreva.nextDouble();

     Double media = (nota1 * 2) + (nota2*3) + (nota3*5);

     System.out.printf("%.1f%n", media/10);


      }



 
    }
}

