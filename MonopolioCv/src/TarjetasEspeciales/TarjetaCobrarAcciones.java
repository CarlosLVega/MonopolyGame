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
public class TarjetaCobrarAcciones extends TarjetaCobrar {

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun");
    }

    @Override
    public void setMensaje(String mensaje) {
        super.setMensaje("Cobrar venta Acciones $50 "); 
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int acciones = 50;
        
        jugador.getCuenta().agregarDinero(acciones);
       
        juego.getBanco().restarDinero(acciones);

    }

    @Override
    public String getMensaje() {
        return super.getMensaje(); 
    }
}
