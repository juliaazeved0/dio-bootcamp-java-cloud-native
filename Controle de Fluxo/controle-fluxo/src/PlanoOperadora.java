public class PlanoOperadora {
    
    public static void main(String[] args) {
        
    String plano = "B";

    if(plano == "B"){
        System.out.println("100 minutos de ligação");
    }else if (plano == "B"){
        System.out.println("100 minutos de ligação");
        System.out.println("Whatsapp e Instagram grátis");
    }else if(plano == "T"){
        System.out.println("100 minutos de ligação");
        System.out.println("Whatsapp e instagram gráts");
        System.out.println("5GB para Youtube");
    }

    System.out.println("---- Usando switch case------");

    switch (plano) {
        case "T": {
            System.out.println("5GB para Youtube");
        }
        case "M": {
            System.out.println("Whatsapp e Instagram grátis");
        }
        case "B": {
            System.out.println("100 minutos de ligação");
        }
    }
    }
}
