import java.util.Scanner;

public class B1114 {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);
    

    while(true) {
    
    int senha = escreva.nextInt();
    

     if (senha != 2002)
      System.out.println("Senha Invalida");

      else if (senha ==2002){  
      System.out.println("Acesso Permitido");
       break;
 }
    
    }

escreva.close();

}
}
