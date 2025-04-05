
public class FormatadorCepExemplo {
    
    public static void main(String[] args) {
    try{    
    String cepFormatado = formatarCep("12345855");
        System.out.println(cepFormatado);
    }
    catch (CepInvalidoException e) {
        System.out.println("cep não corresponde as regras de negócio");
    }
    }   
    static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8)
    throw new CepInvalidoException();

    return "20.765-546";
}
}


