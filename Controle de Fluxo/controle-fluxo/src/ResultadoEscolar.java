public class ResultadoEscolar {

    public static void main(String[] args) {
        
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if( nota > 5 && nota < 7){
            System.out.println("Aluno em recuperação.");
        }
        else 
            System.out.println("Reprovado");

        System.out.println("------Usando operador ternário-------");

        String resultado = nota >= 7 ? "Aprovado" : nota > 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}

