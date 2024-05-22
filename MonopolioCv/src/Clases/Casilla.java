
package Clases;

/**
 *
 * @author carlo
 */
public class Casilla {

    public static final String TIPO_CASILLA_PROPIEDAD = "propiedad";
    public static final String TIPO_CASILLA_ESPECIAL = "especial";

    private final int posicion;
    private String tipoCasilla;
    private final String nombre;

    public Casilla(int posicion, String nombre) {
        this.posicion = posicion;
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

    public String getNombre() {
        return nombre;
    }
}