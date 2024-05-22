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
public class CasillaEspecialEventualidad extends CasillaEspecial {

    public static final String TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN = "Arca comun";
    public static final String TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD = "Casualidad";

    private final String tipoCasillaEspecialEventualidad;

    public CasillaEspecialEventualidad(int posicion, String nombre, String tipoCasillaEspecialEventualidad) {
        super(posicion, nombre);
        this.setTipoCasillaEspecial(CasillaEspecial.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD);
        this.tipoCasillaEspecialEventualidad = tipoCasillaEspecialEventualidad;
    }

    public String getTipoCasillaEspecialEventualidad() {
        return tipoCasillaEspecialEventualidad;
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        switch (tipoCasillaEspecialEventualidad) {
            case CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN:
                juego.getTarjetaArcaComun().ejecutarAccion(jugador, juego);
                break;
            case CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD:
                juego.getTarjetaCasualidad().ejecutarAccion(jugador, juego);
                break;
        }
    }
}
