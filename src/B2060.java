import java.util.Scanner;

public class B2060 {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);

int m2 = 0, m3 = 0,m4=0,m5 = 0;


int N = escreva.nextInt();
for (int x = 0; x < N; x++){

    int l = escreva.nextInt();

    if (l%2==0) m2 ++; 
    if (l%3 ==0) m3++;
    if (l%4 ==0) m4++;
    if (l%5 ==0) m5++;
    
}

System.out.println(m2 + " Multiplo(s) de 2");
System.out.println(m3 + " Multiplo(s) de 3");
System.out.println(m4 + " Multiplo(s) de 4");
System.out.println(m5 + " Multiplo(s) de 5");

    }
}
