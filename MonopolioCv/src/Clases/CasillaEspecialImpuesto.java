/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Juego;
import Clases.Jugador;

/**
 *
 * @author carlo
 */
public class CasillaEspecialImpuesto extends CasillaEspecial {

    public static final int IMPUESTO_DECLARACION = 200;
    public static final int IMPUESTO_LUJOS = 75;

    public CasillaEspecialImpuesto(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_IMPUESTO);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int dineroJugador = jugador.getCuenta().getDinero();
        switch (jugador.getFicha().getPosicion()) {
            case 5:
                jugador.getCuenta().setDinero(dineroJugador - IMPUESTO_DECLARACION);
                juego.getBanco().agregarDinero(IMPUESTO_DECLARACION);
                break;
            case 39:
                jugador.getCuenta().setDinero(dineroJugador - IMPUESTO_LUJOS);
                juego.getBanco().agregarDinero(IMPUESTO_LUJOS);
                break;
        }
    }
}

