import java.util.Scanner;

public class B134 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        
int x = 0;
int alcool =0 , gasolina =0 , diesel =0;


    do
    {x = escreva.nextInt();
if(x ==1)
alcool ++;
else if (x ==2)
gasolina++;
else if (x == 3)
diesel ++;


    }while(x!=4);

System.out.println("MUITO OBRIGADO");
System.out.println("Alcool: "+alcool);
System.out.println("Gasolina: "+gasolina);
System.out.println("Diesel: "+diesel);
    }
}
