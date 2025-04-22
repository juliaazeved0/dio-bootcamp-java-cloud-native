package ex1;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar a água da máquina");
            System.out.println("5 - Verificar o shampopo da máquina");
            System.out.println("6 - Colocar o pet na máquina");
            System.out.println("7 - Verificar se tem pet na máquina");
            System.out.println("8 - Retirar o pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> setPetInPetMachine();
                case 7 -> checkIfHasPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
            
            }
        }while (option != 0);
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void setWater(){
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }

    private static void verifyWater() {
        var water = petMachine.getWater();
            System.out.println("A máquina está com " + petMachine.getWater() + " litros de água no momento." );
    }

    private static void verifyShampoo() {
        var shampoo = petMachine.getShampoo();
            System.out.println("A máquina está com " + petMachine.getShampoo() + " litros de shampoo no momento." );
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet!"); 
            name = scanner.next();
        } 
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " +pet.getNome()+ " foi colocado na máquina.");
       
    }

}
