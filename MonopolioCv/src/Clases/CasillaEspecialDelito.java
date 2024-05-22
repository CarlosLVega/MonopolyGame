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
public class CasillaEspecialDelito extends CasillaEspecial {

    public CasillaEspecialDelito(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_DELITO);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        jugador.getFicha().setPosicion(11);
        jugador.setEstado(Jugador.ESTADO_ENCARCELDADO);
    }

}