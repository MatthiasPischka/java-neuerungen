package de.pischka.java.neuerungen.java9;

import java.io.*;

/**
 * Beispiel für die Try-With-Resources-Verbesserungen in Java 9.
 *
 * @author Matthias Pischka
 */
public class TryWithResourcesFileReaderAndWriter {

    private TryWithResourcesFileReaderAndWriter() {
    }

    /**
     * Schreibt die Datei (übergebener Dateiname) mit dem übergebenen Text.
     *
     * @param dateiname Name der Datei
     * @param text      Inhalt der Datei
     * @throws IOException Bei Fehler
     */
    public static boolean schreibeDatei(String dateiname, String text) throws IOException {

        // Folgendes Beispiel funktioniert schon ab Java 7. Das Lesen der Datei enthält die Neuerung aus Java 9.
        try (FileWriter fileWriter = new FileWriter(dateiname);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            // Die benötigten Ressourcen wurden innerhalb des Try-Blocks initialisiert und werden nach
            // Beendigung des Blocks automatisch wieder freigegeben
            bufferedWriter.write(text);
        }

        return true;
    }

    /**
     * Liest den Inhalt der Datei (übergebener Dateiname) und gibt diesen zurück.
     *
     * @param dateiname Name der Datei
     * @return Inhalt der Datei
     * @throws IOException Bei Fehler
     */
    public static String leseDatei(String dateiname) throws IOException {

        // Verwendete Ressourcen, können ab Java 9 vor dem Try-Block definiert werden, wenn sie final oder
        // effektiv final sind.
        FileReader fileReader = new FileReader(dateiname);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (fileReader; bufferedReader) {
            return bufferedReader.readLine();
        }
    }
}
