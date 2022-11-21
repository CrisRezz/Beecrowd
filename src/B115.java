import java.util.Scanner;

public class B115 {
    public static void main(String[] args) {
        Scanner escreva =new Scanner(System.in);


        int  X =0;
        int Y =0;

        while(((X = escreva.nextInt())!=0)&&((Y=escreva.nextInt())!=0)){
        

            if (X>0 && Y>0){
                System.out.println("primeiro");
            }else if(X<0 && Y>0){
                System.out.println("segundo");

            }else if(X<0 && Y<0){
                System.out.println("terceiro");


        }else{
            System.out.println("quarto");
        }


}
        
        
escreva.close();
















    
    }
}
/*2 2
3 -2
-8 -1
-7 1
0 2*/