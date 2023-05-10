public class ResultadoEscolar {

    public static void main(String[] args) {
        
        int nota = 6;

        if(nota >= 7)
        System.out.println("Aprovado!");
        //encadeada
        else if(nota >= 5 && nota < 7)
       System.out.println("Prova de Recuperação");

        else 
        System.out.println("Reprovado!");
   
    }
    
}
