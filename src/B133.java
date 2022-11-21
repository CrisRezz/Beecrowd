import java.util.Scanner;

public class B133 {
    public static void main(String[] args) {
    Scanner escreva = new Scanner(System.in);
    
    int X = escreva.nextInt(); int Y = escreva.nextInt(); int valores = 0;

if(X > Y){
        for(int Z = Y+1 ; Z<X ; Z ++){
            if (Z % 5 ==2 || Z% 5 ==3){
               valores = Z;
               System.out.println(valores);
}
}

}else{

        for(int Z = X+1 ; Z<Y ; Z ++){
            if (Z % 5 ==2 || Z% 5 ==3){
              valores = Z;
              System.out.println(valores);

}
}
}
}
}
