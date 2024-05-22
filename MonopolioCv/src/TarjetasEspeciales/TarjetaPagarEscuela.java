/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TarjetasEspeciales;

import Clases.Juego;
import Clases.Jugador;

/**
 *
 * @author carlo
 */
public class TarjetaPagarEscuela extends TarjetaPagar{
    
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Pagar Escuela $50"); 
       
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int cobro=50;
        int dinero=jugador.getCuenta().getDinero();

        jugador.getCuenta().setDinero(dinero - cobro );

        juego.getBanco().agregarDinero(cobro);
        
    }

    @Override
    public String getMensaje() {
        return super.getMensaje();
    }
}
