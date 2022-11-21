import java.util.Scanner;

public class B145 {
    public static void main(String[] args) {
     Scanner escreva = new Scanner(System.in);

     int X = escreva.nextInt();
     int Y = escreva.nextInt();
  

      int linha = 0;
     for(int count =1; count <=Y; count ++ ){
        linha +=1;
        if (linha == X){
        System.out.print(count + "\n");
        linha = 0;

        }else
        System.out.print(count + " ");

     }
        





    }
}
