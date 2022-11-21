public class B96 {
    public static void main(String[] args) {


       int i = 1;

       while ( i <=9){
       
        for (int J = 7; J > 4 ; J --){
        System.out.println("I=" + i + " J="+J);

        }

       i+=2;

}
}
}

	
//O J vale 7, e vai chegar ao 4 em ordem decrescente, ou seja, ele vaI RESULTAR EM 7 6 5.
//O i vale 1, mas toda vez que um loop terminar, ela vai ser adicionado mais 2
//ou seja a cada 3  sysout ele vai valer + 2.
//resultando em uma sequencia repetida de caracteres por 3 turnos.
//O while esta sendo contado pelo i, entao quando o i valer 9, o while para.
//poderia ter sido criado uma variavel cont +=2 pro while, mas foi mais clean usar o proprio i.


    
 