public class User {
    // nome do usuário
    private String nome ;

    // data de nascimento do usuário
    private String date ;

    // construtor: cria um User com nome e data
    public User(String nome, String date) {
        this.nome = nome;
        this.date = date;
    }

    // retorna o nome do usuário
    public String getNome() {
        return nome;
    }

    // retorna a data do usuário
    public String getDate() {
        return date;
    }
}
