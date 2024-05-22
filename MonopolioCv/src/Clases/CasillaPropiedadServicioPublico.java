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
public class CasillaPropiedadServicioPublico extends CasillaPropiedadServicio {

    public CasillaPropiedadServicioPublico(String nombre, int posicion,
            int valor, int rentaBase, int valorHipoteca) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedadServicio(CasillaPropiedadServicio.TIPO_CASILLA_PROPIEDAD_SERVICIO_PUBLICO);
    }

    @Override
    public void calculaRenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


