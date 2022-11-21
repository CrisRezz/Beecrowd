import java.util.Scanner;
public class B71 {
    public static void main(String[] args) {
        
 Scanner escreva = new Scanner(System.in);

int N1= escreva.nextInt();
int N2= escreva.nextInt();
int min,max;
int soma=0;

if (N1<N2){
    min = N1;
     max = N2;

}else{
    min = N2;
    max = N1;
}


for (int cont = min+1 ; cont < max ; cont++)
     if (cont%2 != 0)
     soma +=cont;


     System.out.println(soma);

     escreva.close();
    }
}

