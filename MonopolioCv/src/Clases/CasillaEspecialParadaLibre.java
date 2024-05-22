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
public class CasillaEspecialParadaLibre extends CasillaEspecial {
    
    public CasillaEspecialParadaLibre(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_PARADA_LIBRE);
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
    }
    
}
