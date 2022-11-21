import java.util.Scanner;

public class B1154{


public static void main(String[] args) {

    Scanner tc = new Scanner(System.in);
     int idades = 0, media = 0;
      float divisor =0;
    do {
      idades = tc.nextInt(); 
      divisor ++;
      if (idades > 0)
      media+=idades;
     else;
    } while (idades >= 0);

    System.out.printf("%.2f\n", media/(divisor-1));
}
}