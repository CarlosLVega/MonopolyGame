/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Dado {

    private final ArrayList<Integer> numeros;

    public Dado() {
        this.numeros = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            this.numeros.add(i);
        }
    }

    public int generarNumero() {
        int numero;
        do {
            numero = (int) (Math.random() * this.numeros.size());
        } while (numero < 1 || numero > 6);
        return numero;
    }
}

