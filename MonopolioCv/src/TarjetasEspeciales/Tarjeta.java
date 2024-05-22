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
public abstract class Tarjeta {


private String mensaje;
private String tipoTarjeta;

    


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

 
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

 
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
   public abstract void ejecutarAccion(Jugador jugador, Juego juego);
}
