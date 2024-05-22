/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Ficha;
import Clases.Cuenta;
import Clases.Banco;

/**
 *
 * @author carlo
 */
public class Jugador {

    public static final String ESTADO_ENCARCELDADO = "En la Carcel :(";
    public static final String ESTADO_LIBRE = "En Libertad :)";

    private final Cuenta cuenta;
    private String estado;
    private final Ficha ficha;
    private final String nombre;

    public Jugador(Ficha ficha, String nombre) {
        this.cuenta = new Cuenta();
        this.ficha = ficha;
        this.nombre = nombre;
        this.estado = Jugador.ESTADO_LIBRE;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public boolean comprarPropiedad(Banco banco, CasillaPropiedad propiedad) {
        if (getCuenta().restarDinero(propiedad.getValor())) {
            banco.agregarDinero(propiedad.getValor());
            if (getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(CasillaPropiedad.ADQUIRIDA);
                propiedad.setPropietario(this);
                return true;
            } else {
                getCuenta().agregarDinero(propiedad.getValor());
            }
        }
        return false;
    }

    public boolean comprarPropiedad(Jugador jugador, CasillaPropiedad propiedad) {
        if (jugador.getCuenta().borraPropiedad(propiedad)) {
            if (getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(CasillaPropiedad.ADQUIRIDA);
                propiedad.setPropietario(this);
                return true;
            }
        }
        return false;
    }

    public boolean venderPropiedad(Banco banco, CasillaPropiedad propiedad) {
        if (getCuenta().borraPropiedad(propiedad)) {
            if (banco.agregarPropiedad(propiedad)) {
                propiedad.setEstado(CasillaPropiedad.DISPONIBLE);
                propiedad.setPropietario(null);
                return true;
            }
        }
        return false;
    }

    public boolean venderPropiedad(Jugador jugador, CasillaPropiedad propiedad) {
        if (getCuenta().borraPropiedad(propiedad)) {
            if (jugador.getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(CasillaPropiedad.ADQUIRIDA);
                propiedad.setPropietario(jugador);
                return true;
            }
        }
        return false;
    }

    public boolean hipotecar(Banco banco, CasillaPropiedad propiedad) {
        int hipoteca = propiedad.getValorHipoteca();
        if (cuenta.getPropiedades().contains(propiedad)) {
            banco.restarDinero(hipoteca);
            getCuenta().agregarDinero(hipoteca);
            propiedad.setEstado(CasillaPropiedad.HIPOTECADA);
            return true;
        }
        return false;
    }

    public boolean deshipotecar(Banco banco, CasillaPropiedad propiedad) {
        int deshipoteca = (int) (propiedad.getValorHipoteca() * 1.1);
        if (cuenta.getPropiedades().contains(propiedad)) {
            if (propiedad.getEstado().equals(CasillaPropiedad.HIPOTECADA)) {
                if (getCuenta().restarDinero(deshipoteca)) {
                    banco.agregarDinero(deshipoteca);
                    propiedad.setEstado(CasillaPropiedad.ADQUIRIDA);
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean cobrarRenta(CasillaPropiedad propiedad, Jugador jugador) {
        int renta = propiedad.getRenta();
        if (jugador.getCuenta().restarDinero(renta)) {
            getCuenta().agregarDinero(renta);
            return true;
        }
        return false;
    }

    public void pagarRenta(CasillaPropiedadTerreno propiedad) {
    }
}