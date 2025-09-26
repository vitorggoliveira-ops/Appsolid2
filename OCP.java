// Arquivo: src/Main.java
public class OCP {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.gerar("PDF");
        relatorio.gerar("CSV");
    }
}

class Relatorio {
    public void gerar(String tipo) {
        if (tipo.equals("PDF")) {
            System.out.println("Gerando relatório em PDF...");
        } else if (tipo.equals("CSV")) {
            System.out.println("Gerando relatório em CSV...");
        }
        // Se precisar de outro formato, temos que editar essa classe
    }
}

