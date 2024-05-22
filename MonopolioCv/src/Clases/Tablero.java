/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
import java.util.ArrayList;

public class Tablero {

    private final ArrayList<Casilla> casillas;

    public Tablero() {
        this.casillas = new ArrayList<>();
        this.fillTablero();
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public Casilla getCasillaByPos(int pos) {
        for (Casilla c : getCasillas()) {
            if (c.getPosicion() == pos) {
                return c;
            }
        }
        return null;
    }

    public final void fillTablero() {
        crearCasillasEspeciales();
        crearCasillasPropiedades();
    }

    public final void crearCasillasEspeciales() {
        Casilla casillaEspecialInicio = new CasillaEspecialParadaLibre(1, "GO");
        this.getCasillas().add(casillaEspecialInicio);

        Casilla casillaEspecialEventualidadArcaComunal3 = new CasillaEspecialEventualidad(3,
                "Eventualidad Arca Comun",CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN);
        this.getCasillas().add(casillaEspecialEventualidadArcaComunal3);

        Casilla casillaEspecialImpuesto39 = new CasillaEspecialImpuesto(39, "Impuesto al lujo");
        this.getCasillas().add(casillaEspecialImpuesto39);
        
        Casilla casillaEspecialEventualidadCasualidad8 = new CasillaEspecialEventualidad(8,
            "Eventualidad Casualidad",CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD);
    this.getCasillas().add(casillaEspecialEventualidadCasualidad8);

    Casilla casillaEspecialCarcel = new CasillaEspecialCarcel(11, "Carcel");
    this.getCasillas().add(casillaEspecialCarcel);

    Casilla casillaEspecialEventualidadArcaComun18 = new CasillaEspecialEventualidad(18,
            "Eventualidad Arca Comun", CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN);
    this.getCasillas().add(casillaEspecialEventualidadArcaComun18);

    Casilla casillaespecialParadaLibre = new CasillaEspecialParadaLibre(21, "Parada Libre");
    this.getCasillas().add(casillaespecialParadaLibre);

    Casilla casillaEspecialCasualidad23 = new CasillaEspecialEventualidad(23,
            "Eventualidad Casualidad", CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD);
    this.getCasillas().add(casillaEspecialCasualidad23);

    Casilla casillaEspecialIrCarcel = new CasillaEspecialDelito(31, "Delito, ir a la Carcel");
    this.getCasillas().add(casillaEspecialIrCarcel);

    Casilla casillaEspecialEventualidadArcaComun34 = new CasillaEspecialEventualidad(34,
            "Eventualidad Arca Comun",CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN);
    this.getCasillas().add(casillaEspecialEventualidadArcaComun34);

    Casilla casillaEspecialEventualidadCasualidad37 = new CasillaEspecialEventualidad(37,
            "Eventualidad Casualidad", CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD);
    this.getCasillas().add(casillaEspecialEventualidadCasualidad37);
    }

    public final void crearCasillasPropiedades() {
        
        Casilla casillaPropiedadTerrenoMediterraneanAve = new CasillaPropiedadTerreno(
            "Mediterranean Ave.", 2, 60, 2, 30, 50, 50, CasillaPropiedadTerreno.COLOR_PURPLE);
    this.getCasillas().add(casillaPropiedadTerrenoMediterraneanAve);

    Casilla casillaPropiedadTerrenoBalticAve = new CasillaPropiedadTerreno(
            "Baltic Ave.", 4, 60, 2, 30, 50, 50, CasillaPropiedadTerreno.COLOR_PURPLE);
    this.getCasillas().add(casillaPropiedadTerrenoBalticAve);

    Casilla casillaPropiedadTerrenoOrientalAve = new CasillaPropiedadTerreno(
            "Oriental Ave.", 7, 100, 6, 50, 50, 50, CasillaPropiedadTerreno.COLOR_LIGHT_GREEN);
    this.getCasillas().add(casillaPropiedadTerrenoOrientalAve);

    Casilla casillaPropiedadTerrenoVermontAve = new CasillaPropiedadTerreno(
            "Vermont Ave.", 9, 100, 6, 50, 50, 50, CasillaPropiedadTerreno.COLOR_LIGHT_GREEN);
    this.getCasillas().add(casillaPropiedadTerrenoVermontAve);

    Casilla casillaPropiedadTerrenoConneticutAve = new CasillaPropiedadTerreno(
            "Conneticut Ave.", 10, 120, 6, 50, 50, 50, CasillaPropiedadTerreno.COLOR_LIGHT_GREEN);
    this.getCasillas().add(casillaPropiedadTerrenoConneticutAve);

    Casilla casillaPropiedadTerrenoStCharlesPlace = new CasillaPropiedadTerreno(
            "St. Charles Place.", 12, 140, 10, 50, 50, 50, CasillaPropiedadTerreno.COLOR_VIOLET);
    this.getCasillas().add(casillaPropiedadTerrenoStCharlesPlace);

    Casilla casillaPropiedadTerrenoStatesAve = new CasillaPropiedadTerreno(
            "States Ave.", 14, 140, 10, 70, 100, 100, CasillaPropiedadTerreno.COLOR_VIOLET);
    this.getCasillas().add(casillaPropiedadTerrenoStatesAve);

    Casilla casillaPropiedadTerrenoVirginiaAve = new CasillaPropiedadTerreno(
            "Virginia Ave.", 15, 160, 12, 80, 100, 100, CasillaPropiedadTerreno.COLOR_VIOLET);
    this.getCasillas().add(casillaPropiedadTerrenoVirginiaAve);

    Casilla casillaPropiedadTerrenoStJamesPlace = new CasillaPropiedadTerreno(
            "St. James Place", 17, 180, 14, 90, 100, 100, CasillaPropiedadTerreno.COLOR_ORANGE);
    this.getCasillas().add(casillaPropiedadTerrenoStJamesPlace);

    Casilla casillaPropiedadTerrenoTennesseeAve = new CasillaPropiedadTerreno(
            "Tennessee Ave.", 19, 180, 14, 90, 100, 100, CasillaPropiedadTerreno.COLOR_ORANGE);
    this.getCasillas().add(casillaPropiedadTerrenoTennesseeAve);

    Casilla casillaPropiedadTerrenoNewYork = new CasillaPropiedadTerreno(
            "New York Ave.", 20, 200, 16, 90, 100, 100, CasillaPropiedadTerreno.COLOR_ORANGE);
    this.getCasillas().add(casillaPropiedadTerrenoNewYork);

    Casilla casillaPropiedadTerrenoKentuckyAve = new CasillaPropiedadTerreno(
            "Kentucky Ave.", 22, 220, 18, 110, 150, 150, CasillaPropiedadTerreno.COLOR_RED);
    this.getCasillas().add(casillaPropiedadTerrenoKentuckyAve);

    Casilla casillaPropiedadTerrenoIndianaAve = new CasillaPropiedadTerreno(
            "Indiana Ave.", 24, 220, 18, 110, 150, 150, CasillaPropiedadTerreno.COLOR_RED);
    this.getCasillas().add(casillaPropiedadTerrenoIndianaAve);

    Casilla casillaPropiedadTerrenoIllinoisAve = new CasillaPropiedadTerreno(
            "Illinois Ave.", 25, 240, 20, 120, 150, 150, CasillaPropiedadTerreno.COLOR_RED);
    this.getCasillas().add(casillaPropiedadTerrenoIllinoisAve);

    Casilla casillaPropiedadTerrenoAtlanticAve = new CasillaPropiedadTerreno(
            "Atlantic Ave.", 27, 260, 22, 130, 150, 150, CasillaPropiedadTerreno.COLOR_YELLOW);
    this.getCasillas().add(casillaPropiedadTerrenoAtlanticAve);

    Casilla casillaPropiedadTerrenoVentorAve = new CasillaPropiedadTerreno(
            "Ventor Ave.", 28, 260, 22, 130, 150, 150, CasillaPropiedadTerreno.COLOR_YELLOW);
    this.getCasillas().add(casillaPropiedadTerrenoVentorAve);

    Casilla casillaPropiedadTerrenoMarvinGardens = new CasillaPropiedadTerreno(
            "Marvin Gardens", 30, 280, 22, 140, 150, 150, CasillaPropiedadTerreno.COLOR_YELLOW);
    this.getCasillas().add(casillaPropiedadTerrenoMarvinGardens);

    Casilla casillaPropiedadTerrenoPacificAve = new CasillaPropiedadTerreno(
            "Pacific Ave.", 32, 300, 26, 150, 200, 200, CasillaPropiedadTerreno.COLOR_DARK_GREEN);
    this.getCasillas().add(casillaPropiedadTerrenoPacificAve);

    Casilla casillaPropiedadTerrenoNorthCarolinaAve = new CasillaPropiedadTerreno(
            "North Carolina Ave.", 33, 300, 26, 150, 200, 200, CasillaPropiedadTerreno.COLOR_DARK_GREEN);
    this.getCasillas().add(casillaPropiedadTerrenoNorthCarolinaAve);

    Casilla casillaPropiedadTerrenoPennsylvaniaAve = new CasillaPropiedadTerreno(
            "Pennsylvania Ave.", 35, 320, 28, 160, 200, 200, CasillaPropiedadTerreno.COLOR_DARK_GREEN);
    this.getCasillas().add(casillaPropiedadTerrenoPennsylvaniaAve);

    Casilla casillaPropiedadTerrenoParkPlace = new CasillaPropiedadTerreno(
            "Park Place", 38, 350, 35, 175, 200, 200, CasillaPropiedadTerreno.COLOR_DARK_BLUE);
    this.getCasillas().add(casillaPropiedadTerrenoParkPlace);

    Casilla casillaPropiedadTerrenoBoardWalk = new CasillaPropiedadTerreno(
            "Board Walk", 40, 400, 50, 200, 200, 200, CasillaPropiedadTerreno.COLOR_DARK_BLUE);
    this.getCasillas().add(casillaPropiedadTerrenoBoardWalk);

 
    Casilla casillaPropiedadServicioPublicoElectricCompany13 = new CasillaPropiedadServicioPublico(
            "Electric Company", 13, 150, 0, 75);
    this.getCasillas().add(casillaPropiedadServicioPublicoElectricCompany13);

    Casilla casillaPropiedadServicioPublicoWaterWorks29 = new CasillaPropiedadServicioPublico(
            "Water Works", 29, 150, 0, 75);
    this.getCasillas().add(casillaPropiedadServicioPublicoWaterWorks29);

 
    Casilla casillaPropiedadServicioFerrocarrilReadingRailroad = new CasillaPropiedadServicioFerrocarril(
            "Reading Railroad", 6, 200, 0, 100);
    this.getCasillas().add(casillaPropiedadServicioFerrocarrilReadingRailroad);

    Casilla casillaPropiedadServicioFerrocarrilPennsylvaniaRailroad = new CasillaPropiedadServicioFerrocarril(
            "Pennsylvania Railroad", 16, 200, 0, 100);
    this.getCasillas().add(casillaPropiedadServicioFerrocarrilPennsylvaniaRailroad);

    Casilla casillaPropiedadServicioFerrocarrilBnORailroad = new CasillaPropiedadServicioFerrocarril(
            "B. & O. Railroad", 26, 200, 0, 100);
    this.getCasillas().add(casillaPropiedadServicioFerrocarrilBnORailroad);

    Casilla casillaPropiedadServicioFerrocarrilShortLineRailroad = new CasillaPropiedadServicioFerrocarril(
            "Short Line Railroad", 36, 200, 0, 100);
    this.getCasillas().add(casillaPropiedadServicioFerrocarrilShortLineRailroad);
    }
}

