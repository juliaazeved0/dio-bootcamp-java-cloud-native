package Interface.estabelecimento;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Deskjet;
import Interface.equipamentos.impressora.Impressora;
import Interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em; 
    
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
}
}
