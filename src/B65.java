import java.util.Scanner;
public class B65 {
    public static void main(String[] args) {
        
                
                Scanner escreva = new Scanner(System.in);
            
                int NumerosPares = 0; 
            
              for(int i = 0; i <5 ; i ++){
                
                 Double NumeroDigitado = escreva.nextDouble();
                    Double divisão = NumeroDigitado % 2;
                 if (divisão == 0 ){
                     NumerosPares ++;
        
              }else{
              }
              
              }
                        
              System.out.println(NumerosPares + " valores pares");
              
                  }
                  
            
}
