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
public abstract class TarjetaIrCasilla extends Tarjeta{
    
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta(tipoTarjeta); 
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        
    }
    
    
}
