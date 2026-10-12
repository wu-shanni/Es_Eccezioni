import org.example.ContoBancario;
import org.example.SaldoInsufficienteException;

void main(){
    // ContoBancario conto = new ContoBancario(100.00, 31.28);     //abbastanza
     ContoBancario conto = new ContoBancario(100.00, 264.73);     // non abbastanza

    IO.println("\nIl saldo attuale è:   " + conto.saldo + " €");

    if (conto.importo < conto.saldo){
        IO.println("\nImporto prelevato:   " + conto.importo + " €");
        IO.println("Saldo attuale: " + (conto.saldo - conto.importo) + " €");
    } else {
        IO.println("Non hai abbastanza soldi, te ne mancano " + Math.abs(conto.saldo - conto.importo) + " €");
        throw new SaldoInsufficienteException("Saldo insufficiente");
    }
}