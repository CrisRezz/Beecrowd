import java.util.Scanner;
public class B66 {
    public static void main(String[] args) {                 
 Scanner escreva = new Scanner(System.in);
                    
int NumerosPares = 0; 
int NumerosNegativos =0;
int NumerosPositivos =0;
int NumerosImpares = 0;

                      for(int i = 0; i <5 ; i ++){
                        
                         Double NumeroDigitado = escreva.nextDouble();
                            Double divisão = NumeroDigitado % 2;
                         
                            if (NumeroDigitado > 0)
                        NumerosPositivos ++;

                           if (NumeroDigitado < 0){
                        NumerosNegativos ++;
              
                           }else{

                           }
                         
                            if (divisão == 0 ){
                          
                             NumerosPares ++;
                      
                         }else{
                                NumerosImpares ++;
                         

                     
                      }
                      }
                                
                                      
              System.out.println(NumerosPares + " valor(es) par(es)");
              System.out.println(NumerosImpares + " valor(es) impar(es)");
              System.out.println(NumerosPositivos + " valor(es) positivo(s)");
              System.out.println(NumerosNegativos + " valor(es) negativo(s)");
                      
                          }
                          
                    
                        }
                    

