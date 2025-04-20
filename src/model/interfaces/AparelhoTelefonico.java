package model.interfaces;

public interface AparelhoTelefonico {

    public void ligar(String numeroTelefone);

    public void atender();

    public void iniciarCorreioDeVoz(String numeroTelefone);

    public void desligarChamada ();
}