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
public class TarjetaCobrarBanco extends TarjetaCobrar {
    
     @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Cobrar al banco dividendos $50 "); 
    
       }
    
     @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int cobro=50;
       
        jugador.getCuenta().agregarDinero(cobro);
        
        juego.getBanco().restarDinero(cobro);
    }
    
    @Override
    public String getMensaje() {
        return super.getMensaje(); 
    }
}
