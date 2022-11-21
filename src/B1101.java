import java.util.Scanner;

public class B1101 {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);
    
    int M, N , soma;

    while(((M=escreva.nextInt())>0)&&((N=escreva.nextInt())>0)){
      soma=0;

      if (M>N){
     for(N=N; N<=M; N++){
        System.out.print(N + " ");
        soma+= N;

     }
     System.out.println("Sum=" +soma);


      }else{

            for(M=M; M<=N;M++){
               System.out.print(M + " ");
               soma+= M;
       
            }
            System.out.println("Sum=" +soma);

      }






    }
escreva.close();
    
    }
}
