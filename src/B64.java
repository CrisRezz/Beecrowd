import java.util.Scanner;
public class B64 {
    public static void main(String[] args) {
        
        Scanner escreva = new Scanner(System.in);
    
        int NumerosPositivos = 0; 
        Double divisao = 0.0; 
        Double soma = 0.0;

      for(int i = 0; i <6 ; i ++){
        
         Double NumeroDigitado = escreva.nextDouble();
         if (NumeroDigitado > 0 ){
          
             soma += NumeroDigitado;
             NumerosPositivos ++;

             divisao  =  soma / NumerosPositivos ;
      }else{
      }
      
      }
                
      System.out.println(NumerosPositivos + " valores positivos");
      System.out.printf("%.1f%n", divisao);
      
          }
          
    }

