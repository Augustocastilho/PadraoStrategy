package org.example;

public class Mago {

    private String magia;

    public String getMagia() {
        return magia;
    }

    public void lancarMagiaBolaFogo(String descricao, String dano) {
        Livro livro = new Livro(descricao, dano);
        this.magia = livro.lancarMagia(new MagiaBolaFogo());
    }

    public void lancarMagiaTrovao(String descricao, String dano) {
        Livro livro = new Livro(descricao, dano);
        this.magia = livro.lancarMagia(new MagiaTrovao());
    }

    public void lancarMagiaVeneno(String descricao, String dano) {
        Livro livro = new Livro(descricao, dano);
        this.magia = livro.lancarMagia(new MagiaVeneno());
    }

}
