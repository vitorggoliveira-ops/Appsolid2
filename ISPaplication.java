// Arquivo: src/Main.java
public class ISPaplication {
    public static void main(String[] args) {
        Impressora impressora = new ImpressoraSimples();
        impressora.imprimir();

        Scanner scanner = new ImpressoraMultifuncional();
        scanner.digitalizar();
    }
}

interface Impressora {
    void imprimir();
}

interface Scanner {
    void digitalizar();
}

interface Fax {
    void enviarFax();
}

class ImpressoraSimples implements Impressora {
    public void imprimir() { System.out.println("Imprimindo..."); }
}

class ImpressoraMultifuncional implements Impressora, Scanner, Fax {
    public void imprimir() { System.out.println("Imprimindo..."); }
    public void digitalizar() { System.out.println("Digitalizando..."); }
    public void enviarFax() { System.out.println("Enviando fax..."); }
}
