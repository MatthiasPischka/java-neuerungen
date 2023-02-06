package de.pischka.java.neuerungen.java9;

/**
 * Stellt ein Fahrzeug dar.
 *
 * @author Matthias Pischka
 */
public interface Fahrzeug {

    default String fahreVorwaerts(int geschwindigkeit) {
        return this.gebeFahrtAus("vorwärts", geschwindigkeit);
    }

    default String fahreRueckwaerts(int geschwindigkeit) {
        return this.gebeFahrtAus("rückwärts", geschwindigkeit);
    }

    private String gebeFahrtAus(String richtung, int geschwindigkeit) {
        return "Fährt mit " + geschwindigkeit + " km/h " + richtung;
    }

    static double meterProSekunde(int kilometerProStunde) {
        return berechneMeter(kilometerProStunde) / 3600.0;
    }

    private static int berechneMeter(int kilometer) {
        return kilometer * 1000;
    }
}
