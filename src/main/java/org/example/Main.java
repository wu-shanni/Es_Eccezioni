import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;

void main(){
     ContoBancario conto = new ContoBancario(100.00);

    IO.println("\nIl saldo attuale è:   " + conto.saldo + " €");

    // prelevato troppo
    try {
        conto.preleva(238.0);
    } catch (SaldoInsufficienteException e) {
        IO.println("\nImporto richiesto: " + e.getImportoRichiesto() + " €");
        IO.println("\tMancanza di denaro: " + e.getMancanza() + " euro.");
    }



    //prelievo valido
    try {
        conto.preleva(54.0);
        System.out.println("\nOperazione completata con successo!");
        System.out.println("Nuovo saldo disponibile: " + conto.getSaldo() + " €");
    } catch (SaldoInsufficienteException e) {
        System.out.println(e.getMessage());
    }
}
