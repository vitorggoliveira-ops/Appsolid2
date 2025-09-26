// Arquivo: src/Main.java
public class LSPaplication {
    public static void main(String[] args) {
        Ave andorinha = new Andorinha();
        andorinha.locomover();

        Ave pinguim = new Pinguim();
        pinguim.locomover();
    }
}

abstract class Ave {
    public abstract void locomover();
}

class Andorinha extends Ave {
    @Override
    public void locomover() {
        System.out.println("Voando pelos céus!");
    }
}

class Pinguim extends Ave {
    @Override
    public void locomover() {
        System.out.println("Nadando na água!");
    }
}

