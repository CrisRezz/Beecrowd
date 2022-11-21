import java.util.Scanner;

public class B1131 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

int Ginter; int Ggremio; int contador = 1;
int TotalDeJogos = 0;int VGremio = 0; int VInter = 0; int empates = 0;


while (contador == 1){

TotalDeJogos ++;
Ginter = escreva.nextInt();
Ggremio = escreva.nextInt();

if (Ginter > Ggremio)
 VInter++;
 else if (Ggremio > Ginter )
 VGremio++;
else empates++;

System.out.println("Novo grenal (1-sim 2-nao)");
			contador = escreva.nextInt();
			while (contador != 1 && contador != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				contador = escreva.nextInt();



}



}

System.out.println(TotalDeJogos + " grenais");
		System.out.println("Inter:" + VInter);
		System.out.println("Gremio:" + VGremio);
		System.out.println("Empates:" + empates);
		if (VInter > VGremio) System.out.println("Inter venceu mais");
		else if (VGremio > VInter) System.out.println("Gremio venceu mais");
		else System.out.println("Nao houve vencedor");








    }
}
