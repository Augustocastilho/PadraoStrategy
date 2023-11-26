package org.example;

public class MagiaVeneno implements Magia{

    public String lancarMagia(String descricao, String dano) {
        return "Veneno" + 
        "\nDano: " + dano + 
        "\nDescrição: " + descricao;
    }

}
