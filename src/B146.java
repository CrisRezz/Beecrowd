import java.util.Scanner;

public class B146 {
    public static void main(String[] args) {
     Scanner escreva = new Scanner(System.in);

int X = 1;

do{
     X =escreva.nextInt();
    int linha = 0;

     for(int count =1; count <=X; count ++ ){
        linha +=1;
        if (linha == X){
        System.out.print(count + "\n");
        linha = 0;

        }else
        System.out.print(count + " ");


    
     }
        
}while(X!=0);




    }
}
