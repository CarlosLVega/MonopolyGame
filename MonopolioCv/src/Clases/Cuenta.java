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
public class Cuenta {

    private int dinero;
    private final ArrayList<CasillaPropiedad> propiedades;

    public Cuenta() {
        this.propiedades = new ArrayList<>();
        this.dinero = 2500;
    }

    public boolean borraPropiedad(CasillaPropiedad propiedad) {
        try {
            propiedades.remove(propiedad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean restarDinero(int dinero) {
        this.dinero -= dinero;
        if (this.dinero < 0) {
            this.dinero += dinero;
            return false;
        }
        return true;
    }

    public void agregarDinero(int dinero) {
        this.dinero += dinero;
    }

    public ArrayList<CasillaPropiedad> getPropiedades() {
        return propiedades;
    }

    public int getDinero() {
        return dinero;
    }

    public boolean agregarPropiedad(CasillaPropiedad p) {
        try {
            propiedades.add(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}

