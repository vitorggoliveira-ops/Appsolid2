public class SAplication {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Vitor", "vitor@email.com");
        UsuarioRepository repo = new UsuarioRepository();
        EmailService emailService = new EmailService();

        repo.salvar(usuario);
        emailService.enviarBoasVindas(usuario);
    }
}

class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
}

// Classe com responsabilidade de persistência
class UsuarioRepository {
    public void salvar(Usuario usuario) {
        System.out.println("Salvando usuário no banco de dados...");
    }
}

// Classe com responsabilidade de email
class EmailService {
    public void enviarBoasVindas(Usuario usuario) {
        System.out.println("Enviando e-mail de boas-vindas para " + usuario.getEmail());
    }
}
