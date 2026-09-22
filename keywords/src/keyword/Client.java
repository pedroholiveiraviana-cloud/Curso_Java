package keyword;

public class Client {

    // protected: visível no pacote e também para subclasses em outros pacotes
    protected String nome;

    protected int age ;

    protected Address address = new Address();

    protected String getNome() {
        return nome;
    }

    public String test_defalt() {
        System.out.println(address.getDescription());
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}
