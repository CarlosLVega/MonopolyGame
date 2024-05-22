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
public class TarjetaCarcelIrCarcel extends TarjetaCarcel{

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
        }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Ir a la Carcel o pagar fianza de 200 "); 
    
       }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        jugador.setEstado(Jugador.ESTADO_ENCARCELDADO);

    }

    @Override
    public String getMensaje() {
        return super.getMensaje(); 
    }
    
}
