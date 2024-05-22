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
public class CasillaEspecialSueldo extends CasillaEspecial {

    private static final int SUELDO = 200;

    public CasillaEspecialSueldo(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_SUELDO);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        // se cobra un sueldo de 200 al pasar por la casilla 1
        jugador.getCuenta().agregarDinero(SUELDO);
        juego.getBanco().restarDinero(SUELDO);
    }

}