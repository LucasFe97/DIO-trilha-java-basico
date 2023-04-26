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

            //Unários

        int numero = 5;

        numero = - numero;
       
        System.out.println(numero);

        numero = numero * -1; // Para tornar um número positivo é necessário fazer uma multiplicação
        System.out.println(numero);
    } 

}
