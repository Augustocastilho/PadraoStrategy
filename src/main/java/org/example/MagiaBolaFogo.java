package org.example;

public class MagiaBolaFogo implements Magia {

    public String lancarMagia(String descricao, String dano) {
        return "Bola de Fogo" + 
        "\nDano: " + dano + 
        "\nDescrição: " + descricao;
    }

}
