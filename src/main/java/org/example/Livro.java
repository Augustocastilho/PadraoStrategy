package org.example;

public class Livro {

    private String descricao;
    private String dano;

    public Livro(String descricao, String dano) {
        this.descricao = descricao;
        this.dano = dano;
    }

    public String lancarMagia(Magia magia) {
        return magia.lancarMagia(descricao, dano);
        
    }

}
