// Arquivo: src/Main.java
public class S {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Vitor", "vitor@email.com");
        usuario.salvarNoBanco();
        usuario.enviarEmailBoasVindas();
    }
}

class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Responsabilidade 1: salvar no banco
    public void salvarNoBanco() {
        System.out.println("Salvando usuário no banco de dados...");
    }

    // Responsabilidade 2: enviar email
    public void enviarEmailBoasVindas() {
        System.out.println("Enviando e-mail de boas-vindas para " + email);
    }
}

