package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(2500.5);
        analisarCandidato(1500.0);
        analisarCandidato(2000.0);
        System.out.println("-----------------------------------------------------------");
        selecaoCandidados();
        System.out.println("--------------Lista de candidatos selecionados-------------");
        imprimirSelecionados();
        System.out.println("------------------------------------------------------------");
        String [] candidatos = { "Julia", "Danielle", "Sarah", "Luiz", "Toni", "Enmilli"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    
        
    }

    static void entrandoEmContato(String candidado) {
        int tentativasRealizadas = 1; 
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando = true)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");

        }while(continuarTentando=true && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidado + " na " + tentativasRealizadas + "º tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidado + ", número máximo de tentativas foi atingido: " +tentativasRealizadas + ".");
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = { "Julia", "Danielle", "Sarah", "Luiz", "Toni", "Enmilli"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("-------Forma abreviada de interação foreach-------");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " +candidato);
        }
    }

    static void selecaoCandidados(){
        String [] candidatos = { "Julia", "Danielle", "Sarah", "Luiz", "Toni", "Enmilli" };

        int candidatosSelecionados = 0;
        int candidadosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidadosAtual < candidatos.length){
            String candidato = candidatos[candidadosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário R$" + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato +  " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidadosAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato.");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com uma contra proposta.");
        }else 
            {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }
}