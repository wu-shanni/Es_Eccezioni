package org.example;

public class ContoBancario {
    public Double saldo;
    public Double importo;

    public ContoBancario(Double saldo, Double importo){
        this.saldo = saldo;
        this.importo = importo;
    }

    public Double getImporto() {
        return importo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }
}
