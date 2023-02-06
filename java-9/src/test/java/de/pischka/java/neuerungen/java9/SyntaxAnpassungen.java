package de.pischka.java.neuerungen.java9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Beispiele zu Anpassungen der Syntax.
 *
 * @author Matthias Pischka
 */
class SyntaxAnpassungenTests {

    /**
     * Private Methoden in Interfaces.
     */
    @Test
    void privateInterfaceMethodenTest() {
        Fahrzeug auto = new Auto();
        assertEquals("Fährt mit 30 km/h vorwärts", auto.fahreVorwaerts(30));
        assertEquals("Fährt mit 10 km/h rückwärts", auto.fahreRueckwaerts(10));
    }

    /**
     * Private statische Methoden in Interfaces.
     */
    @Test
    void privateStaticInterfaceMethodenTest() {
        assertEquals(20.0, Fahrzeug.meterProSekunde(72));
    }
}
