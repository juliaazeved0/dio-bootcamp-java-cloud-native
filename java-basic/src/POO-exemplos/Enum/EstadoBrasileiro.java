package Enum;

public enum EstadoBrasileiro {
    
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PARANA ("PR", "Paraná", 13)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSigla (String sigla){
        this.sigla = sigla;
    }

    public String getSigla(){
        return sigla;
    }

    public void setIbge(int ibge){
        this.ibge=ibge;
    }
    public int getIbge(){
        return ibge;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }


}
