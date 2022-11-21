public class B1156 {
  
    public static void main(String[] args) {
       double i , j, s = 1;
     
       for(i = 3 , j=2 ; i<=39 ; i+=2, j*=2){
     s += i/j;

       }
       System.out.printf("%.2f\n" , s);
      
    }

    }
