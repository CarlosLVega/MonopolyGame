/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Ficha;
import Clases.Dado;
import Clases.Banco;
import TarjetasEspeciales.Tarjeta;
import TarjetasEspeciales.TarjetaCarcelIrCarcel;
import TarjetasEspeciales.TarjetaCarcelSalirCarcel;
import TarjetasEspeciales.TarjetaCobrarAcciones;
import TarjetasEspeciales.TarjetaCobrarBanco;
import TarjetasEspeciales.TarjetaCobrarImpuestosPrestamos;
import TarjetasEspeciales.TarjetaCobrarReembolsoImpuesto;
import TarjetasEspeciales.TarjetaPagarEscuela;
import TarjetasEspeciales.TarjetaPagarHospital;
import TarjetasEspeciales.TarjetaPagarJugadores;
import Frames.InterfazJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Juego {

    private final Banco banco;
    private final Tablero tablero;
    private final InterfazJuego gui;
    private final Dado dadoA;
    private final Dado dadoB;
    private final ArrayList<Tarjeta> tarjetasArcaComun;
    private final ArrayList<Tarjeta> tarjetasCasualidad;
    private final ArrayList<Jugador> jugadores;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.dadoA = new Dado();
        this.dadoB = new Dado();
        this.tablero = new Tablero();
        this.banco = new Banco(tablero.getCasillas());
        this.gui = new InterfazJuego();
        this.tarjetasArcaComun = new ArrayList<>();
        this.tarjetasCasualidad = new ArrayList<>();
        this.gui.getJButtonLanzar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getGui().getJButtonLanzar().setEnabled(false);
                jugar();
                getGui().getJButtonLanzar().setEnabled(true);
            }
        });
        this.gui.getJButtonRegistrar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = getGui().getJTextFieldUsuario().getText();
                    if (nombre.length() > 1) {
                        registrarJugador(nombre);
                        getGui().mostrarJugadoresEnTabla(getJugadores());
                        habilitarJuego();
                    } else {
                        JOptionPane.showMessageDialog(getGui(), ":(");
                    }
                    getGui().getJTextFieldUsuario().setText("");
                    getGui().getJTextFieldUsuario().requestFocus();
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(getGui(), "Ingrese un nombre válido.");
                }
            }
        });
        this.gui.getJButtonIniciar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getGui().getJButtonIniciar().setEnabled(false);
                getGui().getJButtonRegistrar().setEnabled(false);
                getGui().getJTextFieldUsuario().setEnabled(false);
                getGui().getJButtonLanzar().setEnabled(true);
            }
        });
    }

    public void registrarJugador(String nombre) {
        Ficha ficha = new Ficha("Ficha" + nombre);
        Jugador jugador = new Jugador(ficha, nombre);
        getJugadores().add(jugador);
    }

    public void siguienteJugador() {
        getJugadores().add(getJugadores().get(0));
        getJugadores().remove(0);
    }

    public void habilitarJuego() {
        if (getJugadores().size() > 1) {
            getGui().getJButtonIniciar().setEnabled(true);
        }
        if (getJugadores().size() > 7) {
            getGui().getJButtonRegistrar().setEnabled(false);
        }
    }

    public int lanzarDados() {
        return dadoA.generarNumero() + dadoB.generarNumero();
    }

    public void jugar() {
        Jugador jugador = getJugadores().get(0);
        int valorDados;
        valorDados = lanzarDados();
        jugador.getFicha().aumentarPosicion(valorDados);
        int pos = jugador.getFicha().getPosicion();
        Casilla casilla = tablero.getCasillaByPos(pos);
        JOptionPane.showMessageDialog(getGui(), "El jugador " + jugador.getNombre()
                + " sacó " + valorDados + "\nCalló en la posicion " + pos + "\n"
                + "" + casilla.getNombre());
        switch (casilla.getTipoCasilla()) {
            case Casilla.TIPO_CASILLA_PROPIEDAD:
                CasillaPropiedad propiedad = (CasillaPropiedad) casilla;
                JOptionPane.showMessageDialog(getGui(), "Propiedad " + propiedad.getNombre().toString() + " Valor " + propiedad.getValor());
                switch (propiedad.getEstado()) {
                    case CasillaPropiedad.ADQUIRIDA:
                        JOptionPane.showMessageDialog(getGui(), "Adquirida");
                        if (!jugador.getCuenta().getPropiedades().contains(propiedad)) {
                            JOptionPane.showMessageDialog(getGui(), "Vas a pagar renta.");
                            if (propiedad.getPropietario().cobrarRenta(propiedad, jugador)) {
                                JOptionPane.showMessageDialog(getGui(), jugador.getNombre() + "\n"
                                        + "paga " + propiedad.getRenta() + " \n" + propiedad.getPropietario().getNombre());
                            } else {
                                JOptionPane.showMessageDialog(getGui(), "El jugador no puedo pagar la renta\n"
                                        + "queda endedudado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(getGui(), "Propia, no paga renta.");
                        }
                        break;
                    case CasillaPropiedad.DISPONIBLE:
                        JOptionPane.showMessageDialog(getGui(), "Disponible");
                        int opcion = JOptionPane.showConfirmDialog(getGui(), "Desea comprar esta propiedad?");
                        if (opcion == 0) {
                            jugador.comprarPropiedad(banco, propiedad);
                        }
                        break;
                    case CasillaPropiedad.HIPOTECADA:
                        JOptionPane.showMessageDialog(getGui(), "Hhipotecada.\n"
                                + "no se paga renta.");
                        break;
                }
                break;
            case Casilla.TIPO_CASILLA_ESPECIAL:
                JOptionPane.showMessageDialog(getGui(), "Casilla Especial");
                CasillaEspecial especial = (CasillaEspecial) casilla;
                switch (especial.getTipoCasillaEspecial()) {
                    case (CasillaEspecial.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD):
                        JOptionPane.showMessageDialog(getGui(), "Tomar tarjeta");
                        break;
                    default:
                        JOptionPane.showMessageDialog(getGui(), "Ejecutar accion ");
                        especial.ejecutarAccion(jugador, this);
                }
                break;
        }
        siguienteJugador();
        getGui().mostrarJugadoresEnTabla(getJugadores());
    }

    public void crearTarjetas() {
        TarjetaCarcelSalirCarcel tarjetaCarcelSalirCarcel = new TarjetaCarcelSalirCarcel();
        TarjetaCarcelIrCarcel tarjetaCarcelIrCarcel = new TarjetaCarcelIrCarcel();
        TarjetaCobrarReembolsoImpuesto tarjetaCobrarReembolsoImpuesto = new TarjetaCobrarReembolsoImpuesto();
        TarjetaPagarHospital tarjetaPagarHospital = new TarjetaPagarHospital();
        TarjetaPagarEscuela tarjetaPagarEscuela = new TarjetaPagarEscuela();
        TarjetaCobrarAcciones tarjetaCobrarAcciones = new TarjetaCobrarAcciones();


        tarjetasArcaComun.add(tarjetaCarcelSalirCarcel);
        tarjetasArcaComun.add(tarjetaCarcelIrCarcel);
        tarjetasArcaComun.add(tarjetaCobrarReembolsoImpuesto);
        tarjetasArcaComun.add(tarjetaPagarHospital);
        tarjetasArcaComun.add(tarjetaPagarEscuela);
        tarjetasArcaComun.add(tarjetaCobrarAcciones);


        TarjetaCobrarBanco tarjetaCobrarBanco = new TarjetaCobrarBanco();
        TarjetaCarcelSalirCarcel tarjetaCarcelSalirCarcel1 = new TarjetaCarcelSalirCarcel();
             TarjetaCarcelIrCarcel tarjetaCarcelIrCarcel1 = new TarjetaCarcelIrCarcel();
        TarjetaPagarJugadores tarjetaPagarJugadores = new TarjetaPagarJugadores();
        TarjetaCobrarImpuestosPrestamos tarjetaCobrarImpuestosPrestamos = new TarjetaCobrarImpuestosPrestamos();
     

        tarjetasCasualidad.add(tarjetaCobrarBanco);
        tarjetasCasualidad.add(tarjetaCarcelSalirCarcel1);
        tarjetasCasualidad.add(tarjetaCarcelIrCarcel1);
        tarjetasCasualidad.add(tarjetaPagarJugadores);
        tarjetasCasualidad.add(tarjetaCobrarImpuestosPrestamos);
    }

    public Banco getBanco() {
        return banco;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public InterfazJuego getGui() {
        return gui;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Tarjeta getTarjetaArcaComun() {
        int tarjeta = (int) (Math.random() * tarjetasArcaComun.size() - 1);
        return tarjetasArcaComun.get(tarjeta);
    }

    public Tarjeta getTarjetaCasualidad() {
        int tarjeta = (int) (Math.random() * tarjetasCasualidad.size() - 1);
        return tarjetasCasualidad.get(tarjeta);
    }
}
