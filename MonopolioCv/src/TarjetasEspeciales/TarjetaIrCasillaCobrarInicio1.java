/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TarjetasEspeciales;

import Clases.Banco;
import Clases.Juego;
import Clases.Jugador;

/**
 *
 * @author carlo
 */
public class TarjetaIrCasillaCobrarInicio1 extends TarjetaIrCasillaCobrar{
    
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Ir a Inicio Cobrar $ 200"); 
    }
        
       
    public void ejecutarAccion(Jugador jugador, Juego juego, Banco banco) {
        int cobro=200;
        int dinero=jugador.getCuenta().getDinero();
        jugador.getCuenta().setDinero(dinero + cobro );
        banco.restarDinero(cobro);

    }

    @Override
    public String getMensaje() {
        return super.getMensaje(); 
    }
}
