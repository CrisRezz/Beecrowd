import java.util.Scanner;

public class B1113 {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);
    
    int X,Y = 0;

    while(true) {
    
    X=escreva.nextInt();
    Y=escreva.nextInt();
      if (X == Y) break;

      else if (X<Y)
      System.out.println("Crescente");

      else
      System.out.println("Decrescente");


    
    }
escreva.close();

}
}

