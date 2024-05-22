
package TarjetasEspeciales;

import Clases.Juego;
import Clases.Jugador;

/**
 *
 * @author carlo
 */
public class TarjetaPagarJugadores extends TarjetaPagar{
   @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Pagar a los demas jugadores $50"); 
       
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
        return super.getMensaje(); //To change body of generated methods, choose Tools | Templates.
    }
}
