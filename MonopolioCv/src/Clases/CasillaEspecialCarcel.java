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
public class CasillaEspecialCarcel extends CasillaEspecial {
    
    public CasillaEspecialCarcel(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_CARCEL);
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        jugador.setEstado(Jugador.ESTADO_ENCARCELDADO);
        jugador.getFicha().setPosicion(this.getPosicion());
    }
    
}