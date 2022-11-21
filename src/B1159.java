import java.util.Scanner;

public class B1159 {
    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);

int sum = 0;
boolean Y = true;

int X = 1;

 
 
while(X != 0){
    X = tc.nextInt();
if (X==0)
    break;

sum = 0;
for (int i = X,total = 0; total < 5; i++) {
        if (i % 2 == 0) {
            sum += i;
            total += 1;
    

   } 


 }
  
  
System.out.println(sum);

}
      

           

    }
}
