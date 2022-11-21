import java.util.Scanner;
public class B60 
{
    
    
    public static void main(String[] args) throws Exception {
    Scanner escreva = new Scanner(System.in);
    
  int NumerosPositivos = 0; 
 


for(int i = 0; i <6 ; i ++){
  
   Double NumeroDigitado = escreva.nextDouble();
   if (NumeroDigitado > 0 ){
       NumerosPositivos ++;

}else{
}

}
          
System.out.println(NumerosPositivos + " valores positivos");


    }
    }