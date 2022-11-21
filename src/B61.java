import java.util.Scanner;

public class B61 {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);
    

    String DateI = escreva.nextLine();
    String [] DI = DateI.split(" ");
    String HourMinSecI = escreva.nextLine();
    String[] HMSI = HourMinSecI.split(" : ");

    String DateF = escreva.nextLine();
    String [] DF = DateF.split(" ");
    String HourMinSecF = escreva.nextLine();
    String[] HMSF = HourMinSecF.split(" : ");

    int DateInitial = Integer.parseInt(DI[1]);
    int HourInitial = Integer.parseInt(HMSI[0]);
    int MinutsInitial = Integer.parseInt(HMSI[1]);
    int SecondsInitial = Integer.parseInt(HMSI[2]);

    int Datefinal = Integer.parseInt(DF[1]);
    int HourFinal = Integer.parseInt(HMSF[0]);
    int MinutsFinal = Integer.parseInt(HMSF[1]);
    int SecondsFinal = Integer.parseInt(HMSF[2]);

int Q1,Q2;
int Tempo;

Q1 = SecondsInitial + (MinutsInitial * 60) + (HourInitial * 3600) + (DateInitial * 24 * 60 * 60);
Q2 = SecondsFinal +  (MinutsFinal * 60) + (HourFinal * 60 *60) + (Datefinal *24 *60 *60);  

Tempo =  Q2 - Q1;



System.out.printf ("%d dia(s)%n" , Tempo / ((24 * 60) * 60));
Tempo %= ((24 * 60)*60);

System.out.printf("%d hora(s)%n" , Tempo/ (3600) );
Tempo %=(60 * 60);

System.out.printf("%d minuto(s)%n" , Tempo/60);
Tempo%=60;

System.out.printf("%d segundo(s)%n" , Tempo);
 	



    }
}
