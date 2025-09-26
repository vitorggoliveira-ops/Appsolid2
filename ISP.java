// Arquivo: src/Main.java
public class ISP {
    public static void main(String[] args) {
        Impressora impressora = new ImpressoraMultifuncional();
        impressora.imprimir();
        impressora.digitalizar();
        impressora.enviarFax();
    }
}

interface Impressora {
    void imprimir();
    void digitalizar();
    void enviarFax();
}

class ImpressoraMultifuncional implements Impressora {
    public void imprimir() { System.out.println("Imprimindo..."); }
    public void digitalizar() { System.out.println("Digitalizando..."); }
    public void enviarFax() { System.out.println("Enviando fax..."); }
}

// Problema: e se tivermos uma impressora simples?
class ImpressoraSimples implements Impressora {
    public void imprimir() { System.out.println("Imprimindo..."); }
    public void digitalizar() { throw new UnsupportedOperationException(); }
    public void enviarFax() { throw new UnsupportedOperationException(); }
}
