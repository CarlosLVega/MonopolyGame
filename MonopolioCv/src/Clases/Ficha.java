/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author carlo
 */
public class Ficha {

    private final String id;
    private int posicion;

    public Ficha(String id) {
        this.id = id;
        this.posicion = 0;
    }

    public void restarPosicion(int p) {
        setPosicion(posicion - p);
        if (getPosicion() < 1) {
            setPosicion(1);
        }
    }

    public void aumentarPosicion(int p) {
        int posicionActual = getPosicion();
        int proximaPosicion = posicionActual + p;
        if (proximaPosicion > 40) {
            setPosicion(proximaPosicion - 40);
        } else {
            setPosicion(proximaPosicion);
        }
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getId() {
        return id;
    }

}

