package de.pischka.java.neuerungen.java9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Beispiel für die Try-With-Resources-Verbesserungen in Java 9.
 *
 * @author Matthias Pischka
 */
public class TryWithResourcesFileWriter {

    private TryWithResourcesFileWriter() {
    }

    /**
     * Schreibt die Datei (übergebener Dateiname) mit dem übergebenen Text.
     *
     * @param dateiname Name der Datei
     * @param text      Inhalt der Dateil
     * @throws IOException Bei Fehler
     */
    public static boolean schreibeDatei(String dateiname, String text) throws IOException {

        // Die verwendeten Ressourcen (wenn es mehr als eine ist) müssen ab Java 9 nicht mehr vor dem
        // Try-Block definiert werden.
        try (FileWriter fileWriter = new FileWriter(dateiname);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            // Die benötigten Ressourcen wurden innerhalb des Try-Blocks initialisiert und werden nach
            // Beendigung des Blocks automatisch wieder freigegeben
            bufferedWriter.write(text);
        }

        return true;
    }
}
