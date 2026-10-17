package org.example;

public class ContoBancario {
    public Double saldo;

    public ContoBancario(Double saldo){
        this.saldo = saldo;
    }

    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo <= 0) {
            throw new ImportoNonValidoException("Errore: L'importo del prelievo deve essere maggiore di zero.");
        }

        if (importo > saldo) {
            throw new SaldoInsufficienteException(saldo, importo);
        }
        saldo -= importo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
