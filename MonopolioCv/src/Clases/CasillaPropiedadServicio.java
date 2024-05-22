/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author carlo
 */
public abstract class CasillaPropiedadServicio extends CasillaPropiedad {

    public static final String TIPO_CASILLA_PROPIEDAD_SERVICIO_PUBLICO = "Publico";
    public static final String TIPO_CASILLA_PROPIEDAD_SERVICIO_FERROCARRIL = "Ferrocarril";

    private String tipoCasillaPropiedadServicio;

    public CasillaPropiedadServicio(int posicion, String nombre, int rentaBase,
            int valor, int valorHipoteca) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedad(CasillaPropiedad.TIPO_CASILLA_PROPIEDAD_SERVICIO);
    }

 
    public String getTipoCasillaPropiedadServicio() {
        return tipoCasillaPropiedadServicio;
    }

    public void setTipoCasillaPropiedadServicio(String tipoCasillaPropiedadServicio) {
        this.tipoCasillaPropiedadServicio = tipoCasillaPropiedadServicio;
    }

    @Override
    public abstract void calculaRenta();

}