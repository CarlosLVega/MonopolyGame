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
public abstract class CasillaEspecial extends Casilla {

    public static final String TIPO_CASILLA_ESPECIAL_INICIO = "Inicio";
    public static final String TIPO_CASILLA_ESPECIAL_CARCEL = "Carcel";
    public static final String TIPO_CASILLA_ESPECIAL_DELITO = "Delito";
    public static final String TIPO_CASILLA_ESPECIAL_EVENTUALIDAD = "Eventualidad";
    public static final String TIPO_CASILLA_ESPECIAL_IMPUESTO = "Impuesto";
    public static final String TIPO_CASILLA_ESPECIAL_PARADA_LIBRE = "Libre";
    public static final String TIPO_CASILLA_ESPECIAL_SUELDO = "Sueldo";

    private String tipoCasillaEspecial;

    public CasillaEspecial(int posicion, String nombre) {
        super(posicion, nombre);
        this.setTipoCasilla(Casilla.TIPO_CASILLA_ESPECIAL);
    }

    public String getTipoCasillaEspecial() {
        return tipoCasillaEspecial;
    }

    public void setTipoCasillaEspecial(String tipoCasillaEspecial) {
        this.tipoCasillaEspecial = tipoCasillaEspecial;
    }

    public abstract void ejecutarAccion(Jugador jugador, Juego juego);
}