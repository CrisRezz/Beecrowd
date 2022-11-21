import java.util.Scanner;

public class B150 {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);

int X = escreva.nextInt() , Z = escreva.nextInt(), cont = 0 , soma = 0;

while (Z <=X){ Z = escreva.nextInt();}

while (soma < Z){ soma +=X; cont ++; X++;}

System.out.println(cont);






    }
}
