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
public class Banco {

    private int dinero;
    private final ArrayList<Mejora> mejoras;
    private final ArrayList<CasillaPropiedad> propiedades;

    public Banco(ArrayList propiedades) {
        this.mejoras = new ArrayList<>();
        this.propiedades = propiedades;
        this.dinero = 100000000; // cien millones
    }

    public boolean borrarMejora(String tipoMejora) {
        for (Mejora m : mejoras) {
            if (m.getTipoMejora().equals(tipoMejora)) {
                mejoras.remove(m);
                return true;
            }
        }
        return false;
    }

    public void agregarDinero(int dinero) {
        this.dinero += dinero;
    }

    public ArrayList<Mejora> getMejoras() {
        return mejoras;
    }

    public boolean agregarPropiedad(CasillaPropiedad propiedad) {
        try {
            propiedades.add(propiedad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void restarDinero(int dinero) {
        this.dinero -= dinero;
        if (this.dinero <= 0) {
            this.dinero = 1000000;
        }
    }

    public boolean borrarPorpiedad(CasillaPropiedad propiedad) {
        try {
            propiedades.remove(propiedad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<CasillaPropiedad> getPropiedades() {
        return propiedades;
    }

    public boolean agregarMejora(String tipoMejora) {
        try {
            mejoras.add(new Mejora(tipoMejora));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

