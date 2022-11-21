import java.util.Scanner;
public class B1235s {


public static String lerlinhateste (Scanner escreva){
String linhateste = escreva.nextLine();
return linhateste;
}
  public static void main(String[] args) {
  Scanner escreva = new Scanner(System.in);


    int N = escreva.nextInt();
    escreva.nextLine();
    String textocorreto = "";
    int cont = 0;

  while (cont < N) {
  cont++;
       String linha = lerlinhateste(escreva);
       int qtdecaracters = linha.length();

           for (int i = (qtdecaracters/2) -1 ; i >= 0; i--){
           textocorreto += linha.charAt(i) ;  
           } 
           for (int i = (qtdecaracters - 1) ; i >=(qtdecaracters/2); i--){
           textocorreto += linha.charAt(i); 
            }

 System.out.println(textocorreto);
 textocorreto = "";
    
      }
     }
    }

