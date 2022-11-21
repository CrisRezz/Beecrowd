public class B97 {
 public static void main(String[] args) {

 int I = 1 , J = 7;

       while( I <= 9){
       for(int k = 0; k < 3 ; k++){
       System.out.println("I="+ I + " J="+J);
       System.out.println(k);
        J--;
      }
      
       I+=2;
       J+=5;
}      
}
}

//enquanto o i for menor que 9, o for vai rodar uma sequencia de 3
//o sysout imprime o i e o J - 1 3 vezes.
//quando fora do looping, é adicionado mais 2 ao i e mais 5 ao J;
//dentro do looping J sempre recebe - 1, que ocasiona a ordem descrescente 

/*
I=1 J=7 -1
0
I=1 J=6 -1
1
I=1 J=5 -1
2

No final da sequencia é adicionado + 5 e  (- 1)
I=3 J=9 
0
I=3 J=8 - 1
1
I=3 J=7 -1
2

No final da sequencia é adicionado + 5 e  (- 1)
I=5 J=11 
0
I=5 J=10 - 1
1
I=5 J=9 -1 
 e etc... */
