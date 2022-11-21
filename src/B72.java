import java.util.Scanner;
public class B72 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

    int N = escreva.nextInt();
    int IN = 0;
    int OUT = 0;
{
for (int leitura = 0; leitura < N ; leitura++){

    int X = escreva.nextInt();
    
    if ( X >=10 && X <=20)
     IN += 1;
    else{
        OUT += 1;
    }
  

}

  System.out.printf("%d in%n", IN);
  System.out.printf("%d out%n", OUT);

  
  
    }
    }
}

