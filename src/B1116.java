import java.util.Scanner;

public class B1116 {
    public static void main(String[] args) {
Scanner escreva = new Scanner(System.in);

int N = escreva.nextInt();

for(int i = 0; i <N; i++){
int X = escreva.nextInt();
int Y = escreva.nextInt();

if(Y == 0)
System.out.println("divisao impossivel");
else
System.out.printf("%.1f%n", (float)X/Y); 

}





    }
}
