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
public class TarjetaCarcelSalirCarcel extends TarjetaCarcel{

   @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
   @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Sale de la carcel, si no esta en la carcel puede conservar comodin"); 
    
       }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        jugador.setEstado(Jugador.ESTADO_LIBRE);

    }

    @Override
    public String getMensaje() {
        return super.getMensaje(); 
    }
    
}
