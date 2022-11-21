import java.util.Scanner;

public class B132 {
    public static void main(String[] args) {
  Scanner escreva = new Scanner(System.in);

  int N1 = escreva.nextInt(); int N2 = escreva.nextInt(); int soma = 0;

if (N1 > N2){  
           for(int i = N2; i <=N1; i++){
                  if(i%13!=0) soma +=i;
}

}else{
           for(int i = N1; i <=N2; i++){
                  if(i%13!=0) soma +=i;

}
}

System.out.println(soma);





    }
}
