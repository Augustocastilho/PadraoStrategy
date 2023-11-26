package org.example;

public class MagiaTrovao implements Magia{

    public String lancarMagia(String descricao, String dano) {
        return "Trovão" + 
        "\nDano: " + dano + 
        "\nDescrição: " + descricao;
    }

}
