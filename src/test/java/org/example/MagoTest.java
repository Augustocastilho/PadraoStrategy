package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagoTest {

    @Test
    void deveLancarMagiaBolaFogo() {
        Mago mago = new Mago();
        mago.lancarMagiaBolaFogo(
            "Cada criatura em uma esfera de 6 metros de raio [20-foot radius], centrada no ponto, deve realizar um teste de resistência de Destreza.", 
            "8d6");
        assertEquals("Bola de Fogo" +
            "\nDano: 8d6" + 
            "\nDescrição: Cada criatura em uma esfera de 6 metros de raio [20-foot radius], centrada no ponto, deve realizar um teste de resistência de Destreza.", 
            mago.getMagia());
    }

    @Test
    void deveLancarMagiaTrovao() {
        Mago mago = new Mago();
        mago.lancarMagiaTrovao(
            "Cada criatura em uma esfera de 6 metros de raio [20-foot radius], centrada no ponto, deve realizar um teste de resistência de Constituição.", 
            "2d8");
        assertEquals("Trovão" +
            "\nDano: 2d8" + 
            "\nDescrição: Cada criatura em uma esfera de 6 metros de raio [20-foot radius], centrada no ponto, deve realizar um teste de resistência de Constituição.", 
            mago.getMagia());
    }

    @Test
    void deveLancarMagiaVeneno() {
        Mago mago = new Mago();
        mago.lancarMagiaVeneno(
            "Você envenena uma criatura que você possa tocar.", 
            "3d6");
        assertEquals("Veneno" +
            "\nDano: 3d6" + 
            "\nDescrição: Você envenena uma criatura que você possa tocar.", 
            mago.getMagia());
    }

}