package org.example;

public class SaldoInsufficienteException extends Exception {
    private double saldoAttuale;
    private double importoRichiesto;

    public SaldoInsufficienteException(double saldoAttuale, double importoRichiesto) {
        super("Tentativo di prelievo fallito: saldo non sufficiente.");
        this.saldoAttuale = saldoAttuale;
        this.importoRichiesto = importoRichiesto;
    }

    public double getSaldoAttuale() {
        return saldoAttuale;
    }

    public double getImportoRichiesto() {
        return importoRichiesto;
    }

    public double getMancanza() {
        return importoRichiesto - saldoAttuale;
    }
}
