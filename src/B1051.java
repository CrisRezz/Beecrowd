import java.util.Scanner;

public class B1051 {
    public static void main(String[] args) throws Exception {
      Scanner escreva = new Scanner(System.in);

      double salario = escreva.nextDouble();

   
    



    if (salario <=2000){
      System.out.println("Isento/n");
    }else if(salario>= 2000.01 && salario <= 3000){
      System.out.printf("%.2f%n", (salario - 2000) * 0.08);
    }else if(salario >= 3000.01 && salario <= 4500){
    System.out.printf("R$ %.2f%n", ((salario- 3000.00)*0.18 + 1000.00*0.08));

    }else if( salario > 4500){
    System.out.printf("R$ %.2f%n", ((salario - 4500.00)*0.28 + (1500.00*0.18) + 1000.00*0.08));
}else{

}

    }


    }

/*if(sal <= 2000.00){
  cout << "Isento\n";
}else if (sal >= 2000.01 && sal <= 3000.00){
 printf("R$ %.2f\n", (sal - 2000.00)*0.08);
}else if (sal >= 3000.01 && sal <= 4500.00){
 printf("R$ %.2f\n", ((sal - 3000.00)*0.18 + 1000.00*0.08));
}else if (sal >= 4500.01){
 printf("R$ %.2f\n", ((sal - 4500.00)*0.28 + 1500.00*0.18 + 1000.00*0.08));
}
return 0;
}*/