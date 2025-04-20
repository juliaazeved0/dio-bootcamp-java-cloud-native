package service;
import exception.*;

public class ValidacaoNumeroTelefone {
    
    public static void validarNumeroTelefone(String numero) throws NumeroInvalidoException{
        if(!numero.matches("\\d+")){
            throw new NumeroInvalidoException("O número de telefone deve conter apenas digitos numéricos. \n-----------------------------------");
            
        }
        if (numero.length() != 11){
            throw new NumeroInvalidoException("O número de telefone deve conter exatamente 11 dígitos. \n-----------------------------------");
    }
}
}