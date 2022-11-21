import java.util.Scanner;

public class B1117 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);


int qtd=0;  double soma = 0.0;

while(qtd < 2){

double notas = escreva.nextDouble();

     if(notas >= 0 && notas <=10){
            qtd ++;
            soma +=notas;
     }else
            System.out.println("nota invalida");

}

System.out.printf("media = %.2f%n", soma/2.0 );


    }
}
