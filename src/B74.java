import java.util.Scanner;
public class B74 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

 int N = escreva.nextInt();

for (int cont = 0; cont < N ; cont++){

int X ;
  X = escreva.nextInt();
 
  if (X == 0)
     System.out.println("NULL");

 
 if (X % 2 == 0 && X != 0){
    System.out.print("EVEN ");
 }else if(X % 2 != 0 && X != 0) {
    System.out.print("ODD ");
 }


    if ( X  > 0 && X != 0){
System.out.println("POSITIVE");
    }else if  ( X  < 0 && X != 0) {
    System.out.println("NEGATIVE");
    }

}
    }
}

