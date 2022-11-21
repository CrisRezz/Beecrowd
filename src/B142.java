import java.util.Scanner;

public class B142 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

        int N = escreva.nextInt();
		int cont = 1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("PUM");
			cont++;

    }
}
}
