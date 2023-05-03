import java.sql.Blob;

public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Unários

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1; // Para tornar um número positivo é necessário fazer uma multiplicação
        System.out.println(numero);

        // Unários Incremento e Decremento

        int numeroExemplo = 5;

        System.out.println(numeroExemplo++);
        System.out.println(numeroExemplo);

        // Unário negação

        Boolean variavel = true;
        variavel = !variavel;

        System.out.println(variavel);

        // Ternário

        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ?"Verdadeiro" : "Falso";
        

         System.out.println(resultado);

         //Boolean

         int numero1 = 6;
         int numero2 = 6;

         boolean simNao = numero1 == numero2;

         System.out.println("numeroUm é igual ao numeroDois? " + simNao);
        
         simNao = numero1 > numero2;

         System.out.println("numeroUm é maior que numeroDois? " + simNao);

         // Operadores Lógicos (&&) (||)

         boolean condicao1 = true;
         
         Boolean condicao2 = false;

         if(condicao1 && condicao2){
            System.out.println("as duas condiçoes são verdadeiras.");
         }

         if (condicao1 || condicao2){
            System.out.println("Uma das condiçoes é verdadeira");
         }

    }

}
