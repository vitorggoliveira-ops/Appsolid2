// Arquivo: src/Main.java
public class OCPaplication {
    public static void main(String[] args) {
        Relatorio pdf = new RelatorioPDF();
        Relatorio csv = new RelatorioCSV();

        pdf.gerar();
        csv.gerar();
    }
}

abstract class Relatorio {
    public abstract void gerar();
}

class RelatorioPDF extends Relatorio {
    public void gerar() {
        System.out.println("Gerando relatório em PDF...");
    }
}

class RelatorioCSV extends Relatorio {
    public void gerar() {
        System.out.println("Gerando relatório em CSV...");
    }
}
