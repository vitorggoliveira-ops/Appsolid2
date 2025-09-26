// Arquivo: src/Main.java
public class LSP {
    public static void main(String[] args) {
        Ave pinguim = new Pinguim();
        pinguim.voar(); // problema: pinguim não voa!
    }
}

class Ave {
    public void voar() {
        System.out.println("Voando...");
    }
}

class Pinguim extends Ave {
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguins não voam!");
    }
}

