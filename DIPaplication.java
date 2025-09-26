// Arquivo: src/Main.java
public class DIPaplication {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        Pedido pedido = new Pedido(db);
        pedido.processar();
    }
}

class Pedido {
    private Database db;

    public Pedido(Database db) {
        this.db = db;
    }

    public void processar() {
        db.salvar("Pedido salvo com sucesso!");
    }
}

interface Database {
    void salvar(String dados);
}

class MySQLDatabase implements Database {
    public void salvar(String dados) {
        System.out.println("[MySQL] " + dados);
    }
}

class MongoDBDatabase implements Database {
    public void salvar(String dados) {
        System.out.println("[MongoDB] " + dados);
    }
}

