import java.util.Scanner;

public class B1158 {
    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);

int N = tc.nextInt();

  

for(int j = 0 ; j <N ; j++){
int sum = 0;

  int X= tc.nextInt(), Y =tc.nextInt();


    for (int i = X,total = 0; total < Y; i++) {
        if (i % 2 != 0) {
            sum += i;
            total += 1;


   } 
    
   
 }
  System.out.println(sum);
    }



    

           

    }
}
